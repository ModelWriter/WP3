// Generated from C:/Users/emre.kirmizi/IdeaProjects/Core/src/Antlr\Core.g4 by ANTLR 4.5.1
package unit.verifier.core;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoreParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoreVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoreParser#specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecification(CoreParser.SpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoreParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(CoreParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoreParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(CoreParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoreParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(CoreParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoreParser#quantification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantification(CoreParser.QuantificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoreParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CoreParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoreParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(CoreParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoreParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(CoreParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoreParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOp(CoreParser.BinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoreParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(CoreParser.UnaryOpContext ctx);
}