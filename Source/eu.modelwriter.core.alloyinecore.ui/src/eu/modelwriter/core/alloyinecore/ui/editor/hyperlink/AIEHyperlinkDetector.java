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
import eu.modelwriter.core.alloyinecore.structure.model.RootPackage;
import eu.modelwriter.core.alloyinecore.ui.editor.AIEEditor;
import eu.modelwriter.core.alloyinecore.ui.editor.util.EditorUtils;
import eu.modelwriter.core.alloyinecore.visitor.ElementVisitorImpl;

public class AIEHyperlinkDetector implements IHyperlinkDetector {

  private final ISourceViewer sourceViewer;
  public AIEEditor editor;

  public AIEHyperlinkDetector(final ISourceViewer sourceViewer, final AIEEditor fTextEditor) {
    this.sourceViewer = sourceViewer;
    editor = fTextEditor;
  }

  @SuppressWarnings({"rawtypes", "unchecked"})
  @Override
  public IHyperlink[] detectHyperlinks(final ITextViewer textViewer, final IRegion region,
      final boolean canShowMultipleHyperlinks) {
    Element linkElement = null;
    try {
      linkElement = EditorUtils.findElement(editor.getRootElement(),
          sourceViewer.getDocument().getLineOfOffset(region.getOffset()) + 1, region.getOffset());
    } catch (BadLocationException | NullPointerException e) {
      e.printStackTrace();
    }

    final List<IHyperlink> result = new ArrayList<>();
    if (linkElement != null) {
      final TargetVisitor targetVisitor =
          new TargetVisitor(editor.getRootElement().getOwnedElement(RootPackage.class),
              linkElement);
      targetVisitor.visit(editor.getRootElement());
      final Element targetElement = targetVisitor.getTarget();

      if (targetElement != null && !targetElement.equals(linkElement)) {
        final AIEHyperlink aieHyperlink = new AIEHyperlink(targetElement, linkElement);
        result.add(aieHyperlink);
        return result.toArray(new IHyperlink[0]);
      }
    }
    return null;
  }

  private static class TargetVisitor extends ElementVisitorImpl<Object> {

    @SuppressWarnings("rawtypes")
    private Element target = null;
    @SuppressWarnings("rawtypes")
    private final Element rootElement;
    @SuppressWarnings("rawtypes")
    private final Element linkElement;

    @SuppressWarnings("rawtypes")
    public TargetVisitor(final Element rootElement, final Element linkElement) {
      this.rootElement = rootElement;
      this.linkElement = linkElement;
    }

    @SuppressWarnings("rawtypes")
    public Element getTarget() {
      return target;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Object visitElement(final Element element) {
      if (element instanceof ITarget) {
        final String relativeSegment =
            rootElement.getToken().getText() + "::" + ((ITarget) element).getRelativeSegment();
        if (linkElement instanceof INavigable) {
          String link = ((INavigable) linkElement).getPathName();
          if (!link.startsWith(rootElement.getToken().getText() + "::")) {
            link = rootElement.getToken().getText() + "::" + link;
          }
          if (relativeSegment.equals(link)) {
            target = element;
          }
        }
      }
      return super.visitElement(element);
    }

  }
}
