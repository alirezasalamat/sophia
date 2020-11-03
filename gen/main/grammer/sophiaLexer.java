// Generated from F:/university term 5/compiler/sophia/src/main/grammer\sophia.g4 by ANTLR 4.8
package main.grammer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sophiaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IDENTIFIER=2, POS_INT=3, INT_LITERAL=4, STRING_LITERAL=5, BOOL_LITERAL=6, 
		LPAREN=7, RPAREN=8, LBRACE=9, RBRACE=10, LBRACK=11, RBRACK=12, SEMI=13, 
		COMMA=14, DOT=15, ARROW=16, ASSIGN=17, GT=18, LT=19, NOT=20, TILDE=21, 
		QUESTION=22, COLON=23, EQUAL=24, LE=25, GE=26, NOTEQUAL=27, AND=28, OR=29, 
		INC=30, DEC=31, ADD=32, SUB=33, MUL=34, DIV=35, BITAND=36, BITOR=37, CARET=38, 
		MOD=39, CLASS=40, EXTENDS=41, THIS=42, DEF=43, FUNC=44, RETURN=45, IF=46, 
		ELSE=47, FOR=48, FOREACH=49, CONTINUE=50, BREAK=51, FALSE=52, TRUE=53, 
		INT=54, STRING=55, BOOL=56, VOID=57, LIST=58, IN=59, NULL=60, NEW=61, 
		PRINT=62, COMMENT=63, WS=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "IDENTIFIER", "POS_INT", "INT_LITERAL", "STRING_LITERAL", "BOOL_LITERAL", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ARROW", "ASSIGN", "GT", "LT", "NOT", "TILDE", "QUESTION", "COLON", 
			"EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", 
			"MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "CLASS", "EXTENDS", 
			"THIS", "DEF", "FUNC", "RETURN", "IF", "ELSE", "FOR", "FOREACH", "CONTINUE", 
			"BREAK", "FALSE", "TRUE", "INT", "STRING", "BOOL", "VOID", "LIST", "IN", 
			"NULL", "NEW", "PRINT", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", null, null, null, null, null, "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "','", "'.'", "'->'", "'='", "'>'", "'<'", "'!'", 
			"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
			"'class'", "'extends'", "'this'", "'def'", "'func'", "'return'", "'if'", 
			"'else'", "'for'", "'foreach'", "'continue'", "'break'", "'false'", "'true'", 
			"'int'", "'string'", "'bool'", "'void'", "'list'", "'in'", "'null'", 
			"'new'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "IDENTIFIER", "POS_INT", "INT_LITERAL", "STRING_LITERAL", 
			"BOOL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ARROW", "ASSIGN", "GT", "LT", "NOT", "TILDE", 
			"QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
			"DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", 
			"CLASS", "EXTENDS", "THIS", "DEF", "FUNC", "RETURN", "IF", "ELSE", "FOR", 
			"FOREACH", "CONTINUE", "BREAK", "FALSE", "TRUE", "INT", "STRING", "BOOL", 
			"VOID", "LIST", "IN", "NULL", "NEW", "PRINT", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public sophiaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sophia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u0183\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\3\6\3\u0087\n\3\r\3\16\3\u0088\3\3"+
		"\7\3\u008c\n\3\f\3\16\3\u008f\13\3\3\4\3\4\7\4\u0093\n\4\f\4\16\4\u0096"+
		"\13\4\3\5\3\5\5\5\u009a\n\5\3\6\3\6\6\6\u009e\n\6\r\6\16\6\u009f\3\6\3"+
		"\6\3\7\3\7\5\7\u00a6\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'"+
		"\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,"+
		"\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3"+
		";\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\7"+
		"@\u0174\n@\f@\16@\u0177\13@\3@\3@\3@\3@\3A\6A\u017e\nA\rA\16A\u017f\3"+
		"A\3A\3\u0175\2B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\3\2\b\5\2C\\aac|\6\2\62;C\\"+
		"aac|\3\2\63;\3\2\62;\3\2$$\5\2\13\f\17\17\"\"\2\u018a\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\5\u0086\3\2\2\2\7\u0090"+
		"\3\2\2\2\t\u0099\3\2\2\2\13\u009b\3\2\2\2\r\u00a5\3\2\2\2\17\u00a7\3\2"+
		"\2\2\21\u00a9\3\2\2\2\23\u00ab\3\2\2\2\25\u00ad\3\2\2\2\27\u00af\3\2\2"+
		"\2\31\u00b1\3\2\2\2\33\u00b3\3\2\2\2\35\u00b5\3\2\2\2\37\u00b7\3\2\2\2"+
		"!\u00b9\3\2\2\2#\u00bc\3\2\2\2%\u00be\3\2\2\2\'\u00c0\3\2\2\2)\u00c2\3"+
		"\2\2\2+\u00c4\3\2\2\2-\u00c6\3\2\2\2/\u00c8\3\2\2\2\61\u00ca\3\2\2\2\63"+
		"\u00cd\3\2\2\2\65\u00d0\3\2\2\2\67\u00d3\3\2\2\29\u00d6\3\2\2\2;\u00d9"+
		"\3\2\2\2=\u00dc\3\2\2\2?\u00df\3\2\2\2A\u00e2\3\2\2\2C\u00e4\3\2\2\2E"+
		"\u00e6\3\2\2\2G\u00e8\3\2\2\2I\u00ea\3\2\2\2K\u00ec\3\2\2\2M\u00ee\3\2"+
		"\2\2O\u00f0\3\2\2\2Q\u00f2\3\2\2\2S\u00f8\3\2\2\2U\u0100\3\2\2\2W\u0105"+
		"\3\2\2\2Y\u0109\3\2\2\2[\u010e\3\2\2\2]\u0115\3\2\2\2_\u0118\3\2\2\2a"+
		"\u011d\3\2\2\2c\u0121\3\2\2\2e\u0129\3\2\2\2g\u0132\3\2\2\2i\u0138\3\2"+
		"\2\2k\u013e\3\2\2\2m\u0143\3\2\2\2o\u0147\3\2\2\2q\u014e\3\2\2\2s\u0153"+
		"\3\2\2\2u\u0158\3\2\2\2w\u015d\3\2\2\2y\u0160\3\2\2\2{\u0165\3\2\2\2}"+
		"\u0169\3\2\2\2\177\u016f\3\2\2\2\u0081\u017d\3\2\2\2\u0083\u0084\7%\2"+
		"\2\u0084\4\3\2\2\2\u0085\u0087\t\2\2\2\u0086\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008d\3\2\2\2\u008a"+
		"\u008c\t\3\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\6\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0094"+
		"\t\4\2\2\u0091\u0093\t\5\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\b\3\2\2\2\u0096\u0094\3\2\2\2"+
		"\u0097\u009a\7\62\2\2\u0098\u009a\5\7\4\2\u0099\u0097\3\2\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\n\3\2\2\2\u009b\u009d\7$\2\2\u009c\u009e\n\6\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7$\2\2\u00a2\f\3\2\2\2\u00a3\u00a6"+
		"\5i\65\2\u00a4\u00a6\5k\66\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\16\3\2\2\2\u00a7\u00a8\7*\2\2\u00a8\20\3\2\2\2\u00a9\u00aa\7+\2\2\u00aa"+
		"\22\3\2\2\2\u00ab\u00ac\7}\2\2\u00ac\24\3\2\2\2\u00ad\u00ae\7\177\2\2"+
		"\u00ae\26\3\2\2\2\u00af\u00b0\7]\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7_\2"+
		"\2\u00b2\32\3\2\2\2\u00b3\u00b4\7=\2\2\u00b4\34\3\2\2\2\u00b5\u00b6\7"+
		".\2\2\u00b6\36\3\2\2\2\u00b7\u00b8\7\60\2\2\u00b8 \3\2\2\2\u00b9\u00ba"+
		"\7/\2\2\u00ba\u00bb\7@\2\2\u00bb\"\3\2\2\2\u00bc\u00bd\7?\2\2\u00bd$\3"+
		"\2\2\2\u00be\u00bf\7@\2\2\u00bf&\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1(\3\2"+
		"\2\2\u00c2\u00c3\7#\2\2\u00c3*\3\2\2\2\u00c4\u00c5\7\u0080\2\2\u00c5,"+
		"\3\2\2\2\u00c6\u00c7\7A\2\2\u00c7.\3\2\2\2\u00c8\u00c9\7<\2\2\u00c9\60"+
		"\3\2\2\2\u00ca\u00cb\7?\2\2\u00cb\u00cc\7?\2\2\u00cc\62\3\2\2\2\u00cd"+
		"\u00ce\7>\2\2\u00ce\u00cf\7?\2\2\u00cf\64\3\2\2\2\u00d0\u00d1\7@\2\2\u00d1"+
		"\u00d2\7?\2\2\u00d2\66\3\2\2\2\u00d3\u00d4\7#\2\2\u00d4\u00d5\7?\2\2\u00d5"+
		"8\3\2\2\2\u00d6\u00d7\7(\2\2\u00d7\u00d8\7(\2\2\u00d8:\3\2\2\2\u00d9\u00da"+
		"\7~\2\2\u00da\u00db\7~\2\2\u00db<\3\2\2\2\u00dc\u00dd\7-\2\2\u00dd\u00de"+
		"\7-\2\2\u00de>\3\2\2\2\u00df\u00e0\7/\2\2\u00e0\u00e1\7/\2\2\u00e1@\3"+
		"\2\2\2\u00e2\u00e3\7-\2\2\u00e3B\3\2\2\2\u00e4\u00e5\7/\2\2\u00e5D\3\2"+
		"\2\2\u00e6\u00e7\7,\2\2\u00e7F\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e9H\3\2"+
		"\2\2\u00ea\u00eb\7(\2\2\u00ebJ\3\2\2\2\u00ec\u00ed\7~\2\2\u00edL\3\2\2"+
		"\2\u00ee\u00ef\7`\2\2\u00efN\3\2\2\2\u00f0\u00f1\7\'\2\2\u00f1P\3\2\2"+
		"\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6"+
		"\7u\2\2\u00f6\u00f7\7u\2\2\u00f7R\3\2\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa"+
		"\7z\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7p\2\2\u00fd"+
		"\u00fe\7f\2\2\u00fe\u00ff\7u\2\2\u00ffT\3\2\2\2\u0100\u0101\7v\2\2\u0101"+
		"\u0102\7j\2\2\u0102\u0103\7k\2\2\u0103\u0104\7u\2\2\u0104V\3\2\2\2\u0105"+
		"\u0106\7f\2\2\u0106\u0107\7g\2\2\u0107\u0108\7h\2\2\u0108X\3\2\2\2\u0109"+
		"\u010a\7h\2\2\u010a\u010b\7w\2\2\u010b\u010c\7p\2\2\u010c\u010d\7e\2\2"+
		"\u010dZ\3\2\2\2\u010e\u010f\7t\2\2\u010f\u0110\7g\2\2\u0110\u0111\7v\2"+
		"\2\u0111\u0112\7w\2\2\u0112\u0113\7t\2\2\u0113\u0114\7p\2\2\u0114\\\3"+
		"\2\2\2\u0115\u0116\7k\2\2\u0116\u0117\7h\2\2\u0117^\3\2\2\2\u0118\u0119"+
		"\7g\2\2\u0119\u011a\7n\2\2\u011a\u011b\7u\2\2\u011b\u011c\7g\2\2\u011c"+
		"`\3\2\2\2\u011d\u011e\7h\2\2\u011e\u011f\7q\2\2\u011f\u0120\7t\2\2\u0120"+
		"b\3\2\2\2\u0121\u0122\7h\2\2\u0122\u0123\7q\2\2\u0123\u0124\7t\2\2\u0124"+
		"\u0125\7g\2\2\u0125\u0126\7c\2\2\u0126\u0127\7e\2\2\u0127\u0128\7j\2\2"+
		"\u0128d\3\2\2\2\u0129\u012a\7e\2\2\u012a\u012b\7q\2\2\u012b\u012c\7p\2"+
		"\2\u012c\u012d\7v\2\2\u012d\u012e\7k\2\2\u012e\u012f\7p\2\2\u012f\u0130"+
		"\7w\2\2\u0130\u0131\7g\2\2\u0131f\3\2\2\2\u0132\u0133\7d\2\2\u0133\u0134"+
		"\7t\2\2\u0134\u0135\7g\2\2\u0135\u0136\7c\2\2\u0136\u0137\7m\2\2\u0137"+
		"h\3\2\2\2\u0138\u0139\7h\2\2\u0139\u013a\7c\2\2\u013a\u013b\7n\2\2\u013b"+
		"\u013c\7u\2\2\u013c\u013d\7g\2\2\u013dj\3\2\2\2\u013e\u013f\7v\2\2\u013f"+
		"\u0140\7t\2\2\u0140\u0141\7w\2\2\u0141\u0142\7g\2\2\u0142l\3\2\2\2\u0143"+
		"\u0144\7k\2\2\u0144\u0145\7p\2\2\u0145\u0146\7v\2\2\u0146n\3\2\2\2\u0147"+
		"\u0148\7u\2\2\u0148\u0149\7v\2\2\u0149\u014a\7t\2\2\u014a\u014b\7k\2\2"+
		"\u014b\u014c\7p\2\2\u014c\u014d\7i\2\2\u014dp\3\2\2\2\u014e\u014f\7d\2"+
		"\2\u014f\u0150\7q\2\2\u0150\u0151\7q\2\2\u0151\u0152\7n\2\2\u0152r\3\2"+
		"\2\2\u0153\u0154\7x\2\2\u0154\u0155\7q\2\2\u0155\u0156\7k\2\2\u0156\u0157"+
		"\7f\2\2\u0157t\3\2\2\2\u0158\u0159\7n\2\2\u0159\u015a\7k\2\2\u015a\u015b"+
		"\7u\2\2\u015b\u015c\7v\2\2\u015cv\3\2\2\2\u015d\u015e\7k\2\2\u015e\u015f"+
		"\7p\2\2\u015fx\3\2\2\2\u0160\u0161\7p\2\2\u0161\u0162\7w\2\2\u0162\u0163"+
		"\7n\2\2\u0163\u0164\7n\2\2\u0164z\3\2\2\2\u0165\u0166\7p\2\2\u0166\u0167"+
		"\7g\2\2\u0167\u0168\7y\2\2\u0168|\3\2\2\2\u0169\u016a\7r\2\2\u016a\u016b"+
		"\7t\2\2\u016b\u016c\7k\2\2\u016c\u016d\7p\2\2\u016d\u016e\7v\2\2\u016e"+
		"~\3\2\2\2\u016f\u0170\7\61\2\2\u0170\u0171\7\61\2\2\u0171\u0175\3\2\2"+
		"\2\u0172\u0174\13\2\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0178\u0179\7\f\2\2\u0179\u017a\3\2\2\2\u017a\u017b\b@\2\2\u017b"+
		"\u0080\3\2\2\2\u017c\u017e\t\7\2\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0182\bA\2\2\u0182\u0082\3\2\2\2\r\2\u0086\u0088\u008b\u008d\u0094\u0099"+
		"\u009f\u00a5\u0175\u017f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}