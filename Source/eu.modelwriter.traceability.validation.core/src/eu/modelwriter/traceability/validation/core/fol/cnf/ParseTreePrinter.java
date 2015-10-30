package eu.modelwriter.traceability.validation.core.fol.cnf;

import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import eu.modelwriter.traceability.validation.core.fol.generated.CoreBaseVisitor;
import eu.modelwriter.traceability.validation.core.fol.generated.CoreParser.ConjunctionContext;
import eu.modelwriter.traceability.validation.core.fol.generated.CoreParser.DisjunctionContext;
import eu.modelwriter.traceability.validation.core.fol.generated.CoreParser.EquivalanceContext;
import eu.modelwriter.traceability.validation.core.fol.generated.CoreParser.ImplicationContext;
import eu.modelwriter.traceability.validation.core.fol.generated.CoreParser.NegationContext;
import eu.modelwriter.traceability.validation.core.fol.generated.CoreParser.ParenthesesContext;
import eu.modelwriter.traceability.validation.core.fol.generated.CoreParser.QuantificationContext;
import eu.modelwriter.traceability.validation.core.fol.generated.CoreParser.RelationContext;
import eu.modelwriter.traceability.validation.core.fol.generated.CoreParser.SentenceContext;
import eu.modelwriter.traceability.validation.core.fol.generated.CoreParser.SetContext;
import eu.modelwriter.traceability.validation.core.fol.generated.CoreParser.SpecificationContext;
import eu.modelwriter.traceability.validation.core.fol.generated.CoreParser.TupleContext;

public class ParseTreePrinter extends CoreBaseVisitor<String> {
  private StringBuilder builder;
  private String specification;

  public ParseTreePrinter() {
    this.builder = new StringBuilder();
  }

  public StringBuilder getBuilder() {
    return this.builder;
  }

  public void print() {
    System.out.println(this.specification);
  }

  @Override
  public String visitConjunction(ConjunctionContext ctx) {
    String left = this.visit(ctx.left);
    String right = this.visit(ctx.right);
    String op = " " + ctx.op.getText() + " ";

    String str = left + op + right;

    return str;
  }

  @Override
  public String visitDisjunction(DisjunctionContext ctx) {
    String left = this.visit(ctx.left);
    String right = this.visit(ctx.right);
    String op = " " + ctx.op.getText() + " ";

    String str = left + op + right;

    return str;
  }

  @Override
  public String visitEquivalance(EquivalanceContext ctx) {
    String left = this.visit(ctx.left);
    String right = this.visit(ctx.right);
    String op = " " + ctx.op.getText() + " ";

    String str = left + op + right;

    return str;
  }

  @Override
  public String visitImplication(ImplicationContext ctx) {
    String left = this.visit(ctx.left);
    String right = this.visit(ctx.right);
    String op = " " + ctx.op.getText() + " ";

    String str = left + op + right;

    return str;
  }

  @Override
  public String visitNegation(NegationContext ctx) {
    String op = ctx.op.getText() + " ";
    String str = op + this.visit(ctx.expr());

    return str;
  }

  @Override
  public String visitParentheses(ParenthesesContext ctx) {
    String str;
    if (ctx.expr() instanceof RelationContext) {
      str = this.visit(ctx.expr());
    } else {
      str = "(" + this.visit(ctx.expr()) + ")";
    }
    return str;
  }

  @Override
  public String visitQuantification(QuantificationContext ctx) {
    String op = ctx.quantifer().op.getText() + " ";
    String identifiers = "";

    List<TerminalNode> identifierList = ctx.quantifer().IDENTIFIER();
    for (int i = 0; i < identifierList.size() - 1; i++) {
      identifiers += identifierList.get(i).getText() + ", ";
    }
    identifiers += identifierList.get(identifierList.size() - 1).getText();

    String str = op + identifiers + " | " + this.visit(ctx.expr());

    return str;
  }

  @Override
  public String visitRelation(RelationContext ctx) {
    String str = ctx.getText();

    return str;
  }

  @Override
  public String visitSentence(SentenceContext ctx) {
    String str = "\t" + this.visit(ctx.expr()) + ";\n";

    return str;
  }

  @Override
  public String visitSet(SetContext ctx) {
    String str = "\t" + ctx.getText() + "\n";

    return str;
  }

  @Override
  public String visitSpecification(SpecificationContext ctx) {
    String model = "Model:\n";
    for (SetContext set : ctx.set()) {
      model += this.visit(set);
    }

    String sentences = "\nSentences:\n";
    for (SentenceContext sentence : ctx.sentence()) {
      sentences += this.visit(sentence);
    }

    this.specification = model + sentences;
    this.builder.append(this.specification);
    this.print();
    return sentences;
  }

  @Override
  public String visitTuple(TupleContext ctx) {
    String str = ctx.getText();

    return str;
  }
}