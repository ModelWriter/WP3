package eu.modelwriter.core.alloyinecore.ui.editor.hyperlink;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.part.FileEditorInput;

import eu.modelwriter.configuration.internal.Utilities;
import eu.modelwriter.core.alloyinecore.structure.base.INavigable;
import eu.modelwriter.core.alloyinecore.structure.model.Import;
import eu.modelwriter.core.alloyinecore.ui.editor.AIEEditor;

public class AIEImportHyperlink implements IHyperlink {

  private final Import targetElement;
  private final IRegion region;

  public AIEImportHyperlink(final Import targetElement) {
    this.targetElement = targetElement;
    region = new Region(targetElement.getStart(),
        targetElement.getStop() - targetElement.getStart() + 1);
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
    EcoreEditor editor = openEcoreEditor(((INavigable) targetElement).getPathName());
  }

  public EcoreEditor openEcoreEditor(String path) {
    try {
      IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
      IFile iFile = Utilities.getIFileFromPath(path);
      FileEditorInput fInput = new FileEditorInput(iFile);
      if (page != null) {
        return (EcoreEditor) page.openEditor(fInput, AIEEditor.editorID, true,
            IWorkbenchPage.MATCH_ID | IWorkbenchPage.MATCH_INPUT);
      }
    } catch (WorkbenchException e) {
      e.printStackTrace();
    }
    return null;
  }

}
