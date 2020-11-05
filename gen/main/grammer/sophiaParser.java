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
		RULE_methodArguements = 7, RULE_methodType = 8, RULE_methodBody = 9, RULE_constructorDeclaration = 10, 
		RULE_fieldDeclaration = 11, RULE_variableDeclaration = 12, RULE_listvariableDeclaration = 13, 
		RULE_variableInitializer = 14, RULE_funcPointerDeclarationBody = 15, RULE_listDeclaration = 16, 
		RULE_listBody = 17, RULE_block = 18, RULE_blockStatements = 19, RULE_blockStatement = 20, 
		RULE_statement = 21, RULE_ifStatement = 22, RULE_condition_block = 23, 
		RULE_statBlock = 24, RULE_statementWithoutTrailingSubstatement = 25, RULE_expStatement = 26, 
		RULE_statementExp = 27, RULE_forStatement = 28, RULE_initialStatement = 29, 
		RULE_updateStatement = 30, RULE_foreachStatement = 31, RULE_breakStatement = 32, 
		RULE_continueStatement = 33, RULE_returnStatement = 34, RULE_expressionName = 35, 
		RULE_primary = 36, RULE_primaryNoNewArray = 37, RULE_primaryNoNewArray_lf_arrayAccess = 38, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 39, RULE_primaryNoNewArray_lf_primary = 40, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 41, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 42, 
		RULE_primaryNoNewArray_lfno_primary = 43, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 44, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 45, 
		RULE_fieldAccess = 46, RULE_fieldAccess_lf_primary = 47, RULE_arrayAccess = 48, 
		RULE_arrayAccess_lf_primary = 49, RULE_arrayAccess_lfno_primary = 50, 
		RULE_returnFuncPointer = 51, RULE_methodCall = 52, RULE_methodCall2 = 53, 
		RULE_methodCallBody = 54, RULE_expression = 55, RULE_assignment = 56, 
		RULE_leftHandSide = 57, RULE_classAssignment = 58, RULE_listInitializer = 59, 
		RULE_preExp = 60, RULE_postExp = 61, RULE_expr = 62, RULE_conditionalOrExpression = 63, 
		RULE_conditionalAndExpression = 64, RULE_equalityExpression = 65, RULE_relationalExpression = 66, 
		RULE_additiveExpression = 67, RULE_multiplicativeExpression = 68, RULE_unaryExpression = 69, 
		RULE_preIncrementExpression = 70, RULE_preDecrementExpression = 71, RULE_unaryExpressionNotPlusMinus = 72, 
		RULE_postfixExpression = 73, RULE_postIncrementExpression = 74, RULE_postIncrementExpression_lf_postfixExpression = 75, 
		RULE_postDecrementExpression = 76, RULE_postDecrementExpression_lf_postfixExpression = 77, 
		RULE_literal = 78, RULE_printStatement = 79, RULE_printBody = 80, RULE_emptyStatement = 81, 
		RULE_comment = 82, RULE_intLiteral = 83;
	private static String[] makeRuleNames() {
		return new String[] {
			"sophia", "type", "classDeclaration", "classBody", "classBodyDeclaration", 
			"memberDeclaration", "methodDeclaration", "methodArguements", "methodType", 
			"methodBody", "constructorDeclaration", "fieldDeclaration", "variableDeclaration", 
			"listvariableDeclaration", "variableInitializer", "funcPointerDeclarationBody", 
			"listDeclaration", "listBody", "block", "blockStatements", "blockStatement", 
			"statement", "ifStatement", "condition_block", "statBlock", "statementWithoutTrailingSubstatement", 
			"expStatement", "statementExp", "forStatement", "initialStatement", "updateStatement", 
			"foreachStatement", "breakStatement", "continueStatement", "returnStatement", 
			"expressionName", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
			"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
			"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
			"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
			"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "fieldAccess", 
			"fieldAccess_lf_primary", "arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", 
			"returnFuncPointer", "methodCall", "methodCall2", "methodCallBody", "expression", 
			"assignment", "leftHandSide", "classAssignment", "listInitializer", "preExp", 
			"postExp", "expr", "conditionalOrExpression", "conditionalAndExpression", 
			"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
			"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
			"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
			"postDecrementExpression_lf_postfixExpression", "literal", "printStatement", 
			"printBody", "emptyStatement", "comment", "intLiteral"
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
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(168);
				classDeclaration();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
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
		public FuncPointerDeclarationBodyContext funcPointerDeclarationBody() {
			return getRuleContext(FuncPointerDeclarationBodyContext.class,0);
		}
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
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(INT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(BOOL);
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				funcPointerDeclarationBody();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token aa;
		public Token bb;
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
			setState(182);
			match(CLASS);
			setState(183);
			((ClassDeclarationContext)_localctx).aa = match(IDENTIFIER);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(184);
				match(EXTENDS);
				setState(185);
				((ClassDeclarationContext)_localctx).bb = match(IDENTIFIER);
				}
			}


			           if ((((ClassDeclarationContext)_localctx).bb!=null?((ClassDeclarationContext)_localctx).bb.getText():null) == null){
			               System.out.println("ClassDec:"+(((ClassDeclarationContext)_localctx).aa!=null?((ClassDeclarationContext)_localctx).aa.getText():null));
			           } else {
			               System.out.println("ClassDec:"+(((ClassDeclarationContext)_localctx).aa!=null?((ClassDeclarationContext)_localctx).aa.getText():null)+", "+(((ClassDeclarationContext)_localctx).bb!=null?((ClassDeclarationContext)_localctx).bb.getText():null));
			           }
			       
			setState(189);
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
			setState(191);
			match(LBRACE);
			setState(192);
			classBodyDeclaration();
			setState(193);
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
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACE) {
					{
					{
					setState(196);
					block();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << DEF) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << NEW) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
					{
					{
					setState(202);
					memberDeclaration();
					}
					}
					setState(207);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
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
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
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
		public Token aa;
		public TerminalNode DEF() { return getToken(sophiaParser.DEF, 0); }
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
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
			setState(216);
			match(DEF);
			setState(217);
			methodType();
			setState(218);
			((MethodDeclarationContext)_localctx).aa = match(IDENTIFIER);
			setState(219);
			match(LPAREN);

			                System.out.println("MethodDec:"+(((MethodDeclarationContext)_localctx).aa!=null?((MethodDeclarationContext)_localctx).aa.getText():null));
			        
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(221);
				methodArguements();
				}
			}

			setState(224);
			match(RPAREN);
			setState(225);
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
		public List<ListvariableDeclarationContext> listvariableDeclaration() {
			return getRuleContexts(ListvariableDeclarationContext.class);
		}
		public ListvariableDeclarationContext listvariableDeclaration(int i) {
			return getRuleContext(ListvariableDeclarationContext.class,i);
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
			setState(227);
			listvariableDeclaration();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(228);
				match(COMMA);
				setState(229);
				listvariableDeclaration();
				}
				}
				setState(234);
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
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
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
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
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
			setState(239);
			match(LBRACE);
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(240);
						variableDeclaration();
						setState(241);
						match(SEMI);
						}
						} 
					}
					setState(247);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << NEW) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
					{
					setState(248);
					blockStatements();
					}
				}

				}
				break;
			}
			setState(253);
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public Token aa;
		public TerminalNode DEF() { return getToken(sophiaParser.DEF, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 20, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(DEF);
			setState(256);
			((ConstructorDeclarationContext)_localctx).aa = match(IDENTIFIER);
			setState(257);
			match(LPAREN);

			                    System.out.println("ConstructorDec:"+(((ConstructorDeclarationContext)_localctx).aa!=null?((ConstructorDeclarationContext)_localctx).aa.getText():null));
			            
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(259);
				methodArguements();
				}
			}

			setState(262);
			match(RPAREN);
			setState(263);
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
		enterRule(_localctx, 22, RULE_fieldDeclaration);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				variableDeclaration();
				setState(266);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				variableInitializer();
				setState(269);
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
		public Token aa;
		public TerminalNode COLON() { return getToken(sophiaParser.COLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(sophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(sophiaParser.IDENTIFIER, i);
		}
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
		enterRule(_localctx, 24, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			((VariableDeclarationContext)_localctx).aa = match(IDENTIFIER);
			setState(274);
			match(COLON);

			                    System.out.println("VarDec:"+(((VariableDeclarationContext)_localctx).aa!=null?((VariableDeclarationContext)_localctx).aa.getText():null));
			            
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				{
				setState(276);
				listDeclaration();
				}
				break;
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
				{
				setState(277);
				type();
				}
				break;
			case IDENTIFIER:
				{
				setState(278);
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

	public static class ListvariableDeclarationContext extends ParserRuleContext {
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
		public ListvariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listvariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterListvariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitListvariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitListvariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListvariableDeclarationContext listvariableDeclaration() throws RecognitionException {
		ListvariableDeclarationContext _localctx = new ListvariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listvariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(IDENTIFIER);
			setState(282);
			match(COLON);
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				{
				setState(283);
				listDeclaration();
				}
				break;
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
				{
				setState(284);
				type();
				}
				break;
			case IDENTIFIER:
				{
				setState(285);
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
		enterRule(_localctx, 28, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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
		enterRule(_localctx, 30, RULE_funcPointerDeclarationBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(FUNC);
			setState(291);
			match(LT);
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(292);
				match(VOID);
				}
				break;
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
				{
				{
				setState(293);
				type();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(294);
					match(COMMA);
					setState(295);
					type();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(303);
			match(ARROW);
			setState(304);
			type();
			setState(305);
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
		enterRule(_localctx, 32, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(LIST);
			setState(308);
			match(LPAREN);
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POS_INT:
				{
				{
				setState(309);
				match(POS_INT);
				setState(310);
				match(T__0);
				setState(313);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
				case INT:
				case STRING:
				case BOOL:
					{
					setState(311);
					type();
					}
					break;
				case LIST:
					{
					setState(312);
					listDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
			case LIST:
			case IDENTIFIER:
				{
				{
				setState(315);
				listBody();
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(316);
					match(COMMA);
					setState(317);
					listBody();
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(325);
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
		public ListvariableDeclarationContext listvariableDeclaration() {
			return getRuleContext(ListvariableDeclarationContext.class,0);
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
		enterRule(_localctx, 34, RULE_listBody);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				listvariableDeclaration();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				listDeclaration();
				}
				break;
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				type();
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
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(LBRACE);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << NEW) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
				{
				setState(333);
				blockStatements();
				}
			}

			setState(336);
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
		enterRule(_localctx, 38, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(338);
				blockStatement();
				}
				}
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << NEW) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0) );
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
		enterRule(_localctx, 40, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
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
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case RETURN:
			case CONTINUE:
			case BREAK:
			case NEW:
			case PRINT:
			case IDENTIFIER:
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case LPAREN:
			case LBRACE:
			case SEMI:
			case INC:
			case DEC:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				statementWithoutTrailingSubstatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				forStatement();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				foreachStatement();
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
		public Condition_blockContext bb;
		public StatBlockContext cc;
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
		enterRule(_localctx, 44, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(IF);

			                System.out.println("Conditional:if");
			            
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(353);
					match(ELSE);
					setState(354);
					match(IF);
					setState(355);
					((IfStatementContext)_localctx).bb = condition_block();

					                System.out.println("Conditional:else");
					                System.out.println("Conditional:if");
					            
					}
					} 
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(363);
				match(ELSE);
				setState(364);
				((IfStatementContext)_localctx).cc = statBlock();

				                System.out.println("Conditional:else");
				            
				}
			}

			setState(369);
			condition_block();
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
		enterRule(_localctx, 46, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			expr();
			setState(372);
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
		enterRule(_localctx, 48, RULE_statBlock);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(LBRACE);
				setState(376);
				block();
				setState(377);
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
		enterRule(_localctx, 50, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				emptyStatement();
				}
				break;
			case THIS:
			case NEW:
			case IDENTIFIER:
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case LPAREN:
			case INC:
			case DEC:
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				expStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(386);
				returnStatement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(387);
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
		enterRule(_localctx, 52, RULE_expStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			statementExp();
			setState(391);
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
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public PreExpContext preExp() {
			return getRuleContext(PreExpContext.class,0);
		}
		public PostExpContext postExp() {
			return getRuleContext(PostExpContext.class,0);
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
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				methodCall();
				 System.out.println("MethodCall");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				preExp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				postExp();
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
		enterRule(_localctx, 56, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(FOR);

			                        System.out.println("Loop:for");
			                
			setState(403);
			match(LPAREN);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << SUB))) != 0)) {
				{
				setState(404);
				initialStatement();
				}
			}

			setState(407);
			match(SEMI);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACK) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(408);
				expr();
				}
			}

			setState(411);
			match(SEMI);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << SUB))) != 0)) {
				{
				setState(412);
				updateStatement();
				}
			}

			setState(415);
			match(RPAREN);
			setState(416);
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
		enterRule(_localctx, 58, RULE_initialStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			assignment();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(419);
				match(COMMA);
				setState(420);
				assignment();
				}
				}
				setState(425);
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
		enterRule(_localctx, 60, RULE_updateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			assignment();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(427);
				match(COMMA);
				setState(428);
				assignment();
				}
				}
				setState(433);
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
		enterRule(_localctx, 62, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(FOREACH);
			setState(435);
			match(LPAREN);
			setState(436);
			match(IDENTIFIER);
			setState(437);
			match(IN);

			                            System.out.println("Loop:foreach");
			                    
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(439);
				match(IDENTIFIER);
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(440);
					match(DOT);
					setState(441);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case 2:
				{
				setState(444);
				match(THIS);
				setState(445);
				match(DOT);
				setState(446);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(447);
				expr();
				}
				break;
			}
			setState(450);
			match(RPAREN);
			setState(451);
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
		enterRule(_localctx, 64, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(BREAK);
			setState(454);
			match(SEMI);

			                        System.out.println("Control:break");
			                
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
		enterRule(_localctx, 66, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(CONTINUE);
			setState(458);
			match(SEMI);

			                            System.out.println("Control:continue");
			                    
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
		enterRule(_localctx, 68, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(RETURN);

			                System.out.println("Return");
			        
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACK) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(463);
				expr();
				}
			}

			setState(466);
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

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(sophiaParser.DOT, 0); }
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitExpressionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		return expressionName(0);
	}

	private ExpressionNameContext expressionName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, _parentState);
		ExpressionNameContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expressionName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(469);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionName);
					setState(471);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(472);
					match(DOT);
					setState(473);
					match(IDENTIFIER);
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ClassAssignmentContext classAssignment() {
			return getRuleContext(ClassAssignmentContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(479);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(480);
				classAssignment();
				}
				break;
			}
			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode THIS() { return getToken(sophiaParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public ClassAssignmentContext classAssignment() {
			return getRuleContext(ClassAssignmentContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrimaryNoNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrimaryNoNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_primaryNoNewArray);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(491);
				match(LPAREN);
				setState(492);
				expression();
				setState(493);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
				classAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(496);
				fieldAccess();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(497);
				arrayAccess();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(498);
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

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode THIS() { return getToken(sophiaParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public ClassAssignmentContext classAssignment() {
			return getRuleContext(ClassAssignmentContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_primaryNoNewArray_lfno_arrayAccess);
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				match(LPAREN);
				setState(506);
				expression();
				setState(507);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(509);
				classAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(510);
				fieldAccess();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(511);
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

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodCall2Context methodCall2() {
			return getRuleContext(MethodCall2Context.class,0);
		}
		public ReturnFuncPointerContext returnFuncPointer() {
			return getRuleContext(ReturnFuncPointerContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				fieldAccess_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				arrayAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				methodCall2();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(517);
				returnFuncPointer();
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

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public MethodCall2Context methodCall2() {
			return getRuleContext(MethodCall2Context.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				fieldAccess_lf_primary();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				methodCall2();
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

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode THIS() { return getToken(sophiaParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public ClassAssignmentContext classAssignment() {
			return getRuleContext(ClassAssignmentContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public MethodCall2Context methodCall2() {
			return getRuleContext(MethodCall2Context.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_primaryNoNewArray_lfno_primary);
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				match(LPAREN);
				setState(529);
				expression();
				setState(530);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(532);
				classAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(533);
				arrayAccess_lfno_primary();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(534);
				methodCall2();
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

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode THIS() { return getToken(sophiaParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(sophiaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sophiaParser.RPAREN, 0); }
		public ClassAssignmentContext classAssignment() {
			return getRuleContext(ClassAssignmentContext.class,0);
		}
		public MethodCall2Context methodCall2() {
			return getRuleContext(MethodCall2Context.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				literal();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				match(THIS);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				match(LPAREN);
				setState(542);
				expression();
				setState(543);
				match(RPAREN);
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(545);
				classAssignment();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(546);
				methodCall2();
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

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(sophiaParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fieldAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			primary();
			setState(550);
			match(DOT);
			setState(551);
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

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(sophiaParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitFieldAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitFieldAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(DOT);
			setState(554);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(sophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(sophiaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(sophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(sophiaParser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(556);
				expressionName(0);
				setState(557);
				match(LBRACK);
				setState(558);
				expression();
				setState(559);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(561);
				primaryNoNewArray_lfno_arrayAccess();
				setState(562);
				match(LBRACK);
				setState(563);
				expression();
				setState(564);
				match(RBRACK);
				}
				break;
			}
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(568);
				primaryNoNewArray_lf_arrayAccess();
				setState(569);
				match(LBRACK);
				setState(570);
				expression();
				setState(571);
				match(RBRACK);
				}
				}
				setState(577);
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

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(sophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(sophiaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(sophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(sophiaParser.RBRACK, i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitArrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitArrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(578);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(579);
			match(LBRACK);
			setState(580);
			expression();
			setState(581);
			match(RBRACK);
			}
			setState(590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(583);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(584);
					match(LBRACK);
					setState(585);
					expression();
					setState(586);
					match(RBRACK);
					}
					} 
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(sophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(sophiaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(sophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(sophiaParser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitArrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitArrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(593);
				expressionName(0);
				setState(594);
				match(LBRACK);
				setState(595);
				expression();
				setState(596);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(598);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(599);
				match(LBRACK);
				setState(600);
				expression();
				setState(601);
				match(RBRACK);
				}
				break;
			}
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(605);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(606);
					match(LBRACK);
					setState(607);
					expression();
					setState(608);
					match(RBRACK);
					}
					} 
				}
				setState(614);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnFuncPointerContext extends ParserRuleContext {
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
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public ReturnFuncPointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnFuncPointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterReturnFuncPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitReturnFuncPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitReturnFuncPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnFuncPointerContext returnFuncPointer() throws RecognitionException {
		ReturnFuncPointerContext _localctx = new ReturnFuncPointerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_returnFuncPointer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(LPAREN);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACK) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(616);
				expr();
				}
			}

			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(619);
				match(COMMA);
				setState(620);
				expr();
				}
				}
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(626);
			match(RPAREN);
			setState(630);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(627);
					primary();
					}
					} 
				}
				setState(632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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

	public static class MethodCallContext extends ParserRuleContext {
		public MethodCallBodyContext methodCallBody() {
			return getRuleContext(MethodCallBodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(sophiaParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
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
		enterRule(_localctx, 104, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(636);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(633);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(634);
					primary();
					}
					break;
				case 3:
					{
					setState(635);
					expressionName(0);
					}
					break;
				}
				setState(638);
				match(DOT);
				}
				break;
			}
			setState(641);
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

	public static class MethodCall2Context extends ParserRuleContext {
		public MethodCallBodyContext methodCallBody() {
			return getRuleContext(MethodCallBodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(sophiaParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public MethodCall2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterMethodCall2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitMethodCall2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitMethodCall2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCall2Context methodCall2() throws RecognitionException {
		MethodCall2Context _localctx = new MethodCall2Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_methodCall2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(645);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(643);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(644);
					expressionName(0);
					}
					break;
				}
				setState(647);
				match(DOT);
				}
				break;
			}
			setState(650);
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
		enterRule(_localctx, 108, RULE_methodCallBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(IDENTIFIER);
			setState(653);
			match(LPAREN);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACK) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(654);
				expr();
				}
			}

			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(657);
				match(COMMA);
				setState(658);
				expr();
				}
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(664);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_expression);
		try {
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				assignment();
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

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(sophiaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 112, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			leftHandSide();
			setState(671);
			match(ASSIGN);
			setState(672);
			expr();

			                        System.out.println("Operator:=");
			                    
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

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitLeftHandSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_leftHandSide);
		try {
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				expressionName(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				arrayAccess();
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
		enterRule(_localctx, 116, RULE_classAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(NEW);
			setState(681);
			match(IDENTIFIER);
			setState(682);
			match(LPAREN);
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACK) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(683);
				expr();
				}
			}

			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(686);
				match(COMMA);
				setState(687);
				expr();
				}
				}
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(693);
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
		enterRule(_localctx, 118, RULE_listInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(LBRACK);
			{
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(696);
				listInitializer();
				}
				break;
			case 2:
				{
				setState(697);
				expr();
				}
				break;
			}
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(700);
				match(COMMA);
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(701);
					listInitializer();
					}
					break;
				case 2:
					{
					setState(702);
					expr();
					}
					break;
				}
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(710);
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
		enterRule(_localctx, 120, RULE_preExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(713);
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
		enterRule(_localctx, 122, RULE_postExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			literal();
			setState(716);
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
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ListInitializerContext listInitializer() {
			return getRuleContext(ListInitializerContext.class,0);
		}
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
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_expr);
		try {
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case NEW:
			case IDENTIFIER:
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case LPAREN:
			case NOT:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				conditionalOrExpression(0);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				listInitializer();
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public Token op;
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(sophiaParser.OR, 0); }
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(723);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(725);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(726);
					((ConditionalOrExpressionContext)_localctx).op = match(OR);
					setState(727);
					conditionalAndExpression(0);

					                      if ((((ConditionalOrExpressionContext)_localctx).op!=null?((ConditionalOrExpressionContext)_localctx).op.getText():null) != null){
					                          System.out.println("Operator:"+(((ConditionalOrExpressionContext)_localctx).op!=null?((ConditionalOrExpressionContext)_localctx).op.getText():null));
					                      }
					                  
					}
					} 
				}
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public Token op;
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(sophiaParser.AND, 0); }
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(736);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(738);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(739);
					((ConditionalAndExpressionContext)_localctx).op = match(AND);
					setState(740);
					equalityExpression(0);

					                      if ((((ConditionalAndExpressionContext)_localctx).op!=null?((ConditionalAndExpressionContext)_localctx).op.getText():null) != null){
					                          System.out.println("Operator:"+(((ConditionalAndExpressionContext)_localctx).op!=null?((ConditionalAndExpressionContext)_localctx).op.getText():null));
					                      }
					                  
					}
					} 
				}
				setState(747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Token op;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(sophiaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(sophiaParser.NOTEQUAL, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_equalityExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(749);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
					setState(751);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(752);
					((EqualityExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						((EqualityExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(753);
					relationalExpression(0);

					                      if ((((EqualityExpressionContext)_localctx).op!=null?((EqualityExpressionContext)_localctx).op.getText():null) != null){
					                          System.out.println("Operator:"+(((EqualityExpressionContext)_localctx).op!=null?((EqualityExpressionContext)_localctx).op.getText():null));
					                      }
					                  
					}
					} 
				}
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Token op;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LE() { return getToken(sophiaParser.LE, 0); }
		public TerminalNode GE() { return getToken(sophiaParser.GE, 0); }
		public TerminalNode LT() { return getToken(sophiaParser.LT, 0); }
		public TerminalNode GT() { return getToken(sophiaParser.GT, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_relationalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(762);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(771);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
					setState(764);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(765);
					((RelationalExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
						((RelationalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(766);
					additiveExpression(0);

					                      if ((((RelationalExpressionContext)_localctx).op!=null?((RelationalExpressionContext)_localctx).op.getText():null) != null){
					                          System.out.println("Operator:"+(((RelationalExpressionContext)_localctx).op!=null?((RelationalExpressionContext)_localctx).op.getText():null));
					                      }
					                  
					}
					} 
				}
				setState(773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Token op;
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(sophiaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(sophiaParser.SUB, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_additiveExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(775);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(784);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(777);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(778);
					((AdditiveExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
						((AdditiveExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(779);
					multiplicativeExpression(0);

					                              if ((((AdditiveExpressionContext)_localctx).op!=null?((AdditiveExpressionContext)_localctx).op.getText():null) != null){
					                                  System.out.println("Operator:"+(((AdditiveExpressionContext)_localctx).op!=null?((AdditiveExpressionContext)_localctx).op.getText():null));
					                              }
					                          
					}
					} 
				}
				setState(786);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Token op;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(sophiaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(sophiaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(sophiaParser.MOD, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_multiplicativeExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(788);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
					setState(790);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(791);
					((MultiplicativeExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						((MultiplicativeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(792);
					unaryExpression();

					                  if ((((MultiplicativeExpressionContext)_localctx).op!=null?((MultiplicativeExpressionContext)_localctx).op.getText():null) != null){
					                      System.out.println("Operator:"+(((MultiplicativeExpressionContext)_localctx).op!=null?((MultiplicativeExpressionContext)_localctx).op.getText():null));
					                  }
					              
					}
					} 
				}
				setState(799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(sophiaParser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(sophiaParser.SUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unaryExpression);
		try {
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				preIncrementExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				preDecrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(802);
				match(ADD);
				setState(803);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(804);
				match(SUB);
				setState(805);
				unaryExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(806);
				unaryExpressionNotPlusMinus();
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

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(sophiaParser.INC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(INC);
			setState(810);
			unaryExpression();
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

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(sophiaParser.DEC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPreDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPreDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(DEC);
			setState(813);
			unaryExpression();
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

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(sophiaParser.NOT, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case NEW:
			case IDENTIFIER:
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case LPAREN:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				postfixExpression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(816);
				match(NOT);
				setState(817);
				unaryExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(820);
				primary();
				}
				break;
			case 2:
				{
				setState(821);
				expressionName(0);
				}
				break;
			}
			setState(828);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(826);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(824);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(825);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(830);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(sophiaParser.INC, 0); }
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			postfixExpression();
			setState(832);
			match(INC);
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

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(sophiaParser.INC, 0); }
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPostIncrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(INC);
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

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DEC() { return getToken(sophiaParser.DEC, 0); }
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPostDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			postfixExpression();
			setState(837);
			match(DEC);
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

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(sophiaParser.DEC, 0); }
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPostDecrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(DEC);
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

	public static class LiteralContext extends ParserRuleContext {
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
		enterRule(_localctx, 156, RULE_literal);
		try {
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POS_INT:
			case ZERO:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(841);
				intLiteral();
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				match(BOOL_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(843);
				match(STRING_LITERAL);
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
		enterRule(_localctx, 158, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(PRINT);
			setState(847);
			match(LPAREN);
			setState(848);
			printBody();
			setState(849);
			match(RPAREN);
			setState(850);
			match(SEMI);

			                            System.out.println("Built-in:print");
			                    
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
		enterRule(_localctx, 160, RULE_printBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			expr();
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
		enterRule(_localctx, 162, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
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
		enterRule(_localctx, 164, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
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
		enterRule(_localctx, 166, RULE_intLiteral);
		try {
			setState(863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				match(ZERO);
				}
				break;
			case POS_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				match(POS_INT);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(861);
				match(SUB);
				setState(862);
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
		case 35:
			return expressionName_sempred((ExpressionNameContext)_localctx, predIndex);
		case 63:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 64:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 65:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 66:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 67:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 68:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionName_sempred(ExpressionNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0364\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\7\2\u00ac\n\2\f\2\16\2\u00af\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5"+
		"\3\u00b7\n\3\3\4\3\4\3\4\3\4\5\4\u00bd\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\7\6\u00c8\n\6\f\6\16\6\u00cb\13\6\3\6\7\6\u00ce\n\6\f\6\16\6"+
		"\u00d1\13\6\5\6\u00d3\n\6\3\7\3\7\3\7\3\7\5\7\u00d9\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00e1\n\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00e9\n\t\f\t\16"+
		"\t\u00ec\13\t\3\n\3\n\5\n\u00f0\n\n\3\13\3\13\3\13\3\13\7\13\u00f6\n\13"+
		"\f\13\16\13\u00f9\13\13\3\13\5\13\u00fc\n\13\5\13\u00fe\n\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u0107\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0112\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u011a\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0121\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u012b\n\21\f\21\16\21\u012e\13\21\5\21\u0130\n\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u013c\n\22\3\22\3\22\3\22\7\22"+
		"\u0141\n\22\f\22\16\22\u0144\13\22\5\22\u0146\n\22\3\22\3\22\3\23\3\23"+
		"\3\23\5\23\u014d\n\23\3\24\3\24\5\24\u0151\n\24\3\24\3\24\3\25\6\25\u0156"+
		"\n\25\r\25\16\25\u0157\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0160\n\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0169\n\30\f\30\16\30\u016c\13"+
		"\30\3\30\3\30\3\30\3\30\5\30\u0172\n\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u017e\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0187\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0192"+
		"\n\35\3\36\3\36\3\36\3\36\5\36\u0198\n\36\3\36\3\36\5\36\u019c\n\36\3"+
		"\36\3\36\5\36\u01a0\n\36\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u01a8\n\37"+
		"\f\37\16\37\u01ab\13\37\3 \3 \3 \7 \u01b0\n \f \16 \u01b3\13 \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\5!\u01bd\n!\3!\3!\3!\3!\5!\u01c3\n!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\5$\u01d3\n$\3$\3$\3%\3%\3%\3%\3%\3%\7%\u01dd"+
		"\n%\f%\16%\u01e0\13%\3&\3&\5&\u01e4\n&\3&\7&\u01e7\n&\f&\16&\u01ea\13"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01f6\n\'\3(\3(\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\5)\u0203\n)\3*\3*\3*\3*\5*\u0209\n*\3+\3+\3,\3,\5"+
		",\u020f\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u021a\n-\3.\3.\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\5/\u0226\n/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0239\n\62\3\62\3\62\3\62"+
		"\3\62\3\62\7\62\u0240\n\62\f\62\16\62\u0243\13\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u024f\n\63\f\63\16\63\u0252\13\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u025e\n\64\3\64"+
		"\3\64\3\64\3\64\3\64\7\64\u0265\n\64\f\64\16\64\u0268\13\64\3\65\3\65"+
		"\5\65\u026c\n\65\3\65\3\65\7\65\u0270\n\65\f\65\16\65\u0273\13\65\3\65"+
		"\3\65\7\65\u0277\n\65\f\65\16\65\u027a\13\65\3\66\3\66\3\66\5\66\u027f"+
		"\n\66\3\66\5\66\u0282\n\66\3\66\3\66\3\67\3\67\5\67\u0288\n\67\3\67\5"+
		"\67\u028b\n\67\3\67\3\67\38\38\38\58\u0292\n8\38\38\78\u0296\n8\f8\16"+
		"8\u0299\138\38\38\39\39\59\u029f\n9\3:\3:\3:\3:\3:\3;\3;\3;\5;\u02a9\n"+
		";\3<\3<\3<\3<\5<\u02af\n<\3<\3<\7<\u02b3\n<\f<\16<\u02b6\13<\3<\3<\3="+
		"\3=\3=\5=\u02bd\n=\3=\3=\3=\5=\u02c2\n=\7=\u02c4\n=\f=\16=\u02c7\13=\3"+
		"=\3=\3>\3>\3>\3?\3?\3?\3@\3@\5@\u02d3\n@\3A\3A\3A\3A\3A\3A\3A\3A\7A\u02dd"+
		"\nA\fA\16A\u02e0\13A\3B\3B\3B\3B\3B\3B\3B\3B\7B\u02ea\nB\fB\16B\u02ed"+
		"\13B\3C\3C\3C\3C\3C\3C\3C\3C\7C\u02f7\nC\fC\16C\u02fa\13C\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\7D\u0304\nD\fD\16D\u0307\13D\3E\3E\3E\3E\3E\3E\3E\3E\7E\u0311"+
		"\nE\fE\16E\u0314\13E\3F\3F\3F\3F\3F\3F\3F\3F\7F\u031e\nF\fF\16F\u0321"+
		"\13F\3G\3G\3G\3G\3G\3G\3G\5G\u032a\nG\3H\3H\3H\3I\3I\3I\3J\3J\3J\5J\u0335"+
		"\nJ\3K\3K\5K\u0339\nK\3K\3K\7K\u033d\nK\fK\16K\u0340\13K\3L\3L\3L\3M\3"+
		"M\3N\3N\3N\3O\3O\3P\3P\3P\5P\u034f\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3S\3"+
		"S\3T\3T\3U\3U\3U\3U\5U\u0362\nU\3U\2\tH\u0080\u0082\u0084\u0086\u0088"+
		"\u008aV\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\2\7\3\2\678\4\2\61\61\64\64\4\2+,\62\63\3\29:\4\2;"+
		"<@@\2\u038d\2\u00ad\3\2\2\2\4\u00b6\3\2\2\2\6\u00b8\3\2\2\2\b\u00c1\3"+
		"\2\2\2\n\u00d2\3\2\2\2\f\u00d8\3\2\2\2\16\u00da\3\2\2\2\20\u00e5\3\2\2"+
		"\2\22\u00ef\3\2\2\2\24\u00f1\3\2\2\2\26\u0101\3\2\2\2\30\u0111\3\2\2\2"+
		"\32\u0113\3\2\2\2\34\u011b\3\2\2\2\36\u0122\3\2\2\2 \u0124\3\2\2\2\"\u0135"+
		"\3\2\2\2$\u014c\3\2\2\2&\u014e\3\2\2\2(\u0155\3\2\2\2*\u0159\3\2\2\2,"+
		"\u015f\3\2\2\2.\u0161\3\2\2\2\60\u0175\3\2\2\2\62\u017d\3\2\2\2\64\u0186"+
		"\3\2\2\2\66\u0188\3\2\2\28\u0191\3\2\2\2:\u0193\3\2\2\2<\u01a4\3\2\2\2"+
		">\u01ac\3\2\2\2@\u01b4\3\2\2\2B\u01c7\3\2\2\2D\u01cb\3\2\2\2F\u01cf\3"+
		"\2\2\2H\u01d6\3\2\2\2J\u01e3\3\2\2\2L\u01f5\3\2\2\2N\u01f7\3\2\2\2P\u0202"+
		"\3\2\2\2R\u0208\3\2\2\2T\u020a\3\2\2\2V\u020e\3\2\2\2X\u0219\3\2\2\2Z"+
		"\u021b\3\2\2\2\\\u0225\3\2\2\2^\u0227\3\2\2\2`\u022b\3\2\2\2b\u0238\3"+
		"\2\2\2d\u0244\3\2\2\2f\u025d\3\2\2\2h\u0269\3\2\2\2j\u0281\3\2\2\2l\u028a"+
		"\3\2\2\2n\u028e\3\2\2\2p\u029e\3\2\2\2r\u02a0\3\2\2\2t\u02a8\3\2\2\2v"+
		"\u02aa\3\2\2\2x\u02b9\3\2\2\2z\u02ca\3\2\2\2|\u02cd\3\2\2\2~\u02d2\3\2"+
		"\2\2\u0080\u02d4\3\2\2\2\u0082\u02e1\3\2\2\2\u0084\u02ee\3\2\2\2\u0086"+
		"\u02fb\3\2\2\2\u0088\u0308\3\2\2\2\u008a\u0315\3\2\2\2\u008c\u0329\3\2"+
		"\2\2\u008e\u032b\3\2\2\2\u0090\u032e\3\2\2\2\u0092\u0334\3\2\2\2\u0094"+
		"\u0338\3\2\2\2\u0096\u0341\3\2\2\2\u0098\u0344\3\2\2\2\u009a\u0346\3\2"+
		"\2\2\u009c\u0349\3\2\2\2\u009e\u034e\3\2\2\2\u00a0\u0350\3\2\2\2\u00a2"+
		"\u0357\3\2\2\2\u00a4\u0359\3\2\2\2\u00a6\u035b\3\2\2\2\u00a8\u0361\3\2"+
		"\2\2\u00aa\u00ac\5\6\4\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00b0\u00b1\7\2\2\3\u00b1\3\3\2\2\2\u00b2\u00b7\7\22\2\2\u00b3\u00b7"+
		"\7\23\2\2\u00b4\u00b7\7\24\2\2\u00b5\u00b7\5 \21\2\u00b6\u00b2\3\2\2\2"+
		"\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\5\3"+
		"\2\2\2\u00b8\u00b9\7\4\2\2\u00b9\u00bc\7\33\2\2\u00ba\u00bb\7\5\2\2\u00bb"+
		"\u00bd\7\33\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3"+
		"\2\2\2\u00be\u00bf\b\4\1\2\u00bf\u00c0\5\b\5\2\u00c0\7\3\2\2\2\u00c1\u00c2"+
		"\7\"\2\2\u00c2\u00c3\5\n\6\2\u00c3\u00c4\7#\2\2\u00c4\t\3\2\2\2\u00c5"+
		"\u00d3\7&\2\2\u00c6\u00c8\5&\24\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d3\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00ce\5\f\7\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00c5\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00cf\3\2"+
		"\2\2\u00d3\13\3\2\2\2\u00d4\u00d9\5,\27\2\u00d5\u00d9\5\16\b\2\u00d6\u00d9"+
		"\5\26\f\2\u00d7\u00d9\5\30\r\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2"+
		"\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\r\3\2\2\2\u00da\u00db\7"+
		"\7\2\2\u00db\u00dc\5\22\n\2\u00dc\u00dd\7\33\2\2\u00dd\u00de\7 \2\2\u00de"+
		"\u00e0\b\b\1\2\u00df\u00e1\5\20\t\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7!\2\2\u00e3\u00e4\5\24\13\2\u00e4"+
		"\17\3\2\2\2\u00e5\u00ea\5\34\17\2\u00e6\u00e7\7\'\2\2\u00e7\u00e9\5\34"+
		"\17\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\21\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\5\4\3"+
		"\2\u00ee\u00f0\7\25\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\23\3\2\2\2\u00f1\u00fd\7\"\2\2\u00f2\u00f3\5\32\16\2\u00f3\u00f4\7&\2"+
		"\2\u00f4\u00f6\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fc\5(\25\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2"+
		"\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\7#\2\2\u0100\25\3\2\2\2\u0101\u0102\7\7\2\2\u0102\u0103\7\33\2"+
		"\2\u0103\u0104\7 \2\2\u0104\u0106\b\f\1\2\u0105\u0107\5\20\t\2\u0106\u0105"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7!\2\2\u0109"+
		"\u010a\5\24\13\2\u010a\27\3\2\2\2\u010b\u010c\5\32\16\2\u010c\u010d\7"+
		"&\2\2\u010d\u0112\3\2\2\2\u010e\u010f\5\36\20\2\u010f\u0110\7&\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u010e\3\2\2\2\u0112\31\3\2\2"+
		"\2\u0113\u0114\7\33\2\2\u0114\u0115\7\60\2\2\u0115\u0119\b\16\1\2\u0116"+
		"\u011a\5\"\22\2\u0117\u011a\5\4\3\2\u0118\u011a\7\33\2\2\u0119\u0116\3"+
		"\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\33\3\2\2\2\u011b"+
		"\u011c\7\33\2\2\u011c\u0120\7\60\2\2\u011d\u0121\5\"\22\2\u011e\u0121"+
		"\5\4\3\2\u011f\u0121\7\33\2\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2"+
		"\u0120\u011f\3\2\2\2\u0121\35\3\2\2\2\u0122\u0123\5r:\2\u0123\37\3\2\2"+
		"\2\u0124\u0125\7\b\2\2\u0125\u012f\7,\2\2\u0126\u0130\7\25\2\2\u0127\u012c"+
		"\5\4\3\2\u0128\u0129\7\'\2\2\u0129\u012b\5\4\3\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012f\u0126\3\2\2\2\u012f\u0127\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\7)\2\2\u0132\u0133\5\4\3\2\u0133\u0134\7+\2"+
		"\2\u0134!\3\2\2\2\u0135\u0136\7\26\2\2\u0136\u0145\7 \2\2\u0137\u0138"+
		"\7\34\2\2\u0138\u013b\7\3\2\2\u0139\u013c\5\4\3\2\u013a\u013c\5\"\22\2"+
		"\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u0146\3\2\2\2\u013d\u0142"+
		"\5$\23\2\u013e\u013f\7\'\2\2\u013f\u0141\5$\23\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0146\3\2"+
		"\2\2\u0144\u0142\3\2\2\2\u0145\u0137\3\2\2\2\u0145\u013d\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\7!\2\2\u0148#\3\2\2\2\u0149\u014d\5\34\17\2"+
		"\u014a\u014d\5\"\22\2\u014b\u014d\5\4\3\2\u014c\u0149\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014c\u014b\3\2\2\2\u014d%\3\2\2\2\u014e\u0150\7\"\2\2\u014f"+
		"\u0151\5(\25\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0153\7#\2\2\u0153\'\3\2\2\2\u0154\u0156\5*\26\2\u0155\u0154"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		")\3\2\2\2\u0159\u015a\5,\27\2\u015a+\3\2\2\2\u015b\u0160\5\64\33\2\u015c"+
		"\u0160\5.\30\2\u015d\u0160\5:\36\2\u015e\u0160\5@!\2\u015f\u015b\3\2\2"+
		"\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160-"+
		"\3\2\2\2\u0161\u0162\7\n\2\2\u0162\u016a\b\30\1\2\u0163\u0164\7\13\2\2"+
		"\u0164\u0165\7\n\2\2\u0165\u0166\5\60\31\2\u0166\u0167\b\30\1\2\u0167"+
		"\u0169\3\2\2\2\u0168\u0163\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u0171\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"\u016e\7\13\2\2\u016e\u016f\5\62\32\2\u016f\u0170\b\30\1\2\u0170\u0172"+
		"\3\2\2\2\u0171\u016d\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\5\60\31\2\u0174/\3\2\2\2\u0175\u0176\5~@\2\u0176\u0177\5\62\32"+
		"\2\u0177\61\3\2\2\2\u0178\u017e\5,\27\2\u0179\u017a\7\"\2\2\u017a\u017b"+
		"\5&\24\2\u017b\u017c\7#\2\2\u017c\u017e\3\2\2\2\u017d\u0178\3\2\2\2\u017d"+
		"\u0179\3\2\2\2\u017e\63\3\2\2\2\u017f\u0187\5&\24\2\u0180\u0187\5\u00a4"+
		"S\2\u0181\u0187\5\66\34\2\u0182\u0187\5B\"\2\u0183\u0187\5D#\2\u0184\u0187"+
		"\5F$\2\u0185\u0187\5\u00a0Q\2\u0186\u017f\3\2\2\2\u0186\u0180\3\2\2\2"+
		"\u0186\u0181\3\2\2\2\u0186\u0182\3\2\2\2\u0186\u0183\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0186\u0185\3\2\2\2\u0187\65\3\2\2\2\u0188\u0189\58\35\2\u0189"+
		"\u018a\7&\2\2\u018a\67\3\2\2\2\u018b\u0192\5r:\2\u018c\u018d\5j\66\2\u018d"+
		"\u018e\b\35\1\2\u018e\u0192\3\2\2\2\u018f\u0192\5z>\2\u0190\u0192\5|?"+
		"\2\u0191\u018b\3\2\2\2\u0191\u018c\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0190"+
		"\3\2\2\2\u01929\3\2\2\2\u0193\u0194\7\f\2\2\u0194\u0195\b\36\1\2\u0195"+
		"\u0197\7 \2\2\u0196\u0198\5<\37\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u0199\3\2\2\2\u0199\u019b\7&\2\2\u019a\u019c\5~@\2\u019b\u019a"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\7&\2\2\u019e"+
		"\u01a0\5> \2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2"+
		"\2\u01a1\u01a2\7!\2\2\u01a2\u01a3\5\62\32\2\u01a3;\3\2\2\2\u01a4\u01a9"+
		"\5r:\2\u01a5\u01a6\7\'\2\2\u01a6\u01a8\5r:\2\u01a7\u01a5\3\2\2\2\u01a8"+
		"\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa=\3\2\2\2"+
		"\u01ab\u01a9\3\2\2\2\u01ac\u01b1\5r:\2\u01ad\u01ae\7\'\2\2\u01ae\u01b0"+
		"\5r:\2\u01af\u01ad\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2?\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\7\r\2\2"+
		"\u01b5\u01b6\7 \2\2\u01b6\u01b7\7\33\2\2\u01b7\u01b8\7\27\2\2\u01b8\u01c2"+
		"\b!\1\2\u01b9\u01bc\7\33\2\2\u01ba\u01bb\7(\2\2\u01bb\u01bd\7\33\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c3\3\2\2\2\u01be\u01bf\7\6"+
		"\2\2\u01bf\u01c0\7(\2\2\u01c0\u01c3\7\33\2\2\u01c1\u01c3\5~@\2\u01c2\u01b9"+
		"\3\2\2\2\u01c2\u01be\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\7!\2\2\u01c5\u01c6\5\62\32\2\u01c6A\3\2\2\2\u01c7\u01c8\7\17\2"+
		"\2\u01c8\u01c9\7&\2\2\u01c9\u01ca\b\"\1\2\u01caC\3\2\2\2\u01cb\u01cc\7"+
		"\16\2\2\u01cc\u01cd\7&\2\2\u01cd\u01ce\b#\1\2\u01ceE\3\2\2\2\u01cf\u01d0"+
		"\7\t\2\2\u01d0\u01d2\b$\1\2\u01d1\u01d3\5~@\2\u01d2\u01d1\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\7&\2\2\u01d5G\3\2\2\2\u01d6"+
		"\u01d7\b%\1\2\u01d7\u01d8\7\33\2\2\u01d8\u01de\3\2\2\2\u01d9\u01da\f\3"+
		"\2\2\u01da\u01db\7(\2\2\u01db\u01dd\7\33\2\2\u01dc\u01d9\3\2\2\2\u01dd"+
		"\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01dfI\3\2\2\2"+
		"\u01e0\u01de\3\2\2\2\u01e1\u01e4\5X-\2\u01e2\u01e4\5v<\2\u01e3\u01e1\3"+
		"\2\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e8\3\2\2\2\u01e5\u01e7\5R*\2\u01e6"+
		"\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2"+
		"\2\2\u01e9K\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01f6\5\u009eP\2\u01ec\u01f6"+
		"\7\6\2\2\u01ed\u01ee\7 \2\2\u01ee\u01ef\5p9\2\u01ef\u01f0\7!\2\2\u01f0"+
		"\u01f6\3\2\2\2\u01f1\u01f6\5v<\2\u01f2\u01f6\5^\60\2\u01f3\u01f6\5b\62"+
		"\2\u01f4\u01f6\5j\66\2\u01f5\u01eb\3\2\2\2\u01f5\u01ec\3\2\2\2\u01f5\u01ed"+
		"\3\2\2\2\u01f5\u01f1\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f4\3\2\2\2\u01f6M\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8O\3\2\2\2\u01f9"+
		"\u0203\5\u009eP\2\u01fa\u0203\7\6\2\2\u01fb\u01fc\7 \2\2\u01fc\u01fd\5"+
		"p9\2\u01fd\u01fe\7!\2\2\u01fe\u0203\3\2\2\2\u01ff\u0203\5v<\2\u0200\u0203"+
		"\5^\60\2\u0201\u0203\5j\66\2\u0202\u01f9\3\2\2\2\u0202\u01fa\3\2\2\2\u0202"+
		"\u01fb\3\2\2\2\u0202\u01ff\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2"+
		"\2\2\u0203Q\3\2\2\2\u0204\u0209\5`\61\2\u0205\u0209\5d\63\2\u0206\u0209"+
		"\5l\67\2\u0207\u0209\5h\65\2\u0208\u0204\3\2\2\2\u0208\u0205\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209S\3\2\2\2\u020a\u020b\3\2\2\2"+
		"\u020bU\3\2\2\2\u020c\u020f\5`\61\2\u020d\u020f\5l\67\2\u020e\u020c\3"+
		"\2\2\2\u020e\u020d\3\2\2\2\u020fW\3\2\2\2\u0210\u021a\5\u009eP\2\u0211"+
		"\u021a\7\6\2\2\u0212\u0213\7 \2\2\u0213\u0214\5p9\2\u0214\u0215\7!\2\2"+
		"\u0215\u021a\3\2\2\2\u0216\u021a\5v<\2\u0217\u021a\5f\64\2\u0218\u021a"+
		"\5l\67\2\u0219\u0210\3\2\2\2\u0219\u0211\3\2\2\2\u0219\u0212\3\2\2\2\u0219"+
		"\u0216\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u0218\3\2\2\2\u021aY\3\2\2\2"+
		"\u021b\u021c\3\2\2\2\u021c[\3\2\2\2\u021d\u0226\5\u009eP\2\u021e\u0226"+
		"\7\6\2\2\u021f\u0220\7 \2\2\u0220\u0221\5p9\2\u0221\u0222\7!\2\2\u0222"+
		"\u0226\3\2\2\2\u0223\u0226\5v<\2\u0224\u0226\5l\67\2\u0225\u021d\3\2\2"+
		"\2\u0225\u021e\3\2\2\2\u0225\u021f\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0224"+
		"\3\2\2\2\u0226]\3\2\2\2\u0227\u0228\5J&\2\u0228\u0229\7(\2\2\u0229\u022a"+
		"\7\33\2\2\u022a_\3\2\2\2\u022b\u022c\7(\2\2\u022c\u022d\7\33\2\2\u022d"+
		"a\3\2\2\2\u022e\u022f\5H%\2\u022f\u0230\7$\2\2\u0230\u0231\5p9\2\u0231"+
		"\u0232\7%\2\2\u0232\u0239\3\2\2\2\u0233\u0234\5P)\2\u0234\u0235\7$\2\2"+
		"\u0235\u0236\5p9\2\u0236\u0237\7%\2\2\u0237\u0239\3\2\2\2\u0238\u022e"+
		"\3\2\2\2\u0238\u0233\3\2\2\2\u0239\u0241\3\2\2\2\u023a\u023b\5N(\2\u023b"+
		"\u023c\7$\2\2\u023c\u023d\5p9\2\u023d\u023e\7%\2\2\u023e\u0240\3\2\2\2"+
		"\u023f\u023a\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242"+
		"\3\2\2\2\u0242c\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0245\5V,\2\u0245\u0246"+
		"\7$\2\2\u0246\u0247\5p9\2\u0247\u0248\7%\2\2\u0248\u0250\3\2\2\2\u0249"+
		"\u024a\5T+\2\u024a\u024b\7$\2\2\u024b\u024c\5p9\2\u024c\u024d\7%\2\2\u024d"+
		"\u024f\3\2\2\2\u024e\u0249\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2"+
		"\2\2\u0250\u0251\3\2\2\2\u0251e\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0254"+
		"\5H%\2\u0254\u0255\7$\2\2\u0255\u0256\5p9\2\u0256\u0257\7%\2\2\u0257\u025e"+
		"\3\2\2\2\u0258\u0259\5\\/\2\u0259\u025a\7$\2\2\u025a\u025b\5p9\2\u025b"+
		"\u025c\7%\2\2\u025c\u025e\3\2\2\2\u025d\u0253\3\2\2\2\u025d\u0258\3\2"+
		"\2\2\u025e\u0266\3\2\2\2\u025f\u0260\5Z.\2\u0260\u0261\7$\2\2\u0261\u0262"+
		"\5p9\2\u0262\u0263\7%\2\2\u0263\u0265\3\2\2\2\u0264\u025f\3\2\2\2\u0265"+
		"\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267g\3\2\2\2"+
		"\u0268\u0266\3\2\2\2\u0269\u026b\7 \2\2\u026a\u026c\5~@\2\u026b\u026a"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u0271\3\2\2\2\u026d\u026e\7\'\2\2\u026e"+
		"\u0270\5~@\2\u026f\u026d\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2"+
		"\2\u0271\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0278"+
		"\7!\2\2\u0275\u0277\5J&\2\u0276\u0275\3\2\2\2\u0277\u027a\3\2\2\2\u0278"+
		"\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279i\3\2\2\2\u027a\u0278\3\2\2\2"+
		"\u027b\u027f\7\33\2\2\u027c\u027f\5J&\2\u027d\u027f\5H%\2\u027e\u027b"+
		"\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0282\7(\2\2\u0281\u027e\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3\2"+
		"\2\2\u0283\u0284\5n8\2\u0284k\3\2\2\2\u0285\u0288\7\33\2\2\u0286\u0288"+
		"\5H%\2\u0287\u0285\3\2\2\2\u0287\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028b\7(\2\2\u028a\u0287\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2"+
		"\2\2\u028c\u028d\5n8\2\u028dm\3\2\2\2\u028e\u028f\7\33\2\2\u028f\u0291"+
		"\7 \2\2\u0290\u0292\5~@\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0297\3\2\2\2\u0293\u0294\7\'\2\2\u0294\u0296\5~@\2\u0295\u0293\3\2\2"+
		"\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029a"+
		"\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029b\7!\2\2\u029bo\3\2\2\2\u029c\u029f"+
		"\5~@\2\u029d\u029f\5r:\2\u029e\u029c\3\2\2\2\u029e\u029d\3\2\2\2\u029f"+
		"q\3\2\2\2\u02a0\u02a1\5t;\2\u02a1\u02a2\7*\2\2\u02a2\u02a3\5~@\2\u02a3"+
		"\u02a4\b:\1\2\u02a4s\3\2\2\2\u02a5\u02a9\5H%\2\u02a6\u02a9\5^\60\2\u02a7"+
		"\u02a9\5b\62\2\u02a8\u02a5\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a7\3\2"+
		"\2\2\u02a9u\3\2\2\2\u02aa\u02ab\7\31\2\2\u02ab\u02ac\7\33\2\2\u02ac\u02ae"+
		"\7 \2\2\u02ad\u02af\5~@\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u02b4\3\2\2\2\u02b0\u02b1\7\'\2\2\u02b1\u02b3\5~@\2\u02b2\u02b0\3\2\2"+
		"\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7"+
		"\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b8\7!\2\2\u02b8w\3\2\2\2\u02b9\u02bc"+
		"\7$\2\2\u02ba\u02bd\5x=\2\u02bb\u02bd\5~@\2\u02bc\u02ba\3\2\2\2\u02bc"+
		"\u02bb\3\2\2\2\u02bd\u02c5\3\2\2\2\u02be\u02c1\7\'\2\2\u02bf\u02c2\5x"+
		"=\2\u02c0\u02c2\5~@\2\u02c1\u02bf\3\2\2\2\u02c1\u02c0\3\2\2\2\u02c2\u02c4"+
		"\3\2\2\2\u02c3\u02be\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5"+
		"\u02c6\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\7%"+
		"\2\2\u02c9y\3\2\2\2\u02ca\u02cb\t\2\2\2\u02cb\u02cc\5\u009eP\2\u02cc{"+
		"\3\2\2\2\u02cd\u02ce\5\u009eP\2\u02ce\u02cf\t\2\2\2\u02cf}\3\2\2\2\u02d0"+
		"\u02d3\5\u0080A\2\u02d1\u02d3\5x=\2\u02d2\u02d0\3\2\2\2\u02d2\u02d1\3"+
		"\2\2\2\u02d3\177\3\2\2\2\u02d4\u02d5\bA\1\2\u02d5\u02d6\5\u0082B\2\u02d6"+
		"\u02de\3\2\2\2\u02d7\u02d8\f\3\2\2\u02d8\u02d9\7\66\2\2\u02d9\u02da\5"+
		"\u0082B\2\u02da\u02db\bA\1\2\u02db\u02dd\3\2\2\2\u02dc\u02d7\3\2\2\2\u02dd"+
		"\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u0081\3\2"+
		"\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e2\bB\1\2\u02e2\u02e3\5\u0084C\2\u02e3"+
		"\u02eb\3\2\2\2\u02e4\u02e5\f\3\2\2\u02e5\u02e6\7\65\2\2\u02e6\u02e7\5"+
		"\u0084C\2\u02e7\u02e8\bB\1\2\u02e8\u02ea\3\2\2\2\u02e9\u02e4\3\2\2\2\u02ea"+
		"\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u0083\3\2"+
		"\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02ef\bC\1\2\u02ef\u02f0\5\u0086D\2\u02f0"+
		"\u02f8\3\2\2\2\u02f1\u02f2\f\3\2\2\u02f2\u02f3\t\3\2\2\u02f3\u02f4\5\u0086"+
		"D\2\u02f4\u02f5\bC\1\2\u02f5\u02f7\3\2\2\2\u02f6\u02f1\3\2\2\2\u02f7\u02fa"+
		"\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u0085\3\2\2\2\u02fa"+
		"\u02f8\3\2\2\2\u02fb\u02fc\bD\1\2\u02fc\u02fd\5\u0088E\2\u02fd\u0305\3"+
		"\2\2\2\u02fe\u02ff\f\3\2\2\u02ff\u0300\t\4\2\2\u0300\u0301\5\u0088E\2"+
		"\u0301\u0302\bD\1\2\u0302\u0304\3\2\2\2\u0303\u02fe\3\2\2\2\u0304\u0307"+
		"\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0087\3\2\2\2\u0307"+
		"\u0305\3\2\2\2\u0308\u0309\bE\1\2\u0309\u030a\5\u008aF\2\u030a\u0312\3"+
		"\2\2\2\u030b\u030c\f\3\2\2\u030c\u030d\t\5\2\2\u030d\u030e\5\u008aF\2"+
		"\u030e\u030f\bE\1\2\u030f\u0311\3\2\2\2\u0310\u030b\3\2\2\2\u0311\u0314"+
		"\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0089\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0315\u0316\bF\1\2\u0316\u0317\5\u008cG\2\u0317\u031f\3"+
		"\2\2\2\u0318\u0319\f\3\2\2\u0319\u031a\t\6\2\2\u031a\u031b\5\u008cG\2"+
		"\u031b\u031c\bF\1\2\u031c\u031e\3\2\2\2\u031d\u0318\3\2\2\2\u031e\u0321"+
		"\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u008b\3\2\2\2\u0321"+
		"\u031f\3\2\2\2\u0322\u032a\5\u008eH\2\u0323\u032a\5\u0090I\2\u0324\u0325"+
		"\79\2\2\u0325\u032a\5\u008cG\2\u0326\u0327\7:\2\2\u0327\u032a\5\u008c"+
		"G\2\u0328\u032a\5\u0092J\2\u0329\u0322\3\2\2\2\u0329\u0323\3\2\2\2\u0329"+
		"\u0324\3\2\2\2\u0329\u0326\3\2\2\2\u0329\u0328\3\2\2\2\u032a\u008d\3\2"+
		"\2\2\u032b\u032c\7\67\2\2\u032c\u032d\5\u008cG\2\u032d\u008f\3\2\2\2\u032e"+
		"\u032f\78\2\2\u032f\u0330\5\u008cG\2\u0330\u0091\3\2\2\2\u0331\u0335\5"+
		"\u0094K\2\u0332\u0333\7-\2\2\u0333\u0335\5\u008cG\2\u0334\u0331\3\2\2"+
		"\2\u0334\u0332\3\2\2\2\u0335\u0093\3\2\2\2\u0336\u0339\5J&\2\u0337\u0339"+
		"\5H%\2\u0338\u0336\3\2\2\2\u0338\u0337\3\2\2\2\u0339\u033e\3\2\2\2\u033a"+
		"\u033d\5\u0098M\2\u033b\u033d\5\u009cO\2\u033c\u033a\3\2\2\2\u033c\u033b"+
		"\3\2\2\2\u033d\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f"+
		"\u0095\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u0342\5\u0094K\2\u0342\u0343"+
		"\7\67\2\2\u0343\u0097\3\2\2\2\u0344\u0345\7\67\2\2\u0345\u0099\3\2\2\2"+
		"\u0346\u0347\5\u0094K\2\u0347\u0348\78\2\2\u0348\u009b\3\2\2\2\u0349\u034a"+
		"\78\2\2\u034a\u009d\3\2\2\2\u034b\u034f\5\u00a8U\2\u034c\u034f\7\37\2"+
		"\2\u034d\u034f\7\36\2\2\u034e\u034b\3\2\2\2\u034e\u034c\3\2\2\2\u034e"+
		"\u034d\3\2\2\2\u034f\u009f\3\2\2\2\u0350\u0351\7\32\2\2\u0351\u0352\7"+
		" \2\2\u0352\u0353\5\u00a2R\2\u0353\u0354\7!\2\2\u0354\u0355\7&\2\2\u0355"+
		"\u0356\bQ\1\2\u0356\u00a1\3\2\2\2\u0357\u0358\5~@\2\u0358\u00a3\3\2\2"+
		"\2\u0359\u035a\7&\2\2\u035a\u00a5\3\2\2\2\u035b\u035c\7A\2\2\u035c\u00a7"+
		"\3\2\2\2\u035d\u0362\7\35\2\2\u035e\u0362\7\34\2\2\u035f\u0360\7:\2\2"+
		"\u0360\u0362\7\34\2\2\u0361\u035d\3\2\2\2\u0361\u035e\3\2\2\2\u0361\u035f"+
		"\3\2\2\2\u0362\u00a9\3\2\2\2U\u00ad\u00b6\u00bc\u00c9\u00cf\u00d2\u00d8"+
		"\u00e0\u00ea\u00ef\u00f7\u00fb\u00fd\u0106\u0111\u0119\u0120\u012c\u012f"+
		"\u013b\u0142\u0145\u014c\u0150\u0157\u015f\u016a\u0171\u017d\u0186\u0191"+
		"\u0197\u019b\u019f\u01a9\u01b1\u01bc\u01c2\u01d2\u01de\u01e3\u01e8\u01f5"+
		"\u0202\u0208\u020e\u0219\u0225\u0238\u0241\u0250\u025d\u0266\u026b\u0271"+
		"\u0278\u027e\u0281\u0287\u028a\u0291\u0297\u029e\u02a8\u02ae\u02b4\u02bc"+
		"\u02c1\u02c5\u02d2\u02de\u02eb\u02f8\u0305\u0312\u031f\u0329\u0334\u0338"+
		"\u033c\u033e\u034e\u0361";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}