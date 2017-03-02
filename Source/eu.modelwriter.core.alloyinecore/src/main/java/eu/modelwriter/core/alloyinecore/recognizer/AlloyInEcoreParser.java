// Generated from /home/ferhat/git/WP3/Source/eu.modelwriter.core.alloyinecore/src/main/java/eu/modelwriter/core/alloyinecore/recognizer/AlloyInEcore.g4 by ANTLR 4.6
package eu.modelwriter.core.alloyinecore.recognizer;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ETypeParameter;

import eu.modelwriter.core.alloyinecore.structure.base.INamespace;
import eu.modelwriter.core.alloyinecore.structure.base.Repository;
import eu.modelwriter.core.alloyinecore.structure.base.Element;

import eu.modelwriter.core.alloyinecore.structure.model.ModelElement;
import eu.modelwriter.core.alloyinecore.structure.model.Annotation;
import eu.modelwriter.core.alloyinecore.structure.model.AnnotationDetail;
import eu.modelwriter.core.alloyinecore.structure.model.AnnotationReference;
import eu.modelwriter.core.alloyinecore.structure.model.NamedElement;
import eu.modelwriter.core.alloyinecore.structure.model.Model;
import eu.modelwriter.core.alloyinecore.structure.model.Import;
import eu.modelwriter.core.alloyinecore.structure.model.EcoreImport;
import eu.modelwriter.core.alloyinecore.structure.model.Package;
import eu.modelwriter.core.alloyinecore.structure.model.RootPackage;
import eu.modelwriter.core.alloyinecore.structure.model.Classifier;
import eu.modelwriter.core.alloyinecore.structure.model.Class;
import eu.modelwriter.core.alloyinecore.structure.model.Interface;
import eu.modelwriter.core.alloyinecore.structure.model.DataType;
import eu.modelwriter.core.alloyinecore.structure.model.Enum;
import eu.modelwriter.core.alloyinecore.structure.model.EnumLiteral;
import eu.modelwriter.core.alloyinecore.structure.model.StructuralFeature;
import eu.modelwriter.core.alloyinecore.structure.model.TypedElement;
import eu.modelwriter.core.alloyinecore.structure.model.Multiplicity;
import eu.modelwriter.core.alloyinecore.structure.model.Reference;
import eu.modelwriter.core.alloyinecore.structure.model.Attribute;
import eu.modelwriter.core.alloyinecore.structure.model.Operation;
import eu.modelwriter.core.alloyinecore.structure.model.Parameter;
import eu.modelwriter.core.alloyinecore.structure.model.GenericException;
import eu.modelwriter.core.alloyinecore.structure.model.TypeParameter;
import eu.modelwriter.core.alloyinecore.structure.model.GenericType;
import eu.modelwriter.core.alloyinecore.structure.model.GenericTypeArgument;
import eu.modelwriter.core.alloyinecore.structure.model.GenericElementType;
import eu.modelwriter.core.alloyinecore.structure.model.GenericSuperType;
import eu.modelwriter.core.alloyinecore.structure.model.GenericWildcard;
import eu.modelwriter.core.alloyinecore.structure.model.PrimitiveType;
import eu.modelwriter.core.alloyinecore.structure.model.Invariant;
import eu.modelwriter.core.alloyinecore.structure.model.Derivation;
import eu.modelwriter.core.alloyinecore.structure.model.Body;
import eu.modelwriter.core.alloyinecore.structure.model.PostCondition;
import eu.modelwriter.core.alloyinecore.structure.model.PreCondition;
import eu.modelwriter.core.alloyinecore.structure.model.Initial;

import eu.modelwriter.core.alloyinecore.structure.instance.ModelImport;
import eu.modelwriter.core.alloyinecore.structure.instance.Instance;
import eu.modelwriter.core.alloyinecore.structure.instance.Object;
import eu.modelwriter.core.alloyinecore.structure.instance.Slot;
import eu.modelwriter.core.alloyinecore.structure.instance.ObjectValue;
import eu.modelwriter.core.alloyinecore.structure.instance.EnumValue;
import eu.modelwriter.core.alloyinecore.structure.instance.IntegerValue;
import eu.modelwriter.core.alloyinecore.structure.instance.RealValue;
import eu.modelwriter.core.alloyinecore.structure.instance.BooleanValue;
import eu.modelwriter.core.alloyinecore.structure.instance.StringValue;
import eu.modelwriter.core.alloyinecore.structure.instance.NullValue;

import eu.modelwriter.core.alloyinecore.structure.constraints.Formula;
import eu.modelwriter.core.alloyinecore.structure.constraints.Expression;
import eu.modelwriter.core.alloyinecore.structure.constraints.IntExpression;
import eu.modelwriter.core.alloyinecore.structure.constraints.QuantifierDeclaration;
import eu.modelwriter.core.alloyinecore.structure.constraints.LetDeclaration;
import eu.modelwriter.core.alloyinecore.structure.constraints.ComprehensionDeclaration;
import eu.modelwriter.core.alloyinecore.structure.constraints.Variable;

