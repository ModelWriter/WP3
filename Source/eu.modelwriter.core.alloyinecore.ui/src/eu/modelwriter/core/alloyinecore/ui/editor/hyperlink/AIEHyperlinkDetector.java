package eu.modelwriter.core.alloyinecore.ui.editor.hyperlink;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.jface.text.hyperlink.IHyperlinkDetector;
import org.eclipse.jface.text.source.ISourceViewer;

import eu.modelwriter.core.alloyinecore.structure.model.RootPackage;
import eu.modelwriter.core.alloyinecore.ui.editor.AIEEditor;

public class AIEHyperlinkDetector implements IHyperlinkDetector {

  private final ISourceViewer sourceViewer;
  public AIEEditor editor;
  private final AIEHyperlinkUtil hyperlinkUtil;

  public AIEHyperlinkDetector(final ISourceViewer sourceViewer, final AIEEditor fTextEditor) {
    this.sourceViewer = sourceViewer;
    editor = fTextEditor;
    hyperlinkUtil = new AIEHyperlinkUtil();
  }

  @SuppressWarnings({"unchecked"})
  @Override
  public IHyperlink[] detectHyperlinks(final ITextViewer textViewer, final IRegion region,
      final boolean canShowMultipleHyperlinks) {
    AIEHyperlink hyperlink = null;
    try {
      hyperlink = hyperlinkUtil.getHyperlink(
          editor.getRootElement().getOwnedElement(RootPackage.class),
          sourceViewer.getDocument().getLineOfOffset(region.getOffset()) + 1, region.getOffset());
    } catch (final BadLocationException e) {
      e.printStackTrace();
    }

    if (hyperlink != null) {
      final List<IHyperlink> result = new ArrayList<>();
      result.add(hyperlink);
      return result.toArray(new IHyperlink[0]);
    }
    return null;
  }

}
