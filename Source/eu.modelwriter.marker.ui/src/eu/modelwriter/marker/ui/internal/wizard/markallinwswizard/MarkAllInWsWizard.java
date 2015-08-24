package eu.modelwriter.marker.ui.internal.wizard.markallinwswizard;

import java.util.Scanner;
import java.util.UUID;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ide.IDE;

import eu.modelwriter.marker.MarkerActivator;
import eu.modelwriter.marker.internal.AnnotationFactory;
import eu.modelwriter.marker.internal.MarkElementUtilities;
import eu.modelwriter.marker.internal.MarkerFactory;
import eu.modelwriter.marker.ui.Activator;

public class MarkAllInWsWizard extends Wizard {

  private MarkAllInWsPage page;
  private ITextSelection textSelection;
  private IFile file;

  public MarkAllInWsWizard(ITextSelection textSelection, IFile file) {
    super();
    this.textSelection = textSelection;
    this.file = file;
  }

  @Override
  public void addPages() {
    page = new MarkAllInWsPage();
    super.addPages();
    this.addPage(page);
  }

  @Override
  public String getWindowTitle() {
    return "Mark All In Workspace";
  }

  @SuppressWarnings("static-access")
  @Override
  public boolean performFinish() {
    Object[] checkedElements = page.checkboxTreeViewer.getCheckedElements();
    String text = textSelection.getText();
    String leader_id = UUID.randomUUID().toString();
    boolean success = false;
    for (Object object : checkedElements) {
      try {
        if (object instanceof IFile) {
          IFile iFile = (IFile) object;
          if (!iFile.getFileExtension().equals("xmi") && !iFile.getFileExtension().equals("ecore")
              && !iFile.getFileExtension().equals("reqif")) {
            String charSet = iFile.getCharset();
            Scanner scanner = new Scanner(iFile.getContents(), charSet);
            IDocument document = new Document(scanner.useDelimiter("\\A").next());
            scanner.close();

            String fullText = document.get();
            boolean hasLeader = false;
            int index = 0;
            int offset = 0;
            int lenght = textSelection.getLength();
            String id = UUID.randomUUID().toString();

            IEditorPart editor =
                IDE.openEditor(Activator.getActiveWorkbenchWindow().getActivePage(), iFile);

            if (lenght != 0) {
              while ((offset = fullText.indexOf(text, index)) != -1) {
                TextSelection nextSelection = new TextSelection(document, offset, lenght);
                if (MarkerFactory.findMarkerByOffset(iFile, offset) == null) {
                  IMarker mymarker = MarkerFactory.createMarker(iFile, nextSelection);
                  MarkElementUtilities.setGroupId(mymarker, id);
                  if (!iFile.equals(this.file)) {
                    if (hasLeader == false) {
                      MarkElementUtilities.setLeaderId(mymarker, leader_id);
                      hasLeader = true;
                    }
                  } else {
                    if (textSelection.getOffset() == offset) {
                      MarkElementUtilities.setLeaderId(mymarker, leader_id);
                    }
                  }

                  AnnotationFactory.addAnnotation(mymarker, editor,
                      AnnotationFactory.ANNOTATION_MARKING);
                }
                index = offset + lenght;
              }
            }
            success = true;
          } else {
            MessageDialog dialog =
                new MessageDialog(MarkerActivator.getShell(), "Mark All In Workspace", null,
                    iFile.getName() + " doesn't supported for this command.",
                    MessageDialog.INFORMATION, new String[] {"OK"}, 0);
            dialog.open();
            page.checkboxTreeViewer.setChecked(iFile, false);
          }
        }
      } catch (CoreException e) {
        e.printStackTrace();
      }
    }
    if (success == true) {
      MessageDialog dialog = new MessageDialog(MarkerActivator.getShell(), "Mark All In Workspace",
          null, "Selected project(s) have been marked by selected text", MessageDialog.INFORMATION,
          new String[] {"OK"}, 0);
      dialog.open();
      return true;
    } else {
      return false;
    }
  }
}