package eu.modelwriter.core.alloyinecore.ui.editor.hyperlink;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.FileEditorInput;

import eu.modelwriter.configuration.internal.Utilities;
import eu.modelwriter.core.alloyinecore.structure.base.Element;
import eu.modelwriter.core.alloyinecore.structure.imports.ImportedClass;
import eu.modelwriter.core.alloyinecore.structure.imports.ImportedDataType;
import eu.modelwriter.core.alloyinecore.ui.Activator;

public class AIEHyperlink implements IHyperlink {

  private final Element<?> targetElement;
  private final IRegion region;

  public AIEHyperlink(final Element<?> targetElement, final Element<?> linkElement) {
    this.targetElement = targetElement;
    if (linkElement.getContext().getText().contains("::"))
      region = new Region(linkElement.getContext().stop.getStartIndex(),
          linkElement.getContext().stop.getStopIndex()
              - linkElement.getContext().stop.getStartIndex() + 1);
    else
      region =
          new Region(linkElement.getStart(), linkElement.getStop() - linkElement.getStart() + 1);
  }

  @Override
  public IRegion getHyperlinkRegion() {
    return region;
  }

  @Override
  public String getTypeLabel() {
    return "AIE Hyperlink";
  }

  @Override
  public String getHyperlinkText() {
    return "Open declaration";
  }

  @Override
  public void open() {
    if (targetElement instanceof ImportedClass || targetElement instanceof ImportedDataType) {
      // Not implemented
    } else {
      final TextEditor editor =
          (TextEditor) Activator.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
      if (targetElement != null) {
        editor.selectAndReveal(targetElement.getStart(),
            targetElement.getStop() - targetElement.getStart() + 1);
        editor.setFocus();
      }
    }
  }

  public EcoreEditor openEcoreEditor(String path) {
    try {
      IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
      IFile iFile = Utilities.getIFileFromPath(path);
      FileEditorInput fInput = new FileEditorInput(iFile);
      if (page != null) {
        return (EcoreEditor) page.openEditor(fInput,
            "org.eclipse.emf.ecore.presentation.EcoreEditorID", true,
            IWorkbenchPage.MATCH_ID | IWorkbenchPage.MATCH_INPUT);
      }
    } catch (WorkbenchException e) {
      e.printStackTrace();
    }
    return null;
  }

}