import eu.modelwriter.core.alloyinecore.internal.AnnotationSources;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import java.io.IOException;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlloyInEcoreParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, INT=135, IDENTIFIER=136, DOUBLE_QUOTED_STRING=137, 
		SINGLE_QUOTED_STRING=138, ML_SINGLE_QUOTED_STRING=139, MULTILINE_COMMENT=140, 
		SINGLELINE_COMMENT=141, WS=142;
	public static final int
		RULE_options = 0, RULE_option = 1, RULE_instance = 2, RULE_modelImport = 3, 
		RULE_eObject = 4, RULE_slot = 5, RULE_dataValue = 6, RULE_multiValueData = 7, 
		RULE_eObjectValue = 8, RULE_literalValue = 9, RULE_enumValue = 10, RULE_booleanValue = 11, 
		RULE_integerValue = 12, RULE_realValue = 13, RULE_stringValue = 14, RULE_nullValue = 15, 
		RULE_model = 16, RULE_packageImport = 17, RULE_ePackage = 18, RULE_eClassifier = 19, 
		RULE_eClass = 20, RULE_eStructuralFeature = 21, RULE_eAttribute = 22, 
		RULE_eReference = 23, RULE_eOperation = 24, RULE_eGenericException = 25, 
		RULE_eGenericSuperType = 26, RULE_eParameter = 27, RULE_eMultiplicity = 28, 
		RULE_eDataType = 29, RULE_eEnum = 30, RULE_eEnumLiteral = 31, RULE_eAnnotation = 32, 
		RULE_eDetail = 33, RULE_eModelElement = 34, RULE_eNamedElement = 35, RULE_eTypedElement = 36, 
		RULE_eModelElementRef = 37, RULE_templateSignature = 38, RULE_eTypeParameter = 39, 
		RULE_eGenericTypeArgument = 40, RULE_eGenericType = 41, RULE_eGenericElementType = 42, 
		RULE_eGenericWildcard = 43, RULE_pathName = 44, RULE_segment = 45, RULE_ePrimitiveType = 46, 
		RULE_body = 47, RULE_invariant = 48, RULE_precondition = 49, RULE_postcondition = 50, 
		RULE_initial = 51, RULE_derivation = 52, RULE_visibilityKind = 53, RULE_formula = 54, 
		RULE_expression = 55, RULE_intExpression = 56, RULE_quantifierDeclarations = 57, 
		RULE_quantifierDeclaration = 58, RULE_letDeclarations = 59, RULE_letDeclaration = 60, 
		RULE_comprehensionDeclarations = 61, RULE_comprehensionDeclaration = 62, 
		RULE_relationId = 63, RULE_variable = 64, RULE_mult = 65, RULE_unrestrictedName = 66, 
		RULE_identifier = 67, RULE_upper = 68, RULE_lower = 69;
	public static final String[] ruleNames = {
		"options", "option", "instance", "modelImport", "eObject", "slot", "dataValue", 
		"multiValueData", "eObjectValue", "literalValue", "enumValue", "booleanValue", 
		"integerValue", "realValue", "stringValue", "nullValue", "model", "packageImport", 
		"ePackage", "eClassifier", "eClass", "eStructuralFeature", "eAttribute", 
		"eReference", "eOperation", "eGenericException", "eGenericSuperType", 
		"eParameter", "eMultiplicity", "eDataType", "eEnum", "eEnumLiteral", "eAnnotation", 
		"eDetail", "eModelElement", "eNamedElement", "eTypedElement", "eModelElementRef", 
		"templateSignature", "eTypeParameter", "eGenericTypeArgument", "eGenericType", 
		"eGenericElementType", "eGenericWildcard", "pathName", "segment", "ePrimitiveType", 
		"body", "invariant", "precondition", "postcondition", "initial", "derivation", 
		"visibilityKind", "formula", "expression", "intExpression", "quantifierDeclarations", 
		"quantifierDeclaration", "letDeclarations", "letDeclaration", "comprehensionDeclarations", 
		"comprehensionDeclaration", "relationId", "variable", "mult", "unrestrictedName", 
		"identifier", "upper", "lower"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'options'", "'{'", "','", "'}'", "'symmetry_breaking'", "':'", 
		"'bit_width'", "'skolem_depth'", "'sharing'", "'instance'", "';'", "'model'", 
		"'['", "']'", "'true'", "'false'", "'+'", "'-'", "'.'", "'null'", "'import'", 
		"'package'", "'='", "'abstract'", "'class'", "'interface'", "'extends'", 
		"'static'", "'ghost'", "'transient'", "'volatile'", "'readonly'", "'attribute'", 
		"'derived'", "'id'", "'ordered'", "'!ordered'", "'unique'", "'!unique'", 
		"'unsettable'", "'!unsettable'", "'property'", "'#'", "'composes'", "'resolve'", 
		"'!resolve'", "'key'", "'operation'", "'('", "')'", "'throws'", "'..'", 
		"'*'", "'?'", "'|?'", "'|1'", "'primitive'", "'datatype'", "'serializable'", 
		"'!serializable'", "'enum'", "'literal'", "'annotation'", "'reference'", 
		"'<'", "'>'", "'&'", "'super'", "'::'", "'@'", "'Boolean'", "'Integer'", 
		"'String'", "'Real'", "'UnlimitedNatural'", "'body'", "'callable'", "'invariant'", 
		"'precondition'", "'requires'", "'postcondition'", "'ensures'", "'initial'", 
		"'derivation'", "'public'", "'protected'", "'private'", "'no'", "'lone'", 
		"'one'", "'some'", "'!'", "'not'", "'in'", "'<='", "'>='", "'sum'", "'|'", 
		"'acyclic'", "'function'", "'->'", "'ord'", "'&&'", "'and'", "'||'", "'or'", 
		"'=>'", "'implies'", "'<=>'", "'iff'", "'all'", "'let'", "'~'", "'^'", 
		"'++'", "'if'", "'then'", "'else'", "'iden'", "'none'", "'univ'", "'ints'", 
		"'plus'", "'minus'", "'mul'", "'/'", "'div'", "'%'", "'modulo'", "'disj'", 
		"'set'", "'definition'", "'ensure'", "'require'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "INT", "IDENTIFIER", "DOUBLE_QUOTED_STRING", "SINGLE_QUOTED_STRING", 
		"ML_SINGLE_QUOTED_STRING", "MULTILINE_COMMENT", "SINGLELINE_COMMENT", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AlloyInEcore.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public Model model;
	public Instance instance;
	private boolean resolveImports = true;

	Repository repository = new Repository();


	URI uri;

	public AlloyInEcoreParser(TokenStream input, URI uri){
	    this(input);
	    this.uri = uri;
	    repository = new Repository(uri);
	}

	public AlloyInEcoreParser(TokenStream input, URI uri, boolean resolveImports){
	    this(input, uri);
	    this.resolveImports = resolveImports;
	}


	public void saveResource(String filename, String path){
	    model.printTree();
	    repository.printNamespaces();
	    if (model.getOwnedPackage() != null) {
	        ResourceSet metaResourceSet = new ResourceSetImpl();
	        metaResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMLResourceFactoryImpl());
	        Resource metaResource = metaResourceSet.createResource(URI.createURI(path + filename + ".ecore"));
	        metaResource.getContents().add(model.getOwnedPackage().getEObject());
	        try {
	            metaResource.save(null);
	        } catch (java.io.IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

	private String getLocation() { return "["+ getCurrentToken().getLine()+ ","+ getCurrentToken().getCharPositionInLine()+ "]";}

	private String getContextText(ParserRuleContext ctx){
	    return getTokenStream().getTokenSource().getInputStream().toString().substring(ctx.start.getStartIndex(),ctx.stop.getStopIndex());
	}


	private EcoreFactory eFactory = EcoreFactory.eINSTANCE;

	private void signalParsingCompletion() {
	    //restoreReferences();
	    //checkConstraints();
	}

	private void createEAnnotation(EModelElement owner, final String source) {
	    if (owner.getEAnnotation(source) != null)
	        return;
	    final EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
	    eAnnotation.setSource(source);
	    owner.getEAnnotations().add(eAnnotation);
	}


	public AlloyInEcoreParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OptionsContext extends ParserRuleContext {
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public OptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionsContext options() throws RecognitionException {
		OptionsContext _localctx = new OptionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__0);
			setState(141);
			match(T__1);
			setState(142);
			option();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(143);
				match(T__2);
				setState(144);
				option();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionContext extends ParserRuleContext {
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
	 
		public OptionContext() { }
		public void copyFrom(OptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SymmetryBreakingContext extends OptionContext {
		public Token key;
		public Token value;
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public SymmetryBreakingContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSymmetryBreaking(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSymmetryBreaking(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSymmetryBreaking(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitWidthContext extends OptionContext {
		public Token key;
		public Token value;
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public BitWidthContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterBitWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitBitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitBitWidth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkolemDepthContext extends OptionContext {
		public Token key;
		public Token value;
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public SkolemDepthContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSkolemDepth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSkolemDepth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSkolemDepth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SharingContext extends OptionContext {
		public Token key;
		public Token value;
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public SharingContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSharing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSharing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSharing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_option);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new SymmetryBreakingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				((SymmetryBreakingContext)_localctx).key = match(T__4);
				setState(153);
				match(T__5);
				setState(154);
				((SymmetryBreakingContext)_localctx).value = match(INT);
				}
				break;
			case T__6:
				_localctx = new BitWidthContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				((BitWidthContext)_localctx).key = match(T__6);
				setState(156);
				match(T__5);
				setState(157);
				((BitWidthContext)_localctx).value = match(INT);
				}
				break;
			case T__7:
				_localctx = new SkolemDepthContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				((SkolemDepthContext)_localctx).key = match(T__7);
				setState(159);
				match(T__5);
				setState(160);
				((SkolemDepthContext)_localctx).value = match(INT);
				}
				break;
			case T__8:
				_localctx = new SharingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				((SharingContext)_localctx).key = match(T__8);
				setState(162);
				match(T__5);
				setState(163);
				((SharingContext)_localctx).value = match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceContext extends ParserRuleContext {
		public Element owner;
		public Instance current;
		public IdentifierContext name;
		public EObjectContext rootObject;
		public ModelImportContext modelImport() {
			return getRuleContext(ModelImportContext.class,0);
		}
		public List<PackageImportContext> packageImport() {
			return getRuleContexts(PackageImportContext.class);
		}
		public PackageImportContext packageImport(int i) {
			return getRuleContext(PackageImportContext.class,i);
		}
		public EObjectContext eObject() {
			return getRuleContext(EObjectContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InstanceContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InstanceContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_instance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceContext instance(Element owner) throws RecognitionException {
		InstanceContext _localctx = new InstanceContext(_ctx, getState(), owner);
		enterRule(_localctx, 4, RULE_instance);
		((InstanceContext)_localctx).current =  new Instance(_localctx); instance= _localctx.current; if (owner!=null) owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(166);
				match(T__9);
				setState(167);
				((InstanceContext)_localctx).name = identifier();
				setState(168);
				match(T__10);
				}
			}

			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(172);
				packageImport(_localctx.current);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			modelImport(_localctx.current);
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__11:
			case T__20:
			case T__21:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__37:
			case T__39:
			case T__41:
			case T__43:
			case T__44:
			case T__46:
			case T__47:
			case T__50:
			case T__56:
			case T__57:
			case T__58:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__80:
			case T__82:
			case T__83:
			case T__131:
			case T__132:
			case T__133:
			case IDENTIFIER:
				{
				setState(179);
				((InstanceContext)_localctx).rootObject = eObject(_localctx.current);
				}
				break;
			case T__10:
				{
				setState(180);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			instance.printTree();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelImportContext extends ParserRuleContext {
		public Element owner;
		public ModelImport current;
		public EObject object;
		public UnrestrictedNameContext name;
		public Token ownedPathName;
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public ModelImportContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ModelImportContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_modelImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterModelImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitModelImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitModelImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelImportContext modelImport(Element owner) throws RecognitionException {
		ModelImportContext _localctx = new ModelImportContext(_ctx, getState(), owner);
		enterRule(_localctx, 6, RULE_modelImport);
		((ModelImportContext)_localctx).current =  new ModelImport(_localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(183);
			match(T__11);
			}
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__11 - 10)) | (1L << (T__20 - 10)) | (1L << (T__21 - 10)) | (1L << (T__23 - 10)) | (1L << (T__24 - 10)) | (1L << (T__25 - 10)) | (1L << (T__26 - 10)) | (1L << (T__27 - 10)) | (1L << (T__29 - 10)) | (1L << (T__30 - 10)) | (1L << (T__31 - 10)) | (1L << (T__32 - 10)) | (1L << (T__33 - 10)) | (1L << (T__34 - 10)) | (1L << (T__35 - 10)) | (1L << (T__37 - 10)) | (1L << (T__39 - 10)) | (1L << (T__41 - 10)) | (1L << (T__43 - 10)) | (1L << (T__44 - 10)) | (1L << (T__46 - 10)) | (1L << (T__47 - 10)) | (1L << (T__50 - 10)) | (1L << (T__56 - 10)) | (1L << (T__57 - 10)) | (1L << (T__58 - 10)) | (1L << (T__60 - 10)) | (1L << (T__61 - 10)) | (1L << (T__62 - 10)) | (1L << (T__63 - 10)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
				{
				setState(184);
				((ModelImportContext)_localctx).name = unrestrictedName();
				setState(185);
				match(T__5);
				}
			}

			setState(189);
			((ModelImportContext)_localctx).ownedPathName = match(SINGLE_QUOTED_STRING);
			setState(190);
			match(T__10);
			}
			_ctx.stop = _input.LT(-1);

			if (((ModelImportContext)_localctx).ownedPathName != null) {
			    String path = ((ModelImportContext)_localctx).ownedPathName.getText().replace("'", "");
			    if (path.equals(EcorePackage.eNS_URI)) {
			        notifyErrorListeners(((ModelImportContext)_localctx).ownedPathName, "You cannot create an instance of ECore Model! Instead, create a model in the model editor!", null);
			    } else {
			        Resource resource = repository.loadResource(path);
			        if (resource == null) {
			            notifyErrorListeners(((ModelImportContext)_localctx).ownedPathName, "Import could not be resolved!", null);
			        }
			        else {
			            ((ModelImportContext)_localctx).object =  repository.loadResource(path).getContents().get(0);
			            if (_localctx.object instanceof ENamedElement) {
			                _localctx.current.setEObject(_localctx.object);
			                repository.name2Import.put(_localctx.current.getKey(), _localctx.current);
			                _localctx.current.loadNamespace(repository);
			            } else {
			                notifyErrorListeners(((ModelImportContext)_localctx).ownedPathName, "This is an instance, cannot be used as a model!", null);
			            }
			        }
			    }
			}

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EObjectContext extends ParserRuleContext {
		public Element owner;
		public Object current;
		public PathNameContext name;
		public LiteralValueContext id;
		public SlotContext slot;
		public List<SlotContext> slots = new ArrayList<SlotContext>();
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public List<SlotContext> slot() {
			return getRuleContexts(SlotContext.class);
		}
		public SlotContext slot(int i) {
			return getRuleContext(SlotContext.class,i);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public EObjectContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EObjectContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EObjectContext eObject(Element owner) throws RecognitionException {
		EObjectContext _localctx = new EObjectContext(_ctx, getState(), owner);
		enterRule(_localctx, 8, RULE_eObject);
		((EObjectContext)_localctx).current =  new Object(_localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((EObjectContext)_localctx).name = pathName(_localctx.current);

			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (INT - 135)) | (1L << (IDENTIFIER - 135)) | (1L << (DOUBLE_QUOTED_STRING - 135)))) != 0)) {
				{
				setState(194);
				((EObjectContext)_localctx).id = literalValue(_localctx.owner);
				}
			}


			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(198);
				match(T__1);
				setState(199);
				((EObjectContext)_localctx).slot = slot(_localctx.current);
				((EObjectContext)_localctx).slots.add(((EObjectContext)_localctx).slot);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(200);
					match(T__2);
					setState(201);
					((EObjectContext)_localctx).slot = slot(_localctx.current);
					((EObjectContext)_localctx).slots.add(((EObjectContext)_localctx).slot);
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(T__3);
				}
				break;
			case T__10:
				{
				setState(209);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SlotContext extends ParserRuleContext {
		public Element owner;
		public Slot current;
		public UnrestrictedNameContext name;
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public List<EObjectValueContext> eObjectValue() {
			return getRuleContexts(EObjectValueContext.class);
		}
		public EObjectValueContext eObjectValue(int i) {
			return getRuleContext(EObjectValueContext.class,i);
		}
		public DataValueContext dataValue() {
			return getRuleContext(DataValueContext.class,0);
		}
		public List<EObjectContext> eObject() {
			return getRuleContexts(EObjectContext.class);
		}
		public EObjectContext eObject(int i) {
			return getRuleContext(EObjectContext.class,i);
		}
		public SlotContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SlotContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_slot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSlot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSlot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSlot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlotContext slot(Element owner) throws RecognitionException {
		SlotContext _localctx = new SlotContext(_ctx, getState(), owner);
		enterRule(_localctx, 10, RULE_slot);
		((SlotContext)_localctx).current =  new Slot(_localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			((SlotContext)_localctx).name = unrestrictedName();

			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(214);
				match(T__5);
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(215);
					if (!(true)) throw new FailedPredicateException(this, "true");
					setState(216);
					match(T__1);
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__11 - 10)) | (1L << (T__20 - 10)) | (1L << (T__21 - 10)) | (1L << (T__23 - 10)) | (1L << (T__24 - 10)) | (1L << (T__25 - 10)) | (1L << (T__26 - 10)) | (1L << (T__27 - 10)) | (1L << (T__29 - 10)) | (1L << (T__30 - 10)) | (1L << (T__31 - 10)) | (1L << (T__32 - 10)) | (1L << (T__33 - 10)) | (1L << (T__34 - 10)) | (1L << (T__35 - 10)) | (1L << (T__37 - 10)) | (1L << (T__39 - 10)) | (1L << (T__41 - 10)) | (1L << (T__43 - 10)) | (1L << (T__44 - 10)) | (1L << (T__46 - 10)) | (1L << (T__47 - 10)) | (1L << (T__50 - 10)) | (1L << (T__56 - 10)) | (1L << (T__57 - 10)) | (1L << (T__58 - 10)) | (1L << (T__60 - 10)) | (1L << (T__61 - 10)) | (1L << (T__62 - 10)) | (1L << (T__63 - 10)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
						{
						{
						setState(217);
						eObject(_localctx.current);
						}
						}
						setState(222);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(223);
					match(T__3);
					}
					break;
				case 2:
					{
					setState(224);
					eObjectValue(_localctx.current);
					}
					break;
				case 3:
					{
					setState(225);
					match(T__12);
					setState(226);
					eObjectValue(_localctx.current);
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(227);
						match(T__2);
						setState(228);
						eObjectValue(_localctx.current);
						}
						}
						setState(233);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(234);
					match(T__13);
					}
					break;
				case 4:
					{
					setState(236);
					dataValue(_localctx.current);
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataValueContext extends ParserRuleContext {
		public Element owner;
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public MultiValueDataContext multiValueData() {
			return getRuleContext(MultiValueDataContext.class,0);
		}
		public DataValueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DataValueContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_dataValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterDataValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitDataValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitDataValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataValueContext dataValue(Element owner) throws RecognitionException {
		DataValueContext _localctx = new DataValueContext(_ctx, getState(), owner);
		enterRule(_localctx, 12, RULE_dataValue);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case INT:
			case IDENTIFIER:
			case DOUBLE_QUOTED_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				literalValue(_localctx.owner);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				multiValueData(_localctx.owner);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiValueDataContext extends ParserRuleContext {
		public Element owner;
		public List<DataValueContext> dataValue() {
			return getRuleContexts(DataValueContext.class);
		}
		public DataValueContext dataValue(int i) {
			return getRuleContext(DataValueContext.class,i);
		}
		public MultiValueDataContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MultiValueDataContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_multiValueData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterMultiValueData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitMultiValueData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitMultiValueData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiValueDataContext multiValueData(Element owner) throws RecognitionException {
		MultiValueDataContext _localctx = new MultiValueDataContext(_ctx, getState(), owner);
		enterRule(_localctx, 14, RULE_multiValueData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__12);
			setState(246);
			dataValue(_localctx.owner);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(247);
				match(T__2);
				setState(248);
				dataValue(_localctx.owner);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EObjectValueContext extends ParserRuleContext {
		public Element owner;
		public ObjectValue current;
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public EObjectValueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EObjectValueContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eObjectValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEObjectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEObjectValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEObjectValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EObjectValueContext eObjectValue(Element owner) throws RecognitionException {
		EObjectValueContext _localctx = new EObjectValueContext(_ctx, getState(), owner);
		enterRule(_localctx, 16, RULE_eObjectValue);
		((EObjectValueContext)_localctx).current =  new ObjectValue(_localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			pathName(_localctx.current);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralValueContext extends ParserRuleContext {
		public Element owner;
		public Element current;
		public EnumValueContext enumValue() {
			return getRuleContext(EnumValueContext.class,0);
		}
		public IntegerValueContext integerValue() {
			return getRuleContext(IntegerValueContext.class,0);
		}
		public RealValueContext realValue() {
			return getRuleContext(RealValueContext.class,0);
		}
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public NullValueContext nullValue() {
			return getRuleContext(NullValueContext.class,0);
		}
		public LiteralValueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LiteralValueContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_literalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLiteralValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralValueContext literalValue(Element owner) throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState(), owner);
		enterRule(_localctx, 18, RULE_literalValue);
		if(_localctx.parent instanceof EObjectContext) {} else { ((LiteralValueContext)_localctx).current =  _localctx.owner;} 
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				enumValue(_localctx.current);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				integerValue(_localctx.current);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				realValue(_localctx.current);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				stringValue(_localctx.current);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				booleanValue(_localctx.current);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				nullValue(_localctx.current);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueContext extends ParserRuleContext {
		public Element owner;
		public EnumValue current;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EnumValueContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue(Element owner) throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState(), owner);
		enterRule(_localctx, 20, RULE_enumValue);
		((EnumValueContext)_localctx).current =  new EnumValue(_localctx); if (owner!=null) _localctx.owner.addOwnedElement(_localctx.current);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public Element owner;
		public BooleanValue current;
		public BooleanValueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue(Element owner) throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState(), owner);
		enterRule(_localctx, 22, RULE_booleanValue);
		((BooleanValueContext)_localctx).current =  new BooleanValue(_localctx); if (owner!=null) _localctx.owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerValueContext extends ParserRuleContext {
		public Element owner;
		public IntegerValue current;
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public IntegerValueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IntegerValueContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_integerValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIntegerValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIntegerValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIntegerValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerValueContext integerValue(Element owner) throws RecognitionException {
		IntegerValueContext _localctx = new IntegerValueContext(_ctx, getState(), owner);
		enterRule(_localctx, 24, RULE_integerValue);
		((IntegerValueContext)_localctx).current =  new IntegerValue(_localctx); if (owner!=null) _localctx.owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16 || _la==T__17) {
				{
				setState(270);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(273);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealValueContext extends ParserRuleContext {
		public Element owner;
		public RealValue current;
		public List<TerminalNode> INT() { return getTokens(AlloyInEcoreParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AlloyInEcoreParser.INT, i);
		}
		public RealValueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RealValueContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_realValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterRealValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitRealValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitRealValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealValueContext realValue(Element owner) throws RecognitionException {
		RealValueContext _localctx = new RealValueContext(_ctx, getState(), owner);
		enterRule(_localctx, 26, RULE_realValue);
		((RealValueContext)_localctx).current =  new RealValue(_localctx); if (owner!=null) _localctx.owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16 || _la==T__17) {
				{
				setState(275);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(278);
				match(INT);
				}
			}

			setState(281);
			match(T__18);
			setState(282);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringValueContext extends ParserRuleContext {
		public Element owner;
		public StringValue current;
		public TerminalNode DOUBLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.DOUBLE_QUOTED_STRING, 0); }
		public StringValueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StringValueContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_stringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringValueContext stringValue(Element owner) throws RecognitionException {
		StringValueContext _localctx = new StringValueContext(_ctx, getState(), owner);
		enterRule(_localctx, 28, RULE_stringValue);
		((StringValueContext)_localctx).current =  new StringValue(_localctx); if (owner!=null) _localctx.owner.addOwnedElement(_localctx.current);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(DOUBLE_QUOTED_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullValueContext extends ParserRuleContext {
		public Element owner;
		public NullValue current;
		public NullValueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NullValueContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_nullValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterNullValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitNullValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitNullValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullValueContext nullValue(Element owner) throws RecognitionException {
		NullValueContext _localctx = new NullValueContext(_ctx, getState(), owner);
		enterRule(_localctx, 30, RULE_nullValue);
		((NullValueContext)_localctx).current =  new NullValue(_localctx); if (owner!=null) _localctx.owner.addOwnedElement(_localctx.current);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelContext extends ParserRuleContext {
		public EAnnotation element;
		public IdentifierContext name;
		public PackageImportContext packageImport;
		public List<PackageImportContext> ownedPackageImport = new ArrayList<PackageImportContext>();
		public EPackageContext ownedPackage;
		public EPackageContext ePackage;
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public EPackageContext ePackage() {
			return getRuleContext(EPackageContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PackageImportContext> packageImport() {
			return getRuleContexts(PackageImportContext.class);
		}
		public PackageImportContext packageImport(int i) {
			return getRuleContext(PackageImportContext.class,i);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_model);
		model = new Model(_localctx); ((ModelContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.MODULE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(288);
				options();
				}
			}


			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(292);
				match(T__11);
				setState(293);
				((ModelContext)_localctx).name = identifier();
				setState(294);
				match(T__10);
				}
			}

			_localctx.element.getDetails().put("name", (((ModelContext)_localctx).name!=null?_input.getText(((ModelContext)_localctx).name.start,((ModelContext)_localctx).name.stop):null));
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(299);
				((ModelContext)_localctx).packageImport = packageImport(model);
				((ModelContext)_localctx).ownedPackageImport.add(((ModelContext)_localctx).packageImport);
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(305);
			((ModelContext)_localctx).ownedPackage = ((ModelContext)_localctx).ePackage = ePackage(model);
			((ModelContext)_localctx).ePackage.element.getEAnnotations().add(_localctx.element);
			}
			for(PackageImportContext ctx: _localctx.ownedPackageImport) {((ModelContext)_localctx).ePackage.element.getEAnnotations().add(ctx.element);}
			}
			_ctx.stop = _input.LT(-1);
			signalParsingCompletion();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageImportContext extends ParserRuleContext {
		public Element owner;
		public EAnnotation element;
		public EObject object;
		public IdentifierContext name;
		public Token ownedPathName;
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PackageImportContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PackageImportContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_packageImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterPackageImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitPackageImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitPackageImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageImportContext packageImport(Element owner) throws RecognitionException {
		PackageImportContext _localctx = new PackageImportContext(_ctx, getState(), owner);
		enterRule(_localctx, 34, RULE_packageImport);
		((PackageImportContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.IMPORT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(310);
			match(T__20);
			}
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(311);
				((PackageImportContext)_localctx).name = identifier();
				setState(312);
				match(T__5);
				}
			}

			setState(316);
			((PackageImportContext)_localctx).ownedPathName = match(SINGLE_QUOTED_STRING);
			setState(317);
			match(T__10);
			_localctx.element.getDetails().put((((PackageImportContext)_localctx).name!=null?_input.getText(((PackageImportContext)_localctx).name.start,((PackageImportContext)_localctx).name.stop):null), ((PackageImportContext)_localctx).ownedPathName != null ? ((PackageImportContext)_localctx).ownedPathName.getText().replace("'", "") : null);
			}
			_ctx.stop = _input.LT(-1);

			if (((PackageImportContext)_localctx).ownedPathName != null) {
			    String path = ((PackageImportContext)_localctx).ownedPathName.getText().replace("'", "");
			    Import imported = null;
			    if (path.equals(EcorePackage.eNS_URI)) {
			        ((PackageImportContext)_localctx).object =  EcorePackage.eINSTANCE;
			        imported = new EcoreImport(_localctx.object, _localctx);
			        _localctx.owner.addOwnedElement(imported);
			        repository.name2Import.put(imported.getKey(), imported);
			        imported.loadNamespace(repository);
			    } else {
			        Resource resource = repository.loadResource(path);
			        if (resource == null) {
			            notifyErrorListeners(((PackageImportContext)_localctx).ownedPathName, "Import could not be resolved!", null);

			        } else {
			            ((PackageImportContext)_localctx).object =  repository.loadResource(path).getContents().get(0);
			            imported = new Import(_localctx.object, _localctx);
			            _localctx.owner.addOwnedElement(imported);
			            repository.name2Import.put(imported.getKey(), imported);
			            imported.loadNamespace(repository);
			        }
			    }
			}

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EPackageContext extends ParserRuleContext {
		public Element owner;
		public EPackage element;
		public Package current;
		public VisibilityKindContext visibility;
		public UnrestrictedNameContext name;
		public IdentifierContext nsPrefix;
		public Token nsURI;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public EPackageContext ePackage;
		public List<EPackageContext> eSubPackages = new ArrayList<EPackageContext>();
		public EClassifierContext eClassifier;
		public List<EClassifierContext> eClassifiers = new ArrayList<EClassifierContext>();
		public InvariantContext invariant;
		public List<InvariantContext> eConstraints = new ArrayList<InvariantContext>();
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public List<EPackageContext> ePackage() {
			return getRuleContexts(EPackageContext.class);
		}
		public EPackageContext ePackage(int i) {
			return getRuleContext(EPackageContext.class,i);
		}
		public List<EClassifierContext> eClassifier() {
			return getRuleContexts(EClassifierContext.class);
		}
		public EClassifierContext eClassifier(int i) {
			return getRuleContext(EClassifierContext.class,i);
		}
		public List<InvariantContext> invariant() {
			return getRuleContexts(InvariantContext.class);
		}
		public InvariantContext invariant(int i) {
			return getRuleContext(InvariantContext.class,i);
		}
		public EPackageContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EPackageContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_ePackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEPackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EPackageContext ePackage(Element owner) throws RecognitionException {
		EPackageContext _localctx = new EPackageContext(_ctx, getState(), owner);
		enterRule(_localctx, 36, RULE_ePackage);

		((EPackageContext)_localctx).element =  eFactory.createEPackage();
		if(_localctx.parent instanceof ModelContext) {((EPackageContext)_localctx).current =  new RootPackage(_localctx.element, _localctx);}
		else {((EPackageContext)_localctx).current =  new Package(_localctx.element, _localctx);}
		owner.addOwnedElement(_localctx.current);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (T__85 - 85)) | (1L << (T__86 - 85)))) != 0)) {
				{
				setState(320);
				((EPackageContext)_localctx).visibility = visibilityKind();
				}
			}

			if(_localctx.visibility != null) _localctx.element.getEAnnotations().add(((EPackageContext)_localctx).visibility.element);
			setState(324);
			match(T__21);
			setState(325);
			((EPackageContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((EPackageContext)_localctx).name!=null?_input.getText(((EPackageContext)_localctx).name.start,((EPackageContext)_localctx).name.stop):null));
			if(_localctx.parent instanceof ModelContext) {repository.name2Import.put(((RootPackage)_localctx.current).getKey(), (RootPackage)_localctx.current);}
			{
			setState(328);
			match(T__5);
			setState(329);
			((EPackageContext)_localctx).nsPrefix = identifier();
			}
			{
			setState(331);
			match(T__22);
			setState(332);
			((EPackageContext)_localctx).nsURI = match(SINGLE_QUOTED_STRING);
			}
			_localctx.element.setNsPrefix((((EPackageContext)_localctx).nsPrefix!=null?_input.getText(((EPackageContext)_localctx).nsPrefix.start,((EPackageContext)_localctx).nsPrefix.stop):null)); if(((EPackageContext)_localctx).nsURI != null) _localctx.element.setNsURI(((EPackageContext)_localctx).nsURI.getText().replace("'", ""));
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(335);
				match(T__1);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__56) | (1L << T__57) | (1L << T__60) | (1L << T__62))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (T__76 - 77)) | (1L << (T__77 - 77)) | (1L << (T__84 - 77)) | (1L << (T__85 - 77)) | (1L << (T__86 - 77)))) != 0)) {
					{
					setState(348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(336);
						((EPackageContext)_localctx).eAnnotation = ((EPackageContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EPackageContext)_localctx).ownedAnnotations.add(((EPackageContext)_localctx).eAnnotation);
						_localctx.element.getEAnnotations().add(((EPackageContext)_localctx).eAnnotation.element);
						}
						break;
					case 2:
						{
						setState(339);
						((EPackageContext)_localctx).ePackage = ((EPackageContext)_localctx).ePackage = ePackage(_localctx.current);
						((EPackageContext)_localctx).eSubPackages.add(((EPackageContext)_localctx).ePackage);
						_localctx.element.getESubpackages().add(((EPackageContext)_localctx).ePackage.element);
						}
						break;
					case 3:
						{
						setState(342);
						((EPackageContext)_localctx).eClassifier = ((EPackageContext)_localctx).eClassifier = eClassifier(_localctx.current);
						((EPackageContext)_localctx).eClassifiers.add(((EPackageContext)_localctx).eClassifier);
						if (((EPackageContext)_localctx).eClassifier.element != null) _localctx.element.getEClassifiers().add(((EPackageContext)_localctx).eClassifier.element);
						}
						break;
					case 4:
						{
						setState(345);
						((EPackageContext)_localctx).invariant = ((EPackageContext)_localctx).invariant = invariant(_localctx.current);
						((EPackageContext)_localctx).eConstraints.add(((EPackageContext)_localctx).invariant);
						_localctx.element.getEAnnotations().add(((EPackageContext)_localctx).invariant.element);
						}
						break;
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(353);
				match(T__3);
				}
				}
				break;
			case T__10:
				{
				setState(354);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EClassifierContext extends ParserRuleContext {
		public Element owner;
		public EClassifier element;
		public EClassContext eClass;
		public EDataTypeContext eDataType;
		public EEnumContext eEnum;
		public EClassContext eClass() {
			return getRuleContext(EClassContext.class,0);
		}
		public EDataTypeContext eDataType() {
			return getRuleContext(EDataTypeContext.class,0);
		}
		public EEnumContext eEnum() {
			return getRuleContext(EEnumContext.class,0);
		}
		public EClassifierContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EClassifierContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eClassifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEClassifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEClassifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEClassifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EClassifierContext eClassifier(Element owner) throws RecognitionException {
		EClassifierContext _localctx = new EClassifierContext(_ctx, getState(), owner);
		enterRule(_localctx, 38, RULE_eClassifier);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				((EClassifierContext)_localctx).eClass = eClass(_localctx.owner);
				((EClassifierContext)_localctx).element =  ((EClassifierContext)_localctx).eClass.element;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				((EClassifierContext)_localctx).eDataType = eDataType(_localctx.owner);
				((EClassifierContext)_localctx).element =  ((EClassifierContext)_localctx).eDataType.element;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				((EClassifierContext)_localctx).eEnum = eEnum(_localctx.owner);
				((EClassifierContext)_localctx).element =  ((EClassifierContext)_localctx).eEnum.element;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EClassContext extends ParserRuleContext {
		public Element owner;
		public EClass element;
		public Class current;
		public VisibilityKindContext visibility;
		public Token isAbstract;
		public Token isClass;
		public Token isInterface;
		public UnrestrictedNameContext name;
		public TemplateSignatureContext ownedSignature;
		public TemplateSignatureContext templateSignature;
		public EGenericSuperTypeContext eGenericSuperType;
		public List<EGenericSuperTypeContext> eSuperTypes = new ArrayList<EGenericSuperTypeContext>();
		public Token instanceClassName;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public EOperationContext eOperation;
		public List<EOperationContext> eOperations = new ArrayList<EOperationContext>();
		public EStructuralFeatureContext eStructuralFeature;
		public List<EStructuralFeatureContext> eStructuralFeatures = new ArrayList<EStructuralFeatureContext>();
		public InvariantContext invariant;
		public List<InvariantContext> eConstraints = new ArrayList<InvariantContext>();
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public TemplateSignatureContext templateSignature() {
			return getRuleContext(TemplateSignatureContext.class,0);
		}
		public List<EGenericSuperTypeContext> eGenericSuperType() {
			return getRuleContexts(EGenericSuperTypeContext.class);
		}
		public EGenericSuperTypeContext eGenericSuperType(int i) {
			return getRuleContext(EGenericSuperTypeContext.class,i);
		}
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public List<EOperationContext> eOperation() {
			return getRuleContexts(EOperationContext.class);
		}
		public EOperationContext eOperation(int i) {
			return getRuleContext(EOperationContext.class,i);
		}
		public List<EStructuralFeatureContext> eStructuralFeature() {
			return getRuleContexts(EStructuralFeatureContext.class);
		}
		public EStructuralFeatureContext eStructuralFeature(int i) {
			return getRuleContext(EStructuralFeatureContext.class,i);
		}
		public List<InvariantContext> invariant() {
			return getRuleContexts(InvariantContext.class);
		}
		public InvariantContext invariant(int i) {
			return getRuleContext(InvariantContext.class,i);
		}
		public EClassContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EClassContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EClassContext eClass(Element owner) throws RecognitionException {
		EClassContext _localctx = new EClassContext(_ctx, getState(), owner);
		enterRule(_localctx, 40, RULE_eClass);
		((EClassContext)_localctx).element =  eFactory.createEClass(); ((EClassContext)_localctx).current =  new Class(_localctx.element, _localctx); if (owner!=null) owner.addOwnedElement(_localctx.current); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (T__85 - 85)) | (1L << (T__86 - 85)))) != 0)) {
				{
				setState(368);
				((EClassContext)_localctx).visibility = visibilityKind();
				}
			}

			if(_localctx.visibility != null) _localctx.element.getEAnnotations().add(((EClassContext)_localctx).visibility.element);
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
				{
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(372);
					((EClassContext)_localctx).isAbstract = match(T__23);
					}
				}

				setState(375);
				((EClassContext)_localctx).isClass = match(T__24);
				}
				break;
			case T__25:
				{
				setState(376);
				((EClassContext)_localctx).isInterface = match(T__25);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_localctx.element.setAbstract(((EClassContext)_localctx).isAbstract!=null); if (((EClassContext)_localctx).isInterface!=null) {_localctx.element.setInterface(true);_localctx.element.setAbstract(true);}
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(380);
				((EClassContext)_localctx).name = unrestrictedName();
				}
				break;
			}
			if (_localctx.name == null) {notifyErrorListeners("missing Class name");} else {_localctx.element.setName((((EClassContext)_localctx).name!=null?_input.getText(((EClassContext)_localctx).name.start,((EClassContext)_localctx).name.stop):null));}
			if (((EClassContext)_localctx).isInterface!=null) {owner.deleteOwnedElement(_localctx.current); ((EClassContext)_localctx).current =  new Interface(_localctx.element, _localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);}
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__64) {
				{
				setState(385);
				((EClassContext)_localctx).ownedSignature = ((EClassContext)_localctx).templateSignature = templateSignature(_localctx.current);
				}
			}

			if(_localctx.templateSignature != null) _localctx.element.getETypeParameters().addAll(((EClassContext)_localctx).templateSignature.typeParameters);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(389);
				match(T__26);
				setState(390);
				((EClassContext)_localctx).eGenericSuperType = eGenericSuperType(_localctx.current);
				((EClassContext)_localctx).eSuperTypes.add(((EClassContext)_localctx).eGenericSuperType);
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(391);
					match(T__2);
					setState(392);
					((EClassContext)_localctx).eGenericSuperType = eGenericSuperType(_localctx.current);
					((EClassContext)_localctx).eSuperTypes.add(((EClassContext)_localctx).eGenericSuperType);
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}


			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(401);
				match(T__5);
				setState(402);
				((EClassContext)_localctx).instanceClassName = match(SINGLE_QUOTED_STRING);
				}
			}

			if(((EClassContext)_localctx).instanceClassName != null) _localctx.element.setInstanceClassName(((EClassContext)_localctx).instanceClassName.getText().replace("'", ""));
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(406);
				match(T__1);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__41) | (1L << T__47) | (1L << T__62))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (T__76 - 77)) | (1L << (T__77 - 77)) | (1L << (T__84 - 77)) | (1L << (T__85 - 77)) | (1L << (T__86 - 77)))) != 0)) {
					{
					setState(419);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(407);
						((EClassContext)_localctx).eAnnotation = ((EClassContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EClassContext)_localctx).ownedAnnotations.add(((EClassContext)_localctx).eAnnotation);
						if (((EClassContext)_localctx).eAnnotation.element != null) _localctx.element.getEAnnotations().add(((EClassContext)_localctx).eAnnotation.element);
						}
						break;
					case 2:
						{
						setState(410);
						((EClassContext)_localctx).eOperation = ((EClassContext)_localctx).eOperation = eOperation(_localctx.current);
						((EClassContext)_localctx).eOperations.add(((EClassContext)_localctx).eOperation);
						if (((EClassContext)_localctx).eOperation.element != null) _localctx.element.getEOperations().add(((EClassContext)_localctx).eOperation.element);
						}
						break;
					case 3:
						{
						setState(413);
						((EClassContext)_localctx).eStructuralFeature = ((EClassContext)_localctx).eStructuralFeature = eStructuralFeature(_localctx.current);
						((EClassContext)_localctx).eStructuralFeatures.add(((EClassContext)_localctx).eStructuralFeature);
						if (((EClassContext)_localctx).eStructuralFeature.element != null) _localctx.element.getEStructuralFeatures().add(((EClassContext)_localctx).eStructuralFeature.element);
						}
						break;
					case 4:
						{
						setState(416);
						((EClassContext)_localctx).invariant = ((EClassContext)_localctx).invariant = invariant(_localctx.current);
						((EClassContext)_localctx).eConstraints.add(((EClassContext)_localctx).invariant);
						if (((EClassContext)_localctx).invariant.element != null) _localctx.element.getEAnnotations().add(((EClassContext)_localctx).invariant.element);
						}
						break;
					}
					}
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(424);
				match(T__3);
				}
				}
				break;
			case T__10:
				{
				setState(425);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EStructuralFeatureContext extends ParserRuleContext {
		public Element owner;
		public EStructuralFeature element;
		public EAttributeContext eAttribute;
		public EReferenceContext eReference;
		public EAttributeContext eAttribute() {
			return getRuleContext(EAttributeContext.class,0);
		}
		public EReferenceContext eReference() {
			return getRuleContext(EReferenceContext.class,0);
		}
		public EStructuralFeatureContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EStructuralFeatureContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eStructuralFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEStructuralFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEStructuralFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEStructuralFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EStructuralFeatureContext eStructuralFeature(Element owner) throws RecognitionException {
		EStructuralFeatureContext _localctx = new EStructuralFeatureContext(_ctx, getState(), owner);
		enterRule(_localctx, 42, RULE_eStructuralFeature);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				((EStructuralFeatureContext)_localctx).eAttribute = eAttribute(_localctx.owner);
				((EStructuralFeatureContext)_localctx).element =  ((EStructuralFeatureContext)_localctx).eAttribute.element;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				((EStructuralFeatureContext)_localctx).eReference = eReference(_localctx.owner);
				((EStructuralFeatureContext)_localctx).element =  ((EStructuralFeatureContext)_localctx).eReference.element;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EAttributeContext extends ParserRuleContext {
		public Element owner;
		public EAttribute element;
		public Attribute current;
		public VisibilityKindContext visibility;
		public Token s28;
		public List<Token> qualifier = new ArrayList<Token>();
		public Token s12;
		public Token s29;
		public Token s30;
		public Token s31;
		public Token s32;
		public UnrestrictedNameContext name;
		public EGenericElementTypeContext eAttributeType;
		public EMultiplicityContext ownedMultiplicity;
		public Token defaultValue;
		public Token s34;
		public Token s35;
		public Token s36;
		public Token s37;
		public Token s38;
		public Token s39;
		public Token s40;
		public Token s41;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public DerivationContext ownedDerivation;
		public DerivationContext derivation;
		public InitialContext ownedInitial;
		public InitialContext initial;
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public EGenericElementTypeContext eGenericElementType() {
			return getRuleContext(EGenericElementTypeContext.class,0);
		}
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public EMultiplicityContext eMultiplicity() {
			return getRuleContext(EMultiplicityContext.class,0);
		}
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public DerivationContext derivation() {
			return getRuleContext(DerivationContext.class,0);
		}
		public InitialContext initial() {
			return getRuleContext(InitialContext.class,0);
		}
		public EAttributeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EAttributeContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EAttributeContext eAttribute(Element owner) throws RecognitionException {
		EAttributeContext _localctx = new EAttributeContext(_ctx, getState(), owner);
		enterRule(_localctx, 44, RULE_eAttribute);
		((EAttributeContext)_localctx).element =  eFactory.createEAttribute(); ((EAttributeContext)_localctx).current =  new Attribute(_localctx.element, _localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (T__85 - 85)) | (1L << (T__86 - 85)))) != 0)) {
				{
				setState(436);
				((EAttributeContext)_localctx).visibility = visibilityKind();
				}
			}

			if (_localctx.visibility != null) _localctx.element.getEAnnotations().add(((EAttributeContext)_localctx).visibility.element);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(440);
				((EAttributeContext)_localctx).s28 = match(T__27);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s28);
				}
			}

			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(443);
				((EAttributeContext)_localctx).s12 = match(T__11);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s12);
				}
				break;
			case T__28:
				{
				setState(444);
				((EAttributeContext)_localctx).s29 = match(T__28);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s29);
				}
				break;
			case T__29:
			case T__30:
			case T__31:
			case T__32:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(447);
				((EAttributeContext)_localctx).s30 = match(T__29);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s30);
				}
			}

			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(450);
				((EAttributeContext)_localctx).s31 = match(T__30);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s31);
				}
			}

			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(453);
				((EAttributeContext)_localctx).s32 = match(T__31);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s32);
				}
			}

			setState(456);
			match(T__32);
			setState(457);
			((EAttributeContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((EAttributeContext)_localctx).name!=null?_input.getText(((EAttributeContext)_localctx).name.start,((EAttributeContext)_localctx).name.stop):null));
			setState(459);
			match(T__5);
			setState(460);
			((EAttributeContext)_localctx).eAttributeType = eGenericElementType(_localctx.current);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(461);
				((EAttributeContext)_localctx).ownedMultiplicity = eMultiplicity(_localctx.current, (ETypedElement)_localctx.element);
				}
			}

			if(_localctx.ownedMultiplicity == null) {_localctx.element.setLowerBound(1);} 
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(465);
				match(T__22);
				setState(466);
				((EAttributeContext)_localctx).defaultValue = match(SINGLE_QUOTED_STRING);
				}
			}

			if(((EAttributeContext)_localctx).defaultValue != null) _localctx.element.setDefaultValueLiteral(((EAttributeContext)_localctx).defaultValue.getText().replace("'", ""));
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(470);
				match(T__1);
				setState(484); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(479);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__33:
						{
						setState(471);
						((EAttributeContext)_localctx).s34 = match(T__33);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s34);
						}
						break;
					case T__34:
						{
						setState(472);
						((EAttributeContext)_localctx).s35 = match(T__34);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s35);
						}
						break;
					case T__35:
						{
						setState(473);
						((EAttributeContext)_localctx).s36 = match(T__35);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s36);
						}
						break;
					case T__36:
						{
						setState(474);
						((EAttributeContext)_localctx).s37 = match(T__36);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s37);
						}
						break;
					case T__37:
						{
						setState(475);
						((EAttributeContext)_localctx).s38 = match(T__37);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s38);
						}
						break;
					case T__38:
						{
						setState(476);
						((EAttributeContext)_localctx).s39 = match(T__38);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s39);
						}
						break;
					case T__39:
						{
						setState(477);
						((EAttributeContext)_localctx).s40 = match(T__39);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s40);
						}
						break;
					case T__40:
						{
						setState(478);
						((EAttributeContext)_localctx).s41 = match(T__40);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s41);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(481);
						match(T__2);
						}
					}

					}
					}
					setState(486); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0) );
				setState(488);
				match(T__3);
				}
				break;
			}
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(491);
				match(T__1);
				{
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(492);
						((EAttributeContext)_localctx).eAnnotation = ((EAttributeContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EAttributeContext)_localctx).ownedAnnotations.add(((EAttributeContext)_localctx).eAnnotation);
						_localctx.element.getEAnnotations().add(((EAttributeContext)_localctx).eAnnotation.element);
						}
						} 
					}
					setState(499);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(506);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__83:
					{
					setState(500);
					((EAttributeContext)_localctx).ownedDerivation = ((EAttributeContext)_localctx).derivation = derivation(_localctx.current);
					_localctx.element.getEAnnotations().add(((EAttributeContext)_localctx).derivation.element);
					}
					break;
				case T__82:
					{
					setState(503);
					((EAttributeContext)_localctx).ownedInitial = ((EAttributeContext)_localctx).initial = initial(_localctx.current);
					_localctx.element.getEAnnotations().add(((EAttributeContext)_localctx).initial.element);
					}
					break;
				case T__3:
				case T__62:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__62) {
					{
					{
					setState(508);
					((EAttributeContext)_localctx).eAnnotation = ((EAttributeContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
					((EAttributeContext)_localctx).ownedAnnotations.add(((EAttributeContext)_localctx).eAnnotation);
					_localctx.element.getEAnnotations().add(((EAttributeContext)_localctx).eAnnotation.element);
					}
					}
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(516);
				match(T__3);
				}
				}
				break;
			case T__10:
				{
				setState(517);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			for(String s: ((EAttributeContext)_localctx).qualifier.stream().map(Token::getText).distinct().collect(Collectors.toList())){
			        switch (s) {
			            case "static":     createEAnnotation(_localctx.element, AnnotationSources.STATIC); break;
			            case "model":      createEAnnotation(_localctx.element, AnnotationSources.MODEL); break;
			            case "ghost":      createEAnnotation(_localctx.element, AnnotationSources.GHOST); break;
			            case "transient":  _localctx.element.setTransient(true); break;
			            case "volatile":   _localctx.element.setVolatile(true); break;
			            case "readonly":   _localctx.element.setChangeable(false); break;
			            case "derived":    _localctx.element.setDerived(true); break;
			            case "ordered":    int u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setOrdered(true); break;
			            case "!unique":    u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setUnique(false); break;
			            case "unsettable": _localctx.element.setUnsettable(true); break;
			            case "id":         _localctx.element.setID(true); break;}}
			    
			}
			_ctx.stop = _input.LT(-1);

			if (_localctx.eAttributeType != null) {
			    EObject genericElementType = _localctx.eAttributeType.element;
			    if (genericElementType instanceof EClassifier) { _localctx.element.setEType((EClassifier) genericElementType);}
			    else if (genericElementType instanceof EGenericType) { _localctx.element.setEGenericType((EGenericType) genericElementType);}
			}

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EReferenceContext extends ParserRuleContext {
		public Element owner;
		public EReference element;
		public Reference current;
		public VisibilityKindContext visibility;
		public Token s28;
		public List<Token> qualifier = new ArrayList<Token>();
		public Token s12;
		public Token s29;
		public Token s30;
		public Token s31;
		public Token s32;
		public UnrestrictedNameContext name;
		public UnrestrictedNameContext eOpposite;
		public EGenericElementTypeContext eReferenceType;
		public EMultiplicityContext ownedMultiplicity;
		public Token defaultValue;
		public Token s44;
		public Token s34;
		public Token s36;
		public Token s37;
		public Token s38;
		public Token s39;
		public Token s45;
		public Token s46;
		public Token s40;
		public Token s41;
		public UnrestrictedNameContext unrestrictedName;
		public List<UnrestrictedNameContext> referredKeys = new ArrayList<UnrestrictedNameContext>();
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public DerivationContext ownedDerivation;
		public DerivationContext derivation;
		public InitialContext ownedInitial;
		public InitialContext initial;
		public List<UnrestrictedNameContext> unrestrictedName() {
			return getRuleContexts(UnrestrictedNameContext.class);
		}
		public UnrestrictedNameContext unrestrictedName(int i) {
			return getRuleContext(UnrestrictedNameContext.class,i);
		}
		public EGenericElementTypeContext eGenericElementType() {
			return getRuleContext(EGenericElementTypeContext.class,0);
		}
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public EMultiplicityContext eMultiplicity() {
			return getRuleContext(EMultiplicityContext.class,0);
		}
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public DerivationContext derivation() {
			return getRuleContext(DerivationContext.class,0);
		}
		public InitialContext initial() {
			return getRuleContext(InitialContext.class,0);
		}
		public EReferenceContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EReferenceContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EReferenceContext eReference(Element owner) throws RecognitionException {
		EReferenceContext _localctx = new EReferenceContext(_ctx, getState(), owner);
		enterRule(_localctx, 46, RULE_eReference);
		((EReferenceContext)_localctx).element =  eFactory.createEReference(); ((EReferenceContext)_localctx).current =  new Reference(_localctx.element, _localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (T__85 - 85)) | (1L << (T__86 - 85)))) != 0)) {
				{
				setState(522);
				((EReferenceContext)_localctx).visibility = visibilityKind();
				}
			}

			if (_localctx.visibility != null) _localctx.element.getEAnnotations().add(((EReferenceContext)_localctx).visibility.element);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(526);
				((EReferenceContext)_localctx).s28 = match(T__27);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s28);
				}
			}

			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(529);
				((EReferenceContext)_localctx).s12 = match(T__11);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s12);
				}
				break;
			case T__28:
				{
				setState(530);
				((EReferenceContext)_localctx).s29 = match(T__28);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s29);
				}
				break;
			case T__29:
			case T__30:
			case T__31:
			case T__41:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(533);
				((EReferenceContext)_localctx).s30 = match(T__29);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s30);
				}
			}

			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(536);
				((EReferenceContext)_localctx).s31 = match(T__30);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s31);
				}
			}

			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(539);
				((EReferenceContext)_localctx).s32 = match(T__31);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s32);
				}
			}

			setState(542);
			match(T__41);
			setState(543);
			((EReferenceContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((EReferenceContext)_localctx).name!=null?_input.getText(((EReferenceContext)_localctx).name.start,((EReferenceContext)_localctx).name.stop):null));
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(545);
				match(T__42);
				setState(546);
				((EReferenceContext)_localctx).eOpposite = unrestrictedName();
				}
			}


			{
			setState(550);
			match(T__5);
			setState(551);
			((EReferenceContext)_localctx).eReferenceType = eGenericElementType(_localctx.current);
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(552);
				((EReferenceContext)_localctx).ownedMultiplicity = eMultiplicity(_localctx.current, (ETypedElement) _localctx.element);
				}
			}

			}
			if (_localctx.ownedMultiplicity == null) {_localctx.element.setLowerBound(1);} 
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(556);
				match(T__22);
				setState(557);
				((EReferenceContext)_localctx).defaultValue = match(SINGLE_QUOTED_STRING);
				}
			}

			if(((EReferenceContext)_localctx).defaultValue != null) _localctx.element.setDefaultValueLiteral(((EReferenceContext)_localctx).defaultValue.getText().replace("'", ""));
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(561);
				match(T__1);
				setState(577); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(572);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__43:
						{
						setState(562);
						((EReferenceContext)_localctx).s44 = match(T__43);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s44);
						}
						break;
					case T__33:
						{
						setState(563);
						((EReferenceContext)_localctx).s34 = match(T__33);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s34);
						}
						break;
					case T__35:
						{
						setState(564);
						((EReferenceContext)_localctx).s36 = match(T__35);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s36);
						}
						break;
					case T__36:
						{
						setState(565);
						((EReferenceContext)_localctx).s37 = match(T__36);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s37);
						}
						break;
					case T__37:
						{
						setState(566);
						((EReferenceContext)_localctx).s38 = match(T__37);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s38);
						}
						break;
					case T__38:
						{
						setState(567);
						((EReferenceContext)_localctx).s39 = match(T__38);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s39);
						}
						break;
					case T__44:
						{
						setState(568);
						((EReferenceContext)_localctx).s45 = match(T__44);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s45);
						}
						break;
					case T__45:
						{
						setState(569);
						((EReferenceContext)_localctx).s46 = match(T__45);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s46);
						}
						break;
					case T__39:
						{
						setState(570);
						((EReferenceContext)_localctx).s40 = match(T__39);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s40);
						}
						break;
					case T__40:
						{
						setState(571);
						((EReferenceContext)_localctx).s41 = match(T__40);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s41);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(575);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(574);
						match(T__2);
						}
					}

					}
					}
					setState(579); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0) );
				setState(581);
				match(T__3);
				}
				break;
			}
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(584);
				match(T__1);
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__46) {
					{
					setState(585);
					match(T__46);
					setState(586);
					((EReferenceContext)_localctx).unrestrictedName = unrestrictedName();
					((EReferenceContext)_localctx).referredKeys.add(((EReferenceContext)_localctx).unrestrictedName);
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(587);
						match(T__2);
						setState(588);
						((EReferenceContext)_localctx).unrestrictedName = unrestrictedName();
						((EReferenceContext)_localctx).referredKeys.add(((EReferenceContext)_localctx).unrestrictedName);
						}
						}
						setState(593);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(594);
					match(T__10);
					}
				}

				{
				setState(603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(598);
						((EReferenceContext)_localctx).eAnnotation = ((EReferenceContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EReferenceContext)_localctx).ownedAnnotations.add(((EReferenceContext)_localctx).eAnnotation);
						_localctx.element.getEAnnotations().add(((EReferenceContext)_localctx).eAnnotation.element);
						}
						} 
					}
					setState(605);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				setState(612);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__83:
					{
					setState(606);
					((EReferenceContext)_localctx).ownedDerivation = ((EReferenceContext)_localctx).derivation = derivation(_localctx.current);
					_localctx.element.getEAnnotations().add(((EReferenceContext)_localctx).derivation.element);
					}
					break;
				case T__82:
					{
					setState(609);
					((EReferenceContext)_localctx).ownedInitial = ((EReferenceContext)_localctx).initial = initial(_localctx.current);
					_localctx.element.getEAnnotations().add(((EReferenceContext)_localctx).initial.element);
					}
					break;
				case T__3:
				case T__62:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__62) {
					{
					{
					setState(614);
					((EReferenceContext)_localctx).eAnnotation = ((EReferenceContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
					((EReferenceContext)_localctx).ownedAnnotations.add(((EReferenceContext)_localctx).eAnnotation);
					_localctx.element.getEAnnotations().add(((EReferenceContext)_localctx).eAnnotation.element);
					}
					}
					setState(621);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(622);
				match(T__3);
				}
				}
				break;
			case T__10:
				{
				setState(623);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			for(String s: ((EReferenceContext)_localctx).qualifier.stream().map(Token::getText).distinct().collect(Collectors.toList())){
			        switch (s) {
			            case "static":    createEAnnotation(_localctx.element, AnnotationSources.STATIC); break;
			            case "model":     createEAnnotation(_localctx.element, AnnotationSources.MODEL); break;
			            case "ghost":     createEAnnotation(_localctx.element, AnnotationSources.GHOST); break;
			            case "transient": _localctx.element.setTransient(true); break;
			            case "volatile":  _localctx.element.setVolatile(true); break;
			            case "readonly":  _localctx.element.setChangeable(false); break;
			            case "unsettable":_localctx.element.setUnsettable(true); break;
			            case "derived":   _localctx.element.setDerived(true); break;
			            case "ordered":   int u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setOrdered(true); break;
			            case "!unique":   u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setUnique(false); break;
			            case "composes":  _localctx.element.setContainment(true); break;
			            case "!resolve":  _localctx.element.setResolveProxies(false); break;
			            default: break;}}
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EOperationContext extends ParserRuleContext {
		public Element owner;
		public EOperation element;
		public Operation current;
		public VisibilityKindContext visibility;
		public Token s28;
		public List<Token> qualifier = new ArrayList<Token>();
		public TemplateSignatureContext ownedSignature;
		public TemplateSignatureContext templateSignature;
		public UnrestrictedNameContext name;
		public EParameterContext eParameter;
		public List<EParameterContext> eParameters = new ArrayList<EParameterContext>();
		public EGenericElementTypeContext eReturnType;
		public EGenericElementTypeContext eGenericElementType;
		public EMultiplicityContext ownedMultiplicity;
		public EGenericExceptionContext eGenericException;
		public List<EGenericExceptionContext> ownedException = new ArrayList<EGenericExceptionContext>();
		public Token s36;
		public Token s37;
		public Token s38;
		public Token s39;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public PreconditionContext precondition;
		public List<PreconditionContext> ownedPreconditions = new ArrayList<PreconditionContext>();
		public BodyContext body;
		public List<BodyContext> ownedBodyExpression = new ArrayList<BodyContext>();
		public PostconditionContext postcondition;
		public List<PostconditionContext> ownedPostconditions = new ArrayList<PostconditionContext>();
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public TemplateSignatureContext templateSignature() {
			return getRuleContext(TemplateSignatureContext.class,0);
		}
		public EGenericElementTypeContext eGenericElementType() {
			return getRuleContext(EGenericElementTypeContext.class,0);
		}
		public List<EGenericExceptionContext> eGenericException() {
			return getRuleContexts(EGenericExceptionContext.class);
		}
		public EGenericExceptionContext eGenericException(int i) {
			return getRuleContext(EGenericExceptionContext.class,i);
		}
		public List<EParameterContext> eParameter() {
			return getRuleContexts(EParameterContext.class);
		}
		public EParameterContext eParameter(int i) {
			return getRuleContext(EParameterContext.class,i);
		}
		public EMultiplicityContext eMultiplicity() {
			return getRuleContext(EMultiplicityContext.class,0);
		}
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public List<PreconditionContext> precondition() {
			return getRuleContexts(PreconditionContext.class);
		}
		public PreconditionContext precondition(int i) {
			return getRuleContext(PreconditionContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<PostconditionContext> postcondition() {
			return getRuleContexts(PostconditionContext.class);
		}
		public PostconditionContext postcondition(int i) {
			return getRuleContext(PostconditionContext.class,i);
		}
		public EOperationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EOperationContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EOperationContext eOperation(Element owner) throws RecognitionException {
		EOperationContext _localctx = new EOperationContext(_ctx, getState(), owner);
		enterRule(_localctx, 48, RULE_eOperation);
		((EOperationContext)_localctx).element =  eFactory.createEOperation(); ((EOperationContext)_localctx).current =  new Operation(_localctx.element, _localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (T__85 - 85)) | (1L << (T__86 - 85)))) != 0)) {
				{
				setState(628);
				((EOperationContext)_localctx).visibility = visibilityKind();
				}
			}

			if (_localctx.visibility != null) _localctx.element.getEAnnotations().add(((EOperationContext)_localctx).visibility.element);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(632);
				((EOperationContext)_localctx).s28 = match(T__27);
				((EOperationContext)_localctx).qualifier.add(((EOperationContext)_localctx).s28);
				}
			}

			setState(635);
			match(T__47);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__64) {
				{
				setState(636);
				((EOperationContext)_localctx).ownedSignature = ((EOperationContext)_localctx).templateSignature = templateSignature(_localctx.current);
				}
			}

			if(_localctx.templateSignature != null) _localctx.element.getETypeParameters().addAll(((EOperationContext)_localctx).templateSignature.typeParameters);
			setState(640);
			((EOperationContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((EOperationContext)_localctx).name!=null?_input.getText(((EOperationContext)_localctx).name.start,((EOperationContext)_localctx).name.stop):null));
			{
			setState(642);
			match(T__48);
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__11 - 10)) | (1L << (T__20 - 10)) | (1L << (T__21 - 10)) | (1L << (T__23 - 10)) | (1L << (T__24 - 10)) | (1L << (T__25 - 10)) | (1L << (T__26 - 10)) | (1L << (T__27 - 10)) | (1L << (T__29 - 10)) | (1L << (T__30 - 10)) | (1L << (T__31 - 10)) | (1L << (T__32 - 10)) | (1L << (T__33 - 10)) | (1L << (T__34 - 10)) | (1L << (T__35 - 10)) | (1L << (T__37 - 10)) | (1L << (T__39 - 10)) | (1L << (T__41 - 10)) | (1L << (T__43 - 10)) | (1L << (T__44 - 10)) | (1L << (T__46 - 10)) | (1L << (T__47 - 10)) | (1L << (T__50 - 10)) | (1L << (T__56 - 10)) | (1L << (T__57 - 10)) | (1L << (T__58 - 10)) | (1L << (T__60 - 10)) | (1L << (T__61 - 10)) | (1L << (T__62 - 10)) | (1L << (T__63 - 10)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
				{
				setState(643);
				((EOperationContext)_localctx).eParameter = eParameter(_localctx.current);
				((EOperationContext)_localctx).eParameters.add(((EOperationContext)_localctx).eParameter);
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(644);
					match(T__2);
					setState(645);
					((EOperationContext)_localctx).eParameter = eParameter(_localctx.current);
					((EOperationContext)_localctx).eParameters.add(((EOperationContext)_localctx).eParameter);
					}
					}
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(653);
			match(T__49);
			}
			for (EParameterContext ctx: ((EOperationContext)_localctx).eParameters){_localctx.element.getEParameters().add(ctx.element);}
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(656);
				match(T__5);
				setState(657);
				((EOperationContext)_localctx).eReturnType = ((EOperationContext)_localctx).eGenericElementType = eGenericElementType(_localctx.current);
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(658);
					((EOperationContext)_localctx).ownedMultiplicity = eMultiplicity(_localctx.current, (ETypedElement) _localctx.element);
					}
				}

				}
			}

			if (_localctx.ownedMultiplicity == null) {_localctx.element.setLowerBound(1);} 
			 if (_localctx.eReturnType != null) _localctx.element.setEGenericType(((EOperationContext)_localctx).eGenericElementType.element);
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__50) {
				{
				setState(665);
				match(T__50);
				setState(666);
				((EOperationContext)_localctx).eGenericException = eGenericException(_localctx.current);
				((EOperationContext)_localctx).ownedException.add(((EOperationContext)_localctx).eGenericException);
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(667);
					match(T__2);
					setState(668);
					((EOperationContext)_localctx).eGenericException = eGenericException(_localctx.current);
					((EOperationContext)_localctx).ownedException.add(((EOperationContext)_localctx).eGenericException);
					}
					}
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			 for(EGenericExceptionContext e: ((EOperationContext)_localctx).ownedException) _localctx.element.getEGenericExceptions().add(e.element);
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(677);
				match(T__1);
				setState(687); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(682);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__35:
						{
						setState(678);
						((EOperationContext)_localctx).s36 = match(T__35);
						((EOperationContext)_localctx).qualifier.add(((EOperationContext)_localctx).s36);
						}
						break;
					case T__36:
						{
						setState(679);
						((EOperationContext)_localctx).s37 = match(T__36);
						((EOperationContext)_localctx).qualifier.add(((EOperationContext)_localctx).s37);
						}
						break;
					case T__37:
						{
						setState(680);
						((EOperationContext)_localctx).s38 = match(T__37);
						((EOperationContext)_localctx).qualifier.add(((EOperationContext)_localctx).s38);
						}
						break;
					case T__38:
						{
						setState(681);
						((EOperationContext)_localctx).s39 = match(T__38);
						((EOperationContext)_localctx).qualifier.add(((EOperationContext)_localctx).s39);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(684);
						match(T__2);
						}
					}

					}
					}
					setState(689); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0) );
				setState(691);
				match(T__3);
				}
				break;
			}
			setState(714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(694);
				match(T__1);
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__75 - 63)) | (1L << (T__78 - 63)) | (1L << (T__79 - 63)) | (1L << (T__80 - 63)) | (1L << (T__81 - 63)))) != 0)) {
					{
					setState(707);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__62:
						{
						setState(695);
						((EOperationContext)_localctx).eAnnotation = ((EOperationContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EOperationContext)_localctx).ownedAnnotations.add(((EOperationContext)_localctx).eAnnotation);
						_localctx.element.getEAnnotations().add(((EOperationContext)_localctx).eAnnotation.element);
						}
						break;
					case T__78:
					case T__79:
						{
						setState(698);
						((EOperationContext)_localctx).precondition = ((EOperationContext)_localctx).precondition = precondition(_localctx.current);
						((EOperationContext)_localctx).ownedPreconditions.add(((EOperationContext)_localctx).precondition);
						_localctx.element.getEAnnotations().add(((EOperationContext)_localctx).precondition.element);
						}
						break;
					case T__75:
						{
						setState(701);
						((EOperationContext)_localctx).body = ((EOperationContext)_localctx).body = body(_localctx.current);
						((EOperationContext)_localctx).ownedBodyExpression.add(((EOperationContext)_localctx).body);
						_localctx.element.getEAnnotations().add(((EOperationContext)_localctx).body.element);
						}
						break;
					case T__80:
					case T__81:
						{
						setState(704);
						((EOperationContext)_localctx).postcondition = ((EOperationContext)_localctx).postcondition = postcondition(_localctx.current);
						((EOperationContext)_localctx).ownedPostconditions.add(((EOperationContext)_localctx).postcondition);
						_localctx.element.getEAnnotations().add(((EOperationContext)_localctx).postcondition.element);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(712);
				match(T__3);
				}
				}
				break;
			case T__10:
				{
				setState(713);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			for(String s: ((EOperationContext)_localctx).qualifier.stream().map(Token::getText).distinct().collect(Collectors.toList())){
			        switch (s) {
			            case "static":   createEAnnotation(_localctx.element, AnnotationSources.STATIC); break;
			            case "ordered":  int u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setOrdered(true); break;
			            case "!unique":  u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setUnique(false); break;}}
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EGenericExceptionContext extends ParserRuleContext {
		public Element owner;
		public EGenericType element;
		public GenericException current;
		public EGenericTypeContext eGenericType;
		public EGenericTypeContext eGenericType() {
			return getRuleContext(EGenericTypeContext.class,0);
		}
		public EGenericExceptionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EGenericExceptionContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eGenericException; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEGenericException(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEGenericException(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEGenericException(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EGenericExceptionContext eGenericException(Element owner) throws RecognitionException {
		EGenericExceptionContext _localctx = new EGenericExceptionContext(_ctx, getState(), owner);
		enterRule(_localctx, 50, RULE_eGenericException);
		((EGenericExceptionContext)_localctx).current =  new GenericException(_localctx); if (owner!=null) _localctx.owner.addOwnedElement(_localctx.current);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			((EGenericExceptionContext)_localctx).eGenericType = eGenericType(_localctx.current);
			((EGenericExceptionContext)_localctx).element =  ((EGenericExceptionContext)_localctx).eGenericType.element; _localctx.current.setEObject(_localctx.element);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EGenericSuperTypeContext extends ParserRuleContext {
		public Element owner;
		public EGenericType element;
		public GenericSuperType current;
		public EGenericTypeContext eGenericType;
		public EGenericTypeContext eGenericType() {
			return getRuleContext(EGenericTypeContext.class,0);
		}
		public EGenericSuperTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EGenericSuperTypeContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eGenericSuperType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEGenericSuperType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEGenericSuperType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEGenericSuperType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EGenericSuperTypeContext eGenericSuperType(Element owner) throws RecognitionException {
		EGenericSuperTypeContext _localctx = new EGenericSuperTypeContext(_ctx, getState(), owner);
		enterRule(_localctx, 52, RULE_eGenericSuperType);
		((EGenericSuperTypeContext)_localctx).current =  new GenericSuperType(_localctx); if (owner!=null) _localctx.owner.addOwnedElement(_localctx.current);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			((EGenericSuperTypeContext)_localctx).eGenericType = eGenericType(_localctx.current);
			((EGenericSuperTypeContext)_localctx).element =  ((EGenericSuperTypeContext)_localctx).eGenericType.element; _localctx.current.setEObject(_localctx.element);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EParameterContext extends ParserRuleContext {
		public Element owner;
		public EParameter element;
		public Parameter current;
		public UnrestrictedNameContext name;
		public EGenericElementTypeContext eParameterType;
		public EMultiplicityContext ownedMultiplicity;
		public Token s36;
		public List<Token> qualifier = new ArrayList<Token>();
		public Token s37;
		public Token s38;
		public Token s39;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public EGenericElementTypeContext eGenericElementType() {
			return getRuleContext(EGenericElementTypeContext.class,0);
		}
		public EMultiplicityContext eMultiplicity() {
			return getRuleContext(EMultiplicityContext.class,0);
		}
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public EParameterContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EParameterContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EParameterContext eParameter(Element owner) throws RecognitionException {
		EParameterContext _localctx = new EParameterContext(_ctx, getState(), owner);
		enterRule(_localctx, 54, RULE_eParameter);
		((EParameterContext)_localctx).element =  eFactory.createEParameter(); ((EParameterContext)_localctx).current =  new Parameter(_localctx.element, _localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			((EParameterContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((EParameterContext)_localctx).name!=null?_input.getText(((EParameterContext)_localctx).name.start,((EParameterContext)_localctx).name.stop):null));
			setState(726);
			match(T__5);
			setState(727);
			((EParameterContext)_localctx).eParameterType = eGenericElementType(_localctx.current);
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(728);
				((EParameterContext)_localctx).ownedMultiplicity = eMultiplicity(_localctx.current, (ETypedElement) _localctx.element);
				}
			}

			if (_localctx.ownedMultiplicity == null) {_localctx.element.setLowerBound(1);} 
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(732);
				match(T__1);
				setState(742); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(737);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__35:
						{
						setState(733);
						((EParameterContext)_localctx).s36 = match(T__35);
						((EParameterContext)_localctx).qualifier.add(((EParameterContext)_localctx).s36);
						}
						break;
					case T__36:
						{
						setState(734);
						((EParameterContext)_localctx).s37 = match(T__36);
						((EParameterContext)_localctx).qualifier.add(((EParameterContext)_localctx).s37);
						}
						break;
					case T__37:
						{
						setState(735);
						((EParameterContext)_localctx).s38 = match(T__37);
						((EParameterContext)_localctx).qualifier.add(((EParameterContext)_localctx).s38);
						}
						break;
					case T__38:
						{
						setState(736);
						((EParameterContext)_localctx).s39 = match(T__38);
						((EParameterContext)_localctx).qualifier.add(((EParameterContext)_localctx).s39);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(739);
						match(T__2);
						}
					}

					}
					}
					setState(744); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0) );
				setState(746);
				match(T__3);
				}
				break;
			}
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(749);
				match(T__1);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__62) {
					{
					{
					setState(750);
					((EParameterContext)_localctx).eAnnotation = ((EParameterContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
					((EParameterContext)_localctx).ownedAnnotations.add(((EParameterContext)_localctx).eAnnotation);
					}
					}
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				_localctx.element.getEAnnotations().add(((EParameterContext)_localctx).eAnnotation.element);
				setState(757);
				match(T__3);
				}
			}

			for(String s: ((EParameterContext)_localctx).qualifier.stream().map(Token::getText).distinct().collect(Collectors.toList())){
			        switch (s) {
			            case "ordered":  int u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setOrdered(true);break;
			            case "!unique":  u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setUnique(false);break;}}
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EMultiplicityContext extends ParserRuleContext {
		public Element owner;
		public ETypedElement element;
		public int l = 1;
		public int u = 1;
		public LowerContext lowerBound;
		public UpperContext upperBound;
		public Token stringBound;
		public Token nullable;
		public LowerContext lower() {
			return getRuleContext(LowerContext.class,0);
		}
		public UpperContext upper() {
			return getRuleContext(UpperContext.class,0);
		}
		public EMultiplicityContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EMultiplicityContext(ParserRuleContext parent, int invokingState, Element owner, ETypedElement element) {
			super(parent, invokingState);
			this.owner = owner;
			this.element = element;
		}
		@Override public int getRuleIndex() { return RULE_eMultiplicity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEMultiplicity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEMultiplicity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEMultiplicity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EMultiplicityContext eMultiplicity(Element owner,ETypedElement element) throws RecognitionException {
		EMultiplicityContext _localctx = new EMultiplicityContext(_ctx, getState(), owner, element);
		enterRule(_localctx, 56, RULE_eMultiplicity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(T__12);
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(763);
				((EMultiplicityContext)_localctx).lowerBound = lower();
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__51) {
					{
					setState(764);
					match(T__51);
					setState(765);
					((EMultiplicityContext)_localctx).upperBound = upper();
					}
				}

				}
				break;
			case T__16:
			case T__52:
			case T__53:
				{
				setState(768);
				((EMultiplicityContext)_localctx).stringBound = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__52) | (1L << T__53))) != 0)) ) {
					((EMultiplicityContext)_localctx).stringBound = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__54:
				{
				setState(771);
				((EMultiplicityContext)_localctx).nullable = match(T__54);
				}
				break;
			case T__55:
				{
				setState(772);
				match(T__55);
				}
				break;
			case T__13:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(775);
			match(T__13);

				if (_localctx.stringBound != null) {
				    switch (_localctx.stringBound.getText()) {
			            case "*": ((EMultiplicityContext)_localctx).l =  0; ((EMultiplicityContext)_localctx).u =  -1; break;
			            case "+": ((EMultiplicityContext)_localctx).l =  1; ((EMultiplicityContext)_localctx).u =  -1; break;
			            case "?": ((EMultiplicityContext)_localctx).l =  0; ((EMultiplicityContext)_localctx).u =   1; break;
			            default: break;
			        }
			    } else {
			        try { ((EMultiplicityContext)_localctx).l =  Integer.valueOf((((EMultiplicityContext)_localctx).lowerBound!=null?_input.getText(((EMultiplicityContext)_localctx).lowerBound.start,((EMultiplicityContext)_localctx).lowerBound.stop):null)); } catch (NumberFormatException ex) {System.out.println(Arrays.toString(ex.getStackTrace()));}
			        if (_localctx.upperBound != null) {
			            if (_localctx.upperBound.getText().equals("*")) ((EMultiplicityContext)_localctx).u =  -1;
			            else try {((EMultiplicityContext)_localctx).u =  Integer.valueOf((((EMultiplicityContext)_localctx).upperBound!=null?_input.getText(((EMultiplicityContext)_localctx).upperBound.start,((EMultiplicityContext)_localctx).upperBound.stop):null));} catch (NumberFormatException ex){System.out.println(Arrays.toString(ex.getStackTrace()));}
			        } else { ((EMultiplicityContext)_localctx).u =  _localctx.l;}
			    }
			    if ((_localctx.u > 1 || _localctx.u == -1) && _localctx.nullable != null) createEAnnotation(_localctx.element, AnnotationSources.NULLABLE);
				
			}
			_ctx.stop = _input.LT(-1);
			_localctx.element.setLowerBound(_localctx.l); _localctx.element.setUpperBound(_localctx.u); if (owner!=null) _localctx.owner.addOwnedElement(new Multiplicity(_localctx));
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EDataTypeContext extends ParserRuleContext {
		public Element owner;
		public EDataType element;
		public DataType current;
		public VisibilityKindContext visibility;
		public Token s57;
		public List<Token> qualifier = new ArrayList<Token>();
		public UnrestrictedNameContext name;
		public TemplateSignatureContext ownedSignature;
		public TemplateSignatureContext templateSignature;
		public Token instanceClassName;
		public Token s59;
		public Token s60;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public InvariantContext invariant;
		public List<InvariantContext> ownedConstraints = new ArrayList<InvariantContext>();
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public TemplateSignatureContext templateSignature() {
			return getRuleContext(TemplateSignatureContext.class,0);
		}
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public List<InvariantContext> invariant() {
			return getRuleContexts(InvariantContext.class);
		}
		public InvariantContext invariant(int i) {
			return getRuleContext(InvariantContext.class,i);
		}
		public EDataTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EDataTypeContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EDataTypeContext eDataType(Element owner) throws RecognitionException {
		EDataTypeContext _localctx = new EDataTypeContext(_ctx, getState(), owner);
		enterRule(_localctx, 58, RULE_eDataType);
		((EDataTypeContext)_localctx).element =  eFactory.createEDataType(); ((EDataTypeContext)_localctx).current =  new DataType(_localctx.element, _localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (T__85 - 85)) | (1L << (T__86 - 85)))) != 0)) {
				{
				setState(778);
				((EDataTypeContext)_localctx).visibility = visibilityKind();
				}
			}

			if (_localctx.visibility != null) _localctx.element.getEAnnotations().add(((EDataTypeContext)_localctx).visibility.element);
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__56) {
				{
				setState(782);
				((EDataTypeContext)_localctx).s57 = match(T__56);
				((EDataTypeContext)_localctx).qualifier.add(((EDataTypeContext)_localctx).s57);
				}
			}

			setState(785);
			match(T__57);
			setState(786);
			((EDataTypeContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((EDataTypeContext)_localctx).name!=null?_input.getText(((EDataTypeContext)_localctx).name.start,((EDataTypeContext)_localctx).name.stop):null));
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__64) {
				{
				setState(788);
				((EDataTypeContext)_localctx).ownedSignature = ((EDataTypeContext)_localctx).templateSignature = templateSignature(_localctx.current);
				}
			}

			if(_localctx.templateSignature != null) _localctx.element.getETypeParameters().addAll(((EDataTypeContext)_localctx).templateSignature.typeParameters);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(792);
				match(T__5);
				setState(793);
				((EDataTypeContext)_localctx).instanceClassName = match(SINGLE_QUOTED_STRING);
				}
			}

			if(((EDataTypeContext)_localctx).instanceClassName != null) _localctx.element.setInstanceClassName(((EDataTypeContext)_localctx).instanceClassName.getText().replace("'", ""));
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(797);
				match(T__1);
				setState(800);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__58:
					{
					setState(798);
					((EDataTypeContext)_localctx).s59 = match(T__58);
					((EDataTypeContext)_localctx).qualifier.add(((EDataTypeContext)_localctx).s59);
					}
					break;
				case T__59:
					{
					setState(799);
					((EDataTypeContext)_localctx).s60 = match(T__59);
					((EDataTypeContext)_localctx).qualifier.add(((EDataTypeContext)_localctx).s60);
					}
					break;
				case T__3:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(802);
				match(T__3);
				}
				break;
			}
			setState(819);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(805);
				match(T__1);
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__76 - 63)) | (1L << (T__77 - 63)))) != 0)) {
					{
					setState(812);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__62:
						{
						setState(806);
						((EDataTypeContext)_localctx).eAnnotation = ((EDataTypeContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EDataTypeContext)_localctx).ownedAnnotations.add(((EDataTypeContext)_localctx).eAnnotation);
						_localctx.element.getEAnnotations().add(((EDataTypeContext)_localctx).eAnnotation.element);
						}
						break;
					case T__76:
					case T__77:
						{
						setState(809);
						((EDataTypeContext)_localctx).invariant = ((EDataTypeContext)_localctx).invariant = invariant(_localctx.current);
						((EDataTypeContext)_localctx).ownedConstraints.add(((EDataTypeContext)_localctx).invariant);
						_localctx.element.getEAnnotations().add(((EDataTypeContext)_localctx).invariant.element);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(816);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(817);
				match(T__3);
				}
				}
				break;
			case T__10:
				{
				setState(818);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			for(String s: ((EDataTypeContext)_localctx).qualifier.stream().map(Token::getText).distinct().collect(Collectors.toList())){
			        switch (s) {
			            case "primitive":     createEAnnotation(_localctx.element, AnnotationSources.DATATYPE_PRIMITIVE);break;
			            case "!serializable": _localctx.element.setSerializable(false); break; }}
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EEnumContext extends ParserRuleContext {
		public Element owner;
		public EEnum element;
		public Enum current;
		public VisibilityKindContext visibility;
		public UnrestrictedNameContext name;
		public TemplateSignatureContext ownedSignature;
		public TemplateSignatureContext templateSignature;
		public Token instanceClassName;
		public Token s59;
		public List<Token> qualifier = new ArrayList<Token>();
		public Token s60;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public EEnumLiteralContext eEnumLiteral;
		public List<EEnumLiteralContext> ownedLiteral = new ArrayList<EEnumLiteralContext>();
		public InvariantContext invariant;
		public List<InvariantContext> ownedConstraint = new ArrayList<InvariantContext>();
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public TemplateSignatureContext templateSignature() {
			return getRuleContext(TemplateSignatureContext.class,0);
		}
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public List<EEnumLiteralContext> eEnumLiteral() {
			return getRuleContexts(EEnumLiteralContext.class);
		}
		public EEnumLiteralContext eEnumLiteral(int i) {
			return getRuleContext(EEnumLiteralContext.class,i);
		}
		public List<InvariantContext> invariant() {
			return getRuleContexts(InvariantContext.class);
		}
		public InvariantContext invariant(int i) {
			return getRuleContext(InvariantContext.class,i);
		}
		public EEnumContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EEnumContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EEnumContext eEnum(Element owner) throws RecognitionException {
		EEnumContext _localctx = new EEnumContext(_ctx, getState(), owner);
		enterRule(_localctx, 60, RULE_eEnum);
		((EEnumContext)_localctx).element =  eFactory.createEEnum(); ((EEnumContext)_localctx).current =  new Enum(_localctx.element, _localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (T__85 - 85)) | (1L << (T__86 - 85)))) != 0)) {
				{
				setState(823);
				((EEnumContext)_localctx).visibility = visibilityKind();
				}
			}

			if (_localctx.visibility != null) _localctx.element.getEAnnotations().add(((EEnumContext)_localctx).visibility.element);
			setState(827);
			match(T__60);
			setState(828);
			((EEnumContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((EEnumContext)_localctx).name!=null?_input.getText(((EEnumContext)_localctx).name.start,((EEnumContext)_localctx).name.stop):null));
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__64) {
				{
				setState(830);
				((EEnumContext)_localctx).ownedSignature = ((EEnumContext)_localctx).templateSignature = templateSignature(_localctx.current);
				}
			}

			if(_localctx.templateSignature != null) _localctx.element.getETypeParameters().addAll(((EEnumContext)_localctx).templateSignature.typeParameters);
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(834);
				match(T__5);
				setState(835);
				((EEnumContext)_localctx).instanceClassName = match(SINGLE_QUOTED_STRING);
				}
			}

			if(((EEnumContext)_localctx).instanceClassName != null) _localctx.element.setInstanceClassName(((EEnumContext)_localctx).instanceClassName.getText().replace("'", ""));
			setState(845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(839);
				match(T__1);
				setState(842);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__58:
					{
					setState(840);
					((EEnumContext)_localctx).s59 = match(T__58);
					((EEnumContext)_localctx).qualifier.add(((EEnumContext)_localctx).s59);
					}
					break;
				case T__59:
					{
					setState(841);
					((EEnumContext)_localctx).s60 = match(T__59);
					((EEnumContext)_localctx).qualifier.add(((EEnumContext)_localctx).s60);
					}
					break;
				case T__3:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(844);
				match(T__3);
				}
				break;
			}
			setState(864);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(847);
				match(T__1);
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__11 - 10)) | (1L << (T__20 - 10)) | (1L << (T__21 - 10)) | (1L << (T__23 - 10)) | (1L << (T__24 - 10)) | (1L << (T__25 - 10)) | (1L << (T__26 - 10)) | (1L << (T__27 - 10)) | (1L << (T__29 - 10)) | (1L << (T__30 - 10)) | (1L << (T__31 - 10)) | (1L << (T__32 - 10)) | (1L << (T__33 - 10)) | (1L << (T__34 - 10)) | (1L << (T__35 - 10)) | (1L << (T__37 - 10)) | (1L << (T__39 - 10)) | (1L << (T__41 - 10)) | (1L << (T__43 - 10)) | (1L << (T__44 - 10)) | (1L << (T__46 - 10)) | (1L << (T__47 - 10)) | (1L << (T__50 - 10)) | (1L << (T__56 - 10)) | (1L << (T__57 - 10)) | (1L << (T__58 - 10)) | (1L << (T__60 - 10)) | (1L << (T__61 - 10)) | (1L << (T__62 - 10)) | (1L << (T__63 - 10)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
					{
					setState(857);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						setState(848);
						((EEnumContext)_localctx).eAnnotation = ((EEnumContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EEnumContext)_localctx).ownedAnnotations.add(((EEnumContext)_localctx).eAnnotation);
						_localctx.element.getEAnnotations().add(((EEnumContext)_localctx).eAnnotation.element);
						}
						break;
					case 2:
						{
						setState(851);
						((EEnumContext)_localctx).eEnumLiteral = ((EEnumContext)_localctx).eEnumLiteral = eEnumLiteral(_localctx.current);
						((EEnumContext)_localctx).ownedLiteral.add(((EEnumContext)_localctx).eEnumLiteral);
						_localctx.element.getELiterals().add(((EEnumContext)_localctx).eEnumLiteral.element);
						}
						break;
					case 3:
						{
						setState(854);
						((EEnumContext)_localctx).invariant = ((EEnumContext)_localctx).invariant = invariant(_localctx.current);
						((EEnumContext)_localctx).ownedConstraint.add(((EEnumContext)_localctx).invariant);
						_localctx.element.getEAnnotations().add(((EEnumContext)_localctx).invariant.element);
						}
						break;
					}
					}
					setState(861);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(862);
				match(T__3);
				}
				}
				break;
			case T__10:
				{
				setState(863);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			for(String s: ((EEnumContext)_localctx).qualifier.stream().map(Token::getText).distinct().collect(Collectors.toList())){
			        switch (s) {
			            case "!serializable": _localctx.element.setSerializable(false); break;}}
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EEnumLiteralContext extends ParserRuleContext {
		public Element owner;
		public EEnumLiteral element;
		public EnumLiteral current;
		public UnrestrictedNameContext name;
		public Token value;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public EEnumLiteralContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EEnumLiteralContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eEnumLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEEnumLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEEnumLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEEnumLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EEnumLiteralContext eEnumLiteral(Element owner) throws RecognitionException {
		EEnumLiteralContext _localctx = new EEnumLiteralContext(_ctx, getState(), owner);
		enterRule(_localctx, 62, RULE_eEnumLiteral);
		((EEnumLiteralContext)_localctx).element =  eFactory.createEEnumLiteral(); ((EEnumLiteralContext)_localctx).current =  new EnumLiteral(_localctx.element, _localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				{
				setState(868);
				match(T__61);
				setState(869);
				((EEnumLiteralContext)_localctx).name = unrestrictedName();
				}
				}
				break;
			case 2:
				{
				setState(870);
				((EEnumLiteralContext)_localctx).name = unrestrictedName();
				}
				break;
			}
			_localctx.element.setName((((EEnumLiteralContext)_localctx).name!=null?_input.getText(((EEnumLiteralContext)_localctx).name.start,((EEnumLiteralContext)_localctx).name.stop):null));
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(874);
				match(T__22);
				setState(875);
				((EEnumLiteralContext)_localctx).value = match(INT);
				}
			}

			 
			setState(889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(879);
				match(T__1);
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__62) {
					{
					{
					setState(880);
					((EEnumLiteralContext)_localctx).eAnnotation = ((EEnumLiteralContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
					((EEnumLiteralContext)_localctx).ownedAnnotations.add(((EEnumLiteralContext)_localctx).eAnnotation);
					}
					}
					setState(885);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				_localctx.element.getEAnnotations().add(((EEnumLiteralContext)_localctx).eAnnotation.element);
				setState(887);
				match(T__3);
				}
				}
				break;
			case T__10:
				{
				setState(888);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EAnnotationContext extends ParserRuleContext {
		public Element owner;
		public EAnnotation element;
		public Annotation current;
		public Token source;
		public EDetailContext eDetail;
		public List<EDetailContext> ownedDetails = new ArrayList<EDetailContext>();
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public EModelElementContext eModelElement;
		public List<EModelElementContext> ownedContents = new ArrayList<EModelElementContext>();
		public EModelElementRefContext eModelElementRef;
		public List<EModelElementRefContext> ownedReferences = new ArrayList<EModelElementRefContext>();
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public List<EDetailContext> eDetail() {
			return getRuleContexts(EDetailContext.class);
		}
		public EDetailContext eDetail(int i) {
			return getRuleContext(EDetailContext.class,i);
		}
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public List<EModelElementContext> eModelElement() {
			return getRuleContexts(EModelElementContext.class);
		}
		public EModelElementContext eModelElement(int i) {
			return getRuleContext(EModelElementContext.class,i);
		}
		public List<EModelElementRefContext> eModelElementRef() {
			return getRuleContexts(EModelElementRefContext.class);
		}
		public EModelElementRefContext eModelElementRef(int i) {
			return getRuleContext(EModelElementRefContext.class,i);
		}
		public EAnnotationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EAnnotationContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EAnnotationContext eAnnotation(Element owner) throws RecognitionException {
		EAnnotationContext _localctx = new EAnnotationContext(_ctx, getState(), owner);
		enterRule(_localctx, 64, RULE_eAnnotation);
		((EAnnotationContext)_localctx).element =  eFactory.createEAnnotation(); ((EAnnotationContext)_localctx).current =  new Annotation(_localctx.element, _localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(T__62);
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_QUOTED_STRING) {
				{
				setState(892);
				((EAnnotationContext)_localctx).source = match(SINGLE_QUOTED_STRING);
				}
			}

			_localctx.element.setSource(((EAnnotationContext)_localctx).source != null ? ((EAnnotationContext)_localctx).source.getText().replace("'", "") : null);
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__48) {
				{
				setState(896);
				match(T__48);
				setState(897);
				((EAnnotationContext)_localctx).eDetail = eDetail(_localctx.current);
				((EAnnotationContext)_localctx).ownedDetails.add(((EAnnotationContext)_localctx).eDetail);
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(898);
					match(T__2);
					setState(899);
					((EAnnotationContext)_localctx).eDetail = eDetail(_localctx.current);
					((EAnnotationContext)_localctx).ownedDetails.add(((EAnnotationContext)_localctx).eDetail);
					}
					}
					setState(904);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(905);
				match(T__49);
				}
			}

			for (EDetailContext ctx: ((EAnnotationContext)_localctx).ownedDetails) _localctx.element.getDetails().put(ctx.k, ctx.v);
			setState(927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(910);
				match(T__1);
				setState(920); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(920);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
					case 1:
						{
						setState(911);
						((EAnnotationContext)_localctx).eAnnotation = ((EAnnotationContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EAnnotationContext)_localctx).ownedAnnotations.add(((EAnnotationContext)_localctx).eAnnotation);
						if(((EAnnotationContext)_localctx).eAnnotation.element != null) _localctx.element.getEAnnotations().add(((EAnnotationContext)_localctx).eAnnotation.element);
						}
						break;
					case 2:
						{
						setState(914);
						((EAnnotationContext)_localctx).eModelElement = ((EAnnotationContext)_localctx).eModelElement = eModelElement(_localctx.current);
						((EAnnotationContext)_localctx).ownedContents.add(((EAnnotationContext)_localctx).eModelElement);
						if(((EAnnotationContext)_localctx).eModelElement.element != null) _localctx.element.getContents().add(((EAnnotationContext)_localctx).eModelElement.element);
						}
						break;
					case 3:
						{
						setState(917);
						((EAnnotationContext)_localctx).eModelElementRef = ((EAnnotationContext)_localctx).eModelElementRef = eModelElementRef(_localctx.current);
						((EAnnotationContext)_localctx).ownedReferences.add(((EAnnotationContext)_localctx).eModelElementRef);
						if(((EAnnotationContext)_localctx).eModelElementRef.element != null) _localctx.element.getReferences().add(((EAnnotationContext)_localctx).eModelElementRef.element);
						}
						break;
					}
					}
					setState(922); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__11 - 10)) | (1L << (T__20 - 10)) | (1L << (T__21 - 10)) | (1L << (T__23 - 10)) | (1L << (T__24 - 10)) | (1L << (T__25 - 10)) | (1L << (T__26 - 10)) | (1L << (T__27 - 10)) | (1L << (T__28 - 10)) | (1L << (T__29 - 10)) | (1L << (T__30 - 10)) | (1L << (T__31 - 10)) | (1L << (T__32 - 10)) | (1L << (T__33 - 10)) | (1L << (T__34 - 10)) | (1L << (T__35 - 10)) | (1L << (T__37 - 10)) | (1L << (T__39 - 10)) | (1L << (T__41 - 10)) | (1L << (T__43 - 10)) | (1L << (T__44 - 10)) | (1L << (T__46 - 10)) | (1L << (T__47 - 10)) | (1L << (T__50 - 10)) | (1L << (T__56 - 10)) | (1L << (T__57 - 10)) | (1L << (T__58 - 10)) | (1L << (T__60 - 10)) | (1L << (T__61 - 10)) | (1L << (T__62 - 10)) | (1L << (T__63 - 10)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__84 - 76)) | (1L << (T__85 - 76)) | (1L << (T__86 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (IDENTIFIER - 76)))) != 0) );
				setState(924);
				match(T__3);
				}
				}
				break;
			case T__10:
				{
				setState(926);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EDetailContext extends ParserRuleContext {
		public Element owner;
		public String k;
		public String v;
		public AnnotationDetail current;
		public Token key;
		public Token value;
		public List<TerminalNode> SINGLE_QUOTED_STRING() { return getTokens(AlloyInEcoreParser.SINGLE_QUOTED_STRING); }
		public TerminalNode SINGLE_QUOTED_STRING(int i) {
			return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, i);
		}
		public TerminalNode ML_SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.ML_SINGLE_QUOTED_STRING, 0); }
		public EDetailContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EDetailContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eDetail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEDetail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEDetail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEDetail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EDetailContext eDetail(Element owner) throws RecognitionException {
		EDetailContext _localctx = new EDetailContext(_ctx, getState(), owner);
		enterRule(_localctx, 66, RULE_eDetail);
		((EDetailContext)_localctx).current =  new AnnotationDetail(_localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_QUOTED_STRING) {
				{
				setState(929);
				((EDetailContext)_localctx).key = match(SINGLE_QUOTED_STRING);
				}
			}

			setState(932);
			match(T__22);
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_QUOTED_STRING || _la==ML_SINGLE_QUOTED_STRING) {
				{
				setState(933);
				((EDetailContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SINGLE_QUOTED_STRING || _la==ML_SINGLE_QUOTED_STRING) ) {
					((EDetailContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			((EDetailContext)_localctx).k =  ((EDetailContext)_localctx).key != null ? ((EDetailContext)_localctx).key.getText().replace("'", "") : null; ((EDetailContext)_localctx).v =  ((EDetailContext)_localctx).value != null ? ((EDetailContext)_localctx).value.getText().replace("'", "") : null; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EModelElementContext extends ParserRuleContext {
		public Element owner;
		public EModelElement element;
		public EAnnotationContext eAnnotation;
		public ENamedElementContext eNamedElement;
		public EAnnotationContext eAnnotation() {
			return getRuleContext(EAnnotationContext.class,0);
		}
		public ENamedElementContext eNamedElement() {
			return getRuleContext(ENamedElementContext.class,0);
		}
		public EModelElementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EModelElementContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eModelElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEModelElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEModelElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEModelElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EModelElementContext eModelElement(Element owner) throws RecognitionException {
		EModelElementContext _localctx = new EModelElementContext(_ctx, getState(), owner);
		enterRule(_localctx, 68, RULE_eModelElement);
		try {
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				((EModelElementContext)_localctx).eAnnotation = eAnnotation(_localctx.owner);
				((EModelElementContext)_localctx).element =  ((EModelElementContext)_localctx).eAnnotation.element;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				((EModelElementContext)_localctx).eNamedElement = eNamedElement(_localctx.owner);
				((EModelElementContext)_localctx).element =  ((EModelElementContext)_localctx).eNamedElement.element;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ENamedElementContext extends ParserRuleContext {
		public Element owner;
		public ENamedElement element;
		public ETypedElementContext eTypedElement;
		public EClassifierContext eClassifier;
		public EPackageContext ePackage;
		public EEnumLiteralContext eEnumLiteral;
		public ETypedElementContext eTypedElement() {
			return getRuleContext(ETypedElementContext.class,0);
		}
		public EClassifierContext eClassifier() {
			return getRuleContext(EClassifierContext.class,0);
		}
		public EPackageContext ePackage() {
			return getRuleContext(EPackageContext.class,0);
		}
		public EEnumLiteralContext eEnumLiteral() {
			return getRuleContext(EEnumLiteralContext.class,0);
		}
		public ENamedElementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ENamedElementContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eNamedElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterENamedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitENamedElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitENamedElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ENamedElementContext eNamedElement(Element owner) throws RecognitionException {
		ENamedElementContext _localctx = new ENamedElementContext(_ctx, getState(), owner);
		enterRule(_localctx, 70, RULE_eNamedElement);
		try {
			setState(958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				((ENamedElementContext)_localctx).eTypedElement = eTypedElement(_localctx.owner);
				((ENamedElementContext)_localctx).element =  ((ENamedElementContext)_localctx).eTypedElement.element;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(949);
				((ENamedElementContext)_localctx).eClassifier = eClassifier(_localctx.owner);
				((ENamedElementContext)_localctx).element =  ((ENamedElementContext)_localctx).eClassifier.element;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(952);
				((ENamedElementContext)_localctx).ePackage = ePackage(_localctx.owner);
				((ENamedElementContext)_localctx).element =  ((ENamedElementContext)_localctx).ePackage.element;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(955);
				((ENamedElementContext)_localctx).eEnumLiteral = eEnumLiteral(_localctx.owner);
				((ENamedElementContext)_localctx).element =  ((ENamedElementContext)_localctx).eEnumLiteral.element;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ETypedElementContext extends ParserRuleContext {
		public Element owner;
		public ETypedElement element;
		public EOperationContext eOperation;
		public EParameterContext eParameter;
		public EStructuralFeatureContext eStructuralFeature;
		public EOperationContext eOperation() {
			return getRuleContext(EOperationContext.class,0);
		}
		public EParameterContext eParameter() {
			return getRuleContext(EParameterContext.class,0);
		}
		public EStructuralFeatureContext eStructuralFeature() {
			return getRuleContext(EStructuralFeatureContext.class,0);
		}
		public ETypedElementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ETypedElementContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eTypedElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterETypedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitETypedElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitETypedElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ETypedElementContext eTypedElement(Element owner) throws RecognitionException {
		ETypedElementContext _localctx = new ETypedElementContext(_ctx, getState(), owner);
		enterRule(_localctx, 72, RULE_eTypedElement);
		try {
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(960);
				((ETypedElementContext)_localctx).eOperation = eOperation(_localctx.owner);
				((ETypedElementContext)_localctx).element =  ((ETypedElementContext)_localctx).eOperation.element;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				((ETypedElementContext)_localctx).eParameter = eParameter(_localctx.owner);
				((ETypedElementContext)_localctx).element =  ((ETypedElementContext)_localctx).eParameter.element;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				((ETypedElementContext)_localctx).eStructuralFeature = eStructuralFeature(_localctx.owner);
				((ETypedElementContext)_localctx).element =  ((ETypedElementContext)_localctx).eStructuralFeature.element;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EModelElementRefContext extends ParserRuleContext {
		public Element owner;
		public EObject element;
		public AnnotationReference current;
		public PathNameContext ownedPathName;
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public EModelElementRefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EModelElementRefContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eModelElementRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEModelElementRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEModelElementRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEModelElementRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EModelElementRefContext eModelElementRef(Element owner) throws RecognitionException {
		EModelElementRefContext _localctx = new EModelElementRefContext(_ctx, getState(), owner);
		enterRule(_localctx, 74, RULE_eModelElementRef);
		((EModelElementRefContext)_localctx).current =  new AnnotationReference(_localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(T__63);
			setState(972);
			((EModelElementRefContext)_localctx).ownedPathName = pathName(_localctx.current);
			if (((EModelElementRefContext)_localctx).ownedPathName.element != null) _localctx.current.setEObject(((EModelElementRefContext)_localctx).element =  ((EModelElementRefContext)_localctx).ownedPathName.element);
			setState(974);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateSignatureContext extends ParserRuleContext {
		public Element owner;
		public List<ETypeParameter> typeParameters;
		public ETypeParameterContext eTypeParameter;
		public List<ETypeParameterContext> ownedTypeParameters = new ArrayList<ETypeParameterContext>();
		public List<ETypeParameterContext> eTypeParameter() {
			return getRuleContexts(ETypeParameterContext.class);
		}
		public ETypeParameterContext eTypeParameter(int i) {
			return getRuleContext(ETypeParameterContext.class,i);
		}
		public TemplateSignatureContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TemplateSignatureContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_templateSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterTemplateSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitTemplateSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitTemplateSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateSignatureContext templateSignature(Element owner) throws RecognitionException {
		TemplateSignatureContext _localctx = new TemplateSignatureContext(_ctx, getState(), owner);
		enterRule(_localctx, 76, RULE_templateSignature);
		((TemplateSignatureContext)_localctx).typeParameters =  new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(T__64);
			setState(977);
			((TemplateSignatureContext)_localctx).eTypeParameter = eTypeParameter(_localctx.owner);
			((TemplateSignatureContext)_localctx).ownedTypeParameters.add(((TemplateSignatureContext)_localctx).eTypeParameter);
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(978);
				match(T__2);
				setState(979);
				((TemplateSignatureContext)_localctx).eTypeParameter = eTypeParameter(_localctx.owner);
				((TemplateSignatureContext)_localctx).ownedTypeParameters.add(((TemplateSignatureContext)_localctx).eTypeParameter);
				}
				}
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(985);
			match(T__65);
			}
			_ctx.stop = _input.LT(-1);
			for(ETypeParameterContext ctx: ((TemplateSignatureContext)_localctx).ownedTypeParameters) _localctx.typeParameters.add(ctx.element);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ETypeParameterContext extends ParserRuleContext {
		public Element owner;
		public ETypeParameter element;
		public TypeParameter current;
		public UnrestrictedNameContext name;
		public EGenericTypeContext eGenericType;
		public List<EGenericTypeContext> ownedEBounds = new ArrayList<EGenericTypeContext>();
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public List<EGenericTypeContext> eGenericType() {
			return getRuleContexts(EGenericTypeContext.class);
		}
		public EGenericTypeContext eGenericType(int i) {
			return getRuleContext(EGenericTypeContext.class,i);
		}
		public ETypeParameterContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ETypeParameterContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterETypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitETypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitETypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ETypeParameterContext eTypeParameter(Element owner) throws RecognitionException {
		ETypeParameterContext _localctx = new ETypeParameterContext(_ctx, getState(), owner);
		enterRule(_localctx, 78, RULE_eTypeParameter);
		((ETypeParameterContext)_localctx).element =  eFactory.createETypeParameter(); ((ETypeParameterContext)_localctx).current =  new TypeParameter(_localctx.element, _localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			((ETypeParameterContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((ETypeParameterContext)_localctx).name!=null?_input.getText(((ETypeParameterContext)_localctx).name.start,((ETypeParameterContext)_localctx).name.stop):null));
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(989);
				match(T__26);
				setState(990);
				((ETypeParameterContext)_localctx).eGenericType = eGenericType(_localctx.current);
				((ETypeParameterContext)_localctx).ownedEBounds.add(((ETypeParameterContext)_localctx).eGenericType);
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__66) {
					{
					{
					setState(991);
					match(T__66);
					setState(992);
					((ETypeParameterContext)_localctx).eGenericType = eGenericType(_localctx.current);
					((ETypeParameterContext)_localctx).ownedEBounds.add(((ETypeParameterContext)_localctx).eGenericType);
					}
					}
					setState(997);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			for(EGenericTypeContext ctx: ((ETypeParameterContext)_localctx).ownedEBounds) _localctx.element.getEBounds().add(ctx.element);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EGenericTypeArgumentContext extends ParserRuleContext {
		public Element owner;
		public EGenericType element;
		public GenericTypeArgument current;
		public EGenericTypeContext eGenericType;
		public EGenericWildcardContext eGenericWildcard;
		public EGenericTypeContext eGenericType() {
			return getRuleContext(EGenericTypeContext.class,0);
		}
		public EGenericWildcardContext eGenericWildcard() {
			return getRuleContext(EGenericWildcardContext.class,0);
		}
		public EGenericTypeArgumentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EGenericTypeArgumentContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eGenericTypeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEGenericTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEGenericTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEGenericTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EGenericTypeArgumentContext eGenericTypeArgument(Element owner) throws RecognitionException {
		EGenericTypeArgumentContext _localctx = new EGenericTypeArgumentContext(_ctx, getState(), owner);
		enterRule(_localctx, 80, RULE_eGenericTypeArgument);
		((EGenericTypeArgumentContext)_localctx).current =  new GenericTypeArgument(_localctx); if (owner!=null) _localctx.owner.addOwnedElement(_localctx.current);
		try {
			setState(1008);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__11:
			case T__20:
			case T__21:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__37:
			case T__39:
			case T__41:
			case T__43:
			case T__44:
			case T__46:
			case T__47:
			case T__50:
			case T__56:
			case T__57:
			case T__58:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__80:
			case T__82:
			case T__83:
			case T__131:
			case T__132:
			case T__133:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				((EGenericTypeArgumentContext)_localctx).eGenericType = eGenericType(_localctx.current);
				((EGenericTypeArgumentContext)_localctx).element =  ((EGenericTypeArgumentContext)_localctx).eGenericType.element; _localctx.current.setEObject(_localctx.element);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				((EGenericTypeArgumentContext)_localctx).eGenericWildcard = eGenericWildcard(_localctx.current);
				((EGenericTypeArgumentContext)_localctx).element =  ((EGenericTypeArgumentContext)_localctx).eGenericWildcard.element; _localctx.current.setEObject(_localctx.element);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EGenericTypeContext extends ParserRuleContext {
		public Element owner;
		public EGenericType element;
		public Element current;
		public PathNameContext ownedPathName;
		public EGenericTypeArgumentContext eGenericTypeArgument;
		public List<EGenericTypeArgumentContext> ownedETypeArguments = new ArrayList<EGenericTypeArgumentContext>();
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public List<EGenericTypeArgumentContext> eGenericTypeArgument() {
			return getRuleContexts(EGenericTypeArgumentContext.class);
		}
		public EGenericTypeArgumentContext eGenericTypeArgument(int i) {
			return getRuleContext(EGenericTypeArgumentContext.class,i);
		}
		public EGenericTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EGenericTypeContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eGenericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEGenericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EGenericTypeContext eGenericType(Element owner) throws RecognitionException {
		EGenericTypeContext _localctx = new EGenericTypeContext(_ctx, getState(), owner);
		enterRule(_localctx, 82, RULE_eGenericType);

		((EGenericTypeContext)_localctx).element =  eFactory.createEGenericType();
		if (_localctx.parent instanceof ETypeParameterContext) {((EGenericTypeContext)_localctx).current =  new GenericType(_localctx.element, _localctx); owner.addOwnedElement(_localctx.current);}
		else {((EGenericTypeContext)_localctx).current =  _localctx.owner;}

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			((EGenericTypeContext)_localctx).ownedPathName = pathName(_localctx.current);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__64) {
				{
				setState(1011);
				match(T__64);
				setState(1012);
				((EGenericTypeContext)_localctx).eGenericTypeArgument = eGenericTypeArgument(_localctx.current);
				((EGenericTypeContext)_localctx).ownedETypeArguments.add(((EGenericTypeContext)_localctx).eGenericTypeArgument);
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1013);
					match(T__2);
					setState(1014);
					((EGenericTypeContext)_localctx).eGenericTypeArgument = eGenericTypeArgument(_localctx.current);
					((EGenericTypeContext)_localctx).ownedETypeArguments.add(((EGenericTypeContext)_localctx).eGenericTypeArgument);
					}
					}
					setState(1019);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1020);
				match(T__65);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EGenericElementTypeContext extends ParserRuleContext {
		public Element owner;
		public EGenericType element;
		public GenericElementType current;
		public EPrimitiveTypeContext ePrimitiveType;
		public EGenericTypeContext eGenericType;
		public EPrimitiveTypeContext ePrimitiveType() {
			return getRuleContext(EPrimitiveTypeContext.class,0);
		}
		public EGenericTypeContext eGenericType() {
			return getRuleContext(EGenericTypeContext.class,0);
		}
		public EGenericElementTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EGenericElementTypeContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eGenericElementType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEGenericElementType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEGenericElementType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEGenericElementType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EGenericElementTypeContext eGenericElementType(Element owner) throws RecognitionException {
		EGenericElementTypeContext _localctx = new EGenericElementTypeContext(_ctx, getState(), owner);
		enterRule(_localctx, 84, RULE_eGenericElementType);
		((EGenericElementTypeContext)_localctx).current =  new GenericElementType(_localctx); if (owner!=null) _localctx.owner.addOwnedElement(_localctx.current);
		try {
			setState(1030);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				((EGenericElementTypeContext)_localctx).ePrimitiveType = ePrimitiveType(_localctx.current);
				((EGenericElementTypeContext)_localctx).element =  ((EGenericElementTypeContext)_localctx).ePrimitiveType.element; _localctx.current.setEObject(_localctx.element);
				}
				break;
			case T__9:
			case T__11:
			case T__20:
			case T__21:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__37:
			case T__39:
			case T__41:
			case T__43:
			case T__44:
			case T__46:
			case T__47:
			case T__50:
			case T__56:
			case T__57:
			case T__58:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__80:
			case T__82:
			case T__83:
			case T__131:
			case T__132:
			case T__133:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1027);
				((EGenericElementTypeContext)_localctx).eGenericType = eGenericType(_localctx.current);
				((EGenericElementTypeContext)_localctx).element =  ((EGenericElementTypeContext)_localctx).eGenericType.element; _localctx.current.setEObject(_localctx.element);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EGenericWildcardContext extends ParserRuleContext {
		public Element owner;
		public EGenericType element;
		public GenericWildcard current;
		public Token bound;
		public EGenericTypeContext ownedExtend;
		public EGenericTypeContext eGenericType;
		public EGenericTypeContext eGenericType() {
			return getRuleContext(EGenericTypeContext.class,0);
		}
		public EGenericWildcardContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EGenericWildcardContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eGenericWildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEGenericWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEGenericWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEGenericWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EGenericWildcardContext eGenericWildcard(Element owner) throws RecognitionException {
		EGenericWildcardContext _localctx = new EGenericWildcardContext(_ctx, getState(), owner);
		enterRule(_localctx, 86, RULE_eGenericWildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(T__53);
			((EGenericWildcardContext)_localctx).element =  eFactory.createEGenericType();
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26 || _la==T__67) {
				{
				setState(1034);
				((EGenericWildcardContext)_localctx).bound = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__67) ) {
					((EGenericWildcardContext)_localctx).bound = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((EGenericWildcardContext)_localctx).current =  new GenericWildcard(_localctx.element, _localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
				setState(1036);
				((EGenericWildcardContext)_localctx).ownedExtend = ((EGenericWildcardContext)_localctx).eGenericType = eGenericType(_localctx.current);
				if (((EGenericWildcardContext)_localctx).bound.equals("extends")) _localctx.element.setEUpperBound(((EGenericWildcardContext)_localctx).eGenericType.element); else _localctx.element.setELowerBound(((EGenericWildcardContext)_localctx).eGenericType.element);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathNameContext extends ParserRuleContext {
		public Element owner;
		public EObject element;
		public UnrestrictedNameContext firstSegment;
		public Token index;
		public SegmentContext segment;
		public List<SegmentContext> midSegments = new ArrayList<SegmentContext>();
		public SegmentContext lastSegment;
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public List<SegmentContext> segment() {
			return getRuleContexts(SegmentContext.class);
		}
		public SegmentContext segment(int i) {
			return getRuleContext(SegmentContext.class,i);
		}
		public PathNameContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PathNameContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_pathName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterPathName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitPathName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitPathName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathNameContext pathName(Element owner) throws RecognitionException {
		PathNameContext _localctx = new PathNameContext(_ctx, getState(), owner);
		enterRule(_localctx, 88, RULE_pathName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			((PathNameContext)_localctx).firstSegment = unrestrictedName();
			setState(1044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1042);
				match(T__18);
				setState(1043);
				((PathNameContext)_localctx).index = match(INT);
				}
				break;
			}
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1046);
						((PathNameContext)_localctx).segment = segment();
						((PathNameContext)_localctx).midSegments.add(((PathNameContext)_localctx).segment);
						}
						} 
					}
					setState(1051);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				setState(1052);
				((PathNameContext)_localctx).lastSegment = segment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SegmentContext extends ParserRuleContext {
		public UnrestrictedNameContext name;
		public Token index;
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public SegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(T__68);
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__69) {
				{
				setState(1056);
				match(T__69);
				}
			}

			setState(1059);
			((SegmentContext)_localctx).name = unrestrictedName();
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1060);
				match(T__18);
				setState(1061);
				((SegmentContext)_localctx).index = match(INT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EPrimitiveTypeContext extends ParserRuleContext {
		public Element owner;
		public EGenericType element;
		public PrimitiveType current;
		public EPrimitiveTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EPrimitiveTypeContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_ePrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EPrimitiveTypeContext ePrimitiveType(Element owner) throws RecognitionException {
		EPrimitiveTypeContext _localctx = new EPrimitiveTypeContext(_ctx, getState(), owner);
		enterRule(_localctx, 92, RULE_ePrimitiveType);
		try {
			setState(1074);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__70:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				match(T__70);
				((EPrimitiveTypeContext)_localctx).element =  eFactory.createEGenericType(); _localctx.element.setEClassifier(EcorePackage.eINSTANCE.getEBoolean());
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				match(T__71);
				((EPrimitiveTypeContext)_localctx).element =  eFactory.createEGenericType(); _localctx.element.setEClassifier(EcorePackage.eINSTANCE.getEInt());
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 3);
				{
				setState(1068);
				match(T__72);
				((EPrimitiveTypeContext)_localctx).element =  eFactory.createEGenericType(); _localctx.element.setEClassifier(EcorePackage.eINSTANCE.getEString());
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 4);
				{
				setState(1070);
				match(T__73);
				((EPrimitiveTypeContext)_localctx).element =  eFactory.createEGenericType(); _localctx.element.setEClassifier(EcorePackage.eINSTANCE.getEBigDecimal());
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 5);
				{
				setState(1072);
				match(T__74);
				((EPrimitiveTypeContext)_localctx).element =  eFactory.createEGenericType(); _localctx.element.setEClassifier(EcorePackage.eINSTANCE.getEBigInteger());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			((EPrimitiveTypeContext)_localctx).current =  new PrimitiveType(_localctx.element, _localctx); if (owner!=null) owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public Element owner;
		public EAnnotation element;
		public Body current;
		public IdentifierContext name;
		public ExpressionContext ownedExpression;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BodyContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body(Element owner) throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState(), owner);
		enterRule(_localctx, 94, RULE_body);
		((BodyContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.BODY); ((BodyContext)_localctx).current =  new Body(_localctx); if (owner!=null) _localctx.owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			match(T__75);
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1077);
				((BodyContext)_localctx).name = identifier();
				}
			}

			if(_localctx.name!=null) _localctx.element.getDetails().put("name", (((BodyContext)_localctx).name!=null?_input.getText(((BodyContext)_localctx).name.start,((BodyContext)_localctx).name.stop):null)); 
			setState(1087);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(1081);
				match(T__5);
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
					{
					setState(1082);
					((BodyContext)_localctx).ownedExpression = expression(0);
					}
				}

				setState(1085);
				match(T__10);
				}
				}
				break;
			case T__10:
				{
				setState(1086);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if(_localctx.ownedExpression!=null) {_localctx.element.getDetails().put("expression", getContextText(_localctx.expression())); _localctx.current.addOwnedElement(((BodyContext)_localctx).ownedExpression.element);}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvariantContext extends ParserRuleContext {
		public Element owner;
		public EAnnotation element;
		public Invariant current;
		public Token isCallable;
		public IdentifierContext name;
		public Token message;
		public FormulaContext ownedSpecification;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOUBLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.DOUBLE_QUOTED_STRING, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public InvariantContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InvariantContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_invariant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterInvariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitInvariant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitInvariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvariantContext invariant(Element owner) throws RecognitionException {
		InvariantContext _localctx = new InvariantContext(_ctx, getState(), owner);
		enterRule(_localctx, 96, RULE_invariant);
		((InvariantContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.INVARIANT); ((InvariantContext)_localctx).current =  new Invariant(_localctx); _localctx.owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(1091);
				((InvariantContext)_localctx).isCallable = match(T__76);
				}
			}

			_localctx.element.getDetails().put("callable", ((InvariantContext)_localctx).isCallable != null ? "true" : "false");
			setState(1095);
			match(T__77);
			setState(1102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1096);
				((InvariantContext)_localctx).name = identifier();
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(1097);
					match(T__48);
					setState(1098);
					((InvariantContext)_localctx).message = match(DOUBLE_QUOTED_STRING);
					setState(1099);
					match(T__49);
					}
				}

				}
			}

			if(_localctx.name!=null) _localctx.element.getDetails().put("name", (((InvariantContext)_localctx).name!=null?_input.getText(((InvariantContext)_localctx).name.start,((InvariantContext)_localctx).name.stop):null)); if(((InvariantContext)_localctx).message!=null) _localctx.element.getDetails().put("message", (((InvariantContext)_localctx).message!=null?((InvariantContext)_localctx).message.getText():null).replace("\"", ""));
			setState(1111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(1105);
				match(T__5);
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__14 - 2)) | (1L << (T__15 - 2)) | (1L << (T__17 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__42 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__87 - 76)) | (1L << (T__88 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)) | (1L << (T__91 - 76)) | (1L << (T__92 - 76)) | (1L << (T__96 - 76)) | (1L << (T__98 - 76)) | (1L << (T__99 - 76)) | (1L << (T__101 - 76)) | (1L << (T__110 - 76)) | (1L << (T__111 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (INT - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
					{
					setState(1106);
					((InvariantContext)_localctx).ownedSpecification = formula(0);
					}
				}

				setState(1109);
				match(T__10);
				}
				}
				break;
			case T__10:
				{
				setState(1110);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if(_localctx.ownedSpecification!=null) {_localctx.element.getDetails().put("formula", getContextText(_localctx.formula())); _localctx.current.addOwnedElement(((InvariantContext)_localctx).ownedSpecification.element);}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreconditionContext extends ParserRuleContext {
		public Element owner;
		public EAnnotation element;
		public PreCondition current;
		public IdentifierContext name;
		public Token message;
		public FormulaContext ownedSpecification;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOUBLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.DOUBLE_QUOTED_STRING, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public PreconditionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PreconditionContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_precondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterPrecondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitPrecondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitPrecondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreconditionContext precondition(Element owner) throws RecognitionException {
		PreconditionContext _localctx = new PreconditionContext(_ctx, getState(), owner);
		enterRule(_localctx, 98, RULE_precondition);
		((PreconditionContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.PRECONDITION); ((PreconditionContext)_localctx).current =  new PreCondition(_localctx); _localctx.owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			_la = _input.LA(1);
			if ( !(_la==T__78 || _la==T__79) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1116);
				((PreconditionContext)_localctx).name = identifier();
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(1117);
					match(T__48);
					setState(1118);
					((PreconditionContext)_localctx).message = match(DOUBLE_QUOTED_STRING);
					setState(1119);
					match(T__49);
					}
				}

				}
			}

			if(_localctx.name!=null) _localctx.element.getDetails().put("name", (((PreconditionContext)_localctx).name!=null?_input.getText(((PreconditionContext)_localctx).name.start,((PreconditionContext)_localctx).name.stop):null)); if(((PreconditionContext)_localctx).message!=null) _localctx.element.getDetails().put("message", (((PreconditionContext)_localctx).message!=null?((PreconditionContext)_localctx).message.getText():null).replace("\"", ""));
			setState(1131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(1125);
				match(T__5);
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__14 - 2)) | (1L << (T__15 - 2)) | (1L << (T__17 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__42 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__87 - 76)) | (1L << (T__88 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)) | (1L << (T__91 - 76)) | (1L << (T__92 - 76)) | (1L << (T__96 - 76)) | (1L << (T__98 - 76)) | (1L << (T__99 - 76)) | (1L << (T__101 - 76)) | (1L << (T__110 - 76)) | (1L << (T__111 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (INT - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
					{
					setState(1126);
					((PreconditionContext)_localctx).ownedSpecification = formula(0);
					}
				}

				setState(1129);
				match(T__10);
				}
				}
				break;
			case T__10:
				{
				setState(1130);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if(_localctx.ownedSpecification!=null) _localctx.element.getDetails().put("formula", getContextText(_localctx.formula())); _localctx.current.addOwnedElement(((PreconditionContext)_localctx).ownedSpecification.element);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostconditionContext extends ParserRuleContext {
		public Element owner;
		public EAnnotation element;
		public PostCondition current;
		public IdentifierContext name;
		public Token message;
		public FormulaContext ownedSpecification;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOUBLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.DOUBLE_QUOTED_STRING, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public PostconditionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PostconditionContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_postcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterPostcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitPostcondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitPostcondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostconditionContext postcondition(Element owner) throws RecognitionException {
		PostconditionContext _localctx = new PostconditionContext(_ctx, getState(), owner);
		enterRule(_localctx, 100, RULE_postcondition);
		((PostconditionContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.POSTCONDITION); ((PostconditionContext)_localctx).current =  new PostCondition(_localctx); _localctx.owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			_la = _input.LA(1);
			if ( !(_la==T__80 || _la==T__81) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1136);
				((PostconditionContext)_localctx).name = identifier();
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(1137);
					match(T__48);
					setState(1138);
					((PostconditionContext)_localctx).message = match(DOUBLE_QUOTED_STRING);
					setState(1139);
					match(T__49);
					}
				}

				}
			}

			if(_localctx.name!=null) _localctx.element.getDetails().put("name", (((PostconditionContext)_localctx).name!=null?_input.getText(((PostconditionContext)_localctx).name.start,((PostconditionContext)_localctx).name.stop):null)); if(((PostconditionContext)_localctx).message!=null) _localctx.element.getDetails().put("message", (((PostconditionContext)_localctx).message!=null?((PostconditionContext)_localctx).message.getText():null).replace("\"", ""));
			setState(1151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(1145);
				match(T__5);
				setState(1147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__14 - 2)) | (1L << (T__15 - 2)) | (1L << (T__17 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__42 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__87 - 76)) | (1L << (T__88 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)) | (1L << (T__91 - 76)) | (1L << (T__92 - 76)) | (1L << (T__96 - 76)) | (1L << (T__98 - 76)) | (1L << (T__99 - 76)) | (1L << (T__101 - 76)) | (1L << (T__110 - 76)) | (1L << (T__111 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (INT - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
					{
					setState(1146);
					((PostconditionContext)_localctx).ownedSpecification = formula(0);
					}
				}

				setState(1149);
				match(T__10);
				}
				}
				break;
			case T__10:
				{
				setState(1150);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if(_localctx.ownedSpecification!=null) _localctx.element.getDetails().put("formula", getContextText(_localctx.formula())); _localctx.current.addOwnedElement(((PostconditionContext)_localctx).ownedSpecification.element);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialContext extends ParserRuleContext {
		public Element owner;
		public EAnnotation element;
		public Initial current;
		public IdentifierContext name;
		public ExpressionContext ownedExpression;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InitialContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_initial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterInitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitInitial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitInitial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialContext initial(Element owner) throws RecognitionException {
		InitialContext _localctx = new InitialContext(_ctx, getState(), owner);
		enterRule(_localctx, 102, RULE_initial);
		((InitialContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.INITIAL); ((InitialContext)_localctx).current =  new Initial(_localctx); _localctx.owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(T__82);
			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1156);
				((InitialContext)_localctx).name = identifier();
				}
			}

			if(_localctx.name!=null) _localctx.element.getDetails().put("name", (((InitialContext)_localctx).name!=null?_input.getText(((InitialContext)_localctx).name.start,((InitialContext)_localctx).name.stop):null));
			setState(1166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(1160);
				match(T__5);
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
					{
					setState(1161);
					((InitialContext)_localctx).ownedExpression = expression(0);
					}
				}

				setState(1164);
				match(T__10);
				}
				}
				break;
			case T__10:
				{
				setState(1165);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if(_localctx.ownedExpression!=null) {_localctx.element.getDetails().put("expression", getContextText(_localctx.expression())); _localctx.current.addOwnedElement(((InitialContext)_localctx).ownedExpression.element);} 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DerivationContext extends ParserRuleContext {
		public Element owner;
		public EAnnotation element;
		public Derivation current;
		public IdentifierContext name;
		public ExpressionContext ownedExpression;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DerivationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DerivationContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_derivation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterDerivation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitDerivation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitDerivation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivationContext derivation(Element owner) throws RecognitionException {
		DerivationContext _localctx = new DerivationContext(_ctx, getState(), owner);
		enterRule(_localctx, 104, RULE_derivation);
		((DerivationContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.DERIVATION); ((DerivationContext)_localctx).current =  new Derivation(_localctx); _localctx.owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			match(T__83);
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1171);
				((DerivationContext)_localctx).name = identifier();
				}
			}

			if(_localctx.name!=null) _localctx.element.getDetails().put("name", (((DerivationContext)_localctx).name!=null?_input.getText(((DerivationContext)_localctx).name.start,((DerivationContext)_localctx).name.stop):null));
			setState(1181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(1175);
				match(T__5);
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
					{
					setState(1176);
					((DerivationContext)_localctx).ownedExpression = expression(0);
					}
				}

				setState(1179);
				match(T__10);
				}
				}
				break;
			case T__10:
				{
				setState(1180);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if(_localctx.ownedExpression!=null) {_localctx.element.getDetails().put("expression", getContextText(_localctx.expression())); _localctx.current.addOwnedElement(((DerivationContext)_localctx).ownedExpression.element);} 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisibilityKindContext extends ParserRuleContext {
		public EAnnotation element;
		public Token qualifier;
		public VisibilityKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilityKind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterVisibilityKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitVisibilityKind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitVisibilityKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityKindContext visibilityKind() throws RecognitionException {
		VisibilityKindContext _localctx = new VisibilityKindContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_visibilityKind);
		((VisibilityKindContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.VISIBILITY);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__84:
				{
				setState(1185);
				((VisibilityKindContext)_localctx).qualifier = match(T__84);
				}
				break;
			case T__85:
				{
				setState(1186);
				((VisibilityKindContext)_localctx).qualifier = match(T__85);
				}
				break;
			case T__86:
				{
				setState(1187);
				((VisibilityKindContext)_localctx).qualifier = match(T__86);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_localctx.element.getDetails().put("visibility", (((VisibilityKindContext)_localctx).qualifier!=null?((VisibilityKindContext)_localctx).qualifier.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormulaContext extends ParserRuleContext {
		public Formula element;
		public List<Variable> variables;
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
	 
		public FormulaContext() { }
		public void copyFrom(FormulaContext ctx) {
			super.copyFrom(ctx);
			this.element = ctx.element;
			this.variables = ctx.variables;
		}
	}
	public static class NoContext extends FormulaContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NoContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitNo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitNo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomeContext extends FormulaContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SomeContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSome(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForOneContext extends FormulaContext {
		public FormulaContext formula;
		public QuantifierDeclarationsContext quantifierDeclarations() {
			return getRuleContext(QuantifierDeclarationsContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ForOneContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterForOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitForOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitForOne(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumDeclarationContext extends FormulaContext {
		public QuantifierDeclarationsContext quantifierDeclarations() {
			return getRuleContext(QuantifierDeclarationsContext.class,0);
		}
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public SumDeclarationContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForAllContext extends FormulaContext {
		public FormulaContext formula;
		public QuantifierDeclarationsContext quantifierDeclarations() {
			return getRuleContext(QuantifierDeclarationsContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ForAllContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterForAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitForAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitForAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoneContext extends FormulaContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoneContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtContext extends FormulaContext {
		public IntExpressionContext ileft;
		public Token not;
		public IntExpressionContext iright;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public LtContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForSomeContext extends FormulaContext {
		public FormulaContext formula;
		public QuantifierDeclarationsContext quantifierDeclarations() {
			return getRuleContext(QuantifierDeclarationsContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ForSomeContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterForSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitForSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitForSome(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends FormulaContext {
		public Token op;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public NotContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class F_paranthesisContext extends FormulaContext {
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public F_paranthesisContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterF_paranthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitF_paranthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitF_paranthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends FormulaContext {
		public FormulaContext fleft;
		public Token op;
		public FormulaContext fright;
		public FormulaContext formula;
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public AndContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionContext extends FormulaContext {
		public RelationIdContext rel;
		public ExpressionContext domain;
		public Token partial;
		public ExpressionContext range;
		public RelationIdContext relationId() {
			return getRuleContext(RelationIdContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GteContext extends FormulaContext {
		public IntExpressionContext ileft;
		public Token not;
		public IntExpressionContext iright;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public GteContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterGte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitGte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitGte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AcyclicContext extends FormulaContext {
		public RelationIdContext relationId() {
			return getRuleContext(RelationIdContext.class,0);
		}
		public AcyclicContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterAcyclic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitAcyclic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitAcyclic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetContext extends FormulaContext {
		public FormulaContext formula;
		public LetDeclarationsContext letDeclarations() {
			return getRuleContext(LetDeclarationsContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public LetContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LteContext extends FormulaContext {
		public IntExpressionContext ileft;
		public Token not;
		public IntExpressionContext iright;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public LteContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends FormulaContext {
		public FormulaContext fleft;
		public Token op;
		public FormulaContext fright;
		public FormulaContext formula;
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public OrContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InContext extends FormulaContext {
		public ExpressionContext left;
		public Token not;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OneContext extends FormulaContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OneContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitOne(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends FormulaContext {
		public FalseContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IffContext extends FormulaContext {
		public FormulaContext fleft;
		public Token op;
		public FormulaContext fright;
		public FormulaContext formula;
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public IffContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIff(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqContext extends FormulaContext {
		public IntExpressionContext ileft;
		public Token not;
		public IntExpressionContext iright;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public EqContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtContext extends FormulaContext {
		public IntExpressionContext ileft;
		public Token not;
		public IntExpressionContext iright;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public GtContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitGt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends FormulaContext {
		public ExpressionContext left;
		public Token not;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLoneContext extends FormulaContext {
		public FormulaContext formula;
		public QuantifierDeclarationsContext quantifierDeclarations() {
			return getRuleContext(QuantifierDeclarationsContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ForLoneContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterForLone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitForLone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitForLone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TotalOrderContext extends FormulaContext {
		public RelationIdContext rel;
		public RelationIdContext ordered;
		public RelationIdContext first;
		public RelationIdContext last;
		public List<RelationIdContext> relationId() {
			return getRuleContexts(RelationIdContext.class);
		}
		public RelationIdContext relationId(int i) {
			return getRuleContext(RelationIdContext.class,i);
		}
		public TotalOrderContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterTotalOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitTotalOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitTotalOrder(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends FormulaContext {
		public TrueContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForNoContext extends FormulaContext {
		public FormulaContext formula;
		public QuantifierDeclarationsContext quantifierDeclarations() {
			return getRuleContext(QuantifierDeclarationsContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ForNoContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterForNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitForNo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitForNo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpliesContext extends FormulaContext {
		public FormulaContext fleft;
		public Token op;
		public FormulaContext fright;
		public FormulaContext formula;
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ImpliesContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterImplies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitImplies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitImplies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		return formula(0);
	}

	private FormulaContext formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FormulaContext _localctx = new FormulaContext(_ctx, _parentState);
		FormulaContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_formula, _p);
		if(_localctx.getParent() instanceof FormulaContext) ((FormulaContext)_localctx).variables =  ((FormulaContext)getInvokingContext(54)).variables ; else ((FormulaContext)_localctx).variables =  _localctx.variables = new ArrayList<>();
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				_localctx = new NoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1193);
				match(T__87);
				setState(1194);
				expression(0);
				((NoContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 2:
				{
				_localctx = new LoneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1197);
				match(T__88);
				setState(1198);
				expression(0);
				((LoneContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 3:
				{
				_localctx = new OneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1201);
				match(T__89);
				setState(1202);
				expression(0);
				((OneContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 4:
				{
				_localctx = new SomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1205);
				match(T__90);
				setState(1206);
				expression(0);
				((SomeContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 5:
				{
				_localctx = new InContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1209);
				((InContext)_localctx).left = expression(0);
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__91 || _la==T__92) {
					{
					setState(1210);
					((InContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__91 || _la==T__92) ) {
						((InContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1213);
				match(T__93);
				setState(1214);
				((InContext)_localctx).right = expression(0);
				((InContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 6:
				{
				_localctx = new EqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1217);
				((EqualContext)_localctx).left = expression(0);
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__91 || _la==T__92) {
					{
					setState(1218);
					((EqualContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__91 || _la==T__92) ) {
						((EqualContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1221);
				match(T__22);
				setState(1222);
				((EqualContext)_localctx).right = expression(0);
				((EqualContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 7:
				{
				_localctx = new EqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1225);
				((EqContext)_localctx).ileft = intExpression(0);
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__91 || _la==T__92) {
					{
					setState(1226);
					((EqContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__91 || _la==T__92) ) {
						((EqContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1229);
				match(T__22);
				setState(1230);
				((EqContext)_localctx).iright = intExpression(0);
				((EqContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 8:
				{
				_localctx = new LtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1233);
				((LtContext)_localctx).ileft = intExpression(0);
				setState(1235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__91 || _la==T__92) {
					{
					setState(1234);
					((LtContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__91 || _la==T__92) ) {
						((LtContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1237);
				match(T__64);
				setState(1238);
				((LtContext)_localctx).iright = intExpression(0);
				((LtContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 9:
				{
				_localctx = new LteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1241);
				((LteContext)_localctx).ileft = intExpression(0);
				setState(1243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__91 || _la==T__92) {
					{
					setState(1242);
					((LteContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__91 || _la==T__92) ) {
						((LteContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1245);
				match(T__94);
				setState(1246);
				((LteContext)_localctx).iright = intExpression(0);
				((LteContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 10:
				{
				_localctx = new GtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1249);
				((GtContext)_localctx).ileft = intExpression(0);
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__91 || _la==T__92) {
					{
					setState(1250);
					((GtContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__91 || _la==T__92) ) {
						((GtContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1253);
				match(T__65);
				setState(1254);
				((GtContext)_localctx).iright = intExpression(0);
				((GtContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 11:
				{
				_localctx = new GteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1257);
				((GteContext)_localctx).ileft = intExpression(0);
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__91 || _la==T__92) {
					{
					setState(1258);
					((GteContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__91 || _la==T__92) ) {
						((GteContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1261);
				match(T__95);
				setState(1262);
				((GteContext)_localctx).iright = intExpression(0);
				((GteContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 12:
				{
				_localctx = new SumDeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(1265);
				match(T__96);
				setState(1266);
				quantifierDeclarations();
				setState(1267);
				match(T__97);
				setState(1268);
				intExpression(0);
				}
				((SumDeclarationContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 13:
				{
				_localctx = new AcyclicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1272);
				match(T__98);
				setState(1273);
				match(T__12);
				setState(1274);
				relationId();
				setState(1275);
				match(T__13);
				((AcyclicContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 14:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1278);
				match(T__99);
				setState(1279);
				match(T__12);
				setState(1280);
				((FunctionContext)_localctx).rel = relationId();
				setState(1281);
				match(T__5);
				setState(1282);
				((FunctionContext)_localctx).domain = expression(0);
				setState(1283);
				match(T__100);
				setState(1288);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__9:
				case T__11:
				case T__20:
				case T__21:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__37:
				case T__39:
				case T__41:
				case T__43:
				case T__44:
				case T__46:
				case T__47:
				case T__48:
				case T__50:
				case T__52:
				case T__56:
				case T__57:
				case T__58:
				case T__60:
				case T__61:
				case T__62:
				case T__63:
				case T__75:
				case T__76:
				case T__77:
				case T__78:
				case T__80:
				case T__82:
				case T__83:
				case T__89:
				case T__112:
				case T__113:
				case T__115:
				case T__118:
				case T__119:
				case T__120:
				case T__121:
				case T__131:
				case T__132:
				case T__133:
				case IDENTIFIER:
					{
					setState(1285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__89) {
						{
						setState(1284);
						match(T__89);
						}
					}

					}
					break;
				case T__88:
					{
					setState(1287);
					((FunctionContext)_localctx).partial = match(T__88);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1290);
				((FunctionContext)_localctx).range = expression(0);
				setState(1291);
				match(T__13);
				((FunctionContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 15:
				{
				_localctx = new TotalOrderContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1294);
				match(T__101);
				setState(1295);
				match(T__12);
				setState(1296);
				((TotalOrderContext)_localctx).rel = relationId();
				setState(1297);
				match(T__2);
				setState(1298);
				((TotalOrderContext)_localctx).ordered = relationId();
				setState(1299);
				match(T__2);
				setState(1300);
				((TotalOrderContext)_localctx).first = relationId();
				setState(1301);
				match(T__2);
				setState(1302);
				((TotalOrderContext)_localctx).last = relationId();
				setState(1303);
				match(T__13);
				((TotalOrderContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 16:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1306);
				((NotContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__91 || _la==T__92) ) {
					((NotContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1307);
				((NotContext)_localctx).formula = formula(14);
				((NotContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 17:
				{
				_localctx = new ForAllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(1310);
				match(T__110);
				setState(1311);
				quantifierDeclarations();
				setState(1332);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__97:
					{
					setState(1312);
					match(T__97);
					setState(1322);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						setState(1313);
						((ForAllContext)_localctx).formula = formula(0);
						}
						break;
					case 2:
						{
						setState(1314);
						match(T__1);
						setState(1318);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__14 - 2)) | (1L << (T__15 - 2)) | (1L << (T__17 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__42 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__87 - 76)) | (1L << (T__88 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)) | (1L << (T__91 - 76)) | (1L << (T__92 - 76)) | (1L << (T__96 - 76)) | (1L << (T__98 - 76)) | (1L << (T__99 - 76)) | (1L << (T__101 - 76)) | (1L << (T__110 - 76)) | (1L << (T__111 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (INT - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
							{
							{
							setState(1315);
							((ForAllContext)_localctx).formula = formula(0);
							}
							}
							setState(1320);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1321);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1324);
					match(T__1);
					setState(1328);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__14 - 2)) | (1L << (T__15 - 2)) | (1L << (T__17 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__42 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__87 - 76)) | (1L << (T__88 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)) | (1L << (T__91 - 76)) | (1L << (T__92 - 76)) | (1L << (T__96 - 76)) | (1L << (T__98 - 76)) | (1L << (T__99 - 76)) | (1L << (T__101 - 76)) | (1L << (T__110 - 76)) | (1L << (T__111 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (INT - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
						{
						{
						setState(1325);
						((ForAllContext)_localctx).formula = formula(0);
						}
						}
						setState(1330);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1331);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				((ForAllContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 18:
				{
				_localctx = new ForSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(1336);
				match(T__90);
				setState(1337);
				quantifierDeclarations();
				setState(1358);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__97:
					{
					setState(1338);
					match(T__97);
					setState(1348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
					case 1:
						{
						setState(1339);
						((ForSomeContext)_localctx).formula = formula(0);
						}
						break;
					case 2:
						{
						setState(1340);
						match(T__1);
						setState(1344);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__14 - 2)) | (1L << (T__15 - 2)) | (1L << (T__17 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__42 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__87 - 76)) | (1L << (T__88 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)) | (1L << (T__91 - 76)) | (1L << (T__92 - 76)) | (1L << (T__96 - 76)) | (1L << (T__98 - 76)) | (1L << (T__99 - 76)) | (1L << (T__101 - 76)) | (1L << (T__110 - 76)) | (1L << (T__111 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (INT - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
							{
							{
							setState(1341);
							((ForSomeContext)_localctx).formula = formula(0);
							}
							}
							setState(1346);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1347);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1350);
					match(T__1);
					setState(1354);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__14 - 2)) | (1L << (T__15 - 2)) | (1L << (T__17 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__42 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__87 - 76)) | (1L << (T__88 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)) | (1L << (T__91 - 76)) | (1L << (T__92 - 76)) | (1L << (T__96 - 76)) | (1L << (T__98 - 76)) | (1L << (T__99 - 76)) | (1L << (T__101 - 76)) | (1L << (T__110 - 76)) | (1L << (T__111 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (INT - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
						{
						{
						setState(1351);
						((ForSomeContext)_localctx).formula = formula(0);
						}
						}
						setState(1356);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1357);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				((ForSomeContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 19:
				{
				_localctx = new ForNoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(1362);
				match(T__87);
				setState(1363);
				quantifierDeclarations();
				setState(1384);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__97:
					{
					setState(1364);
					match(T__97);
					setState(1374);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
					case 1:
						{
						setState(1365);
						((ForNoContext)_localctx).formula = formula(0);
						}
						break;
					case 2:
						{
						setState(1366);
						match(T__1);
						setState(1370);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__14 - 2)) | (1L << (T__15 - 2)) | (1L << (T__17 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__42 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__87 - 76)) | (1L << (T__88 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)) | (1L << (T__91 - 76)) | (1L << (T__92 - 76)) | (1L << (T__96 - 76)) | (1L << (T__98 - 76)) | (1L << (T__99 - 76)) | (1L << (T__101 - 76)) | (1L << (T__110 - 76)) | (1L << (T__111 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (INT - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
							{
							{
							setState(1367);
							((ForNoContext)_localctx).formula = formula(0);
							}
							}
							setState(1372);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1373);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1376);
					match(T__1);
					setState(1380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__14 - 2)) | (1L << (T__15 - 2)) | (1L << (T__17 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__42 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__87 - 76)) | (1L << (T__88 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)) | (1L << (T__91 - 76)) | (1L << (T__92 - 76)) | (1L << (T__96 - 76)) | (1L << (T__98 - 76)) | (1L << (T__99 - 76)) | (1L << (T__101 - 76)) | (1L << (T__110 - 76)) | (1L << (T__111 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (INT - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
						{
						{
						setState(1377);
						((ForNoContext)_localctx).formula = formula(0);
						}
						}
						setState(1382);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1383);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				((ForNoContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 20:
				{
				_localctx = new ForOneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(1388);
				match(T__89);
				setState(1389);
				quantifierDeclarations();
				setState(1410);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__97:
					{
					setState(1390);
					match(T__97);
					setState(1400);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
					case 1:
						{
						setState(1391);
						((ForOneContext)_localctx).formula = formula(0);
						}
						break;
					case 2:
						{
						setState(1392);
						match(T__1);
						setState(1396);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__14 - 2)) | (1L << (T__15 - 2)) | (1L << (T__17 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__42 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__87 - 76)) | (1L << (T__88 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)) | (1L << (T__91 - 76)) | (1L << (T__92 - 76)) | (1L << (T__96 - 76)) | (1L << (T__98 - 76)) | (1L << (T__99 - 76)) | (1L << (T__101 - 76)) | (1L << (T__110 - 76)) | (1L << (T__111 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (INT - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
							{
							{
							setState(1393);
							((ForOneContext)_localctx).formula = formula(0);
							}
							}
							setState(1398);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1399);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1402);
					match(T__1);
					setState(1406);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__14 - 2)) | (1L << (T__15 - 2)) | (1L << (T__17 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__42 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__87 - 76)) | (1L << (T__88 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)) | (1L << (T__91 - 76)) | (1L << (T__92 - 76)) | (1L << (T__96 - 76)) | (1L << (T__98 - 76)) | (1L << (T__99 - 76)) | (1L << (T__101 - 76)) | (1L << (T__110 - 76)) | (1L << (T__111 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (INT - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
						{
						{
						setState(1403);
						((ForOneContext)_localctx).formula = formula(0);
						}
						}
						setState(1408);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1409);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				((ForOneContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 21:
				{
				_localctx = new ForLoneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(1414);
				match(T__88);
				setState(1415);
				quantifierDeclarations();
				setState(1436);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__97:
					{
					setState(1416);
					match(T__97);
					setState(1426);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
					case 1:
						{
						setState(1417);
						((ForLoneContext)_localctx).formula = formula(0);
						}
						break;
					case 2:
						{
						setState(1418);
						match(T__1);
						setState(1422);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__14 - 2)) | (1L << (T__15 - 2)) | (1L << (T__17 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__42 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__87 - 76)) | (1L << (T__88 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)) | (1L << (T__91 - 76)) | (1L << (T__92 - 76)) | (1L << (T__96 - 76)) | (1L << (T__98 - 76)) | (1L << (T__99 - 76)) | (1L << (T__101 - 76)) | (1L << (T__110 - 76)) | (1L << (T__111 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (INT - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
							{
							{
							setState(1419);
							((ForLoneContext)_localctx).formula = formula(0);
							}
							}
							setState(1424);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1425);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1428);
					match(T__1);
					setState(1432);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__14 - 2)) | (1L << (T__15 - 2)) | (1L << (T__17 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__42 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__87 - 76)) | (1L << (T__88 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)) | (1L << (T__91 - 76)) | (1L << (T__92 - 76)) | (1L << (T__96 - 76)) | (1L << (T__98 - 76)) | (1L << (T__99 - 76)) | (1L << (T__101 - 76)) | (1L << (T__110 - 76)) | (1L << (T__111 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (INT - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
						{
						{
						setState(1429);
						((ForLoneContext)_localctx).formula = formula(0);
						}
						}
						setState(1434);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1435);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				((ForLoneContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 22:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(1440);
				match(T__111);
				setState(1441);
				letDeclarations();
				setState(1462);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__97:
					{
					setState(1442);
					match(T__97);
					setState(1452);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
					case 1:
						{
						setState(1443);
						((LetContext)_localctx).formula = formula(0);
						}
						break;
					case 2:
						{
						setState(1444);
						match(T__1);
						setState(1448);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__14 - 2)) | (1L << (T__15 - 2)) | (1L << (T__17 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__42 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__87 - 76)) | (1L << (T__88 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)) | (1L << (T__91 - 76)) | (1L << (T__92 - 76)) | (1L << (T__96 - 76)) | (1L << (T__98 - 76)) | (1L << (T__99 - 76)) | (1L << (T__101 - 76)) | (1L << (T__110 - 76)) | (1L << (T__111 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (INT - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
							{
							{
							setState(1445);
							((LetContext)_localctx).formula = formula(0);
							}
							}
							setState(1450);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1451);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1454);
					match(T__1);
					setState(1458);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__9 - 2)) | (1L << (T__11 - 2)) | (1L << (T__14 - 2)) | (1L << (T__15 - 2)) | (1L << (T__17 - 2)) | (1L << (T__20 - 2)) | (1L << (T__21 - 2)) | (1L << (T__23 - 2)) | (1L << (T__24 - 2)) | (1L << (T__25 - 2)) | (1L << (T__26 - 2)) | (1L << (T__27 - 2)) | (1L << (T__29 - 2)) | (1L << (T__30 - 2)) | (1L << (T__31 - 2)) | (1L << (T__32 - 2)) | (1L << (T__33 - 2)) | (1L << (T__34 - 2)) | (1L << (T__35 - 2)) | (1L << (T__37 - 2)) | (1L << (T__39 - 2)) | (1L << (T__41 - 2)) | (1L << (T__42 - 2)) | (1L << (T__43 - 2)) | (1L << (T__44 - 2)) | (1L << (T__46 - 2)) | (1L << (T__47 - 2)) | (1L << (T__48 - 2)) | (1L << (T__50 - 2)) | (1L << (T__52 - 2)) | (1L << (T__56 - 2)) | (1L << (T__57 - 2)) | (1L << (T__58 - 2)) | (1L << (T__60 - 2)) | (1L << (T__61 - 2)) | (1L << (T__62 - 2)) | (1L << (T__63 - 2)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__80 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__87 - 76)) | (1L << (T__88 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)) | (1L << (T__91 - 76)) | (1L << (T__92 - 76)) | (1L << (T__96 - 76)) | (1L << (T__98 - 76)) | (1L << (T__99 - 76)) | (1L << (T__101 - 76)) | (1L << (T__110 - 76)) | (1L << (T__111 - 76)) | (1L << (T__112 - 76)) | (1L << (T__113 - 76)) | (1L << (T__115 - 76)) | (1L << (T__118 - 76)) | (1L << (T__119 - 76)) | (1L << (T__120 - 76)) | (1L << (T__121 - 76)) | (1L << (T__131 - 76)) | (1L << (T__132 - 76)) | (1L << (T__133 - 76)) | (1L << (INT - 76)) | (1L << (IDENTIFIER - 76)))) != 0)) {
						{
						{
						setState(1455);
						((LetContext)_localctx).formula = formula(0);
						}
						}
						setState(1460);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1461);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				((LetContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 23:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1466);
				match(T__14);
				((TrueContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 24:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1468);
				match(T__15);
				((FalseContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 25:
				{
				_localctx = new F_paranthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1470);
				match(T__48);
				setState(1471);
				((F_paranthesisContext)_localctx).formula = formula(0);
				setState(1472);
				match(T__49);
				((F_paranthesisContext)_localctx).element =  ((F_paranthesisContext)_localctx).formula.element;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1497);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new FormulaContext(_parentctx, _parentState));
						((AndContext)_localctx).fleft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(1477);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1478);
						((AndContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__102 || _la==T__103) ) {
							((AndContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1479);
						((AndContext)_localctx).fright = ((AndContext)_localctx).formula = formula(14);
						((AndContext)_localctx).element =  Formula.create(_localctx);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new FormulaContext(_parentctx, _parentState));
						((OrContext)_localctx).fleft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(1482);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1483);
						((OrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__104 || _la==T__105) ) {
							((OrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1484);
						((OrContext)_localctx).fright = ((OrContext)_localctx).formula = formula(13);
						((OrContext)_localctx).element =  Formula.create(_localctx);
						}
						break;
					case 3:
						{
						_localctx = new ImpliesContext(new FormulaContext(_parentctx, _parentState));
						((ImpliesContext)_localctx).fleft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(1487);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1488);
						((ImpliesContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__106 || _la==T__107) ) {
							((ImpliesContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1489);
						((ImpliesContext)_localctx).fright = ((ImpliesContext)_localctx).formula = formula(11);
						((ImpliesContext)_localctx).element =  Formula.create(_localctx);
						}
						break;
					case 4:
						{
						_localctx = new IffContext(new FormulaContext(_parentctx, _parentState));
						((IffContext)_localctx).fleft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(1492);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1493);
						((IffContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__108 || _la==T__109) ) {
							((IffContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1494);
						((IffContext)_localctx).fright = ((IffContext)_localctx).formula = formula(10);
						((IffContext)_localctx).element =  Formula.create(_localctx);
						}
						break;
					}
					} 
				}
				setState(1501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression element;
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this.element = ctx.element;
		}
	}
	public static class ProductContext extends ExpressionContext {
		public ExpressionContext left;
		public MultContext leftMult;
		public MultContext rightMult;
		public ExpressionContext right;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<MultContext> mult() {
			return getRuleContexts(MultContext.class);
		}
		public MultContext mult(int i) {
			return getRuleContext(MultContext.class,i);
		}
		public ProductContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitProduct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoneContext extends ExpressionContext {
		public NoneContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitNone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public UnionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComprehensionContext extends ExpressionContext {
		public ComprehensionDeclarationsContext comprehensionDeclarations() {
			return getRuleContext(ComprehensionDeclarationsContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ComprehensionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitComprehension(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnivContext extends ExpressionContext {
		public UnivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterUniv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitUniv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitUniv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReflexiveContext extends ExpressionContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReflexiveContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterReflexive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitReflexive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitReflexive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_paranthesisContext extends ExpressionContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public E_paranthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterE_paranthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitE_paranthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitE_paranthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdenContext extends ExpressionContext {
		public IdenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIden(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIden(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntsContext extends ExpressionContext {
		public IntsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitInts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitInts(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntersectionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IntersectionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIntersection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIntersection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIntersection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DifferenceContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DifferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterDifference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitDifference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitDifference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransposeContext extends ExpressionContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TransposeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterTranspose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitTranspose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitTranspose(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public JoinContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverrideContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OverrideContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterOverride(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitOverride(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitOverride(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExpressionContext extends ExpressionContext {
		public FormulaContext condition;
		public ExpressionContext thenExpr;
		public ExpressionContext expression;
		public ExpressionContext elseExpr;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IfExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClosureContext extends ExpressionContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClosureContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterClosure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitClosure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitClosure(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeRefContext extends ExpressionContext {
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public TypeRefContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoxJoinContext extends ExpressionContext {
		public ExpressionContext right;
		public ExpressionContext left;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoxJoinContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterBoxJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitBoxJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitBoxJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__112:
				{
				_localctx = new TransposeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1503);
				match(T__112);
				setState(1504);
				((TransposeContext)_localctx).expression = expression(18);
				((TransposeContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__113:
				{
				_localctx = new ClosureContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1507);
				match(T__113);
				setState(1508);
				((ClosureContext)_localctx).expression = expression(17);
				((ClosureContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__52:
				{
				_localctx = new ReflexiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1511);
				match(T__52);
				setState(1512);
				((ReflexiveContext)_localctx).expression = expression(16);
				((ReflexiveContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__1:
				{
				_localctx = new ComprehensionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1515);
				match(T__1);
				setState(1516);
				comprehensionDeclarations();
				setState(1517);
				match(T__97);
				setState(1518);
				formula(0);
				setState(1519);
				match(T__3);
				((ComprehensionContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__115:
				{
				_localctx = new IfExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1522);
				match(T__115);
				setState(1523);
				((IfExpressionContext)_localctx).condition = formula(0);
				setState(1524);
				match(T__116);
				setState(1525);
				((IfExpressionContext)_localctx).thenExpr = ((IfExpressionContext)_localctx).expression = expression(0);
				setState(1526);
				match(T__117);
				setState(1527);
				((IfExpressionContext)_localctx).elseExpr = ((IfExpressionContext)_localctx).expression = expression(7);
				((IfExpressionContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__118:
				{
				_localctx = new IdenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1530);
				match(T__118);
				((IdenContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__119:
				{
				_localctx = new NoneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1532);
				match(T__119);
				((NoneContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__120:
				{
				_localctx = new UnivContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1534);
				match(T__120);
				((UnivContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__121:
				{
				_localctx = new IntsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1536);
				match(T__121);
				((IntsContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__48:
				{
				_localctx = new E_paranthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1538);
				match(T__48);
				setState(1539);
				((E_paranthesisContext)_localctx).expression = expression(0);
				setState(1540);
				match(T__49);
				((E_paranthesisContext)_localctx).element =  ((E_paranthesisContext)_localctx).expression.element;
				}
				break;
			case T__9:
			case T__11:
			case T__20:
			case T__21:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__37:
			case T__39:
			case T__41:
			case T__43:
			case T__44:
			case T__46:
			case T__47:
			case T__50:
			case T__56:
			case T__57:
			case T__58:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__80:
			case T__82:
			case T__83:
			case T__131:
			case T__132:
			case T__133:
			case IDENTIFIER:
				{
				_localctx = new TypeRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1543);
				pathName(_localctx.element);
				((TypeRefContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1592);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1590);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
					case 1:
						{
						_localctx = new UnionContext(new ExpressionContext(_parentctx, _parentState));
						((UnionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1548);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1549);
						match(T__16);
						setState(1550);
						((UnionContext)_localctx).right = ((UnionContext)_localctx).expression = expression(16);
						((UnionContext)_localctx).element =  Expression.create(_localctx);
						}
						break;
					case 2:
						{
						_localctx = new IntersectionContext(new ExpressionContext(_parentctx, _parentState));
						((IntersectionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1553);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1554);
						match(T__66);
						setState(1555);
						((IntersectionContext)_localctx).right = ((IntersectionContext)_localctx).expression = expression(15);
						((IntersectionContext)_localctx).element =  Expression.create(_localctx);
						}
						break;
					case 3:
						{
						_localctx = new DifferenceContext(new ExpressionContext(_parentctx, _parentState));
						((DifferenceContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1558);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1559);
						match(T__17);
						setState(1560);
						((DifferenceContext)_localctx).right = ((DifferenceContext)_localctx).expression = expression(14);
						((DifferenceContext)_localctx).element =  Expression.create(_localctx);
						}
						break;
					case 4:
						{
						_localctx = new JoinContext(new ExpressionContext(_parentctx, _parentState));
						((JoinContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1563);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1564);
						match(T__18);
						setState(1565);
						((JoinContext)_localctx).right = ((JoinContext)_localctx).expression = expression(13);
						((JoinContext)_localctx).element =  Expression.create(_localctx);
						}
						break;
					case 5:
						{
						_localctx = new ProductContext(new ExpressionContext(_parentctx, _parentState));
						((ProductContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1568);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1570);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (T__88 - 89)) | (1L << (T__89 - 89)) | (1L << (T__90 - 89)) | (1L << (T__130 - 89)))) != 0)) {
							{
							setState(1569);
							((ProductContext)_localctx).leftMult = mult();
							}
						}

						setState(1572);
						match(T__100);
						setState(1574);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (T__88 - 89)) | (1L << (T__89 - 89)) | (1L << (T__90 - 89)) | (1L << (T__130 - 89)))) != 0)) {
							{
							setState(1573);
							((ProductContext)_localctx).rightMult = mult();
							}
						}

						setState(1576);
						((ProductContext)_localctx).right = ((ProductContext)_localctx).expression = expression(10);
						((ProductContext)_localctx).element =  Expression.create(_localctx);
						}
						break;
					case 6:
						{
						_localctx = new OverrideContext(new ExpressionContext(_parentctx, _parentState));
						((OverrideContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1579);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1580);
						match(T__114);
						setState(1581);
						((OverrideContext)_localctx).right = ((OverrideContext)_localctx).expression = expression(10);
						((OverrideContext)_localctx).element =  Expression.create(_localctx);
						}
						break;
					case 7:
						{
						_localctx = new BoxJoinContext(new ExpressionContext(_parentctx, _parentState));
						((BoxJoinContext)_localctx).right = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1584);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1585);
						match(T__12);
						setState(1586);
						((BoxJoinContext)_localctx).left = ((BoxJoinContext)_localctx).expression = expression(0);
						setState(1587);
						match(T__13);
						((BoxJoinContext)_localctx).element =  Expression.create(_localctx);
						}
						break;
					}
					} 
				}
				setState(1594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IntExpressionContext extends ParserRuleContext {
		public IntExpression element;
		public IntExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpression; }
	 
		public IntExpressionContext() { }
		public void copyFrom(IntExpressionContext ctx) {
			super.copyFrom(ctx);
			this.element = ctx.element;
		}
	}
	public static class MinusContext extends IntExpressionContext {
		public IntExpressionContext ileft;
		public IntExpressionContext iright;
		public IntExpressionContext intExpression;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public MinusContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntConstantContext extends IntExpressionContext {
		public Token sign;
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public IntConstantContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIntConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIntConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIntConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class I_paranthesisContext extends IntExpressionContext {
		public IntExpressionContext intExpression;
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public I_paranthesisContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterI_paranthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitI_paranthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitI_paranthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfIntExpressionContext extends IntExpressionContext {
		public FormulaContext condition;
		public IntExpressionContext thenExpr;
		public IntExpressionContext intExpression;
		public IntExpressionContext elseExpr;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public IfIntExpressionContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIfIntExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIfIntExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIfIntExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CountContext extends IntExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CountContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitCount(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumContext extends IntExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SumContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideContext extends IntExpressionContext {
		public IntExpressionContext ileft;
		public IntExpressionContext iright;
		public IntExpressionContext intExpression;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public DivideContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyContext extends IntExpressionContext {
		public IntExpressionContext ileft;
		public IntExpressionContext iright;
		public IntExpressionContext intExpression;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public MultiplyContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloContext extends IntExpressionContext {
		public IntExpressionContext ileft;
		public IntExpressionContext iright;
		public IntExpressionContext intExpression;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public ModuloContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitModulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends IntExpressionContext {
		public IntExpressionContext ileft;
		public IntExpressionContext iright;
		public IntExpressionContext intExpression;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public PlusContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntExpressionContext intExpression() throws RecognitionException {
		return intExpression(0);
	}

	private IntExpressionContext intExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntExpressionContext _localctx = new IntExpressionContext(_ctx, _parentState);
		IntExpressionContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_intExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__115:
				{
				_localctx = new IfIntExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1596);
				match(T__115);
				setState(1597);
				((IfIntExpressionContext)_localctx).condition = formula(0);
				setState(1598);
				match(T__116);
				setState(1599);
				((IfIntExpressionContext)_localctx).thenExpr = ((IfIntExpressionContext)_localctx).intExpression = intExpression(0);
				setState(1600);
				match(T__117);
				setState(1601);
				((IfIntExpressionContext)_localctx).elseExpr = ((IfIntExpressionContext)_localctx).intExpression = intExpression(10);
				((IfIntExpressionContext)_localctx).element =  IntExpression.create(_localctx);
				}
				break;
			case T__96:
				{
				_localctx = new SumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1604);
				match(T__96);
				setState(1605);
				expression(0);
				((SumContext)_localctx).element =  IntExpression.create(_localctx);
				}
				break;
			case T__42:
				{
				_localctx = new CountContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1608);
				match(T__42);
				setState(1609);
				expression(0);
				((CountContext)_localctx).element =  IntExpression.create(_localctx);
				}
				break;
			case T__17:
			case INT:
				{
				_localctx = new IntConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(1612);
					((IntConstantContext)_localctx).sign = match(T__17);
					}
				}

				setState(1615);
				match(INT);
				((IntConstantContext)_localctx).element =  IntExpression.create(_localctx);
				}
				break;
			case T__48:
				{
				_localctx = new I_paranthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1617);
				match(T__48);
				setState(1618);
				((I_paranthesisContext)_localctx).intExpression = intExpression(0);
				setState(1619);
				match(T__49);
				((I_paranthesisContext)_localctx).element =  ((I_paranthesisContext)_localctx).intExpression.element;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1649);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new IntExpressionContext(_parentctx, _parentState));
						((PlusContext)_localctx).ileft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpression);
						setState(1624);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1625);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__122) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1626);
						((PlusContext)_localctx).iright = ((PlusContext)_localctx).intExpression = intExpression(8);
						((PlusContext)_localctx).element =  IntExpression.create(_localctx);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new IntExpressionContext(_parentctx, _parentState));
						((MinusContext)_localctx).ileft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpression);
						setState(1629);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1630);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__123) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1631);
						((MinusContext)_localctx).iright = ((MinusContext)_localctx).intExpression = intExpression(7);
						((MinusContext)_localctx).element =  IntExpression.create(_localctx);
						}
						break;
					case 3:
						{
						_localctx = new MultiplyContext(new IntExpressionContext(_parentctx, _parentState));
						((MultiplyContext)_localctx).ileft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpression);
						setState(1634);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1635);
						_la = _input.LA(1);
						if ( !(_la==T__52 || _la==T__124) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1636);
						((MultiplyContext)_localctx).iright = ((MultiplyContext)_localctx).intExpression = intExpression(6);
						((MultiplyContext)_localctx).element =  IntExpression.create(_localctx);
						}
						break;
					case 4:
						{
						_localctx = new DivideContext(new IntExpressionContext(_parentctx, _parentState));
						((DivideContext)_localctx).ileft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpression);
						setState(1639);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1640);
						_la = _input.LA(1);
						if ( !(_la==T__125 || _la==T__126) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1641);
						((DivideContext)_localctx).iright = ((DivideContext)_localctx).intExpression = intExpression(5);
						((DivideContext)_localctx).element =  IntExpression.create(_localctx);
						}
						break;
					case 5:
						{
						_localctx = new ModuloContext(new IntExpressionContext(_parentctx, _parentState));
						((ModuloContext)_localctx).ileft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpression);
						setState(1644);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1645);
						_la = _input.LA(1);
						if ( !(_la==T__127 || _la==T__128) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1646);
						((ModuloContext)_localctx).iright = ((ModuloContext)_localctx).intExpression = intExpression(4);
						((ModuloContext)_localctx).element =  IntExpression.create(_localctx);
						}
						break;
					}
					} 
				}
				setState(1653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QuantifierDeclarationsContext extends ParserRuleContext {
		public List<QuantifierDeclaration> elements;
		public List<QuantifierDeclarationContext> quantifierDeclaration() {
			return getRuleContexts(QuantifierDeclarationContext.class);
		}
		public QuantifierDeclarationContext quantifierDeclaration(int i) {
			return getRuleContext(QuantifierDeclarationContext.class,i);
		}
		public QuantifierDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifierDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterQuantifierDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitQuantifierDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitQuantifierDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierDeclarationsContext quantifierDeclarations() throws RecognitionException {
		QuantifierDeclarationsContext _localctx = new QuantifierDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_quantifierDeclarations);
		((QuantifierDeclarationsContext)_localctx).elements =  new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			quantifierDeclaration();
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1655);
				match(T__2);
				setState(1656);
				quantifierDeclaration();
				}
				}
				setState(1661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			_ctx.stop = _input.LT(-1);
			for(QuantifierDeclarationContext ctx: _localctx.quantifierDeclaration()) _localctx.elements.add(ctx.element);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifierDeclarationContext extends ParserRuleContext {
		public QuantifierDeclaration element;
		public QuantifierDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifierDeclaration; }
	 
		public QuantifierDeclarationContext() { }
		public void copyFrom(QuantifierDeclarationContext ctx) {
			super.copyFrom(ctx);
			this.element = ctx.element;
		}
	}
	public static class OneOfContext extends QuantifierDeclarationContext {
		public Token disj;
		public VariableContext variable;
		public List<VariableContext> vars = new ArrayList<VariableContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public OneOfContext(QuantifierDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterOneOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitOneOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitOneOf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomeOfContext extends QuantifierDeclarationContext {
		public Token disj;
		public VariableContext variable;
		public List<VariableContext> vars = new ArrayList<VariableContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public SomeOfContext(QuantifierDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSomeOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSomeOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSomeOf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoneOfContext extends QuantifierDeclarationContext {
		public Token disj;
		public VariableContext variable;
		public List<VariableContext> vars = new ArrayList<VariableContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public LoneOfContext(QuantifierDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLoneOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLoneOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLoneOf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOfContext extends QuantifierDeclarationContext {
		public Token disj;
		public VariableContext variable;
		public List<VariableContext> vars = new ArrayList<VariableContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public SetOfContext(QuantifierDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSetOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSetOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSetOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierDeclarationContext quantifierDeclaration() throws RecognitionException {
		QuantifierDeclarationContext _localctx = new QuantifierDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_quantifierDeclaration);
		int _la;
		try {
			setState(1728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				_localctx = new OneOfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__129) {
					{
					setState(1662);
					((OneOfContext)_localctx).disj = match(T__129);
					}
				}

				setState(1665);
				((OneOfContext)_localctx).variable = variable();
				((OneOfContext)_localctx).vars.add(((OneOfContext)_localctx).variable);
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1666);
					match(T__2);
					setState(1667);
					((OneOfContext)_localctx).variable = variable();
					((OneOfContext)_localctx).vars.add(((OneOfContext)_localctx).variable);
					}
					}
					setState(1672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1673);
				match(T__5);
				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__89) {
					{
					setState(1674);
					match(T__89);
					}
				}

				setState(1677);
				expression(0);
				((OneOfContext)_localctx).element =  QuantifierDeclaration.create(_localctx);
				}
				break;
			case 2:
				_localctx = new LoneOfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__129) {
					{
					setState(1680);
					((LoneOfContext)_localctx).disj = match(T__129);
					}
				}

				setState(1683);
				((LoneOfContext)_localctx).variable = variable();
				((LoneOfContext)_localctx).vars.add(((LoneOfContext)_localctx).variable);
				setState(1688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1684);
					match(T__2);
					setState(1685);
					((LoneOfContext)_localctx).variable = variable();
					((LoneOfContext)_localctx).vars.add(((LoneOfContext)_localctx).variable);
					}
					}
					setState(1690);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1691);
				match(T__5);
				setState(1692);
				match(T__88);
				setState(1693);
				expression(0);
				((LoneOfContext)_localctx).element =  QuantifierDeclaration.create(_localctx);
				}
				break;
			case 3:
				_localctx = new SomeOfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__129) {
					{
					setState(1696);
					((SomeOfContext)_localctx).disj = match(T__129);
					}
				}

				setState(1699);
				((SomeOfContext)_localctx).variable = variable();
				((SomeOfContext)_localctx).vars.add(((SomeOfContext)_localctx).variable);
				setState(1704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1700);
					match(T__2);
					setState(1701);
					((SomeOfContext)_localctx).variable = variable();
					((SomeOfContext)_localctx).vars.add(((SomeOfContext)_localctx).variable);
					}
					}
					setState(1706);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1707);
				match(T__5);
				setState(1708);
				match(T__90);
				setState(1709);
				expression(0);
				((SomeOfContext)_localctx).element =  QuantifierDeclaration.create(_localctx);
				}
				break;
			case 4:
				_localctx = new SetOfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__129) {
					{
					setState(1712);
					((SetOfContext)_localctx).disj = match(T__129);
					}
				}

				setState(1715);
				((SetOfContext)_localctx).variable = variable();
				((SetOfContext)_localctx).vars.add(((SetOfContext)_localctx).variable);
				setState(1720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1716);
					match(T__2);
					setState(1717);
					((SetOfContext)_localctx).variable = variable();
					((SetOfContext)_localctx).vars.add(((SetOfContext)_localctx).variable);
					}
					}
					setState(1722);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1723);
				match(T__5);
				setState(1724);
				match(T__130);
				setState(1725);
				expression(0);
				((SetOfContext)_localctx).element =  QuantifierDeclaration.create(_localctx);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetDeclarationsContext extends ParserRuleContext {
		public List<LetDeclaration> elements;
		public List<LetDeclarationContext> letDeclaration() {
			return getRuleContexts(LetDeclarationContext.class);
		}
		public LetDeclarationContext letDeclaration(int i) {
			return getRuleContext(LetDeclarationContext.class,i);
		}
		public LetDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLetDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLetDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLetDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDeclarationsContext letDeclarations() throws RecognitionException {
		LetDeclarationsContext _localctx = new LetDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_letDeclarations);
		((LetDeclarationsContext)_localctx).elements =  new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			letDeclaration();
			setState(1735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1731);
				match(T__2);
				setState(1732);
				letDeclaration();
				}
				}
				setState(1737);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			_ctx.stop = _input.LT(-1);
			for(LetDeclarationContext ctx: _localctx.letDeclaration()) _localctx.elements.add(ctx.element);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetDeclarationContext extends ParserRuleContext {
		public LetDeclaration element;
		public VariableContext variable;
		public List<VariableContext> vars = new ArrayList<VariableContext>();
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public LetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLetDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLetDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDeclarationContext letDeclaration() throws RecognitionException {
		LetDeclarationContext _localctx = new LetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_letDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			((LetDeclarationContext)_localctx).variable = variable();
			((LetDeclarationContext)_localctx).vars.add(((LetDeclarationContext)_localctx).variable);
			setState(1743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1739);
				match(T__2);
				setState(1740);
				((LetDeclarationContext)_localctx).variable = variable();
				((LetDeclarationContext)_localctx).vars.add(((LetDeclarationContext)_localctx).variable);
				}
				}
				setState(1745);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1746);
			match(T__22);
			setState(1747);
			((LetDeclarationContext)_localctx).expression = expression(0);
			((LetDeclarationContext)_localctx).element =  new LetDeclaration(_localctx);  for(VariableContext ctx: _localctx.variable()) _localctx.element.addOwnedElements(ctx.element);  _localctx.element.addOwnedElements(((LetDeclarationContext)_localctx).expression.element);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComprehensionDeclarationsContext extends ParserRuleContext {
		public List<ComprehensionDeclaration> elements;
		public List<ComprehensionDeclarationContext> comprehensionDeclaration() {
			return getRuleContexts(ComprehensionDeclarationContext.class);
		}
		public ComprehensionDeclarationContext comprehensionDeclaration(int i) {
			return getRuleContext(ComprehensionDeclarationContext.class,i);
		}
		public ComprehensionDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comprehensionDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterComprehensionDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitComprehensionDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitComprehensionDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComprehensionDeclarationsContext comprehensionDeclarations() throws RecognitionException {
		ComprehensionDeclarationsContext _localctx = new ComprehensionDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_comprehensionDeclarations);
		((ComprehensionDeclarationsContext)_localctx).elements =  new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			comprehensionDeclaration();
			setState(1755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1751);
				match(T__2);
				setState(1752);
				comprehensionDeclaration();
				}
				}
				setState(1757);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			_ctx.stop = _input.LT(-1);
			for(ComprehensionDeclarationContext ctx: _localctx.comprehensionDeclaration()) _localctx.elements.add(ctx.element);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComprehensionDeclarationContext extends ParserRuleContext {
		public ComprehensionDeclaration element;
		public Token disj;
		public VariableContext variable;
		public List<VariableContext> vars = new ArrayList<VariableContext>();
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ComprehensionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comprehensionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterComprehensionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitComprehensionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitComprehensionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComprehensionDeclarationContext comprehensionDeclaration() throws RecognitionException {
		ComprehensionDeclarationContext _localctx = new ComprehensionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_comprehensionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__129) {
				{
				setState(1758);
				((ComprehensionDeclarationContext)_localctx).disj = match(T__129);
				}
			}

			{
			setState(1761);
			((ComprehensionDeclarationContext)_localctx).variable = variable();
			((ComprehensionDeclarationContext)_localctx).vars.add(((ComprehensionDeclarationContext)_localctx).variable);
			setState(1766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1762);
				match(T__2);
				setState(1763);
				((ComprehensionDeclarationContext)_localctx).variable = variable();
				((ComprehensionDeclarationContext)_localctx).vars.add(((ComprehensionDeclarationContext)_localctx).variable);
				}
				}
				setState(1768);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1769);
			match(T__5);
			setState(1771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__89) {
				{
				setState(1770);
				match(T__89);
				}
			}

			setState(1773);
			((ComprehensionDeclarationContext)_localctx).expression = expression(0);
			}
			((ComprehensionDeclarationContext)_localctx).element =  new ComprehensionDeclaration(_localctx); for(VariableContext ctx: _localctx.variable()) _localctx.element.addOwnedElements(ctx.element); _localctx.element.addOwnedElements(((ComprehensionDeclarationContext)_localctx).expression.element);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationIdContext extends ParserRuleContext {
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public RelationIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterRelationId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitRelationId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitRelationId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationIdContext relationId() throws RecognitionException {
		RelationIdContext _localctx = new RelationIdContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_relationId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			unrestrictedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Variable element;
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			unrestrictedName();
			((VariableContext)_localctx).element =  new Variable(_localctx);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (T__88 - 89)) | (1L << (T__89 - 89)) | (1L << (T__90 - 89)) | (1L << (T__130 - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnrestrictedNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnrestrictedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unrestrictedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterUnrestrictedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitUnrestrictedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitUnrestrictedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnrestrictedNameContext unrestrictedName() throws RecognitionException {
		UnrestrictedNameContext _localctx = new UnrestrictedNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unrestrictedName);
		try {
			setState(1827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1784);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1785);
				match(T__23);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1786);
				match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1787);
				match(T__75);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1788);
				match(T__76);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1789);
				match(T__24);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1790);
				match(T__43);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1791);
				match(T__57);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1792);
				match(T__131);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1793);
				match(T__83);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1794);
				match(T__33);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1795);
				match(T__60);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1796);
				match(T__132);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1797);
				match(T__26);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1798);
				match(T__34);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1799);
				match(T__20);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1800);
				match(T__82);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1801);
				match(T__25);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1802);
				match(T__46);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1803);
				match(T__11);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1804);
				match(T__47);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1805);
				match(T__35);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1806);
				match(T__21);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1807);
				match(T__80);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1808);
				match(T__78);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1809);
				match(T__56);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1810);
				match(T__41);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1811);
				match(T__31);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1812);
				match(T__63);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1813);
				match(T__133);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1814);
				match(T__44);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1815);
				match(T__27);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1816);
				match(T__50);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1817);
				match(T__29);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1818);
				match(T__37);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1819);
				match(T__39);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1820);
				match(T__30);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1821);
				match(T__77);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1822);
				match(T__61);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1823);
				match(T__58);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1824);
				match(T__62);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1825);
				match(T__11);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1826);
				match(T__9);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AlloyInEcoreParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpperContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public UpperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterUpper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitUpper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitUpper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpperContext upper() throws RecognitionException {
		UpperContext _localctx = new UpperContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_upper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			_la = _input.LA(1);
			if ( !(_la==T__52 || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LowerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public LowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowerContext lower() throws RecognitionException {
		LowerContext _localctx = new LowerContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_lower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return slot_sempred((SlotContext)_localctx, predIndex);
		case 54:
			return formula_sempred((FormulaContext)_localctx, predIndex);
		case 55:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 56:
			return intExpression_sempred((IntExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean slot_sempred(SlotContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return true;
		}
		return true;
	}
	private boolean formula_sempred(FormulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean intExpression_sempred(IntExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 6);
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0090\u072e\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\7\2\u0094\n\2\f\2\16\2\u0097\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00a7\n\3\3\4\3\4\3\4\3\4\5\4\u00ad"+
		"\n\4\3\4\7\4\u00b0\n\4\f\4\16\4\u00b3\13\4\3\4\3\4\3\4\5\4\u00b8\n\4\3"+
		"\5\3\5\3\5\3\5\5\5\u00be\n\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u00c6\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\u00cd\n\6\f\6\16\6\u00d0\13\6\3\6\3\6\3\6\5\6\u00d5"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00dd\n\7\f\7\16\7\u00e0\13\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\u00e8\n\7\f\7\16\7\u00eb\13\7\3\7\3\7\3\7\5\7\u00f0"+
		"\n\7\5\7\u00f2\n\7\3\b\3\b\5\b\u00f6\n\b\3\t\3\t\3\t\3\t\7\t\u00fc\n\t"+
		"\f\t\16\t\u00ff\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u010b\n\13\3\f\3\f\3\r\3\r\3\16\5\16\u0112\n\16\3\16\3\16\3\17\5\17\u0117"+
		"\n\17\3\17\5\17\u011a\n\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\5\22"+
		"\u0124\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u012b\n\22\3\22\3\22\7\22\u012f"+
		"\n\22\f\22\16\22\u0132\13\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\5\23\u013d\n\23\3\23\3\23\3\23\3\23\3\24\5\24\u0144\n\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u015f\n\24\f\24\16"+
		"\24\u0162\13\24\3\24\3\24\5\24\u0166\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0171\n\25\3\26\5\26\u0174\n\26\3\26\3\26\5\26\u0178"+
		"\n\26\3\26\3\26\5\26\u017c\n\26\3\26\3\26\5\26\u0180\n\26\3\26\3\26\3"+
		"\26\5\26\u0185\n\26\3\26\3\26\3\26\3\26\3\26\7\26\u018c\n\26\f\26\16\26"+
		"\u018f\13\26\5\26\u0191\n\26\3\26\3\26\3\26\5\26\u0196\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01a6"+
		"\n\26\f\26\16\26\u01a9\13\26\3\26\3\26\5\26\u01ad\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u01b5\n\27\3\30\5\30\u01b8\n\30\3\30\3\30\5\30\u01bc"+
		"\n\30\3\30\3\30\5\30\u01c0\n\30\3\30\5\30\u01c3\n\30\3\30\5\30\u01c6\n"+
		"\30\3\30\5\30\u01c9\n\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01d1\n\30"+
		"\3\30\3\30\3\30\5\30\u01d6\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u01e2\n\30\3\30\5\30\u01e5\n\30\6\30\u01e7\n\30\r\30\16"+
		"\30\u01e8\3\30\5\30\u01ec\n\30\3\30\3\30\3\30\3\30\7\30\u01f2\n\30\f\30"+
		"\16\30\u01f5\13\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01fd\n\30\3\30"+
		"\3\30\3\30\7\30\u0202\n\30\f\30\16\30\u0205\13\30\3\30\3\30\5\30\u0209"+
		"\n\30\3\30\3\30\3\31\5\31\u020e\n\31\3\31\3\31\5\31\u0212\n\31\3\31\3"+
		"\31\5\31\u0216\n\31\3\31\5\31\u0219\n\31\3\31\5\31\u021c\n\31\3\31\5\31"+
		"\u021f\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u0226\n\31\3\31\3\31\3\31\3"+
		"\31\5\31\u022c\n\31\3\31\3\31\3\31\5\31\u0231\n\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u023f\n\31\3\31\5\31\u0242"+
		"\n\31\6\31\u0244\n\31\r\31\16\31\u0245\3\31\5\31\u0249\n\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u0250\n\31\f\31\16\31\u0253\13\31\3\31\3\31\5\31"+
		"\u0257\n\31\3\31\3\31\3\31\7\31\u025c\n\31\f\31\16\31\u025f\13\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0267\n\31\3\31\3\31\3\31\7\31\u026c\n"+
		"\31\f\31\16\31\u026f\13\31\3\31\3\31\5\31\u0273\n\31\3\31\3\31\3\32\5"+
		"\32\u0278\n\32\3\32\3\32\5\32\u027c\n\32\3\32\3\32\5\32\u0280\n\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0289\n\32\f\32\16\32\u028c\13\32"+
		"\5\32\u028e\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0296\n\32\5\32\u0298"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u02a0\n\32\f\32\16\32\u02a3\13"+
		"\32\5\32\u02a5\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u02ad\n\32\3\32"+
		"\5\32\u02b0\n\32\6\32\u02b2\n\32\r\32\16\32\u02b3\3\32\5\32\u02b7\n\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u02c6\n\32\f\32\16\32\u02c9\13\32\3\32\3\32\5\32\u02cd\n\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u02dc\n\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u02e4\n\35\3\35\5\35\u02e7\n\35\6"+
		"\35\u02e9\n\35\r\35\16\35\u02ea\3\35\5\35\u02ee\n\35\3\35\3\35\7\35\u02f2"+
		"\n\35\f\35\16\35\u02f5\13\35\3\35\3\35\5\35\u02f9\n\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\5\36\u0301\n\36\3\36\5\36\u0304\n\36\3\36\3\36\5\36\u0308"+
		"\n\36\3\36\3\36\3\36\3\37\5\37\u030e\n\37\3\37\3\37\5\37\u0312\n\37\3"+
		"\37\3\37\3\37\3\37\5\37\u0318\n\37\3\37\3\37\3\37\5\37\u031d\n\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0323\n\37\3\37\5\37\u0326\n\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\7\37\u032f\n\37\f\37\16\37\u0332\13\37\3\37\3\37\5"+
		"\37\u0336\n\37\3\37\3\37\3 \5 \u033b\n \3 \3 \3 \3 \3 \5 \u0342\n \3 "+
		"\3 \3 \5 \u0347\n \3 \3 \3 \3 \5 \u034d\n \3 \5 \u0350\n \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \7 \u035c\n \f \16 \u035f\13 \3 \3 \5 \u0363\n \3 \3"+
		" \3!\3!\3!\5!\u036a\n!\3!\3!\3!\5!\u036f\n!\3!\3!\3!\7!\u0374\n!\f!\16"+
		"!\u0377\13!\3!\3!\3!\5!\u037c\n!\3\"\3\"\5\"\u0380\n\"\3\"\3\"\3\"\3\""+
		"\3\"\7\"\u0387\n\"\f\"\16\"\u038a\13\"\3\"\3\"\5\"\u038e\n\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u039b\n\"\r\"\16\"\u039c\3\"\3"+
		"\"\3\"\5\"\u03a2\n\"\3#\5#\u03a5\n#\3#\3#\5#\u03a9\n#\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\5$\u03b3\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u03c1\n%\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u03cc\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\7(\u03d7\n(\f(\16(\u03da\13(\3(\3(\3)\3)\3)\3)\3)\3)\7)\u03e4\n)\f)\16"+
		")\u03e7\13)\5)\u03e9\n)\3)\3)\3*\3*\3*\3*\3*\3*\5*\u03f3\n*\3+\3+\3+\3"+
		"+\3+\7+\u03fa\n+\f+\16+\u03fd\13+\3+\3+\5+\u0401\n+\3,\3,\3,\3,\3,\3,"+
		"\5,\u0409\n,\3-\3-\3-\3-\3-\3-\3-\5-\u0412\n-\3.\3.\3.\5.\u0417\n.\3."+
		"\7.\u041a\n.\f.\16.\u041d\13.\3.\5.\u0420\n.\3/\3/\5/\u0424\n/\3/\3/\3"+
		"/\5/\u0429\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0435"+
		"\n\60\3\61\3\61\5\61\u0439\n\61\3\61\3\61\3\61\5\61\u043e\n\61\3\61\3"+
		"\61\5\61\u0442\n\61\3\61\3\61\3\62\5\62\u0447\n\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\5\62\u044f\n\62\5\62\u0451\n\62\3\62\3\62\3\62\5\62\u0456\n"+
		"\62\3\62\3\62\5\62\u045a\n\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u0463\n\63\5\63\u0465\n\63\3\63\3\63\3\63\5\63\u046a\n\63\3\63\3\63\5"+
		"\63\u046e\n\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\5\64\u0477\n\64\5\64"+
		"\u0479\n\64\3\64\3\64\3\64\5\64\u047e\n\64\3\64\3\64\5\64\u0482\n\64\3"+
		"\64\3\64\3\65\3\65\5\65\u0488\n\65\3\65\3\65\3\65\5\65\u048d\n\65\3\65"+
		"\3\65\5\65\u0491\n\65\3\65\3\65\3\66\3\66\5\66\u0497\n\66\3\66\3\66\3"+
		"\66\5\66\u049c\n\66\3\66\3\66\5\66\u04a0\n\66\3\66\3\66\3\67\3\67\3\67"+
		"\5\67\u04a7\n\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\58\u04be\n8\38\38\38\38\38\38\58\u04c6\n8\38\38\38\38\3"+
		"8\38\58\u04ce\n8\38\38\38\38\38\38\58\u04d6\n8\38\38\38\38\38\38\58\u04de"+
		"\n8\38\38\38\38\38\38\58\u04e6\n8\38\38\38\38\38\38\58\u04ee\n8\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58"+
		"\u0508\n8\38\58\u050b\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\78\u0527\n8\f8\168\u052a\138\38\58\u052d"+
		"\n8\38\38\78\u0531\n8\f8\168\u0534\138\38\58\u0537\n8\38\38\38\38\38\3"+
		"8\38\38\78\u0541\n8\f8\168\u0544\138\38\58\u0547\n8\38\38\78\u054b\n8"+
		"\f8\168\u054e\138\38\58\u0551\n8\38\38\38\38\38\38\38\38\78\u055b\n8\f"+
		"8\168\u055e\138\38\58\u0561\n8\38\38\78\u0565\n8\f8\168\u0568\138\38\5"+
		"8\u056b\n8\38\38\38\38\38\38\38\38\78\u0575\n8\f8\168\u0578\138\38\58"+
		"\u057b\n8\38\38\78\u057f\n8\f8\168\u0582\138\38\58\u0585\n8\38\38\38\3"+
		"8\38\38\38\38\78\u058f\n8\f8\168\u0592\138\38\58\u0595\n8\38\38\78\u0599"+
		"\n8\f8\168\u059c\138\38\58\u059f\n8\38\38\38\38\38\38\38\38\78\u05a9\n"+
		"8\f8\168\u05ac\138\38\58\u05af\n8\38\38\78\u05b3\n8\f8\168\u05b6\138\3"+
		"8\58\u05b9\n8\38\38\38\38\38\38\38\38\38\38\38\58\u05c6\n8\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\78\u05dc\n8\f8\168\u05df"+
		"\138\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\5"+
		"9\u060d\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\59\u0625\n9\39\39\59\u0629\n9\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\79\u0639\n9\f9\169\u063c\139\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0650\n:\3:\3:\3:\3:\3:\3:\3:\5:\u0659\n:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\7:\u0674\n:\f:\16:\u0677\13:\3;\3;\3;\7;\u067c\n;\f;\16;\u067f"+
		"\13;\3<\5<\u0682\n<\3<\3<\3<\7<\u0687\n<\f<\16<\u068a\13<\3<\3<\5<\u068e"+
		"\n<\3<\3<\3<\3<\5<\u0694\n<\3<\3<\3<\7<\u0699\n<\f<\16<\u069c\13<\3<\3"+
		"<\3<\3<\3<\3<\5<\u06a4\n<\3<\3<\3<\7<\u06a9\n<\f<\16<\u06ac\13<\3<\3<"+
		"\3<\3<\3<\3<\5<\u06b4\n<\3<\3<\3<\7<\u06b9\n<\f<\16<\u06bc\13<\3<\3<\3"+
		"<\3<\3<\5<\u06c3\n<\3=\3=\3=\7=\u06c8\n=\f=\16=\u06cb\13=\3>\3>\3>\7>"+
		"\u06d0\n>\f>\16>\u06d3\13>\3>\3>\3>\3>\3?\3?\3?\7?\u06dc\n?\f?\16?\u06df"+
		"\13?\3@\5@\u06e2\n@\3@\3@\3@\7@\u06e7\n@\f@\16@\u06ea\13@\3@\3@\5@\u06ee"+
		"\n@\3@\3@\3@\3@\3A\3A\3B\3B\3B\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0726\nD\3E\3E\3F\3F\3G\3G\3G\2\5nprH\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\2"+
		"\25\3\2\21\22\3\2\23\24\4\2\23\23\678\3\2\u008c\u008d\4\2\35\35FF\3\2"+
		"QR\3\2ST\3\2^_\3\2ij\3\2kl\3\2mn\3\2op\4\2\23\23}}\4\2\24\24~~\4\2\67"+
		"\67\177\177\3\2\u0080\u0081\3\2\u0082\u0083\4\2[]\u0085\u0085\4\2\67\67"+
		"\u0089\u0089\u0859\2\u008e\3\2\2\2\4\u00a6\3\2\2\2\6\u00ac\3\2\2\2\b\u00b9"+
		"\3\2\2\2\n\u00c2\3\2\2\2\f\u00d6\3\2\2\2\16\u00f5\3\2\2\2\20\u00f7\3\2"+
		"\2\2\22\u0102\3\2\2\2\24\u010a\3\2\2\2\26\u010c\3\2\2\2\30\u010e\3\2\2"+
		"\2\32\u0111\3\2\2\2\34\u0116\3\2\2\2\36\u011e\3\2\2\2 \u0120\3\2\2\2\""+
		"\u0123\3\2\2\2$\u0138\3\2\2\2&\u0143\3\2\2\2(\u0170\3\2\2\2*\u0173\3\2"+
		"\2\2,\u01b4\3\2\2\2.\u01b7\3\2\2\2\60\u020d\3\2\2\2\62\u0277\3\2\2\2\64"+
		"\u02d0\3\2\2\2\66\u02d3\3\2\2\28\u02d6\3\2\2\2:\u02fc\3\2\2\2<\u030d\3"+
		"\2\2\2>\u033a\3\2\2\2@\u0369\3\2\2\2B\u037d\3\2\2\2D\u03a4\3\2\2\2F\u03b2"+
		"\3\2\2\2H\u03c0\3\2\2\2J\u03cb\3\2\2\2L\u03cd\3\2\2\2N\u03d2\3\2\2\2P"+
		"\u03dd\3\2\2\2R\u03f2\3\2\2\2T\u03f4\3\2\2\2V\u0408\3\2\2\2X\u040a\3\2"+
		"\2\2Z\u0413\3\2\2\2\\\u0421\3\2\2\2^\u0434\3\2\2\2`\u0436\3\2\2\2b\u0446"+
		"\3\2\2\2d\u045d\3\2\2\2f\u0471\3\2\2\2h\u0485\3\2\2\2j\u0494\3\2\2\2l"+
		"\u04a6\3\2\2\2n\u05c5\3\2\2\2p\u060c\3\2\2\2r\u0658\3\2\2\2t\u0678\3\2"+
		"\2\2v\u06c2\3\2\2\2x\u06c4\3\2\2\2z\u06cc\3\2\2\2|\u06d8\3\2\2\2~\u06e1"+
		"\3\2\2\2\u0080\u06f3\3\2\2\2\u0082\u06f5\3\2\2\2\u0084\u06f8\3\2\2\2\u0086"+
		"\u0725\3\2\2\2\u0088\u0727\3\2\2\2\u008a\u0729\3\2\2\2\u008c\u072b\3\2"+
		"\2\2\u008e\u008f\7\3\2\2\u008f\u0090\7\4\2\2\u0090\u0095\5\4\3\2\u0091"+
		"\u0092\7\5\2\2\u0092\u0094\5\4\3\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7\6\2\2\u0099\3\3\2\2\2\u009a\u009b\7\7\2\2"+
		"\u009b\u009c\7\b\2\2\u009c\u00a7\7\u0089\2\2\u009d\u009e\7\t\2\2\u009e"+
		"\u009f\7\b\2\2\u009f\u00a7\7\u0089\2\2\u00a0\u00a1\7\n\2\2\u00a1\u00a2"+
		"\7\b\2\2\u00a2\u00a7\7\u0089\2\2\u00a3\u00a4\7\13\2\2\u00a4\u00a5\7\b"+
		"\2\2\u00a5\u00a7\7\u0089\2\2\u00a6\u009a\3\2\2\2\u00a6\u009d\3\2\2\2\u00a6"+
		"\u00a0\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\5\3\2\2\2\u00a8\u00a9\7\f\2\2"+
		"\u00a9\u00aa\5\u0088E\2\u00aa\u00ab\7\r\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00a8\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b1\3\2\2\2\u00ae\u00b0\5$"+
		"\23\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\5\b"+
		"\5\2\u00b5\u00b8\5\n\6\2\u00b6\u00b8\7\r\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\7\3\2\2\2\u00b9\u00bd\7\16\2\2\u00ba\u00bb\5\u0086"+
		"D\2\u00bb\u00bc\7\b\2\2\u00bc\u00be\3\2\2\2\u00bd\u00ba\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\u008c\2\2\u00c0\u00c1"+
		"\7\r\2\2\u00c1\t\3\2\2\2\u00c2\u00c3\5Z.\2\u00c3\u00c5\b\6\1\2\u00c4\u00c6"+
		"\5\24\13\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2"+
		"\u00c7\u00d4\b\6\1\2\u00c8\u00c9\7\4\2\2\u00c9\u00ce\5\f\7\2\u00ca\u00cb"+
		"\7\5\2\2\u00cb\u00cd\5\f\7\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d2\7\6\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d5\7\r\2\2\u00d4"+
		"\u00c8\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\13\3\2\2\2\u00d6\u00d7\5\u0086"+
		"D\2\u00d7\u00f1\b\7\1\2\u00d8\u00ef\7\b\2\2\u00d9\u00da\6\7\2\2\u00da"+
		"\u00de\7\4\2\2\u00db\u00dd\5\n\6\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00f0\7\6\2\2\u00e2\u00f0\5\22\n\2\u00e3\u00e4\7"+
		"\17\2\2\u00e4\u00e9\5\22\n\2\u00e5\u00e6\7\5\2\2\u00e6\u00e8\5\22\n\2"+
		"\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7\20\2\2"+
		"\u00ed\u00f0\3\2\2\2\u00ee\u00f0\5\16\b\2\u00ef\u00d9\3\2\2\2\u00ef\u00e2"+
		"\3\2\2\2\u00ef\u00e3\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00d8\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\r\3\2\2\2\u00f3\u00f6\5\24\13"+
		"\2\u00f4\u00f6\5\20\t\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\17\3\2\2\2\u00f7\u00f8\7\17\2\2\u00f8\u00fd\5\16\b\2\u00f9\u00fa\7\5"+
		"\2\2\u00fa\u00fc\5\16\b\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u0101\7\20\2\2\u0101\21\3\2\2\2\u0102\u0103\5Z.\2\u0103\23"+
		"\3\2\2\2\u0104\u010b\5\26\f\2\u0105\u010b\5\32\16\2\u0106\u010b\5\34\17"+
		"\2\u0107\u010b\5\36\20\2\u0108\u010b\5\30\r\2\u0109\u010b\5 \21\2\u010a"+
		"\u0104\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0106\3\2\2\2\u010a\u0107\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\25\3\2\2\2\u010c\u010d"+
		"\5\u0088E\2\u010d\27\3\2\2\2\u010e\u010f\t\2\2\2\u010f\31\3\2\2\2\u0110"+
		"\u0112\t\3\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0114\7\u0089\2\2\u0114\33\3\2\2\2\u0115\u0117\t\3\2\2\u0116"+
		"\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u011a\7\u0089"+
		"\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\7\25\2\2\u011c\u011d\7\u0089\2\2\u011d\35\3\2\2\2\u011e\u011f\7"+
		"\u008b\2\2\u011f\37\3\2\2\2\u0120\u0121\7\26\2\2\u0121!\3\2\2\2\u0122"+
		"\u0124\5\2\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u012a\b\22\1\2\u0126\u0127\7\16\2\2\u0127\u0128\5\u0088E\2"+
		"\u0128\u0129\7\r\2\2\u0129\u012b\3\2\2\2\u012a\u0126\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0130\b\22\1\2\u012d\u012f\5$\23\2"+
		"\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\5&\24\2\u0134"+
		"\u0135\b\22\1\2\u0135\u0136\3\2\2\2\u0136\u0137\b\22\1\2\u0137#\3\2\2"+
		"\2\u0138\u013c\7\27\2\2\u0139\u013a\5\u0088E\2\u013a\u013b\7\b\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u0139\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013f\7\u008c\2\2\u013f\u0140\7\r\2\2\u0140\u0141\b\23\1\2"+
		"\u0141%\3\2\2\2\u0142\u0144\5l\67\2\u0143\u0142\3\2\2\2\u0143\u0144\3"+
		"\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\b\24\1\2\u0146\u0147\7\30\2\2\u0147"+
		"\u0148\5\u0086D\2\u0148\u0149\b\24\1\2\u0149\u014a\b\24\1\2\u014a\u014b"+
		"\7\b\2\2\u014b\u014c\5\u0088E\2\u014c\u014d\3\2\2\2\u014d\u014e\7\31\2"+
		"\2\u014e\u014f\7\u008c\2\2\u014f\u0150\3\2\2\2\u0150\u0165\b\24\1\2\u0151"+
		"\u0160\7\4\2\2\u0152\u0153\5B\"\2\u0153\u0154\b\24\1\2\u0154\u015f\3\2"+
		"\2\2\u0155\u0156\5&\24\2\u0156\u0157\b\24\1\2\u0157\u015f\3\2\2\2\u0158"+
		"\u0159\5(\25\2\u0159\u015a\b\24\1\2\u015a\u015f\3\2\2\2\u015b\u015c\5"+
		"b\62\2\u015c\u015d\b\24\1\2\u015d\u015f\3\2\2\2\u015e\u0152\3\2\2\2\u015e"+
		"\u0155\3\2\2\2\u015e\u0158\3\2\2\2\u015e\u015b\3\2\2\2\u015f\u0162\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0166\7\6\2\2\u0164\u0166\7\r\2\2\u0165\u0151\3\2"+
		"\2\2\u0165\u0164\3\2\2\2\u0166\'\3\2\2\2\u0167\u0168\5*\26\2\u0168\u0169"+
		"\b\25\1\2\u0169\u0171\3\2\2\2\u016a\u016b\5<\37\2\u016b\u016c\b\25\1\2"+
		"\u016c\u0171\3\2\2\2\u016d\u016e\5> \2\u016e\u016f\b\25\1\2\u016f\u0171"+
		"\3\2\2\2\u0170\u0167\3\2\2\2\u0170\u016a\3\2\2\2\u0170\u016d\3\2\2\2\u0171"+
		")\3\2\2\2\u0172\u0174\5l\67\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2"+
		"\u0174\u0175\3\2\2\2\u0175\u017b\b\26\1\2\u0176\u0178\7\32\2\2\u0177\u0176"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017c\7\33\2\2"+
		"\u017a\u017c\7\34\2\2\u017b\u0177\3\2\2\2\u017b\u017a\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\u017f\b\26\1\2\u017e\u0180\5\u0086D\2\u017f\u017e\3\2\2"+
		"\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\b\26\1\2\u0182"+
		"\u0184\b\26\1\2\u0183\u0185\5N(\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0186\3\2\2\2\u0186\u0190\b\26\1\2\u0187\u0188\7\35\2\2\u0188"+
		"\u018d\5\66\34\2\u0189\u018a\7\5\2\2\u018a\u018c\5\66\34\2\u018b\u0189"+
		"\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0187\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u0195\b\26\1\2\u0193\u0194\7\b\2\2\u0194"+
		"\u0196\7\u008c\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197"+
		"\3\2\2\2\u0197\u01ac\b\26\1\2\u0198\u01a7\7\4\2\2\u0199\u019a\5B\"\2\u019a"+
		"\u019b\b\26\1\2\u019b\u01a6\3\2\2\2\u019c\u019d\5\62\32\2\u019d\u019e"+
		"\b\26\1\2\u019e\u01a6\3\2\2\2\u019f\u01a0\5,\27\2\u01a0\u01a1\b\26\1\2"+
		"\u01a1\u01a6\3\2\2\2\u01a2\u01a3\5b\62\2\u01a3\u01a4\b\26\1\2\u01a4\u01a6"+
		"\3\2\2\2\u01a5\u0199\3\2\2\2\u01a5\u019c\3\2\2\2\u01a5\u019f\3\2\2\2\u01a5"+
		"\u01a2\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2"+
		"\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad\7\6\2\2\u01ab"+
		"\u01ad\7\r\2\2\u01ac\u0198\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad+\3\2\2\2"+
		"\u01ae\u01af\5.\30\2\u01af\u01b0\b\27\1\2\u01b0\u01b5\3\2\2\2\u01b1\u01b2"+
		"\5\60\31\2\u01b2\u01b3\b\27\1\2\u01b3\u01b5\3\2\2\2\u01b4\u01ae\3\2\2"+
		"\2\u01b4\u01b1\3\2\2\2\u01b5-\3\2\2\2\u01b6\u01b8\5l\67\2\u01b7\u01b6"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\b\30\1\2"+
		"\u01ba\u01bc\7\36\2\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bf"+
		"\3\2\2\2\u01bd\u01c0\7\16\2\2\u01be\u01c0\7\37\2\2\u01bf\u01bd\3\2\2\2"+
		"\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01c3"+
		"\7 \2\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u01c6\7!\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2"+
		"\2\2\u01c7\u01c9\7\"\2\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca\u01cb\7#\2\2\u01cb\u01cc\5\u0086D\2\u01cc\u01cd\b"+
		"\30\1\2\u01cd\u01ce\7\b\2\2\u01ce\u01d0\5V,\2\u01cf\u01d1\5:\36\2\u01d0"+
		"\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d5\b\30"+
		"\1\2\u01d3\u01d4\7\31\2\2\u01d4\u01d6\7\u008c\2\2\u01d5\u01d3\3\2\2\2"+
		"\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01eb\b\30\1\2\u01d8\u01e6"+
		"\7\4\2\2\u01d9\u01e2\7$\2\2\u01da\u01e2\7%\2\2\u01db\u01e2\7&\2\2\u01dc"+
		"\u01e2\7\'\2\2\u01dd\u01e2\7(\2\2\u01de\u01e2\7)\2\2\u01df\u01e2\7*\2"+
		"\2\u01e0\u01e2\7+\2\2\u01e1\u01d9\3\2\2\2\u01e1\u01da\3\2\2\2\u01e1\u01db"+
		"\3\2\2\2\u01e1\u01dc\3\2\2\2\u01e1\u01dd\3\2\2\2\u01e1\u01de\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e5\7\5"+
		"\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6"+
		"\u01e1\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2"+
		"\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\7\6\2\2\u01eb\u01d8\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u0208\3\2\2\2\u01ed\u01f3\7\4\2\2\u01ee\u01ef\5B"+
		"\"\2\u01ef\u01f0\b\30\1\2\u01f0\u01f2\3\2\2\2\u01f1\u01ee\3\2\2\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01fc\3\2"+
		"\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\5j\66\2\u01f7\u01f8\b\30\1\2\u01f8"+
		"\u01fd\3\2\2\2\u01f9\u01fa\5h\65\2\u01fa\u01fb\b\30\1\2\u01fb\u01fd\3"+
		"\2\2\2\u01fc\u01f6\3\2\2\2\u01fc\u01f9\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u0203\3\2\2\2\u01fe\u01ff\5B\"\2\u01ff\u0200\b\30\1\2\u0200\u0202\3\2"+
		"\2\2\u0201\u01fe\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0209\7\6"+
		"\2\2\u0207\u0209\7\r\2\2\u0208\u01ed\3\2\2\2\u0208\u0207\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\b\30\1\2\u020b/\3\2\2\2\u020c\u020e\5l\67\2"+
		"\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211"+
		"\b\31\1\2\u0210\u0212\7\36\2\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2"+
		"\u0212\u0215\3\2\2\2\u0213\u0216\7\16\2\2\u0214\u0216\7\37\2\2\u0215\u0213"+
		"\3\2\2\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2\2\2\u0217"+
		"\u0219\7 \2\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2"+
		"\2\2\u021a\u021c\7!\2\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021e\3\2\2\2\u021d\u021f\7\"\2\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u0220\3\2\2\2\u0220\u0221\7,\2\2\u0221\u0222\5\u0086D\2\u0222"+
		"\u0225\b\31\1\2\u0223\u0224\7-\2\2\u0224\u0226\5\u0086D\2\u0225\u0223"+
		"\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\b\31\1\2"+
		"\u0228\u0229\7\b\2\2\u0229\u022b\5V,\2\u022a\u022c\5:\36\2\u022b\u022a"+
		"\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0230\b\31\1\2"+
		"\u022e\u022f\7\31\2\2\u022f\u0231\7\u008c\2\2\u0230\u022e\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0248\b\31\1\2\u0233\u0243\7"+
		"\4\2\2\u0234\u023f\7.\2\2\u0235\u023f\7$\2\2\u0236\u023f\7&\2\2\u0237"+
		"\u023f\7\'\2\2\u0238\u023f\7(\2\2\u0239\u023f\7)\2\2\u023a\u023f\7/\2"+
		"\2\u023b\u023f\7\60\2\2\u023c\u023f\7*\2\2\u023d\u023f\7+\2\2\u023e\u0234"+
		"\3\2\2\2\u023e\u0235\3\2\2\2\u023e\u0236\3\2\2\2\u023e\u0237\3\2\2\2\u023e"+
		"\u0238\3\2\2\2\u023e\u0239\3\2\2\2\u023e\u023a\3\2\2\2\u023e\u023b\3\2"+
		"\2\2\u023e\u023c\3\2\2\2\u023e\u023d\3\2\2\2\u023f\u0241\3\2\2\2\u0240"+
		"\u0242\7\5\2\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2"+
		"\2\2\u0243\u023e\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0243\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\7\6\2\2\u0248\u0233\3\2"+
		"\2\2\u0248\u0249\3\2\2\2\u0249\u0272\3\2\2\2\u024a\u0256\7\4\2\2\u024b"+
		"\u024c\7\61\2\2\u024c\u0251\5\u0086D\2\u024d\u024e\7\5\2\2\u024e\u0250"+
		"\5\u0086D\2\u024f\u024d\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2"+
		"\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0255"+
		"\7\r\2\2\u0255\u0257\3\2\2\2\u0256\u024b\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		"\u025d\3\2\2\2\u0258\u0259\5B\"\2\u0259\u025a\b\31\1\2\u025a\u025c\3\2"+
		"\2\2\u025b\u0258\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u0266\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0261\5j"+
		"\66\2\u0261\u0262\b\31\1\2\u0262\u0267\3\2\2\2\u0263\u0264\5h\65\2\u0264"+
		"\u0265\b\31\1\2\u0265\u0267\3\2\2\2\u0266\u0260\3\2\2\2\u0266\u0263\3"+
		"\2\2\2\u0266\u0267\3\2\2\2\u0267\u026d\3\2\2\2\u0268\u0269\5B\"\2\u0269"+
		"\u026a\b\31\1\2\u026a\u026c\3\2\2\2\u026b\u0268\3\2\2\2\u026c\u026f\3"+
		"\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f"+
		"\u026d\3\2\2\2\u0270\u0273\7\6\2\2\u0271\u0273\7\r\2\2\u0272\u024a\3\2"+
		"\2\2\u0272\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\b\31\1\2\u0275"+
		"\61\3\2\2\2\u0276\u0278\5l\67\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2"+
		"\2\u0278\u0279\3\2\2\2\u0279\u027b\b\32\1\2\u027a\u027c\7\36\2\2\u027b"+
		"\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\7\62"+
		"\2\2\u027e\u0280\5N(\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281"+
		"\3\2\2\2\u0281\u0282\b\32\1\2\u0282\u0283\5\u0086D\2\u0283\u0284\b\32"+
		"\1\2\u0284\u028d\7\63\2\2\u0285\u028a\58\35\2\u0286\u0287\7\5\2\2\u0287"+
		"\u0289\58\35\2\u0288\u0286\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2"+
		"\2\2\u028a\u028b\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028d"+
		"\u0285\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\7\64"+
		"\2\2\u0290\u0291\3\2\2\2\u0291\u0297\b\32\1\2\u0292\u0293\7\b\2\2\u0293"+
		"\u0295\5V,\2\u0294\u0296\5:\36\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2"+
		"\2\u0296\u0298\3\2\2\2\u0297\u0292\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299"+
		"\3\2\2\2\u0299\u029a\b\32\1\2\u029a\u02a4\b\32\1\2\u029b\u029c\7\65\2"+
		"\2\u029c\u02a1\5\64\33\2\u029d\u029e\7\5\2\2\u029e\u02a0\5\64\33\2\u029f"+
		"\u029d\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2"+
		"\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u029b\3\2\2\2\u02a4"+
		"\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02b6\b\32\1\2\u02a7\u02b1\7"+
		"\4\2\2\u02a8\u02ad\7&\2\2\u02a9\u02ad\7\'\2\2\u02aa\u02ad\7(\2\2\u02ab"+
		"\u02ad\7)\2\2\u02ac\u02a8\3\2\2\2\u02ac\u02a9\3\2\2\2\u02ac\u02aa\3\2"+
		"\2\2\u02ac\u02ab\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae\u02b0\7\5\2\2\u02af"+
		"\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02ac\3\2"+
		"\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u02b7\7\6\2\2\u02b6\u02a7\3\2\2\2\u02b6\u02b7\3\2"+
		"\2\2\u02b7\u02cc\3\2\2\2\u02b8\u02c7\7\4\2\2\u02b9\u02ba\5B\"\2\u02ba"+
		"\u02bb\b\32\1\2\u02bb\u02c6\3\2\2\2\u02bc\u02bd\5d\63\2\u02bd\u02be\b"+
		"\32\1\2\u02be\u02c6\3\2\2\2\u02bf\u02c0\5`\61\2\u02c0\u02c1\b\32\1\2\u02c1"+
		"\u02c6\3\2\2\2\u02c2\u02c3\5f\64\2\u02c3\u02c4\b\32\1\2\u02c4\u02c6\3"+
		"\2\2\2\u02c5\u02b9\3\2\2\2\u02c5\u02bc\3\2\2\2\u02c5\u02bf\3\2\2\2\u02c5"+
		"\u02c2\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2"+
		"\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cd\7\6\2\2\u02cb"+
		"\u02cd\7\r\2\2\u02cc\u02b8\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cd\u02ce\3\2"+
		"\2\2\u02ce\u02cf\b\32\1\2\u02cf\63\3\2\2\2\u02d0\u02d1\5T+\2\u02d1\u02d2"+
		"\b\33\1\2\u02d2\65\3\2\2\2\u02d3\u02d4\5T+\2\u02d4\u02d5\b\34\1\2\u02d5"+
		"\67\3\2\2\2\u02d6\u02d7\5\u0086D\2\u02d7\u02d8\b\35\1\2\u02d8\u02d9\7"+
		"\b\2\2\u02d9\u02db\5V,\2\u02da\u02dc\5:\36\2\u02db\u02da\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02ed\b\35\1\2\u02de\u02e8\7"+
		"\4\2\2\u02df\u02e4\7&\2\2\u02e0\u02e4\7\'\2\2\u02e1\u02e4\7(\2\2\u02e2"+
		"\u02e4\7)\2\2\u02e3\u02df\3\2\2\2\u02e3\u02e0\3\2\2\2\u02e3\u02e1\3\2"+
		"\2\2\u02e3\u02e2\3\2\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02e7\7\5\2\2\u02e6"+
		"\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02e3\3\2"+
		"\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb"+
		"\u02ec\3\2\2\2\u02ec\u02ee\7\6\2\2\u02ed\u02de\3\2\2\2\u02ed\u02ee\3\2"+
		"\2\2\u02ee\u02f8\3\2\2\2\u02ef\u02f3\7\4\2\2\u02f0\u02f2\5B\"\2\u02f1"+
		"\u02f0\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2"+
		"\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f7\b\35\1\2\u02f7"+
		"\u02f9\7\6\2\2\u02f8\u02ef\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2"+
		"\2\2\u02fa\u02fb\b\35\1\2\u02fb9\3\2\2\2\u02fc\u0303\7\17\2\2\u02fd\u0300"+
		"\5\u008cG\2\u02fe\u02ff\7\66\2\2\u02ff\u0301\5\u008aF\2\u0300\u02fe\3"+
		"\2\2\2\u0300\u0301\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0304\t\4\2\2\u0303"+
		"\u02fd\3\2\2\2\u0303\u0302\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0308\79"+
		"\2\2\u0306\u0308\7:\2\2\u0307\u0305\3\2\2\2\u0307\u0306\3\2\2\2\u0307"+
		"\u0308\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\7\20\2\2\u030a\u030b\b"+
		"\36\1\2\u030b;\3\2\2\2\u030c\u030e\5l\67\2\u030d\u030c\3\2\2\2\u030d\u030e"+
		"\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\b\37\1\2\u0310\u0312\7;\2\2\u0311"+
		"\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\7<"+
		"\2\2\u0314\u0315\5\u0086D\2\u0315\u0317\b\37\1\2\u0316\u0318\5N(\2\u0317"+
		"\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031c\b\37"+
		"\1\2\u031a\u031b\7\b\2\2\u031b\u031d\7\u008c\2\2\u031c\u031a\3\2\2\2\u031c"+
		"\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0325\b\37\1\2\u031f\u0322\7"+
		"\4\2\2\u0320\u0323\7=\2\2\u0321\u0323\7>\2\2\u0322\u0320\3\2\2\2\u0322"+
		"\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\7\6"+
		"\2\2\u0325\u031f\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0335\3\2\2\2\u0327"+
		"\u0330\7\4\2\2\u0328\u0329\5B\"\2\u0329\u032a\b\37\1\2\u032a\u032f\3\2"+
		"\2\2\u032b\u032c\5b\62\2\u032c\u032d\b\37\1\2\u032d\u032f\3\2\2\2\u032e"+
		"\u0328\3\2\2\2\u032e\u032b\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2"+
		"\2\2\u0330\u0331\3\2\2\2\u0331\u0333\3\2\2\2\u0332\u0330\3\2\2\2\u0333"+
		"\u0336\7\6\2\2\u0334\u0336\7\r\2\2\u0335\u0327\3\2\2\2\u0335\u0334\3\2"+
		"\2\2\u0336\u0337\3\2\2\2\u0337\u0338\b\37\1\2\u0338=\3\2\2\2\u0339\u033b"+
		"\5l\67\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c"+
		"\u033d\b \1\2\u033d\u033e\7?\2\2\u033e\u033f\5\u0086D\2\u033f\u0341\b"+
		" \1\2\u0340\u0342\5N(\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0343\3\2\2\2\u0343\u0346\b \1\2\u0344\u0345\7\b\2\2\u0345\u0347\7\u008c"+
		"\2\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u034f\b \1\2\u0349\u034c\7\4\2\2\u034a\u034d\7=\2\2\u034b\u034d\7>\2"+
		"\2\u034c\u034a\3\2\2\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e"+
		"\3\2\2\2\u034e\u0350\7\6\2\2\u034f\u0349\3\2\2\2\u034f\u0350\3\2\2\2\u0350"+
		"\u0362\3\2\2\2\u0351\u035d\7\4\2\2\u0352\u0353\5B\"\2\u0353\u0354\b \1"+
		"\2\u0354\u035c\3\2\2\2\u0355\u0356\5@!\2\u0356\u0357\b \1\2\u0357\u035c"+
		"\3\2\2\2\u0358\u0359\5b\62\2\u0359\u035a\b \1\2\u035a\u035c\3\2\2\2\u035b"+
		"\u0352\3\2\2\2\u035b\u0355\3\2\2\2\u035b\u0358\3\2\2\2\u035c\u035f\3\2"+
		"\2\2\u035d\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f"+
		"\u035d\3\2\2\2\u0360\u0363\7\6\2\2\u0361\u0363\7\r\2\2\u0362\u0351\3\2"+
		"\2\2\u0362\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\b \1\2\u0365"+
		"?\3\2\2\2\u0366\u0367\7@\2\2\u0367\u036a\5\u0086D\2\u0368\u036a\5\u0086"+
		"D\2\u0369\u0366\3\2\2\2\u0369\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u036e\b!\1\2\u036c\u036d\7\31\2\2\u036d\u036f\7\u0089\2\2\u036e\u036c"+
		"\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u037b\b!\1\2\u0371"+
		"\u0375\7\4\2\2\u0372\u0374\5B\"\2\u0373\u0372\3\2\2\2\u0374\u0377\3\2"+
		"\2\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\3\2\2\2\u0377"+
		"\u0375\3\2\2\2\u0378\u0379\b!\1\2\u0379\u037c\7\6\2\2\u037a\u037c\7\r"+
		"\2\2\u037b\u0371\3\2\2\2\u037b\u037a\3\2\2\2\u037cA\3\2\2\2\u037d\u037f"+
		"\7A\2\2\u037e\u0380\7\u008c\2\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2"+
		"\2\u0380\u0381\3\2\2\2\u0381\u038d\b\"\1\2\u0382\u0383\7\63\2\2\u0383"+
		"\u0388\5D#\2\u0384\u0385\7\5\2\2\u0385\u0387\5D#\2\u0386\u0384\3\2\2\2"+
		"\u0387\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b"+
		"\3\2\2\2\u038a\u0388\3\2\2\2\u038b\u038c\7\64\2\2\u038c\u038e\3\2\2\2"+
		"\u038d\u0382\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u03a1"+
		"\b\"\1\2\u0390\u039a\7\4\2\2\u0391\u0392\5B\"\2\u0392\u0393\b\"\1\2\u0393"+
		"\u039b\3\2\2\2\u0394\u0395\5F$\2\u0395\u0396\b\"\1\2\u0396\u039b\3\2\2"+
		"\2\u0397\u0398\5L\'\2\u0398\u0399\b\"\1\2\u0399\u039b\3\2\2\2\u039a\u0391"+
		"\3\2\2\2\u039a\u0394\3\2\2\2\u039a\u0397\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\7\6"+
		"\2\2\u039f\u03a2\3\2\2\2\u03a0\u03a2\7\r\2\2\u03a1\u0390\3\2\2\2\u03a1"+
		"\u03a0\3\2\2\2\u03a2C\3\2\2\2\u03a3\u03a5\7\u008c\2\2\u03a4\u03a3\3\2"+
		"\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a8\7\31\2\2\u03a7"+
		"\u03a9\t\5\2\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\3\2"+
		"\2\2\u03aa\u03ab\b#\1\2\u03abE\3\2\2\2\u03ac\u03ad\5B\"\2\u03ad\u03ae"+
		"\b$\1\2\u03ae\u03b3\3\2\2\2\u03af\u03b0\5H%\2\u03b0\u03b1\b$\1\2\u03b1"+
		"\u03b3\3\2\2\2\u03b2\u03ac\3\2\2\2\u03b2\u03af\3\2\2\2\u03b3G\3\2\2\2"+
		"\u03b4\u03b5\5J&\2\u03b5\u03b6\b%\1\2\u03b6\u03c1\3\2\2\2\u03b7\u03b8"+
		"\5(\25\2\u03b8\u03b9\b%\1\2\u03b9\u03c1\3\2\2\2\u03ba\u03bb\5&\24\2\u03bb"+
		"\u03bc\b%\1\2\u03bc\u03c1\3\2\2\2\u03bd\u03be\5@!\2\u03be\u03bf\b%\1\2"+
		"\u03bf\u03c1\3\2\2\2\u03c0\u03b4\3\2\2\2\u03c0\u03b7\3\2\2\2\u03c0\u03ba"+
		"\3\2\2\2\u03c0\u03bd\3\2\2\2\u03c1I\3\2\2\2\u03c2\u03c3\5\62\32\2\u03c3"+
		"\u03c4\b&\1\2\u03c4\u03cc\3\2\2\2\u03c5\u03c6\58\35\2\u03c6\u03c7\b&\1"+
		"\2\u03c7\u03cc\3\2\2\2\u03c8\u03c9\5,\27\2\u03c9\u03ca\b&\1\2\u03ca\u03cc"+
		"\3\2\2\2\u03cb\u03c2\3\2\2\2\u03cb\u03c5\3\2\2\2\u03cb\u03c8\3\2\2\2\u03cc"+
		"K\3\2\2\2\u03cd\u03ce\7B\2\2\u03ce\u03cf\5Z.\2\u03cf\u03d0\b\'\1\2\u03d0"+
		"\u03d1\7\r\2\2\u03d1M\3\2\2\2\u03d2\u03d3\7C\2\2\u03d3\u03d8\5P)\2\u03d4"+
		"\u03d5\7\5\2\2\u03d5\u03d7\5P)\2\u03d6\u03d4\3\2\2\2\u03d7\u03da\3\2\2"+
		"\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03db\3\2\2\2\u03da\u03d8"+
		"\3\2\2\2\u03db\u03dc\7D\2\2\u03dcO\3\2\2\2\u03dd\u03de\5\u0086D\2\u03de"+
		"\u03e8\b)\1\2\u03df\u03e0\7\35\2\2\u03e0\u03e5\5T+\2\u03e1\u03e2\7E\2"+
		"\2\u03e2\u03e4\5T+\2\u03e3\u03e1\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e3"+
		"\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e8"+
		"\u03df\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\b)"+
		"\1\2\u03ebQ\3\2\2\2\u03ec\u03ed\5T+\2\u03ed\u03ee\b*\1\2\u03ee\u03f3\3"+
		"\2\2\2\u03ef\u03f0\5X-\2\u03f0\u03f1\b*\1\2\u03f1\u03f3\3\2\2\2\u03f2"+
		"\u03ec\3\2\2\2\u03f2\u03ef\3\2\2\2\u03f3S\3\2\2\2\u03f4\u0400\5Z.\2\u03f5"+
		"\u03f6\7C\2\2\u03f6\u03fb\5R*\2\u03f7\u03f8\7\5\2\2\u03f8\u03fa\5R*\2"+
		"\u03f9\u03f7\3\2\2\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc"+
		"\3\2\2\2\u03fc\u03fe\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe\u03ff\7D\2\2\u03ff"+
		"\u0401\3\2\2\2\u0400\u03f5\3\2\2\2\u0400\u0401\3\2\2\2\u0401U\3\2\2\2"+
		"\u0402\u0403\5^\60\2\u0403\u0404\b,\1\2\u0404\u0409\3\2\2\2\u0405\u0406"+
		"\5T+\2\u0406\u0407\b,\1\2\u0407\u0409\3\2\2\2\u0408\u0402\3\2\2\2\u0408"+
		"\u0405\3\2\2\2\u0409W\3\2\2\2\u040a\u040b\78\2\2\u040b\u0411\b-\1\2\u040c"+
		"\u040d\t\6\2\2\u040d\u040e\b-\1\2\u040e\u040f\5T+\2\u040f\u0410\b-\1\2"+
		"\u0410\u0412\3\2\2\2\u0411\u040c\3\2\2\2\u0411\u0412\3\2\2\2\u0412Y\3"+
		"\2\2\2\u0413\u0416\5\u0086D\2\u0414\u0415\7\25\2\2\u0415\u0417\7\u0089"+
		"\2\2\u0416\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u041f\3\2\2\2\u0418"+
		"\u041a\5\\/\2\u0419\u0418\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2"+
		"\2\2\u041b\u041c\3\2\2\2\u041c\u041e\3\2\2\2\u041d\u041b\3\2\2\2\u041e"+
		"\u0420\5\\/\2\u041f\u041b\3\2\2\2\u041f\u0420\3\2\2\2\u0420[\3\2\2\2\u0421"+
		"\u0423\7G\2\2\u0422\u0424\7H\2\2\u0423\u0422\3\2\2\2\u0423\u0424\3\2\2"+
		"\2\u0424\u0425\3\2\2\2\u0425\u0428\5\u0086D\2\u0426\u0427\7\25\2\2\u0427"+
		"\u0429\7\u0089\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429]\3\2"+
		"\2\2\u042a\u042b\7I\2\2\u042b\u0435\b\60\1\2\u042c\u042d\7J\2\2\u042d"+
		"\u0435\b\60\1\2\u042e\u042f\7K\2\2\u042f\u0435\b\60\1\2\u0430\u0431\7"+
		"L\2\2\u0431\u0435\b\60\1\2\u0432\u0433\7M\2\2\u0433\u0435\b\60\1\2\u0434"+
		"\u042a\3\2\2\2\u0434\u042c\3\2\2\2\u0434\u042e\3\2\2\2\u0434\u0430\3\2"+
		"\2\2\u0434\u0432\3\2\2\2\u0435_\3\2\2\2\u0436\u0438\7N\2\2\u0437\u0439"+
		"\5\u0088E\2\u0438\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2\2"+
		"\2\u043a\u0441\b\61\1\2\u043b\u043d\7\b\2\2\u043c\u043e\5p9\2\u043d\u043c"+
		"\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0442\7\r\2\2\u0440"+
		"\u0442\7\r\2\2\u0441\u043b\3\2\2\2\u0441\u0440\3\2\2\2\u0442\u0443\3\2"+
		"\2\2\u0443\u0444\b\61\1\2\u0444a\3\2\2\2\u0445\u0447\7O\2\2\u0446\u0445"+
		"\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\b\62\1\2"+
		"\u0449\u0450\7P\2\2\u044a\u044e\5\u0088E\2\u044b\u044c\7\63\2\2\u044c"+
		"\u044d\7\u008b\2\2\u044d\u044f\7\64\2\2\u044e\u044b\3\2\2\2\u044e\u044f"+
		"\3\2\2\2\u044f\u0451\3\2\2\2\u0450\u044a\3\2\2\2\u0450\u0451\3\2\2\2\u0451"+
		"\u0452\3\2\2\2\u0452\u0459\b\62\1\2\u0453\u0455\7\b\2\2\u0454\u0456\5"+
		"n8\2\u0455\u0454\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457\3\2\2\2\u0457"+
		"\u045a\7\r\2\2\u0458\u045a\7\r\2\2\u0459\u0453\3\2\2\2\u0459\u0458\3\2"+
		"\2\2\u045a\u045b\3\2\2\2\u045b\u045c\b\62\1\2\u045cc\3\2\2\2\u045d\u0464"+
		"\t\7\2\2\u045e\u0462\5\u0088E\2\u045f\u0460\7\63\2\2\u0460\u0461\7\u008b"+
		"\2\2\u0461\u0463\7\64\2\2\u0462\u045f\3\2\2\2\u0462\u0463\3\2\2\2\u0463"+
		"\u0465\3\2\2\2\u0464\u045e\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\3\2"+
		"\2\2\u0466\u046d\b\63\1\2\u0467\u0469\7\b\2\2\u0468\u046a\5n8\2\u0469"+
		"\u0468\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046e\7\r"+
		"\2\2\u046c\u046e\7\r\2\2\u046d\u0467\3\2\2\2\u046d\u046c\3\2\2\2\u046e"+
		"\u046f\3\2\2\2\u046f\u0470\b\63\1\2\u0470e\3\2\2\2\u0471\u0478\t\b\2\2"+
		"\u0472\u0476\5\u0088E\2\u0473\u0474\7\63\2\2\u0474\u0475\7\u008b\2\2\u0475"+
		"\u0477\7\64\2\2\u0476\u0473\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0479\3"+
		"\2\2\2\u0478\u0472\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\3\2\2\2\u047a"+
		"\u0481\b\64\1\2\u047b\u047d\7\b\2\2\u047c\u047e\5n8\2\u047d\u047c\3\2"+
		"\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0482\7\r\2\2\u0480"+
		"\u0482\7\r\2\2\u0481\u047b\3\2\2\2\u0481\u0480\3\2\2\2\u0482\u0483\3\2"+
		"\2\2\u0483\u0484\b\64\1\2\u0484g\3\2\2\2\u0485\u0487\7U\2\2\u0486\u0488"+
		"\5\u0088E\2\u0487\u0486\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u0489\3\2\2"+
		"\2\u0489\u0490\b\65\1\2\u048a\u048c\7\b\2\2\u048b\u048d\5p9\2\u048c\u048b"+
		"\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u0491\7\r\2\2\u048f"+
		"\u0491\7\r\2\2\u0490\u048a\3\2\2\2\u0490\u048f\3\2\2\2\u0491\u0492\3\2"+
		"\2\2\u0492\u0493\b\65\1\2\u0493i\3\2\2\2\u0494\u0496\7V\2\2\u0495\u0497"+
		"\5\u0088E\2\u0496\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\3\2\2"+
		"\2\u0498\u049f\b\66\1\2\u0499\u049b\7\b\2\2\u049a\u049c\5p9\2\u049b\u049a"+
		"\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u04a0\7\r\2\2\u049e"+
		"\u04a0\7\r\2\2\u049f\u0499\3\2\2\2\u049f\u049e\3\2\2\2\u04a0\u04a1\3\2"+
		"\2\2\u04a1\u04a2\b\66\1\2\u04a2k\3\2\2\2\u04a3\u04a7\7W\2\2\u04a4\u04a7"+
		"\7X\2\2\u04a5\u04a7\7Y\2\2\u04a6\u04a3\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a6"+
		"\u04a5\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\b\67\1\2\u04a9m\3\2\2\2"+
		"\u04aa\u04ab\b8\1\2\u04ab\u04ac\7Z\2\2\u04ac\u04ad\5p9\2\u04ad\u04ae\b"+
		"8\1\2\u04ae\u05c6\3\2\2\2\u04af\u04b0\7[\2\2\u04b0\u04b1\5p9\2\u04b1\u04b2"+
		"\b8\1\2\u04b2\u05c6\3\2\2\2\u04b3\u04b4\7\\\2\2\u04b4\u04b5\5p9\2\u04b5"+
		"\u04b6\b8\1\2\u04b6\u05c6\3\2\2\2\u04b7\u04b8\7]\2\2\u04b8\u04b9\5p9\2"+
		"\u04b9\u04ba\b8\1\2\u04ba\u05c6\3\2\2\2\u04bb\u04bd\5p9\2\u04bc\u04be"+
		"\t\t\2\2\u04bd\u04bc\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf"+
		"\u04c0\7`\2\2\u04c0\u04c1\5p9\2\u04c1\u04c2\b8\1\2\u04c2\u05c6\3\2\2\2"+
		"\u04c3\u04c5\5p9\2\u04c4\u04c6\t\t\2\2\u04c5\u04c4\3\2\2\2\u04c5\u04c6"+
		"\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\7\31\2\2\u04c8\u04c9\5p9\2\u04c9"+
		"\u04ca\b8\1\2\u04ca\u05c6\3\2\2\2\u04cb\u04cd\5r:\2\u04cc\u04ce\t\t\2"+
		"\2\u04cd\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0"+
		"\7\31\2\2\u04d0\u04d1\5r:\2\u04d1\u04d2\b8\1\2\u04d2\u05c6\3\2\2\2\u04d3"+
		"\u04d5\5r:\2\u04d4\u04d6\t\t\2\2\u04d5\u04d4\3\2\2\2\u04d5\u04d6\3\2\2"+
		"\2\u04d6\u04d7\3\2\2\2\u04d7\u04d8\7C\2\2\u04d8\u04d9\5r:\2\u04d9\u04da"+
		"\b8\1\2\u04da\u05c6\3\2\2\2\u04db\u04dd\5r:\2\u04dc\u04de\t\t\2\2\u04dd"+
		"\u04dc\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\7a"+
		"\2\2\u04e0\u04e1\5r:\2\u04e1\u04e2\b8\1\2\u04e2\u05c6\3\2\2\2\u04e3\u04e5"+
		"\5r:\2\u04e4\u04e6\t\t\2\2\u04e5\u04e4\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6"+
		"\u04e7\3\2\2\2\u04e7\u04e8\7D\2\2\u04e8\u04e9\5r:\2\u04e9\u04ea\b8\1\2"+
		"\u04ea\u05c6\3\2\2\2\u04eb\u04ed\5r:\2\u04ec\u04ee\t\t\2\2\u04ed\u04ec"+
		"\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\7b\2\2\u04f0"+
		"\u04f1\5r:\2\u04f1\u04f2\b8\1\2\u04f2\u05c6\3\2\2\2\u04f3\u04f4\7c\2\2"+
		"\u04f4\u04f5\5t;\2\u04f5\u04f6\7d\2\2\u04f6\u04f7\5r:\2\u04f7\u04f8\3"+
		"\2\2\2\u04f8\u04f9\b8\1\2\u04f9\u05c6\3\2\2\2\u04fa\u04fb\7e\2\2\u04fb"+
		"\u04fc\7\17\2\2\u04fc\u04fd\5\u0080A\2\u04fd\u04fe\7\20\2\2\u04fe\u04ff"+
		"\b8\1\2\u04ff\u05c6\3\2\2\2\u0500\u0501\7f\2\2\u0501\u0502\7\17\2\2\u0502"+
		"\u0503\5\u0080A\2\u0503\u0504\7\b\2\2\u0504\u0505\5p9\2\u0505\u050a\7"+
		"g\2\2\u0506\u0508\7\\\2\2\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508"+
		"\u050b\3\2\2\2\u0509\u050b\7[\2\2\u050a\u0507\3\2\2\2\u050a\u0509\3\2"+
		"\2\2\u050b\u050c\3\2\2\2\u050c\u050d\5p9\2\u050d\u050e\7\20\2\2\u050e"+
		"\u050f\b8\1\2\u050f\u05c6\3\2\2\2\u0510\u0511\7h\2\2\u0511\u0512\7\17"+
		"\2\2\u0512\u0513\5\u0080A\2\u0513\u0514\7\5\2\2\u0514\u0515\5\u0080A\2"+
		"\u0515\u0516\7\5\2\2\u0516\u0517\5\u0080A\2\u0517\u0518\7\5\2\2\u0518"+
		"\u0519\5\u0080A\2\u0519\u051a\7\20\2\2\u051a\u051b\b8\1\2\u051b\u05c6"+
		"\3\2\2\2\u051c\u051d\t\t\2\2\u051d\u051e\5n8\20\u051e\u051f\b8\1\2\u051f"+
		"\u05c6\3\2\2\2\u0520\u0521\7q\2\2\u0521\u0536\5t;\2\u0522\u052c\7d\2\2"+
		"\u0523\u052d\5n8\2\u0524\u0528\7\4\2\2\u0525\u0527\5n8\2\u0526\u0525\3"+
		"\2\2\2\u0527\u052a\3\2\2\2\u0528\u0526\3\2\2\2\u0528\u0529\3\2\2\2\u0529"+
		"\u052b\3\2\2\2\u052a\u0528\3\2\2\2\u052b\u052d\7\6\2\2\u052c\u0523\3\2"+
		"\2\2\u052c\u0524\3\2\2\2\u052d\u0537\3\2\2\2\u052e\u0532\7\4\2\2\u052f"+
		"\u0531\5n8\2\u0530\u052f\3\2\2\2\u0531\u0534\3\2\2\2\u0532\u0530\3\2\2"+
		"\2\u0532\u0533\3\2\2\2\u0533\u0535\3\2\2\2\u0534\u0532\3\2\2\2\u0535\u0537"+
		"\7\6\2\2\u0536\u0522\3\2\2\2\u0536\u052e\3\2\2\2\u0537\u0538\3\2\2\2\u0538"+
		"\u0539\b8\1\2\u0539\u05c6\3\2\2\2\u053a\u053b\7]\2\2\u053b\u0550\5t;\2"+
		"\u053c\u0546\7d\2\2\u053d\u0547\5n8\2\u053e\u0542\7\4\2\2\u053f\u0541"+
		"\5n8\2\u0540\u053f\3\2\2\2\u0541\u0544\3\2\2\2\u0542\u0540\3\2\2\2\u0542"+
		"\u0543\3\2\2\2\u0543\u0545\3\2\2\2\u0544\u0542\3\2\2\2\u0545\u0547\7\6"+
		"\2\2\u0546\u053d\3\2\2\2\u0546\u053e\3\2\2\2\u0547\u0551\3\2\2\2\u0548"+
		"\u054c\7\4\2\2\u0549\u054b\5n8\2\u054a\u0549\3\2\2\2\u054b\u054e\3\2\2"+
		"\2\u054c\u054a\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054f\3\2\2\2\u054e\u054c"+
		"\3\2\2\2\u054f\u0551\7\6\2\2\u0550\u053c\3\2\2\2\u0550\u0548\3\2\2\2\u0551"+
		"\u0552\3\2\2\2\u0552\u0553\b8\1\2\u0553\u05c6\3\2\2\2\u0554\u0555\7Z\2"+
		"\2\u0555\u056a\5t;\2\u0556\u0560\7d\2\2\u0557\u0561\5n8\2\u0558\u055c"+
		"\7\4\2\2\u0559\u055b\5n8\2\u055a\u0559\3\2\2\2\u055b\u055e\3\2\2\2\u055c"+
		"\u055a\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055f\3\2\2\2\u055e\u055c\3\2"+
		"\2\2\u055f\u0561\7\6\2\2\u0560\u0557\3\2\2\2\u0560\u0558\3\2\2\2\u0561"+
		"\u056b\3\2\2\2\u0562\u0566\7\4\2\2\u0563\u0565\5n8\2\u0564\u0563\3\2\2"+
		"\2\u0565\u0568\3\2\2\2\u0566\u0564\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0569"+
		"\3\2\2\2\u0568\u0566\3\2\2\2\u0569\u056b\7\6\2\2\u056a\u0556\3\2\2\2\u056a"+
		"\u0562\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056d\b8\1\2\u056d\u05c6\3\2"+
		"\2\2\u056e\u056f\7\\\2\2\u056f\u0584\5t;\2\u0570\u057a\7d\2\2\u0571\u057b"+
		"\5n8\2\u0572\u0576\7\4\2\2\u0573\u0575\5n8\2\u0574\u0573\3\2\2\2\u0575"+
		"\u0578\3\2\2\2\u0576\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0579\3\2"+
		"\2\2\u0578\u0576\3\2\2\2\u0579\u057b\7\6\2\2\u057a\u0571\3\2\2\2\u057a"+
		"\u0572\3\2\2\2\u057b\u0585\3\2\2\2\u057c\u0580\7\4\2\2\u057d\u057f\5n"+
		"8\2\u057e\u057d\3\2\2\2\u057f\u0582\3\2\2\2\u0580\u057e\3\2\2\2\u0580"+
		"\u0581\3\2\2\2\u0581\u0583\3\2\2\2\u0582\u0580\3\2\2\2\u0583\u0585\7\6"+
		"\2\2\u0584\u0570\3\2\2\2\u0584\u057c\3\2\2\2\u0585\u0586\3\2\2\2\u0586"+
		"\u0587\b8\1\2\u0587\u05c6\3\2\2\2\u0588\u0589\7[\2\2\u0589\u059e\5t;\2"+
		"\u058a\u0594\7d\2\2\u058b\u0595\5n8\2\u058c\u0590\7\4\2\2\u058d\u058f"+
		"\5n8\2\u058e\u058d\3\2\2\2\u058f\u0592\3\2\2\2\u0590\u058e\3\2\2\2\u0590"+
		"\u0591\3\2\2\2\u0591\u0593\3\2\2\2\u0592\u0590\3\2\2\2\u0593\u0595\7\6"+
		"\2\2\u0594\u058b\3\2\2\2\u0594\u058c\3\2\2\2\u0595\u059f\3\2\2\2\u0596"+
		"\u059a\7\4\2\2\u0597\u0599\5n8\2\u0598\u0597\3\2\2\2\u0599\u059c\3\2\2"+
		"\2\u059a\u0598\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059d\3\2\2\2\u059c\u059a"+
		"\3\2\2\2\u059d\u059f\7\6\2\2\u059e\u058a\3\2\2\2\u059e\u0596\3\2\2\2\u059f"+
		"\u05a0\3\2\2\2\u05a0\u05a1\b8\1\2\u05a1\u05c6\3\2\2\2\u05a2\u05a3\7r\2"+
		"\2\u05a3\u05b8\5x=\2\u05a4\u05ae\7d\2\2\u05a5\u05af\5n8\2\u05a6\u05aa"+
		"\7\4\2\2\u05a7\u05a9\5n8\2\u05a8\u05a7\3\2\2\2\u05a9\u05ac\3\2\2\2\u05aa"+
		"\u05a8\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ad\3\2\2\2\u05ac\u05aa\3\2"+
		"\2\2\u05ad\u05af\7\6\2\2\u05ae\u05a5\3\2\2\2\u05ae\u05a6\3\2\2\2\u05af"+
		"\u05b9\3\2\2\2\u05b0\u05b4\7\4\2\2\u05b1\u05b3\5n8\2\u05b2\u05b1\3\2\2"+
		"\2\u05b3\u05b6\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b7"+
		"\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b7\u05b9\7\6\2\2\u05b8\u05a4\3\2\2\2\u05b8"+
		"\u05b0\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bb\b8\1\2\u05bb\u05c6\3\2"+
		"\2\2\u05bc\u05bd\7\21\2\2\u05bd\u05c6\b8\1\2\u05be\u05bf\7\22\2\2\u05bf"+
		"\u05c6\b8\1\2\u05c0\u05c1\7\63\2\2\u05c1\u05c2\5n8\2\u05c2\u05c3\7\64"+
		"\2\2\u05c3\u05c4\b8\1\2\u05c4\u05c6\3\2\2\2\u05c5\u04aa\3\2\2\2\u05c5"+
		"\u04af\3\2\2\2\u05c5\u04b3\3\2\2\2\u05c5\u04b7\3\2\2\2\u05c5\u04bb\3\2"+
		"\2\2\u05c5\u04c3\3\2\2\2\u05c5\u04cb\3\2\2\2\u05c5\u04d3\3\2\2\2\u05c5"+
		"\u04db\3\2\2\2\u05c5\u04e3\3\2\2\2\u05c5\u04eb\3\2\2\2\u05c5\u04f3\3\2"+
		"\2\2\u05c5\u04fa\3\2\2\2\u05c5\u0500\3\2\2\2\u05c5\u0510\3\2\2\2\u05c5"+
		"\u051c\3\2\2\2\u05c5\u0520\3\2\2\2\u05c5\u053a\3\2\2\2\u05c5\u0554\3\2"+
		"\2\2\u05c5\u056e\3\2\2\2\u05c5\u0588\3\2\2\2\u05c5\u05a2\3\2\2\2\u05c5"+
		"\u05bc\3\2\2\2\u05c5\u05be\3\2\2\2\u05c5\u05c0\3\2\2\2\u05c6\u05dd\3\2"+
		"\2\2\u05c7\u05c8\f\17\2\2\u05c8\u05c9\t\n\2\2\u05c9\u05ca\5n8\20\u05ca"+
		"\u05cb\b8\1\2\u05cb\u05dc\3\2\2\2\u05cc\u05cd\f\16\2\2\u05cd\u05ce\t\13"+
		"\2\2\u05ce\u05cf\5n8\17\u05cf\u05d0\b8\1\2\u05d0\u05dc\3\2\2\2\u05d1\u05d2"+
		"\f\r\2\2\u05d2\u05d3\t\f\2\2\u05d3\u05d4\5n8\r\u05d4\u05d5\b8\1\2\u05d5"+
		"\u05dc\3\2\2\2\u05d6\u05d7\f\f\2\2\u05d7\u05d8\t\r\2\2\u05d8\u05d9\5n"+
		"8\f\u05d9\u05da\b8\1\2\u05da\u05dc\3\2\2\2\u05db\u05c7\3\2\2\2\u05db\u05cc"+
		"\3\2\2\2\u05db\u05d1\3\2\2\2\u05db\u05d6\3\2\2\2\u05dc\u05df\3\2\2\2\u05dd"+
		"\u05db\3\2\2\2\u05dd\u05de\3\2\2\2\u05deo\3\2\2\2\u05df\u05dd\3\2\2\2"+
		"\u05e0\u05e1\b9\1\2\u05e1\u05e2\7s\2\2\u05e2\u05e3\5p9\24\u05e3\u05e4"+
		"\b9\1\2\u05e4\u060d\3\2\2\2\u05e5\u05e6\7t\2\2\u05e6\u05e7\5p9\23\u05e7"+
		"\u05e8\b9\1\2\u05e8\u060d\3\2\2\2\u05e9\u05ea\7\67\2\2\u05ea\u05eb\5p"+
		"9\22\u05eb\u05ec\b9\1\2\u05ec\u060d\3\2\2\2\u05ed\u05ee\7\4\2\2\u05ee"+
		"\u05ef\5|?\2\u05ef\u05f0\7d\2\2\u05f0\u05f1\5n8\2\u05f1\u05f2\7\6\2\2"+
		"\u05f2\u05f3\b9\1\2\u05f3\u060d\3\2\2\2\u05f4\u05f5\7v\2\2\u05f5\u05f6"+
		"\5n8\2\u05f6\u05f7\7w\2\2\u05f7\u05f8\5p9\2\u05f8\u05f9\7x\2\2\u05f9\u05fa"+
		"\5p9\t\u05fa\u05fb\b9\1\2\u05fb\u060d\3\2\2\2\u05fc\u05fd\7y\2\2\u05fd"+
		"\u060d\b9\1\2\u05fe\u05ff\7z\2\2\u05ff\u060d\b9\1\2\u0600\u0601\7{\2\2"+
		"\u0601\u060d\b9\1\2\u0602\u0603\7|\2\2\u0603\u060d\b9\1\2\u0604\u0605"+
		"\7\63\2\2\u0605\u0606\5p9\2\u0606\u0607\7\64\2\2\u0607\u0608\b9\1\2\u0608"+
		"\u060d\3\2\2\2\u0609\u060a\5Z.\2\u060a\u060b\b9\1\2\u060b\u060d\3\2\2"+
		"\2\u060c\u05e0\3\2\2\2\u060c\u05e5\3\2\2\2\u060c\u05e9\3\2\2\2\u060c\u05ed"+
		"\3\2\2\2\u060c\u05f4\3\2\2\2\u060c\u05fc\3\2\2\2\u060c\u05fe\3\2\2\2\u060c"+
		"\u0600\3\2\2\2\u060c\u0602\3\2\2\2\u060c\u0604\3\2\2\2\u060c\u0609\3\2"+
		"\2\2\u060d\u063a\3\2\2\2\u060e\u060f\f\21\2\2\u060f\u0610\7\23\2\2\u0610"+
		"\u0611\5p9\22\u0611\u0612\b9\1\2\u0612\u0639\3\2\2\2\u0613\u0614\f\20"+
		"\2\2\u0614\u0615\7E\2\2\u0615\u0616\5p9\21\u0616\u0617\b9\1\2\u0617\u0639"+
		"\3\2\2\2\u0618\u0619\f\17\2\2\u0619\u061a\7\24\2\2\u061a\u061b\5p9\20"+
		"\u061b\u061c\b9\1\2\u061c\u0639\3\2\2\2\u061d\u061e\f\16\2\2\u061e\u061f"+
		"\7\25\2\2\u061f\u0620\5p9\17\u0620\u0621\b9\1\2\u0621\u0639\3\2\2\2\u0622"+
		"\u0624\f\f\2\2\u0623\u0625\5\u0084C\2\u0624\u0623\3\2\2\2\u0624\u0625"+
		"\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0628\7g\2\2\u0627\u0629\5\u0084C\2"+
		"\u0628\u0627\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u062b"+
		"\5p9\f\u062b\u062c\b9\1\2\u062c\u0639\3\2\2\2\u062d\u062e\f\13\2\2\u062e"+
		"\u062f\7u\2\2\u062f\u0630\5p9\f\u0630\u0631\b9\1\2\u0631\u0639\3\2\2\2"+
		"\u0632\u0633\f\r\2\2\u0633\u0634\7\17\2\2\u0634\u0635\5p9\2\u0635\u0636"+
		"\7\20\2\2\u0636\u0637\b9\1\2\u0637\u0639\3\2\2\2\u0638\u060e\3\2\2\2\u0638"+
		"\u0613\3\2\2\2\u0638\u0618\3\2\2\2\u0638\u061d\3\2\2\2\u0638\u0622\3\2"+
		"\2\2\u0638\u062d\3\2\2\2\u0638\u0632\3\2\2\2\u0639\u063c\3\2\2\2\u063a"+
		"\u0638\3\2\2\2\u063a\u063b\3\2\2\2\u063bq\3\2\2\2\u063c\u063a\3\2\2\2"+
		"\u063d\u063e\b:\1\2\u063e\u063f\7v\2\2\u063f\u0640\5n8\2\u0640\u0641\7"+
		"w\2\2\u0641\u0642\5r:\2\u0642\u0643\7x\2\2\u0643\u0644\5r:\f\u0644\u0645"+
		"\b:\1\2\u0645\u0659\3\2\2\2\u0646\u0647\7c\2\2\u0647\u0648\5p9\2\u0648"+
		"\u0649\b:\1\2\u0649\u0659\3\2\2\2\u064a\u064b\7-\2\2\u064b\u064c\5p9\2"+
		"\u064c\u064d\b:\1\2\u064d\u0659\3\2\2\2\u064e\u0650\7\24\2\2\u064f\u064e"+
		"\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0652\7\u0089\2"+
		"\2\u0652\u0659\b:\1\2\u0653\u0654\7\63\2\2\u0654\u0655\5r:\2\u0655\u0656"+
		"\7\64\2\2\u0656\u0657\b:\1\2\u0657\u0659\3\2\2\2\u0658\u063d\3\2\2\2\u0658"+
		"\u0646\3\2\2\2\u0658\u064a\3\2\2\2\u0658\u064f\3\2\2\2\u0658\u0653\3\2"+
		"\2\2\u0659\u0675\3\2\2\2\u065a\u065b\f\t\2\2\u065b\u065c\t\16\2\2\u065c"+
		"\u065d\5r:\n\u065d\u065e\b:\1\2\u065e\u0674\3\2\2\2\u065f\u0660\f\b\2"+
		"\2\u0660\u0661\t\17\2\2\u0661\u0662\5r:\t\u0662\u0663\b:\1\2\u0663\u0674"+
		"\3\2\2\2\u0664\u0665\f\7\2\2\u0665\u0666\t\20\2\2\u0666\u0667\5r:\b\u0667"+
		"\u0668\b:\1\2\u0668\u0674\3\2\2\2\u0669\u066a\f\6\2\2\u066a\u066b\t\21"+
		"\2\2\u066b\u066c\5r:\7\u066c\u066d\b:\1\2\u066d\u0674\3\2\2\2\u066e\u066f"+
		"\f\5\2\2\u066f\u0670\t\22\2\2\u0670\u0671\5r:\6\u0671\u0672\b:\1\2\u0672"+
		"\u0674\3\2\2\2\u0673\u065a\3\2\2\2\u0673\u065f\3\2\2\2\u0673\u0664\3\2"+
		"\2\2\u0673\u0669\3\2\2\2\u0673\u066e\3\2\2\2\u0674\u0677\3\2\2\2\u0675"+
		"\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676s\3\2\2\2\u0677\u0675\3\2\2\2"+
		"\u0678\u067d\5v<\2\u0679\u067a\7\5\2\2\u067a\u067c\5v<\2\u067b\u0679\3"+
		"\2\2\2\u067c\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e"+
		"u\3\2\2\2\u067f\u067d\3\2\2\2\u0680\u0682\7\u0084\2\2\u0681\u0680\3\2"+
		"\2\2\u0681\u0682\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0688\5\u0082B\2\u0684"+
		"\u0685\7\5\2\2\u0685\u0687\5\u0082B\2\u0686\u0684\3\2\2\2\u0687\u068a"+
		"\3\2\2\2\u0688\u0686\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068b\3\2\2\2\u068a"+
		"\u0688\3\2\2\2\u068b\u068d\7\b\2\2\u068c\u068e\7\\\2\2\u068d\u068c\3\2"+
		"\2\2\u068d\u068e\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0690\5p9\2\u0690\u0691"+
		"\b<\1\2\u0691\u06c3\3\2\2\2\u0692\u0694\7\u0084\2\2\u0693\u0692\3\2\2"+
		"\2\u0693\u0694\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u069a\5\u0082B\2\u0696"+
		"\u0697\7\5\2\2\u0697\u0699\5\u0082B\2\u0698\u0696\3\2\2\2\u0699\u069c"+
		"\3\2\2\2\u069a\u0698\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069d\3\2\2\2\u069c"+
		"\u069a\3\2\2\2\u069d\u069e\7\b\2\2\u069e\u069f\7[\2\2\u069f\u06a0\5p9"+
		"\2\u06a0\u06a1\b<\1\2\u06a1\u06c3\3\2\2\2\u06a2\u06a4\7\u0084\2\2\u06a3"+
		"\u06a2\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06aa\5\u0082"+
		"B\2\u06a6\u06a7\7\5\2\2\u06a7\u06a9\5\u0082B\2\u06a8\u06a6\3\2\2\2\u06a9"+
		"\u06ac\3\2\2\2\u06aa\u06a8\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ad\3\2"+
		"\2\2\u06ac\u06aa\3\2\2\2\u06ad\u06ae\7\b\2\2\u06ae\u06af\7]\2\2\u06af"+
		"\u06b0\5p9\2\u06b0\u06b1\b<\1\2\u06b1\u06c3\3\2\2\2\u06b2\u06b4\7\u0084"+
		"\2\2\u06b3\u06b2\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5"+
		"\u06ba\5\u0082B\2\u06b6\u06b7\7\5\2\2\u06b7\u06b9\5\u0082B\2\u06b8\u06b6"+
		"\3\2\2\2\u06b9\u06bc\3\2\2\2\u06ba\u06b8\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb"+
		"\u06bd\3\2\2\2\u06bc\u06ba\3\2\2\2\u06bd\u06be\7\b\2\2\u06be\u06bf\7\u0085"+
		"\2\2\u06bf\u06c0\5p9\2\u06c0\u06c1\b<\1\2\u06c1\u06c3\3\2\2\2\u06c2\u0681"+
		"\3\2\2\2\u06c2\u0693\3\2\2\2\u06c2\u06a3\3\2\2\2\u06c2\u06b3\3\2\2\2\u06c3"+
		"w\3\2\2\2\u06c4\u06c9\5z>\2\u06c5\u06c6\7\5\2\2\u06c6\u06c8\5z>\2\u06c7"+
		"\u06c5\3\2\2\2\u06c8\u06cb\3\2\2\2\u06c9\u06c7\3\2\2\2\u06c9\u06ca\3\2"+
		"\2\2\u06cay\3\2\2\2\u06cb\u06c9\3\2\2\2\u06cc\u06d1\5\u0082B\2\u06cd\u06ce"+
		"\7\5\2\2\u06ce\u06d0\5\u0082B\2\u06cf\u06cd\3\2\2\2\u06d0\u06d3\3\2\2"+
		"\2\u06d1\u06cf\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d4\3\2\2\2\u06d3\u06d1"+
		"\3\2\2\2\u06d4\u06d5\7\31\2\2\u06d5\u06d6\5p9\2\u06d6\u06d7\b>\1\2\u06d7"+
		"{\3\2\2\2\u06d8\u06dd\5~@\2\u06d9\u06da\7\5\2\2\u06da\u06dc\5~@\2\u06db"+
		"\u06d9\3\2\2\2\u06dc\u06df\3\2\2\2\u06dd\u06db\3\2\2\2\u06dd\u06de\3\2"+
		"\2\2\u06de}\3\2\2\2\u06df\u06dd\3\2\2\2\u06e0\u06e2\7\u0084\2\2\u06e1"+
		"\u06e0\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e8\5\u0082"+
		"B\2\u06e4\u06e5\7\5\2\2\u06e5\u06e7\5\u0082B\2\u06e6\u06e4\3\2\2\2\u06e7"+
		"\u06ea\3\2\2\2\u06e8\u06e6\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06eb\3\2"+
		"\2\2\u06ea\u06e8\3\2\2\2\u06eb\u06ed\7\b\2\2\u06ec\u06ee\7\\\2\2\u06ed"+
		"\u06ec\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f0\5p"+
		"9\2\u06f0\u06f1\3\2\2\2\u06f1\u06f2\b@\1\2\u06f2\177\3\2\2\2\u06f3\u06f4"+
		"\5\u0086D\2\u06f4\u0081\3\2\2\2\u06f5\u06f6\5\u0086D\2\u06f6\u06f7\bB"+
		"\1\2\u06f7\u0083\3\2\2\2\u06f8\u06f9\t\23\2\2\u06f9\u0085\3\2\2\2\u06fa"+
		"\u0726\5\u0088E\2\u06fb\u0726\7\32\2\2\u06fc\u0726\7#\2\2\u06fd\u0726"+
		"\7N\2\2\u06fe\u0726\7O\2\2\u06ff\u0726\7\33\2\2\u0700\u0726\7.\2\2\u0701"+
		"\u0726\7<\2\2\u0702\u0726\7\u0086\2\2\u0703\u0726\7V\2\2\u0704\u0726\7"+
		"$\2\2\u0705\u0726\7?\2\2\u0706\u0726\7\u0087\2\2\u0707\u0726\7\35\2\2"+
		"\u0708\u0726\7%\2\2\u0709\u0726\7\27\2\2\u070a\u0726\7U\2\2\u070b\u0726"+
		"\7\34\2\2\u070c\u0726\7\61\2\2\u070d\u0726\7\16\2\2\u070e\u0726\7\62\2"+
		"\2\u070f\u0726\7&\2\2\u0710\u0726\7\30\2\2\u0711\u0726\7S\2\2\u0712\u0726"+
		"\7Q\2\2\u0713\u0726\7;\2\2\u0714\u0726\7,\2\2\u0715\u0726\7\"\2\2\u0716"+
		"\u0726\7B\2\2\u0717\u0726\7\u0088\2\2\u0718\u0726\7/\2\2\u0719\u0726\7"+
		"\36\2\2\u071a\u0726\7\65\2\2\u071b\u0726\7 \2\2\u071c\u0726\7(\2\2\u071d"+
		"\u0726\7*\2\2\u071e\u0726\7!\2\2\u071f\u0726\7P\2\2\u0720\u0726\7@\2\2"+
		"\u0721\u0726\7=\2\2\u0722\u0726\7A\2\2\u0723\u0726\7\16\2\2\u0724\u0726"+
		"\7\f\2\2\u0725\u06fa\3\2\2\2\u0725\u06fb\3\2\2\2\u0725\u06fc\3\2\2\2\u0725"+
		"\u06fd\3\2\2\2\u0725\u06fe\3\2\2\2\u0725\u06ff\3\2\2\2\u0725\u0700\3\2"+
		"\2\2\u0725\u0701\3\2\2\2\u0725\u0702\3\2\2\2\u0725\u0703\3\2\2\2\u0725"+
		"\u0704\3\2\2\2\u0725\u0705\3\2\2\2\u0725\u0706\3\2\2\2\u0725\u0707\3\2"+
		"\2\2\u0725\u0708\3\2\2\2\u0725\u0709\3\2\2\2\u0725\u070a\3\2\2\2\u0725"+
		"\u070b\3\2\2\2\u0725\u070c\3\2\2\2\u0725\u070d\3\2\2\2\u0725\u070e\3\2"+
		"\2\2\u0725\u070f\3\2\2\2\u0725\u0710\3\2\2\2\u0725\u0711\3\2\2\2\u0725"+
		"\u0712\3\2\2\2\u0725\u0713\3\2\2\2\u0725\u0714\3\2\2\2\u0725\u0715\3\2"+
		"\2\2\u0725\u0716\3\2\2\2\u0725\u0717\3\2\2\2\u0725\u0718\3\2\2\2\u0725"+
		"\u0719\3\2\2\2\u0725\u071a\3\2\2\2\u0725\u071b\3\2\2\2\u0725\u071c\3\2"+
		"\2\2\u0725\u071d\3\2\2\2\u0725\u071e\3\2\2\2\u0725\u071f\3\2\2\2\u0725"+
		"\u0720\3\2\2\2\u0725\u0721\3\2\2\2\u0725\u0722\3\2\2\2\u0725\u0723\3\2"+
		"\2\2\u0725\u0724\3\2\2\2\u0726\u0087\3\2\2\2\u0727\u0728\7\u008a\2\2\u0728"+
		"\u0089\3\2\2\2\u0729\u072a\t\24\2\2\u072a\u008b\3\2\2\2\u072b\u072c\7"+
		"\u0089\2\2\u072c\u008d\3\2\2\2\u00eb\u0095\u00a6\u00ac\u00b1\u00b7\u00bd"+
		"\u00c5\u00ce\u00d4\u00de\u00e9\u00ef\u00f1\u00f5\u00fd\u010a\u0111\u0116"+
		"\u0119\u0123\u012a\u0130\u013c\u0143\u015e\u0160\u0165\u0170\u0173\u0177"+
		"\u017b\u017f\u0184\u018d\u0190\u0195\u01a5\u01a7\u01ac\u01b4\u01b7\u01bb"+
		"\u01bf\u01c2\u01c5\u01c8\u01d0\u01d5\u01e1\u01e4\u01e8\u01eb\u01f3\u01fc"+
		"\u0203\u0208\u020d\u0211\u0215\u0218\u021b\u021e\u0225\u022b\u0230\u023e"+
		"\u0241\u0245\u0248\u0251\u0256\u025d\u0266\u026d\u0272\u0277\u027b\u027f"+
		"\u028a\u028d\u0295\u0297\u02a1\u02a4\u02ac\u02af\u02b3\u02b6\u02c5\u02c7"+
		"\u02cc\u02db\u02e3\u02e6\u02ea\u02ed\u02f3\u02f8\u0300\u0303\u0307\u030d"+
		"\u0311\u0317\u031c\u0322\u0325\u032e\u0330\u0335\u033a\u0341\u0346\u034c"+
		"\u034f\u035b\u035d\u0362\u0369\u036e\u0375\u037b\u037f\u0388\u038d\u039a"+
		"\u039c\u03a1\u03a4\u03a8\u03b2\u03c0\u03cb\u03d8\u03e5\u03e8\u03f2\u03fb"+
		"\u0400\u0408\u0411\u0416\u041b\u041f\u0423\u0428\u0434\u0438\u043d\u0441"+
		"\u0446\u044e\u0450\u0455\u0459\u0462\u0464\u0469\u046d\u0476\u0478\u047d"+
		"\u0481\u0487\u048c\u0490\u0496\u049b\u049f\u04a6\u04bd\u04c5\u04cd\u04d5"+
		"\u04dd\u04e5\u04ed\u0507\u050a\u0528\u052c\u0532\u0536\u0542\u0546\u054c"+
		"\u0550\u055c\u0560\u0566\u056a\u0576\u057a\u0580\u0584\u0590\u0594\u059a"+
		"\u059e\u05aa\u05ae\u05b4\u05b8\u05c5\u05db\u05dd\u060c\u0624\u0628\u0638"+
		"\u063a\u064f\u0658\u0673\u0675\u067d\u0681\u0688\u068d\u0693\u069a\u06a3"+
		"\u06aa\u06b3\u06ba\u06c2\u06c9\u06d1\u06dd\u06e1\u06e8\u06ed\u0725";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}