package eu.modelwriter.core.alloyinecore.ui.editor.completion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ContextInformationValidator;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

import eu.modelwriter.core.alloyinecore.ui.editor.completion.util.AIECompletionUtil;

public class AIECompletionProcessor implements IContentAssistProcessor {

  private final char[] activationChars = new char[] {'#', ':', '=', ',', '.', '&', '@'};

  @Override
  public ICompletionProposal[] computeCompletionProposals(final ITextViewer viewer,
      final int offset) {
    final List<ICompletionProposal> proposals = new ArrayList<>();

    final IDocument document = viewer.getDocument();

    final AIECompletionUtil completionUtil = new AIECompletionUtil(document, offset);

    Set<AIECompletionProposal> completionWords;
    try {
      completionWords = completionUtil.getProposals().stream().map(p -> (AIECompletionProposal) p)
          .collect(Collectors.toSet());
    } catch (final BadLocationException e1) {
      return new ICompletionProposal[0];
    }

    Character c = null;
    try {
      c = document.getChar(offset - 1);
    } catch (final BadLocationException e) {
      e.printStackTrace();
    }
    int temp = offset - 1;
    StringBuilder builder = new StringBuilder();

    if (Character.isAlphabetic(c)) {
      while (!Character.isWhitespace(c)) {
        builder.append(c);
        temp--;
        try {
          c = document.getChar(temp);
        } catch (final BadLocationException e) {
        }
      }
      builder = builder.reverse();

      for (final AIECompletionProposal cp : completionWords) {
        String regex = "(\\s*)";
        for (final char ch : builder.toString().toCharArray()) {
          regex += "(" + ch + ")" + "(\\s*)";
        }
        final Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
        final Matcher matcher = p.matcher(cp.getReplacementString());
        if (matcher.find()) {
          cp.setReplacementOffset(temp + 1);
          cp.setReplacementLength(builder.length());
          cp.setCursorPosition(cp.getReplacementString().length());
          proposals.add(cp);
        }
      }
    } else {
      for (final AIECompletionProposal cp : completionWords) {
        String regex = "(\\s*)";
        for (final char ch : builder.toString().toCharArray()) {
          regex += "(" + ch + ")" + "(\\s*)";
        }
        final Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
        final Matcher matcher = p.matcher(cp.getReplacementString());
        if (matcher.find()) {
          cp.setReplacementOffset(temp + 1);
          cp.setReplacementLength(builder.length());
          cp.setCursorPosition(cp.getReplacementString().length());
          proposals.add(cp);
        }
      }
    }

    final ICompletionProposal[] result = new ICompletionProposal[proposals.size()];
    proposals.toArray(result);
    return result;
  }

  @Override
  public char[] getCompletionProposalAutoActivationCharacters() {
    return activationChars;
  }

  private final IContextInformation[] NO_CONTEXTS = {};

  @Override
  public IContextInformation[] computeContextInformation(final ITextViewer viewer,
      final int offset) {
    return NO_CONTEXTS;
  }

  @Override
  public char[] getContextInformationAutoActivationCharacters() {
    return null;
  }

  @Override
  public String getErrorMessage() {
    return "No completions available.";
  }

  @Override
  public IContextInformationValidator getContextInformationValidator() {
    return new ContextInformationValidator(this);
  }
}
