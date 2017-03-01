package eu.modelwriter.core.alloyinecore.ui.editor.hyperlink;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.jface.text.hyperlink.IHyperlinkDetector;
import org.eclipse.jface.text.source.ISourceViewer;

import eu.modelwriter.core.alloyinecore.structure.base.Element;
import eu.modelwriter.core.alloyinecore.structure.base.INavigable;
import eu.modelwriter.core.alloyinecore.structure.base.ITarget;
import eu.modelwriter.core.alloyinecore.structure.model.Import;
import eu.modelwriter.core.alloyinecore.ui.editor.AIEEditor;

public class AIEHyperlinkDetector implements IHyperlinkDetector {

  private final ISourceViewer sourceViewer;
  public AIEEditor editor;

  public AIEHyperlinkDetector(final ISourceViewer sourceViewer, final AIEEditor editor) {
    this.sourceViewer = sourceViewer;
    this.editor = editor;
  }

  @Override
  public IHyperlink[] detectHyperlinks(final ITextViewer textViewer, final IRegion region,
      final boolean canShowMultipleHyperlinks) {
    final List<IHyperlink> result = new ArrayList<>();
    try {
      Element<?> selectedElement = editor.findElement(
          sourceViewer.getDocument().getLineOfOffset(region.getOffset()) + 1, region.getOffset());
      if (selectedElement != null && selectedElement instanceof INavigable) {
        if (selectedElement instanceof Import) {
          // TODO implement opening of imports
          // result.add(new AIEImportHyperlink((Import) selectedElement));
        } else {
          ITarget target = ((INavigable) selectedElement).getTarget();
          if (target != null && !target.equals(selectedElement)) {
            result.add(new AIEHyperlink((Element<?>) target, selectedElement));
          }
        }
      }
    } catch (BadLocationException e) {
      System.out.println("BadLocationException at detectHyperlinks: " + e.getMessage());
    }
    return result.isEmpty() ? null : result.toArray(new IHyperlink[0]);
  }
}
