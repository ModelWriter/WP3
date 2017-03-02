package eu.modelwriter.core.alloyinecore.ui.editor.document;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
  private EObject lastSavedEcore = null;

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

  private void setContent(final IDocument document, final FileEditorInput editorInput) {
    try {
      final IFile iFile = editorInput.getFile();
      final EModelElement ecoreRoot = (EModelElement) EcoreUtilities
          .getRootObject(editorInput.getFile().getFullPath().toString());
      EAnnotation sourceAnno = ecoreRoot.getEAnnotation(AnnotationSources.SOURCE);
      if (EcoreUtil.equals(ecoreRoot, lastSavedEcore) && sourceAnno != null
          && sourceAnno.getDetails().get(AIEConstants.SOURCE.toString()) != null) {
        document.set(sourceAnno.getDetails().get(AIEConstants.SOURCE.toString()));
      } else {
        // Remove source annotation so EcoreTranslator really translates it
        if (lastSavedEcore != null)
          ecoreRoot.getEAnnotations().removeIf(a -> a.getSource().equals(AnnotationSources.SOURCE));
        document.set(translator.translate(ecoreRoot));
        if (document instanceof AIEDocument) {
          ((AIEDocument) document).setEcoreRoot(ecoreRoot);
          ((AIEDocument) document).setFile(iFile);
        }
      }
    } catch (final Exception e) {
      e.printStackTrace();
      document.set("");
    }
  }

  @Override
  protected IDocument createEmptyDocument() {
    return new AIEDocument();
  }

  @Override
  protected boolean setDocumentContent(final IDocument document, final IEditorInput editorInput,
      final String encoding) throws CoreException {
    setContent(document, (FileEditorInput) editorInput);
    return true;
  }

  @Override
  protected void doSaveDocument(final IProgressMonitor monitor, final Object element,
      final IDocument document, final boolean overwrite) throws CoreException {
    if (document instanceof AIEDocument) {
      lastSavedEcore = ((AIEDocument) document).saveInEcore(element, overwrite);
    }
  }
}
