// Generated from /home/ferhat/IdeaProjects/eu.modelwriter.core.alloyinecore/src/main/java/eu/modelwriter/core/alloyinecore/instance/Instance.g4 by ANTLR 4.6
package eu.modelwriter.core.alloyinecore.instance;



import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InstanceParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		INT=18, IDENTIFIER=19, DOUBLE_QUOTED_STRING=20, SINGLE_QUOTED_STRING=21, 
		SINGLE_CHARACTER=22, ML_SINGLE_QUOTED_STRING=23, MULTILINE_COMMENT=24, 
		SINGLELINE_COMMENT=25, WS=26;
	public static final int
		RULE_instance = 0, RULE_packageImport = 1, RULE_modelDeclaration = 2, 
		RULE_object = 3, RULE_className = 4, RULE_content = 5, RULE_dataValue = 6, 
		RULE_multiValueData = 7, RULE_objectReference = 8, RULE_pathName = 9, 
		RULE_segment = 10, RULE_value = 11, RULE_unrestrictedName = 12, RULE_booleanValue = 13, 
		RULE_numericValue = 14, RULE_identifier = 15, RULE_stringValue = 16, RULE_charValue = 17, 
		RULE_nullValue = 18;
	public static final String[] ruleNames = {
		"instance", "packageImport", "modelDeclaration", "object", "className", 
		"content", "dataValue", "multiValueData", "objectReference", "pathName", 
		"segment", "value", "unrestrictedName", "booleanValue", "numericValue", 
		"identifier", "stringValue", "charValue", "nullValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "':'", "';'", "'model'", "'{'", "','", "'}'", "'['", 
		"']'", "'.'", "'::'", "'@'", "'true'", "'false'", "'+'", "'-'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "INT", "IDENTIFIER", "DOUBLE_QUOTED_STRING", 
		"SINGLE_QUOTED_STRING", "SINGLE_CHARACTER", "ML_SINGLE_QUOTED_STRING", 
		"MULTILINE_COMMENT", "SINGLELINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "Instance.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }




	public InstanceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InstanceContext extends ParserRuleContext {
		public ObjectContext rootElement;
		public ModelDeclarationContext modelDeclaration() {
			return getRuleContext(ModelDeclarationContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public List<PackageImportContext> packageImport() {
			return getRuleContexts(PackageImportContext.class);
		}
		public PackageImportContext packageImport(int i) {
			return getRuleContext(PackageImportContext.class,i);
		}
		public InstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceContext instance() throws RecognitionException {
		InstanceContext _localctx = new InstanceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_instance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(38);
				packageImport();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			modelDeclaration();
			setState(45);
			((InstanceContext)_localctx).rootElement = object();
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

	public static class PackageImportContext extends ParserRuleContext {
		public UnrestrictedNameContext name;
		public Token ownedPathName;
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(InstanceParser.SINGLE_QUOTED_STRING, 0); }
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public PackageImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterPackageImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitPackageImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitPackageImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageImportContext packageImport() throws RecognitionException {
		PackageImportContext _localctx = new PackageImportContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(47);
			match(T__0);
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(48);
				((PackageImportContext)_localctx).name = unrestrictedName();
				setState(49);
				match(T__1);
				}
			}

			setState(53);
			((PackageImportContext)_localctx).ownedPathName = match(SINGLE_QUOTED_STRING);
			setState(54);
			match(T__2);
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

	public static class ModelDeclarationContext extends ParserRuleContext {
		public UnrestrictedNameContext name;
		public Token ownedPathName;
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(InstanceParser.SINGLE_QUOTED_STRING, 0); }
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public ModelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterModelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitModelDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitModelDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelDeclarationContext modelDeclaration() throws RecognitionException {
		ModelDeclarationContext _localctx = new ModelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modelDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			match(T__3);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(57);
				((ModelDeclarationContext)_localctx).name = unrestrictedName();
				setState(58);
				match(T__1);
				}
			}

			setState(62);
			((ModelDeclarationContext)_localctx).ownedPathName = match(SINGLE_QUOTED_STRING);
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

	public static class ObjectContext extends ParserRuleContext {
		public ClassNameContext name;
		public ValueContext id;
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((ObjectContext)_localctx).name = className();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << INT) | (1L << IDENTIFIER) | (1L << DOUBLE_QUOTED_STRING) | (1L << SINGLE_CHARACTER))) != 0)) {
				{
				setState(65);
				((ObjectContext)_localctx).id = value();
				}
			}

			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(68);
				match(T__4);
				setState(69);
				content();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(70);
					match(T__5);
					setState(71);
					content();
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(77);
				match(T__6);
				}
				break;
			case T__2:
				{
				setState(79);
				match(T__2);
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

	public static class ClassNameContext extends ParserRuleContext {
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			pathName();
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

	public static class ContentContext extends ParserRuleContext {
		public UnrestrictedNameContext name;
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public DataValueContext dataValue() {
			return getRuleContext(DataValueContext.class,0);
		}
		public ObjectReferenceContext objectReference() {
			return getRuleContext(ObjectReferenceContext.class,0);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((ContentContext)_localctx).name = unrestrictedName();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(85);
				match(T__1);
				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(86);
					dataValue();
					}
					break;
				case 2:
					{
					setState(87);
					match(T__4);
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << IDENTIFIER))) != 0)) {
						{
						{
						setState(88);
						object();
						}
						}
						setState(93);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(94);
					match(T__6);
					}
					break;
				case 3:
					{
					setState(95);
					objectReference();
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MultiValueDataContext multiValueData() {
			return getRuleContext(MultiValueDataContext.class,0);
		}
		public DataValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterDataValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitDataValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitDataValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataValueContext dataValue() throws RecognitionException {
		DataValueContext _localctx = new DataValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dataValue);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case INT:
			case IDENTIFIER:
			case DOUBLE_QUOTED_STRING:
			case SINGLE_CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				value();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				multiValueData();
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
		public DataValueContext dataValue() {
			return getRuleContext(DataValueContext.class,0);
		}
		public List<MultiValueDataContext> multiValueData() {
			return getRuleContexts(MultiValueDataContext.class);
		}
		public MultiValueDataContext multiValueData(int i) {
			return getRuleContext(MultiValueDataContext.class,i);
		}
		public MultiValueDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiValueData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterMultiValueData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitMultiValueData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitMultiValueData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiValueDataContext multiValueData() throws RecognitionException {
		MultiValueDataContext _localctx = new MultiValueDataContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multiValueData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__7);
			setState(105);
			dataValue();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(106);
				match(T__5);
				setState(107);
				multiValueData();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(T__8);
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

	public static class ObjectReferenceContext extends ParserRuleContext {
		public List<PathNameContext> pathName() {
			return getRuleContexts(PathNameContext.class);
		}
		public PathNameContext pathName(int i) {
			return getRuleContext(PathNameContext.class,i);
		}
		public ObjectReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterObjectReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitObjectReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitObjectReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectReferenceContext objectReference() throws RecognitionException {
		ObjectReferenceContext _localctx = new ObjectReferenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_objectReference);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				pathName();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(116);
				match(T__7);
				setState(117);
				pathName();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(118);
					match(T__5);
					setState(119);
					pathName();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				match(T__8);
				}
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

	public static class PathNameContext extends ParserRuleContext {
		public UnrestrictedNameContext firstSegment;
		public Token index;
		public SegmentContext segment;
		public List<SegmentContext> midSegments = new ArrayList<SegmentContext>();
		public SegmentContext lastSegment;
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public TerminalNode INT() { return getToken(InstanceParser.INT, 0); }
		public List<SegmentContext> segment() {
			return getRuleContexts(SegmentContext.class);
		}
		public SegmentContext segment(int i) {
			return getRuleContext(SegmentContext.class,i);
		}
		public PathNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterPathName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitPathName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitPathName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathNameContext pathName() throws RecognitionException {
		PathNameContext _localctx = new PathNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pathName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((PathNameContext)_localctx).firstSegment = unrestrictedName();
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(130);
				match(T__9);
				setState(131);
				((PathNameContext)_localctx).index = match(INT);
				}
				break;
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(134);
						((PathNameContext)_localctx).segment = segment();
						((PathNameContext)_localctx).midSegments.add(((PathNameContext)_localctx).segment);
						}
						} 
					}
					setState(139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(140);
				((PathNameContext)_localctx).lastSegment = segment();
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

	public static class SegmentContext extends ParserRuleContext {
		public UnrestrictedNameContext name;
		public Token index;
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public TerminalNode INT() { return getToken(InstanceParser.INT, 0); }
		public SegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__10);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(144);
				match(T__11);
				}
			}

			setState(147);
			((SegmentContext)_localctx).name = unrestrictedName();
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(148);
				match(T__9);
				setState(149);
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

	public static class ValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumericValueContext numericValue() {
			return getRuleContext(NumericValueContext.class,0);
		}
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public CharValueContext charValue() {
			return getRuleContext(CharValueContext.class,0);
		}
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public NullValueContext nullValue() {
			return getRuleContext(NullValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				identifier();
				}
				break;
			case T__9:
			case T__14:
			case T__15:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				numericValue();
				}
				break;
			case DOUBLE_QUOTED_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				stringValue();
				}
				break;
			case SINGLE_CHARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				charValue();
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				booleanValue();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				nullValue();
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
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterUnrestrictedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitUnrestrictedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitUnrestrictedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnrestrictedNameContext unrestrictedName() throws RecognitionException {
		UnrestrictedNameContext _localctx = new UnrestrictedNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unrestrictedName);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				identifier();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(T__0);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(T__3);
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

	public static class BooleanValueContext extends ParserRuleContext {
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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

	public static class NumericValueContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(InstanceParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(InstanceParser.INT, i);
		}
		public NumericValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterNumericValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitNumericValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitNumericValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericValueContext numericValue() throws RecognitionException {
		NumericValueContext _localctx = new NumericValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numericValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14 || _la==T__15) {
				{
				setState(167);
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

			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(170);
				match(INT);
				}
				break;
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(173);
				match(T__9);
				}
			}

			setState(176);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(InstanceParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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

	public static class StringValueContext extends ParserRuleContext {
		public TerminalNode DOUBLE_QUOTED_STRING() { return getToken(InstanceParser.DOUBLE_QUOTED_STRING, 0); }
		public StringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringValueContext stringValue() throws RecognitionException {
		StringValueContext _localctx = new StringValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stringValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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

	public static class CharValueContext extends ParserRuleContext {
		public TerminalNode SINGLE_CHARACTER() { return getToken(InstanceParser.SINGLE_CHARACTER, 0); }
		public CharValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterCharValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitCharValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitCharValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharValueContext charValue() throws RecognitionException {
		CharValueContext _localctx = new CharValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_charValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(SINGLE_CHARACTER);
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
		public NullValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).enterNullValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InstanceListener ) ((InstanceListener)listener).exitNullValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InstanceVisitor ) return ((InstanceVisitor<? extends T>)visitor).visitNullValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullValueContext nullValue() throws RecognitionException {
		NullValueContext _localctx = new NullValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nullValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__16);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u00bd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\5\3\66\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4?\n\4\3\4\3\4\3\5\3\5"+
		"\5\5E\n\5\3\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3\5\3\5\5\5S\n\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7\3\7\5\7c\n\7"+
		"\5\7e\n\7\3\b\3\b\5\bi\n\b\3\t\3\t\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\n\3\n\5\n\u0082\n\n"+
		"\3\13\3\13\3\13\5\13\u0087\n\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d"+
		"\13\13\3\13\5\13\u0090\n\13\3\f\3\f\5\f\u0094\n\f\3\f\3\f\3\f\5\f\u0099"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a1\n\r\3\16\3\16\3\16\5\16\u00a6\n"+
		"\16\3\17\3\17\3\20\5\20\u00ab\n\20\3\20\5\20\u00ae\n\20\3\20\5\20\u00b1"+
		"\n\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\2\2\25\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\4\3\2\17\20\3\2\21\22\u00c6"+
		"\2+\3\2\2\2\4\61\3\2\2\2\6:\3\2\2\2\bB\3\2\2\2\nT\3\2\2\2\fV\3\2\2\2\16"+
		"h\3\2\2\2\20j\3\2\2\2\22\u0081\3\2\2\2\24\u0083\3\2\2\2\26\u0091\3\2\2"+
		"\2\30\u00a0\3\2\2\2\32\u00a5\3\2\2\2\34\u00a7\3\2\2\2\36\u00aa\3\2\2\2"+
		" \u00b4\3\2\2\2\"\u00b6\3\2\2\2$\u00b8\3\2\2\2&\u00ba\3\2\2\2(*\5\4\3"+
		"\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\5\6\4"+
		"\2/\60\5\b\5\2\60\3\3\2\2\2\61\65\7\3\2\2\62\63\5\32\16\2\63\64\7\4\2"+
		"\2\64\66\3\2\2\2\65\62\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\27\2"+
		"\289\7\5\2\29\5\3\2\2\2:>\7\6\2\2;<\5\32\16\2<=\7\4\2\2=?\3\2\2\2>;\3"+
		"\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\27\2\2A\7\3\2\2\2BD\5\n\6\2CE\5\30\r\2"+
		"DC\3\2\2\2DE\3\2\2\2ER\3\2\2\2FG\7\7\2\2GL\5\f\7\2HI\7\b\2\2IK\5\f\7\2"+
		"JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\t\2\2"+
		"PS\3\2\2\2QS\7\5\2\2RF\3\2\2\2RQ\3\2\2\2S\t\3\2\2\2TU\5\24\13\2U\13\3"+
		"\2\2\2Vd\5\32\16\2Wb\7\4\2\2Xc\5\16\b\2Y]\7\7\2\2Z\\\5\b\5\2[Z\3\2\2\2"+
		"\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`c\7\t\2\2ac\5\22\n"+
		"\2bX\3\2\2\2bY\3\2\2\2ba\3\2\2\2ce\3\2\2\2dW\3\2\2\2de\3\2\2\2e\r\3\2"+
		"\2\2fi\5\30\r\2gi\5\20\t\2hf\3\2\2\2hg\3\2\2\2i\17\3\2\2\2jk\7\n\2\2k"+
		"p\5\16\b\2lm\7\b\2\2mo\5\20\t\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2"+
		"\2qs\3\2\2\2rp\3\2\2\2st\7\13\2\2t\21\3\2\2\2u\u0082\5\24\13\2vw\7\n\2"+
		"\2w|\5\24\13\2xy\7\b\2\2y{\5\24\13\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3"+
		"\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\13\2\2\u0080\u0082\3\2\2\2\u0081"+
		"u\3\2\2\2\u0081v\3\2\2\2\u0082\23\3\2\2\2\u0083\u0086\5\32\16\2\u0084"+
		"\u0085\7\f\2\2\u0085\u0087\7\24\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u008f\3\2\2\2\u0088\u008a\5\26\f\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008e\u0090\5\26\f\2\u008f\u008b\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\25\3\2\2\2\u0091\u0093\7\r\2\2\u0092\u0094\7\16\2"+
		"\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098"+
		"\5\32\16\2\u0096\u0097\7\f\2\2\u0097\u0099\7\24\2\2\u0098\u0096\3\2\2"+
		"\2\u0098\u0099\3\2\2\2\u0099\27\3\2\2\2\u009a\u00a1\5 \21\2\u009b\u00a1"+
		"\5\36\20\2\u009c\u00a1\5\"\22\2\u009d\u00a1\5$\23\2\u009e\u00a1\5\34\17"+
		"\2\u009f\u00a1\5&\24\2\u00a0\u009a\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009c"+
		"\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\31\3\2\2\2\u00a2\u00a6\5 \21\2\u00a3\u00a6\7\3\2\2\u00a4\u00a6\7\6\2"+
		"\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\33"+
		"\3\2\2\2\u00a7\u00a8\t\2\2\2\u00a8\35\3\2\2\2\u00a9\u00ab\t\3\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00ae\7\24"+
		"\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00b1\7\f\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b3\7\24\2\2\u00b3\37\3\2\2\2\u00b4\u00b5\7\25\2\2\u00b5"+
		"!\3\2\2\2\u00b6\u00b7\7\26\2\2\u00b7#\3\2\2\2\u00b8\u00b9\7\30\2\2\u00b9"+
		"%\3\2\2\2\u00ba\u00bb\7\23\2\2\u00bb\'\3\2\2\2\31+\65>DLR]bdhp|\u0081"+
		"\u0086\u008b\u008f\u0093\u0098\u00a0\u00a5\u00aa\u00ad\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}