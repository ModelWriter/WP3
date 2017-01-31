package eu.modelwriter.core.alloyinecore.visitor;

import eu.modelwriter.core.alloyinecore.structure.*;
import eu.modelwriter.core.alloyinecore.structure.Class;
import eu.modelwriter.core.alloyinecore.structure.Enum;
import eu.modelwriter.core.alloyinecore.structure.Package;

public interface AlloyInEcoreVisitor<T> extends IVisitor<T> {

    T visitAnnotationReference(AnnotationReference annotationReference);


    T visitOperation(Operation operation);


    T visitIntConstant(IntExpression.IntConstant intConstant);


    T visitPreCondition(PreCondition preCondition);


    T visitNot(Formula.Not not);


    T visitProduct(Expression.Product product);


    T visitDivide(IntExpression.Divide divide);


    T visitSumDeclaration(Formula.SumDeclaration sumDeclaration);


    T visitEnumLiteral(EnumLiteral enumLiteral);


    T visitClosure(Expression.Closure closure);


    T visitOneOf(QuantifierDeclaration.OneOf oneOf);


    T visitFalse(Formula.False _false);


    T visitAnnotationDetail(AnnotationDetail annotationDetail);


    T visitModulo(IntExpression.Modulo modulo);


    T visitInterface(Interface _interface);


    T visitIfExpression(Expression.IfExpression ifExpression);


    T visitBoxJoin(Expression.BoxJoin boxJoin);


    T visitMultiply(IntExpression.Multiply multiply);


    T visitGenericSuperType(GenericSuperType genericSuperType);


    T visitLone(Formula.Lone lone);


    T visitAnd(Formula.And and);


    T visitInts(Expression.Ints ints);


    T visitImplies(Formula.Implies implies);


    T visitImport(Import _import);


    T visitEcoreImport(EcoreImport ecoreImport);


    T visitComprehensionDeclaration(ComprehensionDeclaration comprehensionDeclaration);


    T visitSetOf(QuantifierDeclaration.SetOf setOf);


    T visitForNo(Formula.ForNo forNo);


    T visitParameter(Parameter parameter);


    T visitInitial(Initial initial);


    T visitTypeParameter(TypeParameter typeParameter);


    T visitDerivation(Derivation derivation);


    T visitPrimitiveType(PrimitiveType primitiveType);


    T visitEnum(Enum _enum);


    T visitIntersection(Expression.Intersection intersection);


    T visitReflexive(Expression.Reflexive reflexive);


    T visitTrue(Formula.True _true);


    T visitCount(IntExpression.Count count);


    T visitGenericException(GenericException genericException);


    T visitLt(Formula.Lt lt);


    T visitRelationalOverride(Expression.RelationalOverride relationalOverride);


    T visitForAll(Formula.ForAll forAll);


    T visitBody(Body body);


    T visitGenericTypeArgument(GenericTypeArgument genericTypeArgument);


    T visitFunction(Formula.Function function);


    T visitPlus(IntExpression.Plus plus);


    T visitJoin(Expression.Join join);


    T visitUniv(Expression.Univ univ);


    T visitIfIntExpression(IntExpression.IfIntExpression ifIntExpression);


    T visitInvariant(Invariant invariant);

    T visitVariable(Variable variable);

    T visitDifference(Expression.Difference difference);


    T visitEqual(Formula.Equal equal);


    T visitVar(Expression.Var var);


    T visitIff(Formula.Iff iff);


    T visitSome(Formula.Some some);


    T visitGenericType(GenericType genericType);


    T visitMinus(IntExpression.Minus minus);


    T visitEq(Formula.Eq eq);


    T visitMultiplicity(Multiplicity multiplicity);


    T visitSomeOf(QuantifierDeclaration.SomeOf someOf);


    T visitOr(Formula.Or or);


    T visitGenericWildcard(GenericWildcard genericWildcard);


    T visitNone(Expression.None none);


    T visitUnion(Expression.Union union);


    T visitReference(Reference reference);


    T visitPackage(Package _package);


    T visitForSome(Formula.ForSome forSome);


    T visitGenericElementType(GenericElementType genericElementType);


    T visitComprehension(Expression.Comprehension comprehension);


    T visitGte(Formula.Gte gte);


    T visitClass(Class _class);


    T visitForOne(Formula.ForOne forOne);


    T visitAttribute(Attribute attribute);


    T visitSum(IntExpression.Sum sum);


    T visitGt(Formula.Gt gt);


    T visitTranspose(Expression.Transpose transpose);


    T visitAnnotation(Annotation annotation);


    T visitOne(Formula.One one);


    T visitModule(Module module);


    T visitRel(Expression.Rel rel);


    T visitLte(Formula.Lte lte);


    T visitLetDeclaration(LetDeclaration letDeclaration);


    T visitPostCondition(PostCondition postCondition);


    T visitTotalOrder(Formula.TotalOrder totalOrder);


    T visitIn(Formula.In in);


    T visitAcyclic(Formula.Acyclic acyclic);


    T visitForLone(Formula.ForLone forLone);


    T visitNo(Formula.No no);


    T visitLoneOf(QuantifierDeclaration.LoneOf loneOf);


    T visitIden(Expression.Iden iden);


    T visitDataType(DataType dataType);

    T visitNotIn(Formula.NotIn notIn);

    T visitNotEqual(Formula.NotEqual notEqual);

    T visitNotEq(Formula.NotEq notEq);

    T visitNotLt(Formula.NotLt notLt);

    T visitNotLte(Formula.NotLte notLte);

    T visitNotGt(Formula.NotGt notGt);

    T visitNotGte(Formula.NotGte notGte);

    T visitPartialFunction(Formula.PartialFunction partialFunction);
}
