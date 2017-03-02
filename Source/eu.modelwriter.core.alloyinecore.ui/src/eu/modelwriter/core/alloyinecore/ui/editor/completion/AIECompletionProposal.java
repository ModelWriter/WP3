package eu.modelwriter.core.alloyinecore.ui.editor.completion;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

public class AIECompletionProposal implements ICompletionProposal {

  private final String fDisplayString;
  private final String fReplacementString;
  private int fReplacementOffset;
  private int fReplacementLength;
  private int fCursorPosition;
  private final Image fImage;
  private final IContextInformation fContextInformation;
  private final String fAdditionalProposalInfo;

  public AIECompletionProposal(final String replacementString) {
    this(replacementString, null, null, null, null);
  }

  public AIECompletionProposal(final String replacementString, final Image image,
      final String displayString, final IContextInformation contextInformation,
      final String additionalProposalInfo) {

    fReplacementString = replacementString;
    fImage = image;
    fDisplayString = displayString;
    fContextInformation = contextInformation;
    fAdditionalProposalInfo = additionalProposalInfo;
  }

  @Override
  public void apply(final IDocument document) {
    try {
      document.replace(fReplacementOffset, fReplacementLength, fReplacementString);
    } catch (final BadLocationException x) {
      // ignore
    }
  }

  @Override
  public Point getSelection(final IDocument document) {
    return new Point(fReplacementOffset + fCursorPosition, 0);
  }

  @Override
  public IContextInformation getContextInformation() {
    return fContextInformation;
  }

  @Override
  public Image getImage() {
    return fImage;
  }

  @Override
  public String getDisplayString() {
    if (fDisplayString != null) {
      return fDisplayString;
    }
    return fReplacementString;
  }

  @Override
  public String getAdditionalProposalInfo() {
    return fAdditionalProposalInfo;
  }

  public String getReplacementString() {
    return fReplacementString;
  }

  public void setReplacementOffset(final int replacementOffset) {
    fReplacementOffset = replacementOffset;
  }

  public void setReplacementLength(final int replacementLength) {
    fReplacementLength = replacementLength;
  }

  public void setCursorPosition(final int cursorPosition) {
    fCursorPosition = cursorPosition;
  }

  @Override
  public boolean equals(final Object obj) {
    if (this.getClass().isInstance(obj)
        && ((AIECompletionProposal) obj).getReplacementString().equals(getReplacementString())) {
      return true;
    }
    return false;
  }
}
