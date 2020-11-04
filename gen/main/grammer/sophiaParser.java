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
		T__0=1, CLASS=2, EXTENDS=3, THIS=4, DEF=5, FUNC=6, RETURN=7, IF=8, ELSE=9, 
		FOR=10, FOREACH=11, CONTINUE=12, BREAK=13, FALSE=14, TRUE=15, INT=16, 
		STRING=17, BOOL=18, VOID=19, LIST=20, IN=21, NULL=22, NEW=23, PRINT=24, 
		IDENTIFIER=25, POS_INT=26, ZERO=27, STRING_LITERAL=28, BOOL_LITERAL=29, 
		LPAREN=30, RPAREN=31, LBRACE=32, RBRACE=33, LBRACK=34, RBRACK=35, SEMI=36, 
		COMMA=37, DOT=38, ARROW=39, ASSIGN=40, GT=41, LT=42, NOT=43, TILDE=44, 
		QUESTION=45, COLON=46, EQUAL=47, LE=48, GE=49, NOTEQUAL=50, AND=51, OR=52, 
		INC=53, DEC=54, ADD=55, SUB=56, MUL=57, DIV=58, BITAND=59, BITOR=60, CARET=61, 
		MOD=62, COMMENT=63, WS=64;
	public static final int
		RULE_sophia = 0, RULE_type = 1, RULE_classDeclaration = 2, RULE_classBody = 3, 
		RULE_classBodyDeclaration = 4, RULE_memberDeclaration = 5, RULE_methodDeclaration = 6, 
		RULE_methodArguements = 7, RULE_methodType = 8, RULE_methodBody = 9, RULE_methodCall = 10, 
		RULE_methodCallBody = 11, RULE_constructorDeclaration = 12, RULE_fieldDeclaration = 13, 
		RULE_variableDeclaration = 14, RULE_variableInitializer = 15, RULE_funcPointerDeclaration = 16, 
		RULE_funcPointerDeclarationBody = 17, RULE_listDeclaration = 18, RULE_listBody = 19, 
		RULE_block = 20, RULE_blockStatements = 21, RULE_blockStatement = 22, 
		RULE_statement = 23, RULE_ifStatement = 24, RULE_condition_block = 25, 
		RULE_statBlock = 26, RULE_statementWithoutTrailingSubstatement = 27, RULE_expStatement = 28, 
		RULE_statementExp = 29, RULE_forStatement = 30, RULE_initialStatement = 31, 
		RULE_updateStatement = 32, RULE_foreachStatement = 33, RULE_breakStatement = 34, 
		RULE_continueStatement = 35, RULE_returnStatement = 36, RULE_assignment = 37, 
		RULE_classAssignment = 38, RULE_listInitializer = 39, RULE_preExp = 40, 
		RULE_postExp = 41, RULE_expr = 42, RULE_literal = 43, RULE_printStatement = 44, 
		RULE_printBody = 45, RULE_emptyStatement = 46, RULE_comment = 47, RULE_intLiteral = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"sophia", "type", "classDeclaration", "classBody", "classBodyDeclaration", 
			"memberDeclaration", "methodDeclaration", "methodArguements", "methodType", 
			"methodBody", "methodCall", "methodCallBody", "constructorDeclaration", 
			"fieldDeclaration", "variableDeclaration", "variableInitializer", "funcPointerDeclaration", 
			"funcPointerDeclarationBody", "listDeclaration", "listBody", "block", 
			"blockStatements", "blockStatement", "statement", "ifStatement", "condition_block", 
			"statBlock", "statementWithoutTrailingSubstatement", "expStatement", 
			"statementExp", "forStatement", "initialStatement", "updateStatement", 
			"foreachStatement", "breakStatement", "continueStatement", "returnStatement", 
			"assignment", "classAssignment", "listInitializer", "preExp", "postExp", 
			"expr", "literal", "printStatement", "printBody", "emptyStatement", "comment", 
			"intLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'class'", "'extends'", "'this'", "'def'", "'func'", "'return'", 
			"'if'", "'else'", "'for'", "'foreach'", "'continue'", "'break'", "'false'", 
			"'true'", "'int'", "'string'", "'bool'", "'void'", "'list'", "'in'", 
			"'null'", "'new'", "'print'", null, null, "'0'", null, null, "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'='", "'>'", 
			"'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
			"'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "CLASS", "EXTENDS", "THIS", "DEF", "FUNC", "RETURN", "IF", 
			"ELSE", "FOR", "FOREACH", "CONTINUE", "BREAK", "FALSE", "TRUE", "INT", 
			"STRING", "BOOL", "VOID", "LIST", "IN", "NULL", "NEW", "PRINT", "IDENTIFIER", 
			"POS_INT", "ZERO", "STRING_LITERAL", "BOOL_LITERAL", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ARROW", 
			"ASSIGN", "GT", "LT", "NOT", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", 
			"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
			"BITAND", "BITOR", "CARET", "MOD", "COMMENT", "WS"
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
			System.out.println("hello");
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(99);
				classDeclaration();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
			setState(107);
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
		public Token id;
		public TerminalNode CLASS() { return getToken(sophiaParser.CLASS, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(sophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(sophiaParser.IDENTIFIER, i);
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
			setState(109);
			match(CLASS);
			setState(110);
			((ClassDeclarationContext)_localctx).id = match(IDENTIFIER);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(111);
				match(EXTENDS);
				setState(112);
				match(IDENTIFIER);
				}
			}

			System.out.println("kir"+ (((ClassDeclarationContext)_localctx).id!=null?((ClassDeclarationContext)_localctx).id.getText():null));
			setState(116);
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
			setState(118);
			match(LBRACE);
			setState(119);
			classBodyDeclaration();
			setState(120);
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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
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
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACE) {
					{
					{
					setState(123);
					block();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << DEF) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
					{
					{
					setState(129);
					memberDeclaration();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				constructorDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
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
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodArguementsContext methodArguements() {
			return getRuleContext(MethodArguementsContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(DEF);
			setState(143);
			methodType();
			setState(144);
			match(IDENTIFIER);
			setState(145);
			match(LPAREN);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(146);
				methodArguements();
				}
			}

			setState(149);
			match(RPAREN);
			setState(150);
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
			setState(152);
			variableDeclaration();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				variableDeclaration();
				}
				}
				setState(159);
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
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
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
		public TerminalNode RBRACE() { return getToken(sophiaParser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(LBRACE);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
				{
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(165);
						variableDeclaration();
						setState(166);
						match(SEMI);
						}
						} 
					}
					setState(172);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(173);
				blockStatements();
				}
			}

			setState(176);
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
		public TerminalNode DOT() { return getToken(sophiaParser.DOT, 0); }
		public List<MethodCallBodyContext> methodCallBody() {
			return getRuleContexts(MethodCallBodyContext.class);
		}
		public MethodCallBodyContext methodCallBody(int i) {
			return getRuleContext(MethodCallBodyContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(178);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(179);
				match(THIS);
				}
				break;
			case 3:
				{
				setState(180);
				methodCallBody();
				}
				break;
			}
			setState(183);
			match(DOT);
			setState(184);
			methodCallBody();
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

	public static class MethodCallBodyContext extends ParserRuleContext {
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
		public MethodCallBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterMethodCallBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitMethodCallBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitMethodCallBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallBodyContext methodCallBody() throws RecognitionException {
		MethodCallBodyContext _localctx = new MethodCallBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodCallBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(IDENTIFIER);
			setState(187);
			match(LPAREN);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
				{
				setState(188);
				expr(0);
				}
			}

			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(191);
				match(COMMA);
				setState(192);
				expr(0);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(sophiaParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodArguementsContext methodArguements() {
			return getRuleContext(MethodArguementsContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(DEF);
			setState(201);
			match(IDENTIFIER);
			setState(202);
			match(LPAREN);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(203);
				methodArguements();
				}
			}

			setState(206);
			match(RPAREN);
			setState(207);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(sophiaParser.SEMI, 0); }
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
		enterRule(_localctx, 26, RULE_fieldDeclaration);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				variableDeclaration();
				setState(210);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				variableInitializer();
				setState(213);
				match(SEMI);
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
		enterRule(_localctx, 28, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(IDENTIFIER);
			setState(218);
			match(COLON);
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				{
				setState(219);
				listDeclaration();
				}
				break;
			case INT:
			case STRING:
			case BOOL:
				{
				setState(220);
				type();
				}
				break;
			case IDENTIFIER:
				{
				setState(221);
				match(IDENTIFIER);
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
		enterRule(_localctx, 30, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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
		enterRule(_localctx, 32, RULE_funcPointerDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(IDENTIFIER);
			setState(227);
			match(COLON);
			setState(228);
			funcPointerDeclarationBody();
			setState(229);
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
		enterRule(_localctx, 34, RULE_funcPointerDeclarationBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(FUNC);
			setState(232);
			match(LT);
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(233);
				match(VOID);
				}
				break;
			case INT:
			case STRING:
			case BOOL:
				{
				{
				setState(234);
				type();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(235);
					match(COMMA);
					setState(236);
					type();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(244);
			match(ARROW);
			setState(245);
			type();
			setState(246);
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
		enterRule(_localctx, 36, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(LIST);
			setState(249);
			match(LPAREN);
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POS_INT:
				{
				{
				setState(250);
				match(POS_INT);
				setState(251);
				match(T__0);
				setState(254);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case STRING:
				case BOOL:
					{
					setState(252);
					type();
					}
					break;
				case LIST:
					{
					setState(253);
					listDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case INT:
			case STRING:
			case BOOL:
			case LIST:
			case IDENTIFIER:
				{
				{
				setState(256);
				listBody();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(257);
					match(COMMA);
					setState(258);
					listBody();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(266);
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
		enterRule(_localctx, 38, RULE_listBody);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				funcPointerDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				listDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
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
		enterRule(_localctx, 40, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(LBRACE);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
				{
				setState(275);
				blockStatements();
				}
			}

			setState(278);
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
		enterRule(_localctx, 42, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(280);
				blockStatement();
				}
				}
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0) );
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
		enterRule(_localctx, 44, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		enterRule(_localctx, 46, RULE_statement);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				forStatement();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				foreachStatement();
				}
				break;
			case THIS:
			case RETURN:
			case CONTINUE:
			case BREAK:
			case PRINT:
			case IDENTIFIER:
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case LPAREN:
			case LBRACE:
			case SEMI:
			case NOT:
			case INC:
			case DEC:
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
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
		enterRule(_localctx, 48, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(IF);
			setState(294);
			condition_block();
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295);
					match(ELSE);
					setState(296);
					match(IF);
					setState(297);
					condition_block();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(303);
				match(ELSE);
				setState(304);
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
		enterRule(_localctx, 50, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			expr(0);
			setState(308);
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
		enterRule(_localctx, 52, RULE_statBlock);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(LBRACE);
				setState(312);
				block();
				setState(313);
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
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
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
		enterRule(_localctx, 54, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				emptyStatement();
				}
				break;
			case THIS:
			case IDENTIFIER:
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case LPAREN:
			case NOT:
			case INC:
			case DEC:
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				expStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(322);
				returnStatement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(323);
				printStatement();
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
			setState(326);
			statementExp();
			setState(327);
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
		enterRule(_localctx, 58, RULE_statementExp);
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				preExp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				postExp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(sophiaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(sophiaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(sophiaParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public StatBlockContext statBlock() {
			return getRuleContext(StatBlockContext.class,0);
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
		enterRule(_localctx, 60, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(FOR);
			setState(336);
			match(LPAREN);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
				{
				setState(337);
				initialStatement();
				}
			}

			setState(340);
			match(SEMI);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
				{
				setState(341);
				expr(0);
				}
			}

			setState(344);
			match(SEMI);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
				{
				setState(345);
				updateStatement();
				}
			}

			setState(348);
			match(RPAREN);
			setState(349);
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
		enterRule(_localctx, 62, RULE_initialStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			assignment();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(352);
				match(COMMA);
				setState(353);
				assignment();
				}
				}
				setState(358);
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
		enterRule(_localctx, 64, RULE_updateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			assignment();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(360);
				match(COMMA);
				setState(361);
				assignment();
				}
				}
				setState(366);
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
		public StatBlockContext statBlock() {
			return getRuleContext(StatBlockContext.class,0);
		}
		public TerminalNode THIS() { return getToken(sophiaParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(sophiaParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 66, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(FOREACH);
			setState(368);
			match(LPAREN);
			setState(369);
			match(IDENTIFIER);
			setState(370);
			match(IN);
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(371);
				match(IDENTIFIER);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(372);
					match(DOT);
					setState(373);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case 2:
				{
				setState(376);
				match(THIS);
				setState(377);
				match(DOT);
				setState(378);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(379);
				expr(0);
				}
				break;
			}
			setState(382);
			match(RPAREN);
			setState(383);
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
			setState(385);
			match(BREAK);
			setState(386);
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
			setState(388);
			match(CONTINUE);
			setState(389);
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
			setState(391);
			match(RETURN);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
				{
				setState(392);
				expr(0);
				}
			}

			setState(395);
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
		public TerminalNode THIS() { return getToken(sophiaParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(sophiaParser.DOT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(sophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(sophiaParser.IDENTIFIER, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(sophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(sophiaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(sophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(sophiaParser.RBRACK, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(sophiaParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(sophiaParser.ASSIGN, i);
		}
		public List<ListInitializerContext> listInitializer() {
			return getRuleContexts(ListInitializerContext.class);
		}
		public ListInitializerContext listInitializer(int i) {
			return getRuleContext(ListInitializerContext.class,i);
		}
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
		}
		public List<ClassAssignmentContext> classAssignment() {
			return getRuleContexts(ClassAssignmentContext.class);
		}
		public ClassAssignmentContext classAssignment(int i) {
			return getRuleContext(ClassAssignmentContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(397);
				match(THIS);
				setState(398);
				match(DOT);
				setState(399);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(400);
				match(IDENTIFIER);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(401);
					match(DOT);
					setState(402);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case 3:
				{
				setState(405);
				expr(0);
				}
				break;
			}
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(408);
				match(LBRACK);
				setState(409);
				expr(0);
				setState(410);
				match(RBRACK);
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(417);
				match(ASSIGN);
				setState(422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(418);
					expr(0);
					}
					break;
				case 2:
					{
					setState(419);
					listInitializer();
					}
					break;
				case 3:
					{
					setState(420);
					methodCall();
					}
					break;
				case 4:
					{
					setState(421);
					classAssignment();
					}
					break;
				}
				}
				}
				setState(426); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ASSIGN );
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
			setState(428);
			match(NEW);
			setState(429);
			match(IDENTIFIER);
			setState(430);
			match(LPAREN);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
				{
				setState(431);
				expr(0);
				}
			}

			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(434);
				match(COMMA);
				setState(435);
				expr(0);
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
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
		public List<ListInitializerContext> listInitializer() {
			return getRuleContexts(ListInitializerContext.class);
		}
		public ListInitializerContext listInitializer(int i) {
			return getRuleContext(ListInitializerContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(LBRACK);
			{
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				{
				setState(444);
				listInitializer();
				}
				break;
			case THIS:
			case IDENTIFIER:
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case LPAREN:
			case NOT:
			case INC:
			case DEC:
			case SUB:
				{
				setState(445);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(448);
				match(COMMA);
				setState(451);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(449);
					listInitializer();
					}
					break;
				case THIS:
				case IDENTIFIER:
				case POS_INT:
				case ZERO:
				case STRING_LITERAL:
				case BOOL_LITERAL:
				case LPAREN:
				case NOT:
				case INC:
				case DEC:
				case SUB:
					{
					setState(450);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(458);
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
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
			setState(460);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(461);
			literal();
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
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
			setState(463);
			literal();
			setState(464);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public TerminalNode NOT() { return getToken(sophiaParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PreExpContext preExp() {
			return getRuleContext(PreExpContext.class,0);
		}
		public PostExpContext postExp() {
			return getRuleContext(PostExpContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(sophiaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(sophiaParser.RBRACK, 0); }
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
		public TerminalNode ASSIGN() { return getToken(sophiaParser.ASSIGN, 0); }
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
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(467);
				match(NOT);
				setState(468);
				expr(10);
				}
				break;
			case 2:
				{
				setState(469);
				preExp();
				}
				break;
			case 3:
				{
				setState(470);
				postExp();
				}
				break;
			case 4:
				{
				setState(471);
				literal();
				setState(476);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(472);
					match(LBRACK);
					setState(473);
					expr(0);
					setState(474);
					match(RBRACK);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(498);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(480);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(481);
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
						setState(482);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(483);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(484);
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
						setState(485);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(486);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(487);
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
						setState(488);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(489);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(490);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << EQUAL) | (1L << NOTEQUAL))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(491);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(492);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(493);
						match(AND);
						setState(494);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(495);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(496);
						match(OR);
						setState(497);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(sophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(sophiaParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACK() { return getToken(sophiaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(sophiaParser.RBRACK, 0); }
		public TerminalNode DOT() { return getToken(sophiaParser.DOT, 0); }
		public TerminalNode THIS() { return getToken(sophiaParser.THIS, 0); }
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
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
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(LPAREN);
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
					{
					setState(504);
					expr(0);
					}
				}

				setState(507);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(IDENTIFIER);
				setState(509);
				match(LBRACK);
				{
				setState(510);
				expr(0);
				}
				setState(511);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(514);
				match(DOT);
				setState(515);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(516);
				intLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(517);
				match(BOOL_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(518);
				match(IDENTIFIER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(519);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(sophiaParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public PrintBodyContext printBody() {
			return getRuleContext(PrintBodyContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(sophiaParser.SEMI, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(PRINT);
			setState(523);
			match(LPAREN);
			setState(524);
			printBody();
			setState(525);
			match(RPAREN);
			setState(526);
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

	public static class PrintBodyContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrintBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrintBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrintBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintBodyContext printBody() throws RecognitionException {
		PrintBodyContext _localctx = new PrintBodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_printBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
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
		enterRule(_localctx, 92, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
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
		enterRule(_localctx, 94, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
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

	public static class IntLiteralContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(sophiaParser.ZERO, 0); }
		public TerminalNode POS_INT() { return getToken(sophiaParser.POS_INT, 0); }
		public TerminalNode SUB() { return getToken(sophiaParser.SUB, 0); }
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_intLiteral);
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(ZERO);
				}
				break;
			case POS_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				match(POS_INT);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
				match(SUB);
				setState(537);
				match(POS_INT);
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
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u021f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\7\2g\n\2"+
		"\f\2\16\2j\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4t\n\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\7\6\177\n\6\f\6\16\6\u0082\13\6\3\6\7\6\u0085\n"+
		"\6\f\6\16\6\u0088\13\6\5\6\u008a\n\6\3\7\3\7\3\7\5\7\u008f\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u0096\n\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u009e\n\t\f\t\16"+
		"\t\u00a1\13\t\3\n\3\n\5\n\u00a5\n\n\3\13\3\13\3\13\3\13\7\13\u00ab\n\13"+
		"\f\13\16\13\u00ae\13\13\3\13\5\13\u00b1\n\13\3\13\3\13\3\f\3\f\3\f\5\f"+
		"\u00b8\n\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00c0\n\r\3\r\3\r\7\r\u00c4\n\r"+
		"\f\r\16\r\u00c7\13\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00cf\n\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00da\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00e1\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u00f0\n\23\f\23\16\23\u00f3\13\23\5\23\u00f5"+
		"\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0101\n\24"+
		"\3\24\3\24\3\24\7\24\u0106\n\24\f\24\16\24\u0109\13\24\5\24\u010b\n\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0113\n\25\3\26\3\26\5\26\u0117\n"+
		"\26\3\26\3\26\3\27\6\27\u011c\n\27\r\27\16\27\u011d\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\5\31\u0126\n\31\3\32\3\32\3\32\3\32\3\32\7\32\u012d\n\32\f"+
		"\32\16\32\u0130\13\32\3\32\3\32\5\32\u0134\n\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\5\34\u013e\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0147\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u0150\n\37\3"+
		" \3 \3 \5 \u0155\n \3 \3 \5 \u0159\n \3 \3 \5 \u015d\n \3 \3 \3 \3!\3"+
		"!\3!\7!\u0165\n!\f!\16!\u0168\13!\3\"\3\"\3\"\7\"\u016d\n\"\f\"\16\"\u0170"+
		"\13\"\3#\3#\3#\3#\3#\3#\3#\5#\u0179\n#\3#\3#\3#\3#\5#\u017f\n#\3#\3#\3"+
		"#\3$\3$\3$\3%\3%\3%\3&\3&\5&\u018c\n&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5"+
		"\'\u0196\n\'\3\'\5\'\u0199\n\'\3\'\3\'\3\'\3\'\7\'\u019f\n\'\f\'\16\'"+
		"\u01a2\13\'\3\'\3\'\3\'\3\'\3\'\5\'\u01a9\n\'\6\'\u01ab\n\'\r\'\16\'\u01ac"+
		"\3(\3(\3(\3(\5(\u01b3\n(\3(\3(\7(\u01b7\n(\f(\16(\u01ba\13(\3(\3(\3)\3"+
		")\3)\5)\u01c1\n)\3)\3)\3)\5)\u01c6\n)\7)\u01c8\n)\f)\16)\u01cb\13)\3)"+
		"\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01df\n,\5,\u01e1"+
		"\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u01f5\n,"+
		"\f,\16,\u01f8\13,\3-\3-\5-\u01fc\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\5-\u020b\n-\3.\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\5\62\u021d\n\62\3\62\2\3V\63\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\t\3\2\22\24\3"+
		"\2\678\4\2;<@@\3\29:\4\2+,\62\63\5\2**\61\61\64\64\4\2\6\6\33\33\2\u0244"+
		"\2d\3\2\2\2\4m\3\2\2\2\6o\3\2\2\2\bx\3\2\2\2\n\u0089\3\2\2\2\f\u008e\3"+
		"\2\2\2\16\u0090\3\2\2\2\20\u009a\3\2\2\2\22\u00a4\3\2\2\2\24\u00a6\3\2"+
		"\2\2\26\u00b7\3\2\2\2\30\u00bc\3\2\2\2\32\u00ca\3\2\2\2\34\u00d9\3\2\2"+
		"\2\36\u00db\3\2\2\2 \u00e2\3\2\2\2\"\u00e4\3\2\2\2$\u00e9\3\2\2\2&\u00fa"+
		"\3\2\2\2(\u0112\3\2\2\2*\u0114\3\2\2\2,\u011b\3\2\2\2.\u011f\3\2\2\2\60"+
		"\u0125\3\2\2\2\62\u0127\3\2\2\2\64\u0135\3\2\2\2\66\u013d\3\2\2\28\u0146"+
		"\3\2\2\2:\u0148\3\2\2\2<\u014f\3\2\2\2>\u0151\3\2\2\2@\u0161\3\2\2\2B"+
		"\u0169\3\2\2\2D\u0171\3\2\2\2F\u0183\3\2\2\2H\u0186\3\2\2\2J\u0189\3\2"+
		"\2\2L\u0198\3\2\2\2N\u01ae\3\2\2\2P\u01bd\3\2\2\2R\u01ce\3\2\2\2T\u01d1"+
		"\3\2\2\2V\u01e0\3\2\2\2X\u020a\3\2\2\2Z\u020c\3\2\2\2\\\u0212\3\2\2\2"+
		"^\u0214\3\2\2\2`\u0216\3\2\2\2b\u021c\3\2\2\2dh\b\2\1\2eg\5\6\4\2fe\3"+
		"\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\2\2\3l\3"+
		"\3\2\2\2mn\t\2\2\2n\5\3\2\2\2op\7\4\2\2ps\7\33\2\2qr\7\5\2\2rt\7\33\2"+
		"\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b\4\1\2vw\5\b\5\2w\7\3\2\2\2xy\7\""+
		"\2\2yz\5\n\6\2z{\7#\2\2{\t\3\2\2\2|\u008a\7&\2\2}\177\5*\26\2~}\3\2\2"+
		"\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u008a\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\5\f\7\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089|\3\2\2\2\u0089\u0080\3\2\2\2\u0089\u0086"+
		"\3\2\2\2\u008a\13\3\2\2\2\u008b\u008f\5\16\b\2\u008c\u008f\5\32\16\2\u008d"+
		"\u008f\5\34\17\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3"+
		"\2\2\2\u008f\r\3\2\2\2\u0090\u0091\7\7\2\2\u0091\u0092\5\22\n\2\u0092"+
		"\u0093\7\33\2\2\u0093\u0095\7 \2\2\u0094\u0096\5\20\t\2\u0095\u0094\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7!\2\2\u0098"+
		"\u0099\5\24\13\2\u0099\17\3\2\2\2\u009a\u009f\5\36\20\2\u009b\u009c\7"+
		"\'\2\2\u009c\u009e\5\36\20\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\21\3\2\2\2\u00a1\u009f\3\2\2"+
		"\2\u00a2\u00a5\5\4\3\2\u00a3\u00a5\7\25\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\23\3\2\2\2\u00a6\u00b0\7\"\2\2\u00a7\u00a8\5\36\20"+
		"\2\u00a8\u00a9\7&\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b1\5,\27\2\u00b0\u00ac\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\25\3\2\2\2\u00b4\u00b8"+
		"\7\33\2\2\u00b5\u00b8\7\6\2\2\u00b6\u00b8\5\30\r\2\u00b7\u00b4\3\2\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba"+
		"\7(\2\2\u00ba\u00bb\5\30\r\2\u00bb\27\3\2\2\2\u00bc\u00bd\7\33\2\2\u00bd"+
		"\u00bf\7 \2\2\u00be\u00c0\5V,\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2"+
		"\2\u00c0\u00c5\3\2\2\2\u00c1\u00c2\7\'\2\2\u00c2\u00c4\5V,\2\u00c3\u00c1"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7!\2\2\u00c9\31\3\2\2\2"+
		"\u00ca\u00cb\7\7\2\2\u00cb\u00cc\7\33\2\2\u00cc\u00ce\7 \2\2\u00cd\u00cf"+
		"\5\20\t\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2"+
		"\u00d0\u00d1\7!\2\2\u00d1\u00d2\5\24\13\2\u00d2\33\3\2\2\2\u00d3\u00d4"+
		"\5\36\20\2\u00d4\u00d5\7&\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d7\5 \21\2"+
		"\u00d7\u00d8\7&\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d6"+
		"\3\2\2\2\u00da\35\3\2\2\2\u00db\u00dc\7\33\2\2\u00dc\u00e0\7\60\2\2\u00dd"+
		"\u00e1\5&\24\2\u00de\u00e1\5\4\3\2\u00df\u00e1\7\33\2\2\u00e0\u00dd\3"+
		"\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\37\3\2\2\2\u00e2"+
		"\u00e3\5L\'\2\u00e3!\3\2\2\2\u00e4\u00e5\7\33\2\2\u00e5\u00e6\7\60\2\2"+
		"\u00e6\u00e7\5$\23\2\u00e7\u00e8\7&\2\2\u00e8#\3\2\2\2\u00e9\u00ea\7\b"+
		"\2\2\u00ea\u00f4\7,\2\2\u00eb\u00f5\7\25\2\2\u00ec\u00f1\5\4\3\2\u00ed"+
		"\u00ee\7\'\2\2\u00ee\u00f0\5\4\3\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f7\7)\2\2\u00f7\u00f8\5\4\3\2\u00f8\u00f9\7+\2\2\u00f9%"+
		"\3\2\2\2\u00fa\u00fb\7\26\2\2\u00fb\u010a\7 \2\2\u00fc\u00fd\7\34\2\2"+
		"\u00fd\u0100\7\3\2\2\u00fe\u0101\5\4\3\2\u00ff\u0101\5&\24\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u010b\3\2\2\2\u0102\u0107\5(\25\2\u0103"+
		"\u0104\7\'\2\2\u0104\u0106\5(\25\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u00fc\3\2\2\2\u010a\u0102\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010d\7!\2\2\u010d\'\3\2\2\2\u010e\u0113\5\36\20\2\u010f\u0113"+
		"\5\"\22\2\u0110\u0113\5&\24\2\u0111\u0113\5\4\3\2\u0112\u010e\3\2\2\2"+
		"\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113)\3"+
		"\2\2\2\u0114\u0116\7\"\2\2\u0115\u0117\5,\27\2\u0116\u0115\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7#\2\2\u0119+\3\2\2\2\u011a"+
		"\u011c\5.\30\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e-\3\2\2\2\u011f\u0120\5\60\31\2\u0120/\3"+
		"\2\2\2\u0121\u0126\5\62\32\2\u0122\u0126\5> \2\u0123\u0126\5D#\2\u0124"+
		"\u0126\58\35\2\u0125\u0121\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0124\3\2\2\2\u0126\61\3\2\2\2\u0127\u0128\7\n\2\2\u0128\u012e"+
		"\5\64\33\2\u0129\u012a\7\13\2\2\u012a\u012b\7\n\2\2\u012b\u012d\5\64\33"+
		"\2\u012c\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0133\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7\13\2\2"+
		"\u0132\u0134\5\66\34\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\63"+
		"\3\2\2\2\u0135\u0136\5V,\2\u0136\u0137\5\66\34\2\u0137\65\3\2\2\2\u0138"+
		"\u013e\5\60\31\2\u0139\u013a\7\"\2\2\u013a\u013b\5*\26\2\u013b\u013c\7"+
		"#\2\2\u013c\u013e\3\2\2\2\u013d\u0138\3\2\2\2\u013d\u0139\3\2\2\2\u013e"+
		"\67\3\2\2\2\u013f\u0147\5*\26\2\u0140\u0147\5^\60\2\u0141\u0147\5:\36"+
		"\2\u0142\u0147\5F$\2\u0143\u0147\5H%\2\u0144\u0147\5J&\2\u0145\u0147\5"+
		"Z.\2\u0146\u013f\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0141\3\2\2\2\u0146"+
		"\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2"+
		"\2\2\u01479\3\2\2\2\u0148\u0149\5<\37\2\u0149\u014a\7&\2\2\u014a;\3\2"+
		"\2\2\u014b\u0150\5L\'\2\u014c\u0150\5R*\2\u014d\u0150\5T+\2\u014e\u0150"+
		"\5\26\f\2\u014f\u014b\3\2\2\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2"+
		"\u014f\u014e\3\2\2\2\u0150=\3\2\2\2\u0151\u0152\7\f\2\2\u0152\u0154\7"+
		" \2\2\u0153\u0155\5@!\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0158\7&\2\2\u0157\u0159\5V,\2\u0158\u0157\3\2\2"+
		"\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\7&\2\2\u015b\u015d"+
		"\5B\"\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u015f\7!\2\2\u015f\u0160\5\66\34\2\u0160?\3\2\2\2\u0161\u0166\5L\'\2"+
		"\u0162\u0163\7\'\2\2\u0163\u0165\5L\'\2\u0164\u0162\3\2\2\2\u0165\u0168"+
		"\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167A\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016e\5L\'\2\u016a\u016b\7\'\2\2\u016b\u016d\5L\'"+
		"\2\u016c\u016a\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016fC\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7\r\2\2\u0172"+
		"\u0173\7 \2\2\u0173\u0174\7\33\2\2\u0174\u017e\7\27\2\2\u0175\u0178\7"+
		"\33\2\2\u0176\u0177\7(\2\2\u0177\u0179\7\33\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017f\3\2\2\2\u017a\u017b\7\6\2\2\u017b\u017c\7("+
		"\2\2\u017c\u017f\7\33\2\2\u017d\u017f\5V,\2\u017e\u0175\3\2\2\2\u017e"+
		"\u017a\3\2\2\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7!"+
		"\2\2\u0181\u0182\5\66\34\2\u0182E\3\2\2\2\u0183\u0184\7\17\2\2\u0184\u0185"+
		"\7&\2\2\u0185G\3\2\2\2\u0186\u0187\7\16\2\2\u0187\u0188\7&\2\2\u0188I"+
		"\3\2\2\2\u0189\u018b\7\t\2\2\u018a\u018c\5V,\2\u018b\u018a\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\7&\2\2\u018eK\3\2\2\2\u018f"+
		"\u0190\7\6\2\2\u0190\u0191\7(\2\2\u0191\u0199\7\33\2\2\u0192\u0195\7\33"+
		"\2\2\u0193\u0194\7(\2\2\u0194\u0196\7\33\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0199\5V,\2\u0198\u018f\3\2\2"+
		"\2\u0198\u0192\3\2\2\2\u0198\u0197\3\2\2\2\u0199\u01a0\3\2\2\2\u019a\u019b"+
		"\7$\2\2\u019b\u019c\5V,\2\u019c\u019d\7%\2\2\u019d\u019f\3\2\2\2\u019e"+
		"\u019a\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01aa\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a8\7*\2\2\u01a4"+
		"\u01a9\5V,\2\u01a5\u01a9\5P)\2\u01a6\u01a9\5\26\f\2\u01a7\u01a9\5N(\2"+
		"\u01a8\u01a4\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7"+
		"\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a3\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01adM\3\2\2\2\u01ae\u01af\7\31\2\2"+
		"\u01af\u01b0\7\33\2\2\u01b0\u01b2\7 \2\2\u01b1\u01b3\5V,\2\u01b2\u01b1"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b8\3\2\2\2\u01b4\u01b5\7\'\2\2\u01b5"+
		"\u01b7\5V,\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2"+
		"\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc"+
		"\7!\2\2\u01bcO\3\2\2\2\u01bd\u01c0\7$\2\2\u01be\u01c1\5P)\2\u01bf\u01c1"+
		"\5V,\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c9\3\2\2\2\u01c2"+
		"\u01c5\7\'\2\2\u01c3\u01c6\5P)\2\u01c4\u01c6\5V,\2\u01c5\u01c3\3\2\2\2"+
		"\u01c5\u01c4\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c2\3\2\2\2\u01c8\u01cb"+
		"\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cc\u01cd\7%\2\2\u01cdQ\3\2\2\2\u01ce\u01cf\t\3\2\2\u01cf"+
		"\u01d0\5X-\2\u01d0S\3\2\2\2\u01d1\u01d2\5X-\2\u01d2\u01d3\t\3\2\2\u01d3"+
		"U\3\2\2\2\u01d4\u01d5\b,\1\2\u01d5\u01d6\7-\2\2\u01d6\u01e1\5V,\f\u01d7"+
		"\u01e1\5R*\2\u01d8\u01e1\5T+\2\u01d9\u01de\5X-\2\u01da\u01db\7$\2\2\u01db"+
		"\u01dc\5V,\2\u01dc\u01dd\7%\2\2\u01dd\u01df\3\2\2\2\u01de\u01da\3\2\2"+
		"\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01d4\3\2\2\2\u01e0\u01d7"+
		"\3\2\2\2\u01e0\u01d8\3\2\2\2\u01e0\u01d9\3\2\2\2\u01e1\u01f6\3\2\2\2\u01e2"+
		"\u01e3\f\13\2\2\u01e3\u01e4\t\4\2\2\u01e4\u01f5\5V,\f\u01e5\u01e6\f\n"+
		"\2\2\u01e6\u01e7\t\5\2\2\u01e7\u01f5\5V,\13\u01e8\u01e9\f\t\2\2\u01e9"+
		"\u01ea\t\6\2\2\u01ea\u01f5\5V,\n\u01eb\u01ec\f\b\2\2\u01ec\u01ed\t\7\2"+
		"\2\u01ed\u01f5\5V,\t\u01ee\u01ef\f\7\2\2\u01ef\u01f0\7\65\2\2\u01f0\u01f5"+
		"\5V,\b\u01f1\u01f2\f\6\2\2\u01f2\u01f3\7\66\2\2\u01f3\u01f5\5V,\7\u01f4"+
		"\u01e2\3\2\2\2\u01f4\u01e5\3\2\2\2\u01f4\u01e8\3\2\2\2\u01f4\u01eb\3\2"+
		"\2\2\u01f4\u01ee\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7W\3\2\2\2\u01f8\u01f6\3\2\2\2"+
		"\u01f9\u01fb\7 \2\2\u01fa\u01fc\5V,\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u020b\7!\2\2\u01fe\u01ff\7\33\2\2\u01ff"+
		"\u0200\7$\2\2\u0200\u0201\5V,\2\u0201\u0202\7%\2\2\u0202\u020b\3\2\2\2"+
		"\u0203\u0204\t\b\2\2\u0204\u0205\7(\2\2\u0205\u020b\7\33\2\2\u0206\u020b"+
		"\5b\62\2\u0207\u020b\7\37\2\2\u0208\u020b\7\33\2\2\u0209\u020b\7\36\2"+
		"\2\u020a\u01f9\3\2\2\2\u020a\u01fe\3\2\2\2\u020a\u0203\3\2\2\2\u020a\u0206"+
		"\3\2\2\2\u020a\u0207\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2\2\u020b"+
		"Y\3\2\2\2\u020c\u020d\7\32\2\2\u020d\u020e\7 \2\2\u020e\u020f\5\\/\2\u020f"+
		"\u0210\7!\2\2\u0210\u0211\7&\2\2\u0211[\3\2\2\2\u0212\u0213\5V,\2\u0213"+
		"]\3\2\2\2\u0214\u0215\7&\2\2\u0215_\3\2\2\2\u0216\u0217\7A\2\2\u0217a"+
		"\3\2\2\2\u0218\u021d\7\35\2\2\u0219\u021d\7\34\2\2\u021a\u021b\7:\2\2"+
		"\u021b\u021d\7\34\2\2\u021c\u0218\3\2\2\2\u021c\u0219\3\2\2\2\u021c\u021a"+
		"\3\2\2\2\u021dc\3\2\2\2:hs\u0080\u0086\u0089\u008e\u0095\u009f\u00a4\u00ac"+
		"\u00b0\u00b7\u00bf\u00c5\u00ce\u00d9\u00e0\u00f1\u00f4\u0100\u0107\u010a"+
		"\u0112\u0116\u011d\u0125\u012e\u0133\u013d\u0146\u014f\u0154\u0158\u015c"+
		"\u0166\u016e\u0178\u017e\u018b\u0195\u0198\u01a0\u01a8\u01ac\u01b2\u01b8"+
		"\u01c0\u01c5\u01c9\u01de\u01e0\u01f4\u01f6\u01fb\u020a\u021c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}