package eu.modelwriter.core.alloyinecore.ui.editor.hyperlink;

import eu.modelwriter.core.alloyinecore.structure.base.Element;
import eu.modelwriter.core.alloyinecore.structure.base.INavigable;
import eu.modelwriter.core.alloyinecore.structure.base.ITarget;
import eu.modelwriter.core.alloyinecore.ui.editor.util.EditorUtils;
import eu.modelwriter.core.alloyinecore.visitor.ElementVisitorImpl;

public class AIEHyperlinkUtil {
  @SuppressWarnings("rawtypes")
  public AIEHyperlink getHyperlink(final Element rootElement, final int line, final int offset) {
    final INavigable linkElement = getLinkElement(rootElement, line, offset);
    if (linkElement != null) {
      final ITarget targetElement = getTarget(rootElement, linkElement);
      if (targetElement != null && !targetElement.equals(linkElement)) {
        final AIEHyperlink aieHyperlink =
            new AIEHyperlink((Element) targetElement, (Element) linkElement);
        return aieHyperlink;
      }
    }
    return null;
  }

  /**
   * 
   * @param rootElement
   * @param line
   * @param offset
   * @return an {@link Element} instance of {@link INavigable}
   */
  @SuppressWarnings("rawtypes")
  private INavigable getLinkElement(final Element rootElement, final int line, final int offset) {
    final Element linkElement = EditorUtils.findElement(rootElement, line, offset);
    if (linkElement instanceof INavigable) {
      return (INavigable) linkElement;
    }
    return null;
  }

  /**
   * 
   * @param rootElement
   * @param linkElement
   * @return an {@link Element} instance of {@link ITarget}
   */
  @SuppressWarnings({"rawtypes", "unchecked"})
  private ITarget getTarget(final Element rootElement, final INavigable linkElement) {
    final TargetVisitor targetVisitor = new TargetVisitor(rootElement, linkElement);
    targetVisitor.visit(rootElement);
    final ITarget targetElement = targetVisitor.getTarget();
    return targetElement;
  }

  private static class TargetVisitor extends ElementVisitorImpl<Object> {

    private ITarget target = null;
    @SuppressWarnings("rawtypes")
    private final Element rootElement;
    private final INavigable linkElement;

    /**
     * 
     * @param rootElement
     * @param linkElement must be {@link INavigable}
     */
    @SuppressWarnings("rawtypes")
    public TargetVisitor(final Element rootElement, final INavigable linkElement) {
      this.rootElement = rootElement;
      this.linkElement = linkElement;
    }

    public ITarget getTarget() {
      return target;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Object visitElement(final Element element) {
      if (element instanceof ITarget) {
        final String relativeSegment =
            rootElement.getToken().getText() + "::" + ((ITarget) element).getRelativeSegment();
        String link = linkElement.getPathName();
        if (!link.startsWith(rootElement.getToken().getText() + "::")) {
          link = rootElement.getToken().getText() + "::" + link;
        }
        if (relativeSegment.equals(link)) {
          target = (ITarget) element;
        }
      }
      return super.visitElement(element);
    }
  }
}
