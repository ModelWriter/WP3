package eu.modelwriter.kodkod.editor.scanners;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

import eu.modelwriter.kodkod.editor.rules.RelationBoundsRule;

public class RelationModelPartitionScanner extends RuleBasedPartitionScanner {
  public final static String RELATION_MODEL_COMMENT = "__RELATION_MODEL_COMMENT";
  public final static String RELATION_MODEL_OPTION = "__RELATION_MODEL_OPTION";
  public final static String RELATION_MODEL_UNIVERSE = "__RELATION_MODEL_UNIVERSE";
  public final static String RELATION_MODEL_REL_BOUND = "__RELATION_MODEL_REL_BOUND";
  public final static String DEFAULT_CONTENT_TYPE = "__dftl_partition_content_type";

  public final static String[] PARTITION_TYPES = new String[] {IDocument.DEFAULT_CONTENT_TYPE,
      RelationModelPartitionScanner.RELATION_MODEL_COMMENT,
      RelationModelPartitionScanner.RELATION_MODEL_OPTION,
      RelationModelPartitionScanner.RELATION_MODEL_UNIVERSE,
      RelationModelPartitionScanner.RELATION_MODEL_REL_BOUND};

  public RelationModelPartitionScanner() {
    final IToken commentPartition = new Token(RelationModelPartitionScanner.RELATION_MODEL_COMMENT);
    final IToken optionPartition = new Token(RelationModelPartitionScanner.RELATION_MODEL_OPTION);
    final IToken universePartition =
        new Token(RelationModelPartitionScanner.RELATION_MODEL_UNIVERSE);
    final IToken relBoundPartition =
        new Token(RelationModelPartitionScanner.RELATION_MODEL_REL_BOUND);

    final List<IRule> rules = new ArrayList<IRule>();
    rules.add(new MultiLineRule("/**", "**/", commentPartition));
    rules.add(new EndOfLineRule("--", commentPartition));
    // rules.add(new EndOfLineRule("//", commentPartition));
    rules.add(new MultiLineRule("options {", "}", optionPartition));
    rules.add(new MultiLineRule("universe {", "}", universePartition));
    rules.add(new MultiLineRule("universe [", "]", universePartition));
    rules.add(new RelationBoundsRule("relations", "}", relBoundPartition));

    final IPredicateRule[] result = new IPredicateRule[rules.size()];
    rules.toArray(result);
    this.setPredicateRules(result);
  }

  @Override
  public void setPartialRange(final IDocument document, int offset, final int length,
      final String contentType, final int partitionOffset) {
    if (contentType != null
        && contentType.equals(RelationModelPartitionScanner.RELATION_MODEL_REL_BOUND)) {
      offset = partitionOffset;
    }
    super.setPartialRange(document, offset, length, contentType, partitionOffset);
  }
}
