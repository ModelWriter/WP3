package eu.modelwriter.core.alloyinecore.ui.editor.hyperlink;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.editors.text.TextEditor;

import eu.modelwriter.core.alloyinecore.structure.base.Element;
import eu.modelwriter.core.alloyinecore.structure.imports.ImportedClass;
import eu.modelwriter.core.alloyinecore.ui.Activator;

public class AIEHyperlink implements IHyperlink {

  private final Element targetElement;
  private final Element linkElement;

  public AIEHyperlink(final Element targetElement, final Element linkElement) {
    this.targetElement = targetElement;
    this.linkElement = linkElement;
  }

  @Override
  public IRegion getHyperlinkRegion() {
    if (linkElement != null) {
      if (linkElement.getContext().getText().contains("::"))
        return new Region(linkElement.getContext().stop.getStartIndex(),
            linkElement.getContext().stop.getStopIndex()
                - linkElement.getContext().stop.getStartIndex() + 1);
      return new Region(linkElement.getStart(), linkElement.getStop() - linkElement.getStart() + 1);
    }
    return null;
  }

  @Override
  public String getTypeLabel() {
    return "AIEHyperlink";
  }

  @Override
  public String getHyperlinkText() {
    return "Open declaration";
  }

  @Override
  public void open() {
    if (targetElement instanceof ImportedClass || targetElement instanceof ImportedClass) {
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

}
