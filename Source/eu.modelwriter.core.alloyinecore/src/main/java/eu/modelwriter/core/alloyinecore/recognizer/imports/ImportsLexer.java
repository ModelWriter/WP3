/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017, Ferhat Erata <ferhat@computer.org>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// Generated from /home/ferhat/IdeaProjects/eu.modelwriter.core.alloyinecore/src/main/java/eu/modelwriter/core/alloyinecore/recognizer/imports/Imports.g4 by ANTLR 4.6
package eu.modelwriter.core.alloyinecore.recognizer.imports;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImportsLexer extends Lexer {
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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, INT=58, IDENTIFIER=59, 
		SINGLE_CHARACTER=60, DOUBLE_QUOTED_STRING=61, SINGLE_QUOTED_STRING=62, 
		ML_SINGLE_QUOTED_STRING=63, MULTILINE_COMMENT=64, SINGLELINE_COMMENT=65, 
		WS=66, ANY=67;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
		"INT", "IDENTIFIER", "SINGLE_CHARACTER", "DOUBLE_QUOTED_STRING", "SINGLE_QUOTED_STRING", 
		"LETTER", "DIGIT", "ESCAPED_CHARACTER", "UNDERSCORE", "APOSTROPHE", "DOLLAR", 
		"EXCLAMINATION_MARK", "MINUS", "ML_SINGLE_QUOTED_STRING", "MULTILINE_COMMENT", 
		"SINGLELINE_COMMENT", "WS", "ANY"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'package'", "':'", "'='", "'{'", "'}'", "';'", "'abstract'", "'class'", 
		"'interface'", "'extends'", "','", "'datatype'", "'enum'", "'public'", 
		"'protected'", "'private'", "'<'", "'>'", "'&'", "'?'", "'super'", "'.'", 
		"'::'", "'@'", "'attribute'", "'body'", "'callable'", "'composes'", "'definition'", 
		"'derivation'", "'derived'", "'ensure'", "'id'", "'import'", "'initial'", 
		"'key'", "'model'", "'operation'", "'ordered'", "'postcondition'", "'precondition'", 
		"'primitive'", "'property'", "'readonly'", "'reference'", "'require'", 
		"'resolve'", "'static'", "'throws'", "'transient'", "'unique'", "'unsettable'", 
		"'volatile'", "'invariant'", "'literal'", "'serializable'", "'annotation'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "INT", "IDENTIFIER", 
		"SINGLE_CHARACTER", "DOUBLE_QUOTED_STRING", "SINGLE_QUOTED_STRING", "ML_SINGLE_QUOTED_STRING", 
		"MULTILINE_COMMENT", "SINGLELINE_COMMENT", "WS", "ANY"
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


	public ImportsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Imports.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2E\u029d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\6;\u022e"+
		"\n;\r;\16;\u022f\3<\3<\5<\u0234\n<\3<\3<\3<\3<\3<\7<\u023b\n<\f<\16<\u023e"+
		"\13<\3=\3=\3=\3=\3>\3>\3>\7>\u0247\n>\f>\16>\u024a\13>\3>\3>\3?\3?\3?"+
		"\7?\u0251\n?\f?\16?\u0254\13?\3?\3?\3@\3@\3A\3A\3B\3B\3B\3C\3C\3D\3D\3"+
		"E\3E\3F\3F\3G\3G\3H\3H\7H\u026b\nH\fH\16H\u026e\13H\3H\3H\3H\3H\3I\3I"+
		"\3I\3I\7I\u0278\nI\fI\16I\u027b\13I\3I\3I\3I\3I\3I\3J\3J\3J\3J\5J\u0286"+
		"\nJ\3J\7J\u0289\nJ\fJ\16J\u028c\13J\3J\5J\u028f\nJ\3J\3J\3J\3J\3K\6K\u0296"+
		"\nK\rK\16K\u0297\3K\3K\3L\3L\5\u026c\u0279\u028a\2M\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008fA\u0091"+
		"B\u0093C\u0095D\u0097E\3\2\b\4\2))^^\4\2$$^^\4\2C\\c|\3\2\62;\n\2$$))"+
		"^^ddhhppttvw\5\2\13\f\17\17\"\"\u02a5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\u008f\3\2"+
		"\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\3"+
		"\u0099\3\2\2\2\5\u00a1\3\2\2\2\7\u00a3\3\2\2\2\t\u00a5\3\2\2\2\13\u00a7"+
		"\3\2\2\2\r\u00a9\3\2\2\2\17\u00ab\3\2\2\2\21\u00b4\3\2\2\2\23\u00ba\3"+
		"\2\2\2\25\u00c4\3\2\2\2\27\u00cc\3\2\2\2\31\u00ce\3\2\2\2\33\u00d7\3\2"+
		"\2\2\35\u00dc\3\2\2\2\37\u00e3\3\2\2\2!\u00ed\3\2\2\2#\u00f5\3\2\2\2%"+
		"\u00f7\3\2\2\2\'\u00f9\3\2\2\2)\u00fb\3\2\2\2+\u00fd\3\2\2\2-\u0103\3"+
		"\2\2\2/\u0105\3\2\2\2\61\u0108\3\2\2\2\63\u010a\3\2\2\2\65\u0114\3\2\2"+
		"\2\67\u0119\3\2\2\29\u0122\3\2\2\2;\u012b\3\2\2\2=\u0136\3\2\2\2?\u0141"+
		"\3\2\2\2A\u0149\3\2\2\2C\u0150\3\2\2\2E\u0153\3\2\2\2G\u015a\3\2\2\2I"+
		"\u0162\3\2\2\2K\u0166\3\2\2\2M\u016c\3\2\2\2O\u0176\3\2\2\2Q\u017e\3\2"+
		"\2\2S\u018c\3\2\2\2U\u0199\3\2\2\2W\u01a3\3\2\2\2Y\u01ac\3\2\2\2[\u01b5"+
		"\3\2\2\2]\u01bf\3\2\2\2_\u01c7\3\2\2\2a\u01cf\3\2\2\2c\u01d6\3\2\2\2e"+
		"\u01dd\3\2\2\2g\u01e7\3\2\2\2i\u01ee\3\2\2\2k\u01f9\3\2\2\2m\u0202\3\2"+
		"\2\2o\u020c\3\2\2\2q\u0214\3\2\2\2s\u0221\3\2\2\2u\u022d\3\2\2\2w\u0233"+
		"\3\2\2\2y\u023f\3\2\2\2{\u0243\3\2\2\2}\u024d\3\2\2\2\177\u0257\3\2\2"+
		"\2\u0081\u0259\3\2\2\2\u0083\u025b\3\2\2\2\u0085\u025e\3\2\2\2\u0087\u0260"+
		"\3\2\2\2\u0089\u0262\3\2\2\2\u008b\u0264\3\2\2\2\u008d\u0266\3\2\2\2\u008f"+
		"\u0268\3\2\2\2\u0091\u0273\3\2\2\2\u0093\u0285\3\2\2\2\u0095\u0295\3\2"+
		"\2\2\u0097\u029b\3\2\2\2\u0099\u009a\7r\2\2\u009a\u009b\7c\2\2\u009b\u009c"+
		"\7e\2\2\u009c\u009d\7m\2\2\u009d\u009e\7c\2\2\u009e\u009f\7i\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\4\3\2\2\2\u00a1\u00a2\7<\2\2\u00a2\6\3\2\2\2\u00a3"+
		"\u00a4\7?\2\2\u00a4\b\3\2\2\2\u00a5\u00a6\7}\2\2\u00a6\n\3\2\2\2\u00a7"+
		"\u00a8\7\177\2\2\u00a8\f\3\2\2\2\u00a9\u00aa\7=\2\2\u00aa\16\3\2\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7d\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7v\2\2"+
		"\u00af\u00b0\7t\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3"+
		"\7v\2\2\u00b3\20\3\2\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7"+
		"\7c\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7u\2\2\u00b9\22\3\2\2\2\u00ba\u00bb"+
		"\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7g\2\2\u00be"+
		"\u00bf\7t\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7e\2\2"+
		"\u00c2\u00c3\7g\2\2\u00c3\24\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7"+
		"z\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca"+
		"\7f\2\2\u00ca\u00cb\7u\2\2\u00cb\26\3\2\2\2\u00cc\u00cd\7.\2\2\u00cd\30"+
		"\3\2\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7{\2\2\u00d4\u00d5\7r\2\2"+
		"\u00d5\u00d6\7g\2\2\u00d6\32\3\2\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7"+
		"p\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7o\2\2\u00db\34\3\2\2\2\u00dc\u00dd"+
		"\7r\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7d\2\2\u00df\u00e0\7n\2\2\u00e0"+
		"\u00e1\7k\2\2\u00e1\u00e2\7e\2\2\u00e2\36\3\2\2\2\u00e3\u00e4\7r\2\2\u00e4"+
		"\u00e5\7t\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8\u00e9\7e\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec"+
		"\7f\2\2\u00ec \3\2\2\2\u00ed\u00ee\7r\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0"+
		"\7k\2\2\u00f0\u00f1\7x\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7v\2\2\u00f3"+
		"\u00f4\7g\2\2\u00f4\"\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6$\3\2\2\2\u00f7"+
		"\u00f8\7@\2\2\u00f8&\3\2\2\2\u00f9\u00fa\7(\2\2\u00fa(\3\2\2\2\u00fb\u00fc"+
		"\7A\2\2\u00fc*\3\2\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100"+
		"\7r\2\2\u0100\u0101\7g\2\2\u0101\u0102\7t\2\2\u0102,\3\2\2\2\u0103\u0104"+
		"\7\60\2\2\u0104.\3\2\2\2\u0105\u0106\7<\2\2\u0106\u0107\7<\2\2\u0107\60"+
		"\3\2\2\2\u0108\u0109\7B\2\2\u0109\62\3\2\2\2\u010a\u010b\7c\2\2\u010b"+
		"\u010c\7v\2\2\u010c\u010d\7v\2\2\u010d\u010e\7t\2\2\u010e\u010f\7k\2\2"+
		"\u010f\u0110\7d\2\2\u0110\u0111\7w\2\2\u0111\u0112\7v\2\2\u0112\u0113"+
		"\7g\2\2\u0113\64\3\2\2\2\u0114\u0115\7d\2\2\u0115\u0116\7q\2\2\u0116\u0117"+
		"\7f\2\2\u0117\u0118\7{\2\2\u0118\66\3\2\2\2\u0119\u011a\7e\2\2\u011a\u011b"+
		"\7c\2\2\u011b\u011c\7n\2\2\u011c\u011d\7n\2\2\u011d\u011e\7c\2\2\u011e"+
		"\u011f\7d\2\2\u011f\u0120\7n\2\2\u0120\u0121\7g\2\2\u01218\3\2\2\2\u0122"+
		"\u0123\7e\2\2\u0123\u0124\7q\2\2\u0124\u0125\7o\2\2\u0125\u0126\7r\2\2"+
		"\u0126\u0127\7q\2\2\u0127\u0128\7u\2\2\u0128\u0129\7g\2\2\u0129\u012a"+
		"\7u\2\2\u012a:\3\2\2\2\u012b\u012c\7f\2\2\u012c\u012d\7g\2\2\u012d\u012e"+
		"\7h\2\2\u012e\u012f\7k\2\2\u012f\u0130\7p\2\2\u0130\u0131\7k\2\2\u0131"+
		"\u0132\7v\2\2\u0132\u0133\7k\2\2\u0133\u0134\7q\2\2\u0134\u0135\7p\2\2"+
		"\u0135<\3\2\2\2\u0136\u0137\7f\2\2\u0137\u0138\7g\2\2\u0138\u0139\7t\2"+
		"\2\u0139\u013a\7k\2\2\u013a\u013b\7x\2\2\u013b\u013c\7c\2\2\u013c\u013d"+
		"\7v\2\2\u013d\u013e\7k\2\2\u013e\u013f\7q\2\2\u013f\u0140\7p\2\2\u0140"+
		">\3\2\2\2\u0141\u0142\7f\2\2\u0142\u0143\7g\2\2\u0143\u0144\7t\2\2\u0144"+
		"\u0145\7k\2\2\u0145\u0146\7x\2\2\u0146\u0147\7g\2\2\u0147\u0148\7f\2\2"+
		"\u0148@\3\2\2\2\u0149\u014a\7g\2\2\u014a\u014b\7p\2\2\u014b\u014c\7u\2"+
		"\2\u014c\u014d\7w\2\2\u014d\u014e\7t\2\2\u014e\u014f\7g\2\2\u014fB\3\2"+
		"\2\2\u0150\u0151\7k\2\2\u0151\u0152\7f\2\2\u0152D\3\2\2\2\u0153\u0154"+
		"\7k\2\2\u0154\u0155\7o\2\2\u0155\u0156\7r\2\2\u0156\u0157\7q\2\2\u0157"+
		"\u0158\7t\2\2\u0158\u0159\7v\2\2\u0159F\3\2\2\2\u015a\u015b\7k\2\2\u015b"+
		"\u015c\7p\2\2\u015c\u015d\7k\2\2\u015d\u015e\7v\2\2\u015e\u015f\7k\2\2"+
		"\u015f\u0160\7c\2\2\u0160\u0161\7n\2\2\u0161H\3\2\2\2\u0162\u0163\7m\2"+
		"\2\u0163\u0164\7g\2\2\u0164\u0165\7{\2\2\u0165J\3\2\2\2\u0166\u0167\7"+
		"o\2\2\u0167\u0168\7q\2\2\u0168\u0169\7f\2\2\u0169\u016a\7g\2\2\u016a\u016b"+
		"\7n\2\2\u016bL\3\2\2\2\u016c\u016d\7q\2\2\u016d\u016e\7r\2\2\u016e\u016f"+
		"\7g\2\2\u016f\u0170\7t\2\2\u0170\u0171\7c\2\2\u0171\u0172\7v\2\2\u0172"+
		"\u0173\7k\2\2\u0173\u0174\7q\2\2\u0174\u0175\7p\2\2\u0175N\3\2\2\2\u0176"+
		"\u0177\7q\2\2\u0177\u0178\7t\2\2\u0178\u0179\7f\2\2\u0179\u017a\7g\2\2"+
		"\u017a\u017b\7t\2\2\u017b\u017c\7g\2\2\u017c\u017d\7f\2\2\u017dP\3\2\2"+
		"\2\u017e\u017f\7r\2\2\u017f\u0180\7q\2\2\u0180\u0181\7u\2\2\u0181\u0182"+
		"\7v\2\2\u0182\u0183\7e\2\2\u0183\u0184\7q\2\2\u0184\u0185\7p\2\2\u0185"+
		"\u0186\7f\2\2\u0186\u0187\7k\2\2\u0187\u0188\7v\2\2\u0188\u0189\7k\2\2"+
		"\u0189\u018a\7q\2\2\u018a\u018b\7p\2\2\u018bR\3\2\2\2\u018c\u018d\7r\2"+
		"\2\u018d\u018e\7t\2\2\u018e\u018f\7g\2\2\u018f\u0190\7e\2\2\u0190\u0191"+
		"\7q\2\2\u0191\u0192\7p\2\2\u0192\u0193\7f\2\2\u0193\u0194\7k\2\2\u0194"+
		"\u0195\7v\2\2\u0195\u0196\7k\2\2\u0196\u0197\7q\2\2\u0197\u0198\7p\2\2"+
		"\u0198T\3\2\2\2\u0199\u019a\7r\2\2\u019a\u019b\7t\2\2\u019b\u019c\7k\2"+
		"\2\u019c\u019d\7o\2\2\u019d\u019e\7k\2\2\u019e\u019f\7v\2\2\u019f\u01a0"+
		"\7k\2\2\u01a0\u01a1\7x\2\2\u01a1\u01a2\7g\2\2\u01a2V\3\2\2\2\u01a3\u01a4"+
		"\7r\2\2\u01a4\u01a5\7t\2\2\u01a5\u01a6\7q\2\2\u01a6\u01a7\7r\2\2\u01a7"+
		"\u01a8\7g\2\2\u01a8\u01a9\7t\2\2\u01a9\u01aa\7v\2\2\u01aa\u01ab\7{\2\2"+
		"\u01abX\3\2\2\2\u01ac\u01ad\7t\2\2\u01ad\u01ae\7g\2\2\u01ae\u01af\7c\2"+
		"\2\u01af\u01b0\7f\2\2\u01b0\u01b1\7q\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3"+
		"\7n\2\2\u01b3\u01b4\7{\2\2\u01b4Z\3\2\2\2\u01b5\u01b6\7t\2\2\u01b6\u01b7"+
		"\7g\2\2\u01b7\u01b8\7h\2\2\u01b8\u01b9\7g\2\2\u01b9\u01ba\7t\2\2\u01ba"+
		"\u01bb\7g\2\2\u01bb\u01bc\7p\2\2\u01bc\u01bd\7e\2\2\u01bd\u01be\7g\2\2"+
		"\u01be\\\3\2\2\2\u01bf\u01c0\7t\2\2\u01c0\u01c1\7g\2\2\u01c1\u01c2\7s"+
		"\2\2\u01c2\u01c3\7w\2\2\u01c3\u01c4\7k\2\2\u01c4\u01c5\7t\2\2\u01c5\u01c6"+
		"\7g\2\2\u01c6^\3\2\2\2\u01c7\u01c8\7t\2\2\u01c8\u01c9\7g\2\2\u01c9\u01ca"+
		"\7u\2\2\u01ca\u01cb\7q\2\2\u01cb\u01cc\7n\2\2\u01cc\u01cd\7x\2\2\u01cd"+
		"\u01ce\7g\2\2\u01ce`\3\2\2\2\u01cf\u01d0\7u\2\2\u01d0\u01d1\7v\2\2\u01d1"+
		"\u01d2\7c\2\2\u01d2\u01d3\7v\2\2\u01d3\u01d4\7k\2\2\u01d4\u01d5\7e\2\2"+
		"\u01d5b\3\2\2\2\u01d6\u01d7\7v\2\2\u01d7\u01d8\7j\2\2\u01d8\u01d9\7t\2"+
		"\2\u01d9\u01da\7q\2\2\u01da\u01db\7y\2\2\u01db\u01dc\7u\2\2\u01dcd\3\2"+
		"\2\2\u01dd\u01de\7v\2\2\u01de\u01df\7t\2\2\u01df\u01e0\7c\2\2\u01e0\u01e1"+
		"\7p\2\2\u01e1\u01e2\7u\2\2\u01e2\u01e3\7k\2\2\u01e3\u01e4\7g\2\2\u01e4"+
		"\u01e5\7p\2\2\u01e5\u01e6\7v\2\2\u01e6f\3\2\2\2\u01e7\u01e8\7w\2\2\u01e8"+
		"\u01e9\7p\2\2\u01e9\u01ea\7k\2\2\u01ea\u01eb\7s\2\2\u01eb\u01ec\7w\2\2"+
		"\u01ec\u01ed\7g\2\2\u01edh\3\2\2\2\u01ee\u01ef\7w\2\2\u01ef\u01f0\7p\2"+
		"\2\u01f0\u01f1\7u\2\2\u01f1\u01f2\7g\2\2\u01f2\u01f3\7v\2\2\u01f3\u01f4"+
		"\7v\2\2\u01f4\u01f5\7c\2\2\u01f5\u01f6\7d\2\2\u01f6\u01f7\7n\2\2\u01f7"+
		"\u01f8\7g\2\2\u01f8j\3\2\2\2\u01f9\u01fa\7x\2\2\u01fa\u01fb\7q\2\2\u01fb"+
		"\u01fc\7n\2\2\u01fc\u01fd\7c\2\2\u01fd\u01fe\7v\2\2\u01fe\u01ff\7k\2\2"+
		"\u01ff\u0200\7n\2\2\u0200\u0201\7g\2\2\u0201l\3\2\2\2\u0202\u0203\7k\2"+
		"\2\u0203\u0204\7p\2\2\u0204\u0205\7x\2\2\u0205\u0206\7c\2\2\u0206\u0207"+
		"\7t\2\2\u0207\u0208\7k\2\2\u0208\u0209\7c\2\2\u0209\u020a\7p\2\2\u020a"+
		"\u020b\7v\2\2\u020bn\3\2\2\2\u020c\u020d\7n\2\2\u020d\u020e\7k\2\2\u020e"+
		"\u020f\7v\2\2\u020f\u0210\7g\2\2\u0210\u0211\7t\2\2\u0211\u0212\7c\2\2"+
		"\u0212\u0213\7n\2\2\u0213p\3\2\2\2\u0214\u0215\7u\2\2\u0215\u0216\7g\2"+
		"\2\u0216\u0217\7t\2\2\u0217\u0218\7k\2\2\u0218\u0219\7c\2\2\u0219\u021a"+
		"\7n\2\2\u021a\u021b\7k\2\2\u021b\u021c\7|\2\2\u021c\u021d\7c\2\2\u021d"+
		"\u021e\7d\2\2\u021e\u021f\7n\2\2\u021f\u0220\7g\2\2\u0220r\3\2\2\2\u0221"+
		"\u0222\7c\2\2\u0222\u0223\7p\2\2\u0223\u0224\7p\2\2\u0224\u0225\7q\2\2"+
		"\u0225\u0226\7v\2\2\u0226\u0227\7c\2\2\u0227\u0228\7v\2\2\u0228\u0229"+
		"\7k\2\2\u0229\u022a\7q\2\2\u022a\u022b\7p\2\2\u022bt\3\2\2\2\u022c\u022e"+
		"\5\u0081A\2\u022d\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u022d\3\2\2"+
		"\2\u022f\u0230\3\2\2\2\u0230v\3\2\2\2\u0231\u0234\5\u0085C\2\u0232\u0234"+
		"\5\177@\2\u0233\u0231\3\2\2\2\u0233\u0232\3\2\2\2\u0234\u023c\3\2\2\2"+
		"\u0235\u023b\5\177@\2\u0236\u023b\5\u0087D\2\u0237\u023b\5\u0081A\2\u0238"+
		"\u023b\5\u0085C\2\u0239\u023b\5\u0089E\2\u023a\u0235\3\2\2\2\u023a\u0236"+
		"\3\2\2\2\u023a\u0237\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u0239\3\2\2\2\u023b"+
		"\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023dx\3\2\2\2"+
		"\u023e\u023c\3\2\2\2\u023f\u0240\7)\2\2\u0240\u0241\n\2\2\2\u0241\u0242"+
		"\7)\2\2\u0242z\3\2\2\2\u0243\u0248\7$\2\2\u0244\u0247\5\u0083B\2\u0245"+
		"\u0247\n\3\2\2\u0246\u0244\3\2\2\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2"+
		"\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024b\u024c\7$\2\2\u024c|\3\2\2\2\u024d\u0252\7)\2\2\u024e"+
		"\u0251\5\u0083B\2\u024f\u0251\n\2\2\2\u0250\u024e\3\2\2\2\u0250\u024f"+
		"\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0255\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256\7)\2\2\u0256~\3\2\2\2\u0257"+
		"\u0258\t\4\2\2\u0258\u0080\3\2\2\2\u0259\u025a\t\5\2\2\u025a\u0082\3\2"+
		"\2\2\u025b\u025c\7^\2\2\u025c\u025d\t\6\2\2\u025d\u0084\3\2\2\2\u025e"+
		"\u025f\7a\2\2\u025f\u0086\3\2\2\2\u0260\u0261\7)\2\2\u0261\u0088\3\2\2"+
		"\2\u0262\u0263\7&\2\2\u0263\u008a\3\2\2\2\u0264\u0265\7#\2\2\u0265\u008c"+
		"\3\2\2\2\u0266\u0267\7/\2\2\u0267\u008e\3\2\2\2\u0268\u026c\7)\2\2\u0269"+
		"\u026b\13\2\2\2\u026a\u0269\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026d\3"+
		"\2\2\2\u026c\u026a\3\2\2\2\u026d\u026f\3\2\2\2\u026e\u026c\3\2\2\2\u026f"+
		"\u0270\7)\2\2\u0270\u0271\3\2\2\2\u0271\u0272\bH\2\2\u0272\u0090\3\2\2"+
		"\2\u0273\u0274\7\61\2\2\u0274\u0275\7,\2\2\u0275\u0279\3\2\2\2\u0276\u0278"+
		"\13\2\2\2\u0277\u0276\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u027a\3\2\2\2"+
		"\u0279\u0277\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027d"+
		"\7,\2\2\u027d\u027e\7\61\2\2\u027e\u027f\3\2\2\2\u027f\u0280\bI\2\2\u0280"+
		"\u0092\3\2\2\2\u0281\u0282\7/\2\2\u0282\u0286\7/\2\2\u0283\u0284\7\61"+
		"\2\2\u0284\u0286\7\61\2\2\u0285\u0281\3\2\2\2\u0285\u0283\3\2\2\2\u0286"+
		"\u028a\3\2\2\2\u0287\u0289\13\2\2\2\u0288\u0287\3\2\2\2\u0289\u028c\3"+
		"\2\2\2\u028a\u028b\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028e\3\2\2\2\u028c"+
		"\u028a\3\2\2\2\u028d\u028f\7\17\2\2\u028e\u028d\3\2\2\2\u028e\u028f\3"+
		"\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\7\f\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0293\bJ\2\2\u0293\u0094\3\2\2\2\u0294\u0296\t\7\2\2\u0295\u0294\3\2"+
		"\2\2\u0296\u0297\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u029a\bK\2\2\u029a\u0096\3\2\2\2\u029b\u029c\13\2"+
		"\2\2\u029c\u0098\3\2\2\2\21\2\u022f\u0233\u023a\u023c\u0246\u0248\u0250"+
		"\u0252\u026c\u0279\u0285\u028a\u028e\u0297\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}