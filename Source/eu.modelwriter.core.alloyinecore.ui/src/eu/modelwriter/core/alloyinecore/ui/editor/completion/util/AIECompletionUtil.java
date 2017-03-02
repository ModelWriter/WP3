package eu.modelwriter.core.alloyinecore.ui.editor.completion.util;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;

import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreLexer;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.ModelContext;
import eu.modelwriter.core.alloyinecore.structure.base.Element;

public class AIECompletionUtil {
  private static IDocument document;
  private final int offset;

  private AlloyInEcoreLexer cutDocLexer;
  private CommonTokenStream cutDocTokens;
  private AlloyInEcoreParser cutDocParser;

  private int minDistance = Integer.MAX_VALUE;
  private ParseTree closerNode = null;

  public AIECompletionUtil(final IDocument document, final int offset) {
    AIECompletionUtil.document = document;
    this.offset = offset;
  }

  public Set<String> getProposals() throws BadLocationException {
    cutDocLexer =
        new AlloyInEcoreLexer(new ANTLRInputStream(AIECompletionUtil.document.get(0, offset)));
    cutDocTokens = new CommonTokenStream(cutDocLexer);
    cutDocParser = new AlloyInEcoreParser(cutDocTokens);

    final ModelContext cutModelCtx = cutDocParser.model();

    findCloserNode(cutModelCtx);

    if (closerNode == null) {
      closerNode = cutModelCtx;
    }

    final ParserRuleContext parentOfCloserNode = (ParserRuleContext) closerNode.getParent();

    final SuggestionDetector suggestionDetector =
        new SuggestionDetector(AIECompletionUtil.document, offset, parentOfCloserNode, closerNode);
    final Set<String> detectedSuggestions = suggestionDetector.detect();
    final Set<String> allProposals = new HashSet<>();
    allProposals.addAll(detectedSuggestions);
    return allProposals;
  }

  private void findCloserNode(final ParseTree root) {
    if (root instanceof ParserRuleContext) {
      if (((ParserRuleContext) root).getStart().getStartIndex() <= offset) {
        final int distance = offset - ((ParserRuleContext) root).getStart().getStartIndex();
        if (distance <= minDistance
            && ((ParserRuleContext) root).getStart().getType() != Recognizer.EOF) {
          minDistance = distance;
          closerNode = root;
        }
        if (root.getChildCount() > 0) {
          final List<ParseTree> ownedElements = ((ParserRuleContext) root).children;
          for (int i = 0; i < ownedElements.size(); i++) {
            final ParseTree element = ownedElements.get(i);
            findCloserNode(element);
          }
        }
      }
    } else if (root instanceof TerminalNode) {
      if (((TerminalNode) root).getSymbol().getStartIndex() <= offset) {
        final int distance = offset - ((TerminalNode) root).getSymbol().getStartIndex();
        if (distance <= minDistance) {
          if (!(root instanceof ErrorNode
              && ((TerminalNode) root).getSymbol().getStopIndex() + 1 == offset)) {
            minDistance = distance;
            closerNode = root;
          }
        }
      }
    }
  }

  public static ParserRuleContext getFullContext(final ParserRuleContext cutCtx) {
    final AlloyInEcoreLexer lexer =
        new AlloyInEcoreLexer(new ANTLRInputStream(AIECompletionUtil.document.get()));
    final CommonTokenStream tokens = new CommonTokenStream(lexer);
    final AlloyInEcoreParser parser = new AlloyInEcoreParser(tokens);

    final ModelContext modelContext = parser.model();

    return AIECompletionUtil.findFullContext(modelContext, cutCtx);
  }

  private static ParserRuleContext findFullContext(final ParserRuleContext fullCtx,
      final ParserRuleContext cutCtx) {
    if (fullCtx.getClass().equals(cutCtx.getClass())) {
      try {
        final Field currentElementFieldcutCtx = cutCtx.getClass().getField("current");
        final Field currentElementFieldFullCtx =
            fullCtx.getClass().getField("current");
        if (currentElementFieldcutCtx != null && currentElementFieldFullCtx != null) {
          final Element<?> cutCtxElement = (Element<?>) currentElementFieldcutCtx.get(cutCtx);
          final Element<?> fullCtxElement = (Element<?>) currentElementFieldFullCtx.get(fullCtx);
          if (cutCtxElement.getUniqueName().equals(fullCtxElement.getUniqueName())) {
            return fullCtx;
          }
        }
      } catch (NoSuchFieldException | SecurityException | IllegalArgumentException
          | IllegalAccessException e) {
        e.printStackTrace();
      }
    } else {
      for (final ParseTree child : fullCtx.children) {
        if (child instanceof ParserRuleContext) {
          final ParserRuleContext context =
              AIECompletionUtil.findFullContext((ParserRuleContext) child, cutCtx);
          if (context != null) {
            return context;
          }
        }
      }
    }
    return null;
  }
}
