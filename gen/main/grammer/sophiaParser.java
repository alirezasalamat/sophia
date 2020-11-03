// Generated from F:/university term 5/compiler/sophia/src/main/grammer\sophia.g4 by ANTLR 4.8
package main.grammer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sophiaParser extends Parser {
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
	public static final int
		RULE_sophia = 0, RULE_type = 1, RULE_classDeclaration = 2, RULE_classBody = 3, 
		RULE_classBodyDeclaration = 4, RULE_memberDeclaration = 5, RULE_methodDeclaration = 6, 
		RULE_methodArguements = 7, RULE_methodType = 8, RULE_methodBody = 9, RULE_methodCall = 10, 
		RULE_constructorDeclaration = 11, RULE_fieldDeclaration = 12, RULE_variableDeclaration = 13, 
		RULE_variableInitializer = 14, RULE_funcPointerDeclaration = 15, RULE_funcPointerDeclarationBody = 16, 
		RULE_listDeclaration = 17, RULE_listBody = 18, RULE_block = 19, RULE_blockStatements = 20, 
		RULE_blockStatement = 21, RULE_statement = 22, RULE_ifStatement = 23, 
		RULE_condition_block = 24, RULE_statBlock = 25, RULE_statementWithoutTrailingSubstatement = 26, 
		RULE_statementExp = 27, RULE_expStatement = 28, RULE_forStatement = 29, 
		RULE_initialStatement = 30, RULE_updateStatement = 31, RULE_foreachStatement = 32, 
		RULE_emptyStatement = 33, RULE_breakStatement = 34, RULE_continueStatement = 35, 
		RULE_returnStatement = 36, RULE_assignment = 37, RULE_classAssignment = 38, 
		RULE_listInitializer = 39, RULE_preExp = 40, RULE_postExp = 41, RULE_expr = 42, 
		RULE_literal = 43, RULE_print_stat = 44, RULE_print_body = 45, RULE_comment = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"sophia", "type", "classDeclaration", "classBody", "classBodyDeclaration", 
			"memberDeclaration", "methodDeclaration", "methodArguements", "methodType", 
			"methodBody", "methodCall", "constructorDeclaration", "fieldDeclaration", 
			"variableDeclaration", "variableInitializer", "funcPointerDeclaration", 
			"funcPointerDeclarationBody", "listDeclaration", "listBody", "block", 
			"blockStatements", "blockStatement", "statement", "ifStatement", "condition_block", 
			"statBlock", "statementWithoutTrailingSubstatement", "statementExp", 
			"expStatement", "forStatement", "initialStatement", "updateStatement", 
			"foreachStatement", "emptyStatement", "breakStatement", "continueStatement", 
			"returnStatement", "assignment", "classAssignment", "listInitializer", 
			"preExp", "postExp", "expr", "literal", "print_stat", "print_body", "comment"
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

	@Override
	public String getGrammarFileName() { return "sophia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sophiaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SophiaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(sophiaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public SophiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sophia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterSophia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitSophia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitSophia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SophiaContext sophia() throws RecognitionException {
		SophiaContext _localctx = new SophiaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sophia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(94);
				classDeclaration();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(EOF);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(sophiaParser.INT, 0); }
		public TerminalNode STRING() { return getToken(sophiaParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(sophiaParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(sophiaParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(sophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(sophiaParser.IDENTIFIER, i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(sophiaParser.EXTENDS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(CLASS);
			setState(105);
			match(IDENTIFIER);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(106);
				match(EXTENDS);
				setState(107);
				match(IDENTIFIER);
				}
			}

			setState(110);
			classBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(sophiaParser.LBRACE, 0); }
		public ClassBodyDeclarationContext classBodyDeclaration() {
			return getRuleContext(ClassBodyDeclarationContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(sophiaParser.RBRACE, 0); }
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(LBRACE);
			setState(113);
			classBodyDeclaration();
			setState(114);
			match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(sophiaParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classBodyDeclaration);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(SEMI);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				block();
				}
				break;
			case IDENTIFIER:
			case THIS:
			case DEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_memberDeclaration);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				constructorDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				fieldDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(sophiaParser.DEF, 0); }
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public MethodArguementsContext methodArguements() {
			return getRuleContext(MethodArguementsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(DEF);
			setState(127);
			methodType();
			setState(128);
			match(IDENTIFIER);
			setState(129);
			match(LPAREN);
			setState(130);
			methodArguements();
			setState(131);
			match(RPAREN);
			setState(132);
			methodBody();
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

	public static class MethodArguementsContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(sophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sophiaParser.COMMA, i);
		}
		public MethodArguementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArguements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterMethodArguements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitMethodArguements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitMethodArguements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArguementsContext methodArguements() throws RecognitionException {
		MethodArguementsContext _localctx = new MethodArguementsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodArguements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			variableDeclaration();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(135);
				match(COMMA);
				setState(136);
				variableDeclaration();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MethodTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(sophiaParser.VOID, 0); }
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterMethodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitMethodType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitMethodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodType);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(VOID);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(sophiaParser.LBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(sophiaParser.RBRACE, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(sophiaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(sophiaParser.SEMI, i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(LBRACE);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					variableDeclaration();
					setState(148);
					match(SEMI);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(155);
			blockStatements();
			setState(156);
			match(RBRACE);
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

	public static class MethodCallContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(sophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(sophiaParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(sophiaParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(sophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sophiaParser.COMMA, i);
		}
		public TerminalNode THIS() { return getToken(sophiaParser.THIS, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodCall);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(IDENTIFIER);
				setState(159);
				match(DOT);
				setState(160);
				match(IDENTIFIER);
				setState(161);
				match(LPAREN);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << NOT) | (1L << THIS))) != 0)) {
					{
					setState(162);
					expr(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				expr(0);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(166);
					match(COMMA);
					setState(167);
					expr(0);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(THIS);
				setState(176);
				match(DOT);
				setState(177);
				match(IDENTIFIER);
				setState(178);
				match(LPAREN);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << NOT) | (1L << THIS))) != 0)) {
					{
					setState(179);
					expr(0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				expr(0);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(183);
					match(COMMA);
					setState(184);
					expr(0);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				match(RPAREN);
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(sophiaParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public MethodArguementsContext methodArguements() {
			return getRuleContext(MethodArguementsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(DEF);
			setState(195);
			match(IDENTIFIER);
			setState(196);
			match(LPAREN);
			setState(197);
			methodArguements();
			setState(198);
			match(RPAREN);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fieldDeclaration);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				variableInitializer();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(sophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(sophiaParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(sophiaParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(sophiaParser.SEMI, 0); }
		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(IDENTIFIER);
			setState(205);
			match(COLON);
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				{
				setState(206);
				listDeclaration();
				}
				break;
			case INT:
			case STRING:
			case BOOL:
				{
				setState(207);
				type();
				}
				break;
			case IDENTIFIER:
				{
				setState(208);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(211);
			match(SEMI);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			assignment();
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

	public static class FuncPointerDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(sophiaParser.COLON, 0); }
		public FuncPointerDeclarationBodyContext funcPointerDeclarationBody() {
			return getRuleContext(FuncPointerDeclarationBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(sophiaParser.SEMI, 0); }
		public FuncPointerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcPointerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterFuncPointerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitFuncPointerDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitFuncPointerDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncPointerDeclarationContext funcPointerDeclaration() throws RecognitionException {
		FuncPointerDeclarationContext _localctx = new FuncPointerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcPointerDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IDENTIFIER);
			setState(216);
			match(COLON);
			setState(217);
			funcPointerDeclarationBody();
			setState(218);
			match(SEMI);
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

	public static class FuncPointerDeclarationBodyContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(sophiaParser.FUNC, 0); }
		public TerminalNode LT() { return getToken(sophiaParser.LT, 0); }
		public TerminalNode ARROW() { return getToken(sophiaParser.ARROW, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(sophiaParser.GT, 0); }
		public TerminalNode VOID() { return getToken(sophiaParser.VOID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(sophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sophiaParser.COMMA, i);
		}
		public FuncPointerDeclarationBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcPointerDeclarationBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterFuncPointerDeclarationBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitFuncPointerDeclarationBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitFuncPointerDeclarationBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncPointerDeclarationBodyContext funcPointerDeclarationBody() throws RecognitionException {
		FuncPointerDeclarationBodyContext _localctx = new FuncPointerDeclarationBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcPointerDeclarationBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(FUNC);
			setState(221);
			match(LT);
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(222);
				match(VOID);
				}
				break;
			case INT:
			case STRING:
			case BOOL:
				{
				{
				setState(223);
				type();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(224);
					match(COMMA);
					setState(225);
					type();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(233);
			match(ARROW);
			setState(234);
			type();
			setState(235);
			match(GT);
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

	public static class ListDeclarationContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(sophiaParser.LIST, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(sophiaParser.SEMI, 0); }
		public TerminalNode POS_INT() { return getToken(sophiaParser.POS_INT, 0); }
		public List<ListBodyContext> listBody() {
			return getRuleContexts(ListBodyContext.class);
		}
		public ListBodyContext listBody(int i) {
			return getRuleContext(ListBodyContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(sophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sophiaParser.COMMA, i);
		}
		public ListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(LIST);
			setState(238);
			match(LPAREN);
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POS_INT:
				{
				{
				setState(239);
				match(POS_INT);
				setState(240);
				match(T__0);
				setState(243);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case STRING:
				case BOOL:
					{
					setState(241);
					type();
					}
					break;
				case LIST:
					{
					setState(242);
					listDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case IDENTIFIER:
			case INT:
			case STRING:
			case BOOL:
			case LIST:
				{
				{
				setState(245);
				listBody();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(246);
					match(COMMA);
					setState(247);
					listBody();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(255);
			match(RPAREN);
			setState(256);
			match(SEMI);
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

	public static class ListBodyContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FuncPointerDeclarationContext funcPointerDeclaration() {
			return getRuleContext(FuncPointerDeclarationContext.class,0);
		}
		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterListBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitListBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitListBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListBodyContext listBody() throws RecognitionException {
		ListBodyContext _localctx = new ListBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listBody);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				funcPointerDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				listDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				type();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(sophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(sophiaParser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(LBRACE);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK))) != 0)) {
				{
				setState(265);
				blockStatements();
				}
			}

			setState(268);
			match(RBRACE);
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

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(270);
				blockStatement();
				}
				}
				setState(273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK))) != 0) );
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

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			statement();
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				forStatement();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				foreachStatement();
				}
				break;
			case IDENTIFIER:
			case INT_LITERAL:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case LPAREN:
			case LBRACE:
			case SEMI:
			case NOT:
			case INC:
			case DEC:
			case THIS:
			case RETURN:
			case CONTINUE:
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				statementWithoutTrailingSubstatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(sophiaParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(sophiaParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(sophiaParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(sophiaParser.ELSE, i);
		}
		public StatBlockContext statBlock() {
			return getRuleContext(StatBlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(IF);
			setState(284);
			condition_block();
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(285);
					match(ELSE);
					setState(286);
					match(IF);
					setState(287);
					condition_block();
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(293);
				match(ELSE);
				setState(294);
				statBlock();
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

	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatBlockContext statBlock() {
			return getRuleContext(StatBlockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			expr(0);
			setState(298);
			statBlock();
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

	public static class StatBlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(sophiaParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(sophiaParser.RBRACE, 0); }
		public StatBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterStatBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitStatBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitStatBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatBlockContext statBlock() throws RecognitionException {
		StatBlockContext _localctx = new StatBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statBlock);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(LBRACE);
				setState(302);
				block();
				setState(303);
				match(RBRACE);
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

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpStatementContext expStatement() {
			return getRuleContext(ExpStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitStatementWithoutTrailingSubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				emptyStatement();
				}
				break;
			case IDENTIFIER:
			case INT_LITERAL:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case LPAREN:
			case NOT:
			case INC:
			case DEC:
			case THIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				expStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(312);
				returnStatement();
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

	public static class StatementExpContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreExpContext preExp() {
			return getRuleContext(PreExpContext.class,0);
		}
		public PostExpContext postExp() {
			return getRuleContext(PostExpContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public StatementExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterStatementExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitStatementExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitStatementExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpContext statementExp() throws RecognitionException {
		StatementExpContext _localctx = new StatementExpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statementExp);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				preExp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				postExp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				methodCall();
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

	public static class ExpStatementContext extends ParserRuleContext {
		public StatementExpContext statementExp() {
			return getRuleContext(StatementExpContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(sophiaParser.SEMI, 0); }
		public ExpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterExpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitExpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitExpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpStatementContext expStatement() throws RecognitionException {
		ExpStatementContext _localctx = new ExpStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			statementExp();
			setState(322);
			match(SEMI);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(sophiaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(sophiaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(sophiaParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InitialStatementContext initialStatement() {
			return getRuleContext(InitialStatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(FOR);
			setState(325);
			match(LPAREN);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==THIS) {
				{
				setState(326);
				initialStatement();
				}
			}

			setState(329);
			match(SEMI);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << NOT) | (1L << THIS))) != 0)) {
				{
				setState(330);
				expr(0);
				}
			}

			setState(333);
			match(SEMI);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==THIS) {
				{
				setState(334);
				updateStatement();
				}
			}

			setState(337);
			match(RPAREN);
			setState(338);
			block();
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

	public static class InitialStatementContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(sophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sophiaParser.COMMA, i);
		}
		public InitialStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterInitialStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitInitialStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitInitialStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialStatementContext initialStatement() throws RecognitionException {
		InitialStatementContext _localctx = new InitialStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_initialStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			assignment();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(341);
				match(COMMA);
				setState(342);
				assignment();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class UpdateStatementContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(sophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sophiaParser.COMMA, i);
		}
		public UpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterUpdateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitUpdateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitUpdateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_updateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			assignment();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(349);
				match(COMMA);
				setState(350);
				assignment();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(sophiaParser.FOREACH, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(sophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(sophiaParser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(sophiaParser.IN, 0); }
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THIS() { return getToken(sophiaParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(sophiaParser.DOT, 0); }
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(FOREACH);
			setState(357);
			match(LPAREN);
			setState(358);
			match(IDENTIFIER);
			setState(359);
			match(IN);
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(360);
				match(IDENTIFIER);
				}
				break;
			case THIS:
				{
				setState(361);
				match(THIS);
				setState(362);
				match(DOT);
				setState(363);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(366);
			match(RPAREN);
			setState(367);
			block();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(sophiaParser.SEMI, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(SEMI);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(sophiaParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(sophiaParser.SEMI, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(BREAK);
			setState(372);
			match(SEMI);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(sophiaParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(sophiaParser.SEMI, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(CONTINUE);
			setState(375);
			match(SEMI);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(sophiaParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(sophiaParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(RETURN);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << NOT) | (1L << THIS))) != 0)) {
				{
				setState(378);
				expr(0);
				}
			}

			setState(381);
			match(SEMI);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(sophiaParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(sophiaParser.SEMI, 0); }
		public TerminalNode THIS() { return getToken(sophiaParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(sophiaParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListInitializerContext listInitializer() {
			return getRuleContext(ListInitializerContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ClassAssignmentContext classAssignment() {
			return getRuleContext(ClassAssignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				{
				setState(383);
				match(THIS);
				setState(384);
				match(DOT);
				setState(385);
				match(IDENTIFIER);
				}
				break;
			case IDENTIFIER:
				{
				setState(386);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(389);
			match(ASSIGN);
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(390);
				expr(0);
				}
				break;
			case 2:
				{
				setState(391);
				listInitializer();
				}
				break;
			case 3:
				{
				setState(392);
				methodCall();
				}
				break;
			case 4:
				{
				setState(393);
				classAssignment();
				}
				break;
			}
			setState(396);
			match(SEMI);
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

	public static class ClassAssignmentContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(sophiaParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(sophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sophiaParser.COMMA, i);
		}
		public ClassAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterClassAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitClassAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitClassAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassAssignmentContext classAssignment() throws RecognitionException {
		ClassAssignmentContext _localctx = new ClassAssignmentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(NEW);
			setState(399);
			match(IDENTIFIER);
			setState(400);
			match(LPAREN);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << NOT) | (1L << THIS))) != 0)) {
				{
				setState(401);
				expr(0);
				}
			}

			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(404);
				match(COMMA);
				setState(405);
				expr(0);
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			match(RPAREN);
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

	public static class ListInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(sophiaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(sophiaParser.RBRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ListInitializerContext> listInitializer() {
			return getRuleContexts(ListInitializerContext.class);
		}
		public ListInitializerContext listInitializer(int i) {
			return getRuleContext(ListInitializerContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(sophiaParser.COMMA, 0); }
		public ListInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterListInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitListInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitListInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListInitializerContext listInitializer() throws RecognitionException {
		ListInitializerContext _localctx = new ListInitializerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_listInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(LBRACK);
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case INT_LITERAL:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case LPAREN:
			case NOT:
			case THIS:
				{
				setState(414);
				expr(0);
				{
				setState(415);
				match(COMMA);
				setState(416);
				expr(0);
				}
				}
				break;
			case LBRACK:
				{
				setState(418);
				listInitializer();
				{
				setState(419);
				match(COMMA);
				setState(420);
				listInitializer();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(424);
			match(RBRACK);
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

	public static class PreExpContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(sophiaParser.SEMI, 0); }
		public TerminalNode DEC() { return getToken(sophiaParser.DEC, 0); }
		public TerminalNode INC() { return getToken(sophiaParser.INC, 0); }
		public PreExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPreExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPreExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPreExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreExpContext preExp() throws RecognitionException {
		PreExpContext _localctx = new PreExpContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_preExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(427);
			match(IDENTIFIER);
			setState(428);
			match(SEMI);
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

	public static class PostExpContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(sophiaParser.SEMI, 0); }
		public TerminalNode DEC() { return getToken(sophiaParser.DEC, 0); }
		public TerminalNode INC() { return getToken(sophiaParser.INC, 0); }
		public PostExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPostExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPostExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPostExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostExpContext postExp() throws RecognitionException {
		PostExpContext _localctx = new PostExpContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_postExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(IDENTIFIER);
			setState(431);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(432);
			match(SEMI);
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

	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public TerminalNode NOT() { return getToken(sophiaParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode MUL() { return getToken(sophiaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(sophiaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(sophiaParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(sophiaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(sophiaParser.SUB, 0); }
		public TerminalNode LE() { return getToken(sophiaParser.LE, 0); }
		public TerminalNode GE() { return getToken(sophiaParser.GE, 0); }
		public TerminalNode LT() { return getToken(sophiaParser.LT, 0); }
		public TerminalNode GT() { return getToken(sophiaParser.GT, 0); }
		public TerminalNode EQUAL() { return getToken(sophiaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(sophiaParser.NOTEQUAL, 0); }
		public TerminalNode AND() { return getToken(sophiaParser.AND, 0); }
		public TerminalNode OR() { return getToken(sophiaParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(435);
				match(NOT);
				setState(436);
				expr(8);
				}
				break;
			case IDENTIFIER:
			case INT_LITERAL:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case LPAREN:
			case THIS:
				{
				setState(437);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(458);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(440);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(441);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(442);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(443);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(444);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(445);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(446);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(447);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(448);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(449);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(450);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(451);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(452);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(453);
						match(AND);
						setState(454);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(455);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(456);
						match(OR);
						setState(457);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(sophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(sophiaParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACK() { return getToken(sophiaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(sophiaParser.RBRACK, 0); }
		public TerminalNode DOT() { return getToken(sophiaParser.DOT, 0); }
		public TerminalNode THIS() { return getToken(sophiaParser.THIS, 0); }
		public TerminalNode INT_LITERAL() { return getToken(sophiaParser.INT_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(sophiaParser.BOOL_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(sophiaParser.STRING_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_literal);
		int _la;
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(LPAREN);
				setState(464);
				expr(0);
				setState(465);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(IDENTIFIER);
				setState(468);
				match(LBRACK);
				{
				setState(469);
				expr(0);
				}
				setState(470);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==THIS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(473);
				match(DOT);
				setState(474);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				match(INT_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(476);
				match(BOOL_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(477);
				match(IDENTIFIER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(478);
				match(STRING_LITERAL);
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

	public static class Print_statContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(sophiaParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public Print_bodyContext print_body() {
			return getRuleContext(Print_bodyContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(sophiaParser.SEMI, 0); }
		public Print_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrint_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrint_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrint_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statContext print_stat() throws RecognitionException {
		Print_statContext _localctx = new Print_statContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_print_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(PRINT);
			setState(482);
			match(LPAREN);
			setState(483);
			print_body();
			setState(484);
			match(RPAREN);
			setState(485);
			match(SEMI);
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

	public static class Print_bodyContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Print_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrint_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrint_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrint_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_bodyContext print_body() throws RecognitionException {
		Print_bodyContext _localctx = new Print_bodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_print_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			expr(0);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(sophiaParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(COMMENT);
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
		case 42:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u01ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\5\4o\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5"+
		"\6z\n\6\3\7\3\7\3\7\5\7\177\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\7\t\u008c\n\t\f\t\16\t\u008f\13\t\3\n\3\n\5\n\u0093\n\n\3\13\3"+
		"\13\3\13\3\13\7\13\u0099\n\13\f\13\16\13\u009c\13\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00a6\n\f\3\f\3\f\3\f\7\f\u00ab\n\f\f\f\16\f\u00ae"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b7\n\f\3\f\3\f\3\f\7\f\u00bc"+
		"\n\f\f\f\16\f\u00bf\13\f\3\f\3\f\5\f\u00c3\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\5\16\u00cd\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00d4\n\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\7\22\u00e5\n\22\f\22\16\22\u00e8\13\22\5\22\u00ea\n\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f6\n\23\3\23\3\23\3\23"+
		"\7\23\u00fb\n\23\f\23\16\23\u00fe\13\23\5\23\u0100\n\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\5\24\u0109\n\24\3\25\3\25\5\25\u010d\n\25\3\25\3"+
		"\25\3\26\6\26\u0112\n\26\r\26\16\26\u0113\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\5\30\u011c\n\30\3\31\3\31\3\31\3\31\3\31\7\31\u0123\n\31\f\31\16\31\u0126"+
		"\13\31\3\31\3\31\5\31\u012a\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u0134\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u013c\n\34\3\35"+
		"\3\35\3\35\3\35\5\35\u0142\n\35\3\36\3\36\3\36\3\37\3\37\3\37\5\37\u014a"+
		"\n\37\3\37\3\37\5\37\u014e\n\37\3\37\3\37\5\37\u0152\n\37\3\37\3\37\3"+
		"\37\3 \3 \3 \7 \u015a\n \f \16 \u015d\13 \3!\3!\3!\7!\u0162\n!\f!\16!"+
		"\u0165\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u016f\n\"\3\"\3\"\3\"\3"+
		"#\3#\3$\3$\3$\3%\3%\3%\3&\3&\5&\u017e\n&\3&\3&\3\'\3\'\3\'\3\'\5\'\u0186"+
		"\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u018d\n\'\3\'\3\'\3(\3(\3(\3(\5(\u0195\n"+
		"(\3(\3(\7(\u0199\n(\f(\16(\u019c\13(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\5)\u01a9\n)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\5,\u01b9\n,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u01cd\n,\f,\16"+
		",\u01d0\13,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01e2\n"+
		"-\3.\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\2\3V\61\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\t\3\28"+
		":\3\2 !\4\2$%))\3\2\"#\4\2\24\25\33\34\4\2\32\32\35\35\4\2\4\4,,\2\u0204"+
		"\2c\3\2\2\2\4h\3\2\2\2\6j\3\2\2\2\br\3\2\2\2\ny\3\2\2\2\f~\3\2\2\2\16"+
		"\u0080\3\2\2\2\20\u0088\3\2\2\2\22\u0092\3\2\2\2\24\u0094\3\2\2\2\26\u00c2"+
		"\3\2\2\2\30\u00c4\3\2\2\2\32\u00cc\3\2\2\2\34\u00ce\3\2\2\2\36\u00d7\3"+
		"\2\2\2 \u00d9\3\2\2\2\"\u00de\3\2\2\2$\u00ef\3\2\2\2&\u0108\3\2\2\2(\u010a"+
		"\3\2\2\2*\u0111\3\2\2\2,\u0115\3\2\2\2.\u011b\3\2\2\2\60\u011d\3\2\2\2"+
		"\62\u012b\3\2\2\2\64\u0133\3\2\2\2\66\u013b\3\2\2\28\u0141\3\2\2\2:\u0143"+
		"\3\2\2\2<\u0146\3\2\2\2>\u0156\3\2\2\2@\u015e\3\2\2\2B\u0166\3\2\2\2D"+
		"\u0173\3\2\2\2F\u0175\3\2\2\2H\u0178\3\2\2\2J\u017b\3\2\2\2L\u0185\3\2"+
		"\2\2N\u0190\3\2\2\2P\u019f\3\2\2\2R\u01ac\3\2\2\2T\u01b0\3\2\2\2V\u01b8"+
		"\3\2\2\2X\u01e1\3\2\2\2Z\u01e3\3\2\2\2\\\u01e9\3\2\2\2^\u01eb\3\2\2\2"+
		"`b\5\6\4\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2"+
		"fg\7\2\2\3g\3\3\2\2\2hi\t\2\2\2i\5\3\2\2\2jk\7*\2\2kn\7\4\2\2lm\7+\2\2"+
		"mo\7\4\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\5\b\5\2q\7\3\2\2\2rs\7\13\2"+
		"\2st\5\n\6\2tu\7\f\2\2u\t\3\2\2\2vz\7\17\2\2wz\5(\25\2xz\5\f\7\2yv\3\2"+
		"\2\2yw\3\2\2\2yx\3\2\2\2z\13\3\2\2\2{\177\5\16\b\2|\177\5\30\r\2}\177"+
		"\5\32\16\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\r\3\2\2\2\u0080\u0081\7-"+
		"\2\2\u0081\u0082\5\22\n\2\u0082\u0083\7\4\2\2\u0083\u0084\7\t\2\2\u0084"+
		"\u0085\5\20\t\2\u0085\u0086\7\n\2\2\u0086\u0087\5\24\13\2\u0087\17\3\2"+
		"\2\2\u0088\u008d\5\34\17\2\u0089\u008a\7\20\2\2\u008a\u008c\5\34\17\2"+
		"\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\21\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0093\5\4\3\2\u0091"+
		"\u0093\7;\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\23\3\2\2\2"+
		"\u0094\u009a\7\13\2\2\u0095\u0096\5\34\17\2\u0096\u0097\7\17\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\5*\26\2\u009e\u009f\7\f\2\2\u009f\25\3\2\2\2\u00a0\u00a1\7\4\2"+
		"\2\u00a1\u00a2\7\21\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a5\7\t\2\2\u00a4"+
		"\u00a6\5V,\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00c3\3\2\2"+
		"\2\u00a7\u00ac\5V,\2\u00a8\u00a9\7\20\2\2\u00a9\u00ab\5V,\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\n\2\2\u00b0\u00c3\3\2"+
		"\2\2\u00b1\u00b2\7,\2\2\u00b2\u00b3\7\21\2\2\u00b3\u00b4\7\4\2\2\u00b4"+
		"\u00b6\7\t\2\2\u00b5\u00b7\5V,\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2"+
		"\2\u00b7\u00c3\3\2\2\2\u00b8\u00bd\5V,\2\u00b9\u00ba\7\20\2\2\u00ba\u00bc"+
		"\5V,\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\n"+
		"\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00a0\3\2\2\2\u00c2\u00a7\3\2\2\2\u00c2"+
		"\u00b1\3\2\2\2\u00c2\u00b8\3\2\2\2\u00c3\27\3\2\2\2\u00c4\u00c5\7-\2\2"+
		"\u00c5\u00c6\7\4\2\2\u00c6\u00c7\7\t\2\2\u00c7\u00c8\5\20\t\2\u00c8\u00c9"+
		"\7\n\2\2\u00c9\31\3\2\2\2\u00ca\u00cd\5\34\17\2\u00cb\u00cd\5\36\20\2"+
		"\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\33\3\2\2\2\u00ce\u00cf"+
		"\7\4\2\2\u00cf\u00d3\7\31\2\2\u00d0\u00d4\5$\23\2\u00d1\u00d4\5\4\3\2"+
		"\u00d2\u00d4\7\4\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\17\2\2\u00d6\35\3\2\2\2\u00d7"+
		"\u00d8\5L\'\2\u00d8\37\3\2\2\2\u00d9\u00da\7\4\2\2\u00da\u00db\7\31\2"+
		"\2\u00db\u00dc\5\"\22\2\u00dc\u00dd\7\17\2\2\u00dd!\3\2\2\2\u00de\u00df"+
		"\7.\2\2\u00df\u00e9\7\25\2\2\u00e0\u00ea\7;\2\2\u00e1\u00e6\5\4\3\2\u00e2"+
		"\u00e3\7\20\2\2\u00e3\u00e5\5\4\3\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3"+
		"\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00e0\3\2\2\2\u00e9\u00e1\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\7\22\2\2\u00ec\u00ed\5\4\3\2\u00ed\u00ee\7\24\2\2\u00ee"+
		"#\3\2\2\2\u00ef\u00f0\7<\2\2\u00f0\u00ff\7\t\2\2\u00f1\u00f2\7\5\2\2\u00f2"+
		"\u00f5\7\3\2\2\u00f3\u00f6\5\4\3\2\u00f4\u00f6\5$\23\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f4\3\2\2\2\u00f6\u0100\3\2\2\2\u00f7\u00fc\5&\24\2\u00f8"+
		"\u00f9\7\20\2\2\u00f9\u00fb\5&\24\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3"+
		"\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u00f1\3\2\2\2\u00ff\u00f7\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0102\7\n\2\2\u0102\u0103\7\17\2\2\u0103%\3\2\2\2\u0104\u0109"+
		"\5\34\17\2\u0105\u0109\5 \21\2\u0106\u0109\5$\23\2\u0107\u0109\5\4\3\2"+
		"\u0108\u0104\3\2\2\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107"+
		"\3\2\2\2\u0109\'\3\2\2\2\u010a\u010c\7\13\2\2\u010b\u010d\5*\26\2\u010c"+
		"\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\f"+
		"\2\2\u010f)\3\2\2\2\u0110\u0112\5,\27\2\u0111\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114+\3\2\2\2\u0115"+
		"\u0116\5.\30\2\u0116-\3\2\2\2\u0117\u011c\5\60\31\2\u0118\u011c\5<\37"+
		"\2\u0119\u011c\5B\"\2\u011a\u011c\5\66\34\2\u011b\u0117\3\2\2\2\u011b"+
		"\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c/\3\2\2\2"+
		"\u011d\u011e\7\60\2\2\u011e\u0124\5\62\32\2\u011f\u0120\7\61\2\2\u0120"+
		"\u0121\7\60\2\2\u0121\u0123\5\62\32\2\u0122\u011f\3\2\2\2\u0123\u0126"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0129\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0127\u0128\7\61\2\2\u0128\u012a\5\64\33\2\u0129\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\61\3\2\2\2\u012b\u012c\5V,\2\u012c"+
		"\u012d\5\64\33\2\u012d\63\3\2\2\2\u012e\u0134\5.\30\2\u012f\u0130\7\13"+
		"\2\2\u0130\u0131\5(\25\2\u0131\u0132\7\f\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u012e\3\2\2\2\u0133\u012f\3\2\2\2\u0134\65\3\2\2\2\u0135\u013c\5(\25"+
		"\2\u0136\u013c\5D#\2\u0137\u013c\5:\36\2\u0138\u013c\5F$\2\u0139\u013c"+
		"\5H%\2\u013a\u013c\5J&\2\u013b\u0135\3\2\2\2\u013b\u0136\3\2\2\2\u013b"+
		"\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2"+
		"\2\2\u013c\67\3\2\2\2\u013d\u0142\5L\'\2\u013e\u0142\5R*\2\u013f\u0142"+
		"\5T+\2\u0140\u0142\5\26\f\2\u0141\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u01429\3\2\2\2\u0143\u0144\58\35\2"+
		"\u0144\u0145\7\17\2\2\u0145;\3\2\2\2\u0146\u0147\7\62\2\2\u0147\u0149"+
		"\7\t\2\2\u0148\u014a\5> \2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014d\7\17\2\2\u014c\u014e\5V,\2\u014d\u014c\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\7\17\2\2\u0150"+
		"\u0152\5@!\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2"+
		"\2\u0153\u0154\7\n\2\2\u0154\u0155\5(\25\2\u0155=\3\2\2\2\u0156\u015b"+
		"\5L\'\2\u0157\u0158\7\20\2\2\u0158\u015a\5L\'\2\u0159\u0157\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c?\3\2\2\2"+
		"\u015d\u015b\3\2\2\2\u015e\u0163\5L\'\2\u015f\u0160\7\20\2\2\u0160\u0162"+
		"\5L\'\2\u0161\u015f\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164A\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7\63\2\2"+
		"\u0167\u0168\7\t\2\2\u0168\u0169\7\4\2\2\u0169\u016e\7=\2\2\u016a\u016f"+
		"\7\4\2\2\u016b\u016c\7,\2\2\u016c\u016d\7\21\2\2\u016d\u016f\7\4\2\2\u016e"+
		"\u016a\3\2\2\2\u016e\u016b\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7\n"+
		"\2\2\u0171\u0172\5(\25\2\u0172C\3\2\2\2\u0173\u0174\7\17\2\2\u0174E\3"+
		"\2\2\2\u0175\u0176\7\65\2\2\u0176\u0177\7\17\2\2\u0177G\3\2\2\2\u0178"+
		"\u0179\7\64\2\2\u0179\u017a\7\17\2\2\u017aI\3\2\2\2\u017b\u017d\7/\2\2"+
		"\u017c\u017e\5V,\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u0180\7\17\2\2\u0180K\3\2\2\2\u0181\u0182\7,\2\2\u0182"+
		"\u0183\7\21\2\2\u0183\u0186\7\4\2\2\u0184\u0186\7\4\2\2\u0185\u0181\3"+
		"\2\2\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018c\7\23\2\2\u0188"+
		"\u018d\5V,\2\u0189\u018d\5P)\2\u018a\u018d\5\26\f\2\u018b\u018d\5N(\2"+
		"\u018c\u0188\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018b"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\7\17\2\2\u018fM\3\2\2\2\u0190"+
		"\u0191\7?\2\2\u0191\u0192\7\4\2\2\u0192\u0194\7\t\2\2\u0193\u0195\5V,"+
		"\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u019a\3\2\2\2\u0196\u0197"+
		"\7\20\2\2\u0197\u0199\5V,\2\u0198\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019d\u019e\7\n\2\2\u019eO\3\2\2\2\u019f\u01a8\7\r\2\2\u01a0\u01a1"+
		"\5V,\2\u01a1\u01a2\7\20\2\2\u01a2\u01a3\5V,\2\u01a3\u01a9\3\2\2\2\u01a4"+
		"\u01a5\5P)\2\u01a5\u01a6\7\20\2\2\u01a6\u01a7\5P)\2\u01a7\u01a9\3\2\2"+
		"\2\u01a8\u01a0\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab"+
		"\7\16\2\2\u01abQ\3\2\2\2\u01ac\u01ad\t\3\2\2\u01ad\u01ae\7\4\2\2\u01ae"+
		"\u01af\7\17\2\2\u01afS\3\2\2\2\u01b0\u01b1\7\4\2\2\u01b1\u01b2\t\3\2\2"+
		"\u01b2\u01b3\7\17\2\2\u01b3U\3\2\2\2\u01b4\u01b5\b,\1\2\u01b5\u01b6\7"+
		"\26\2\2\u01b6\u01b9\5V,\n\u01b7\u01b9\5X-\2\u01b8\u01b4\3\2\2\2\u01b8"+
		"\u01b7\3\2\2\2\u01b9\u01ce\3\2\2\2\u01ba\u01bb\f\t\2\2\u01bb\u01bc\t\4"+
		"\2\2\u01bc\u01cd\5V,\n\u01bd\u01be\f\b\2\2\u01be\u01bf\t\5\2\2\u01bf\u01cd"+
		"\5V,\t\u01c0\u01c1\f\7\2\2\u01c1\u01c2\t\6\2\2\u01c2\u01cd\5V,\b\u01c3"+
		"\u01c4\f\6\2\2\u01c4\u01c5\t\7\2\2\u01c5\u01cd\5V,\7\u01c6\u01c7\f\5\2"+
		"\2\u01c7\u01c8\7\36\2\2\u01c8\u01cd\5V,\6\u01c9\u01ca\f\4\2\2\u01ca\u01cb"+
		"\7\37\2\2\u01cb\u01cd\5V,\5\u01cc\u01ba\3\2\2\2\u01cc\u01bd\3\2\2\2\u01cc"+
		"\u01c0\3\2\2\2\u01cc\u01c3\3\2\2\2\u01cc\u01c6\3\2\2\2\u01cc\u01c9\3\2"+
		"\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"W\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\7\t\2\2\u01d2\u01d3\5V,\2\u01d3"+
		"\u01d4\7\n\2\2\u01d4\u01e2\3\2\2\2\u01d5\u01d6\7\4\2\2\u01d6\u01d7\7\r"+
		"\2\2\u01d7\u01d8\5V,\2\u01d8\u01d9\7\16\2\2\u01d9\u01e2\3\2\2\2\u01da"+
		"\u01db\t\b\2\2\u01db\u01dc\7\21\2\2\u01dc\u01e2\7\4\2\2\u01dd\u01e2\7"+
		"\6\2\2\u01de\u01e2\7\b\2\2\u01df\u01e2\7\4\2\2\u01e0\u01e2\7\7\2\2\u01e1"+
		"\u01d1\3\2\2\2\u01e1\u01d5\3\2\2\2\u01e1\u01da\3\2\2\2\u01e1\u01dd\3\2"+
		"\2\2\u01e1\u01de\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2"+
		"Y\3\2\2\2\u01e3\u01e4\7@\2\2\u01e4\u01e5\7\t\2\2\u01e5\u01e6\5\\/\2\u01e6"+
		"\u01e7\7\n\2\2\u01e7\u01e8\7\17\2\2\u01e8[\3\2\2\2\u01e9\u01ea\5V,\2\u01ea"+
		"]\3\2\2\2\u01eb\u01ec\7A\2\2\u01ec_\3\2\2\2.cny~\u008d\u0092\u009a\u00a5"+
		"\u00ac\u00b6\u00bd\u00c2\u00cc\u00d3\u00e6\u00e9\u00f5\u00fc\u00ff\u0108"+
		"\u010c\u0113\u011b\u0124\u0129\u0133\u013b\u0141\u0149\u014d\u0151\u015b"+
		"\u0163\u016e\u017d\u0185\u018c\u0194\u019a\u01a8\u01b8\u01cc\u01ce\u01e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}