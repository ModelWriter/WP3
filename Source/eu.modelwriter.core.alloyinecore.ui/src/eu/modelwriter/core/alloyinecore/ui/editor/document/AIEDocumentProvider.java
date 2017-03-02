package eu.modelwriter.core.alloyinecore.ui.editor.document;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.editors.text.FileDocumentProvider;
import org.eclipse.ui.part.FileEditorInput;

import eu.modelwriter.configuration.internal.EcoreUtilities;
import eu.modelwriter.core.alloyinecore.internal.AIEConstants;
import eu.modelwriter.core.alloyinecore.internal.AnnotationSources;
import eu.modelwriter.core.alloyinecore.translator.EcoreTranslator;

public class AIEDocumentProvider extends FileDocumentProvider {
  private final EcoreTranslator translator;

  public AIEDocumentProvider() {
    translator = new EcoreTranslator();
  }

  @Override
  protected IDocument createDocument(final Object element) throws CoreException {
    final IDocument document = createEmptyDocument();
    if (document != null) {
      setContent(document, (FileEditorInput) element);
    }
    return document;
  }

  private boolean setContent(final IDocument document, final FileEditorInput editorInput) {
    try {
      final IFile iFile = editorInput.getFile();
      final EModelElement ecoreRoot =
          (EModelElement) EcoreUtilities.getRootObject(iFile.getFullPath().toString());
      EAnnotation sourceAnno = ecoreRoot.getEAnnotation(AnnotationSources.SOURCE);
      // Check hash
      if (sourceAnno != null
          && sourceAnno.getDetails().get(AIEConstants.SOURCE_HASH.toString()) != null) {
        ecoreRoot.getEAnnotations().remove(sourceAnno);
        String string = getString(ecoreRoot,
            URI.createPlatformResourceURI(iFile.getFullPath().toString(), true));
        ecoreRoot.getEAnnotations().add(sourceAnno);
        // If hashes are different, ask if user wants to reset
        if (!sourceAnno.getDetails().get(AIEConstants.SOURCE_HASH.toString())
            .equals(string.hashCode() + "")) {
          return translate(document, iFile, ecoreRoot);
        }
      }
      // Reload from source annotation
      if (sourceAnno != null
          && sourceAnno.getDetails().get(AIEConstants.SOURCE.toString()) != null) {
        document.set(sourceAnno.getDetails().get(AIEConstants.SOURCE.toString()));
        if (document instanceof AIEDocument) {
          ((AIEDocument) document).setEcoreRoot(ecoreRoot);
          ((AIEDocument) document).setFile(iFile);
        }
        return true;
      }
      return translate(document, iFile, ecoreRoot);
    } catch (final Exception e) {
      e.printStackTrace();
      document.set("");
    }
    return false;
  }

  private boolean translate(final IDocument document, final IFile iFile,
      final EModelElement ecoreRoot) {
    ecoreRoot.getEAnnotations().removeIf(a -> a.getSource().equals(AnnotationSources.SOURCE));
    document.set(translator.translate(ecoreRoot));
    if (document instanceof AIEDocument) {
      ((AIEDocument) document).setEcoreRoot(ecoreRoot);
      ((AIEDocument) document).setFile(iFile);
    }
    return true;
  }

  @Override
  protected IDocument createEmptyDocument() {
    return new AIEDocument();
  }

  @Override
  protected boolean setDocumentContent(final IDocument document, final IEditorInput editorInput,
      final String encoding) throws CoreException {
    return setContent(document, (FileEditorInput) editorInput);
  }

  @Override
  protected void doSaveDocument(final IProgressMonitor monitor, final Object element,
      final IDocument document, final boolean overwrite) throws CoreException {
    if (document instanceof AIEDocument) {
      ((AIEDocument) document).saveInEcore(element, overwrite);
    }
  }

  public static String getString(final EObject root, final URI saveURI) {
    ResourceSetImpl resourceSet = new ResourceSetImpl();
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
        .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
    final Resource resource = resourceSet.getResource(saveURI, true);
    resource.getContents().clear();
    resource.getContents().add(root);
    ByteArrayOutputStream stream = new ByteArrayOutputStream();
    try {
      resource.save(stream, null);
      return new String(stream.toByteArray());
    } catch (final IOException e) {
      e.printStackTrace();
    }
    return "";
  }

}
