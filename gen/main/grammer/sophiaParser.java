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
		RULE_methodCall = 51, RULE_methodCall2 = 52, RULE_methodCallBody = 53, 
		RULE_expression = 54, RULE_assignment = 55, RULE_leftHandSide = 56, RULE_classAssignment = 57, 
		RULE_listInitializer = 58, RULE_preExp = 59, RULE_postExp = 60, RULE_expr = 61, 
		RULE_conditionalOrExpression = 62, RULE_conditionalAndExpression = 63, 
		RULE_inclusiveOrExpression = 64, RULE_exclusiveOrExpression = 65, RULE_andExpression = 66, 
		RULE_equalityExpression = 67, RULE_relationalExpression = 68, RULE_shiftExpression = 69, 
		RULE_additiveExpression = 70, RULE_multiplicativeExpression = 71, RULE_unaryExpression = 72, 
		RULE_preIncrementExpression = 73, RULE_preDecrementExpression = 74, RULE_unaryExpressionNotPlusMinus = 75, 
		RULE_postfixExpression = 76, RULE_postIncrementExpression = 77, RULE_postIncrementExpression_lf_postfixExpression = 78, 
		RULE_postDecrementExpression = 79, RULE_postDecrementExpression_lf_postfixExpression = 80, 
		RULE_literal = 81, RULE_printStatement = 82, RULE_printBody = 83, RULE_emptyStatement = 84, 
		RULE_comment = 85, RULE_intLiteral = 86;
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
			"methodCall", "methodCall2", "methodCallBody", "expression", "assignment", 
			"leftHandSide", "classAssignment", "listInitializer", "preExp", "postExp", 
			"expr", "conditionalOrExpression", "conditionalAndExpression", "inclusiveOrExpression", 
			"exclusiveOrExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"shiftExpression", "additiveExpression", "multiplicativeExpression", 
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
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(174);
				classDeclaration();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
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
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(INT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(BOOL);
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
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
			setState(188);
			match(CLASS);
			setState(189);
			((ClassDeclarationContext)_localctx).aa = match(IDENTIFIER);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(190);
				match(EXTENDS);
				setState(191);
				((ClassDeclarationContext)_localctx).bb = match(IDENTIFIER);
				}
			}


			           if ((((ClassDeclarationContext)_localctx).bb!=null?((ClassDeclarationContext)_localctx).bb.getText():null) == null){
			               System.out.println("ClassDec:"+(((ClassDeclarationContext)_localctx).aa!=null?((ClassDeclarationContext)_localctx).aa.getText():null));
			           } else {
			               System.out.println("ClassDec:"+(((ClassDeclarationContext)_localctx).aa!=null?((ClassDeclarationContext)_localctx).aa.getText():null)+", "+(((ClassDeclarationContext)_localctx).bb!=null?((ClassDeclarationContext)_localctx).bb.getText():null));
			           }
			       
			setState(195);
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
			setState(197);
			match(LBRACE);
			setState(198);
			classBodyDeclaration();
			setState(199);
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
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACE) {
					{
					{
					setState(202);
					block();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << DEF) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << NEW) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
					{
					{
					setState(208);
					memberDeclaration();
					}
					}
					setState(213);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
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
			setState(222);
			match(DEF);
			setState(223);
			methodType();
			setState(224);
			((MethodDeclarationContext)_localctx).aa = match(IDENTIFIER);
			setState(225);
			match(LPAREN);

			                System.out.println("MethodDec:"+(((MethodDeclarationContext)_localctx).aa!=null?((MethodDeclarationContext)_localctx).aa.getText():null));
			        
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(227);
				methodArguements();
				}
			}

			setState(230);
			match(RPAREN);
			setState(231);
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
			setState(233);
			listvariableDeclaration();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(234);
				match(COMMA);
				setState(235);
				listvariableDeclaration();
				}
				}
				setState(240);
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
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
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
			setState(245);
			match(LBRACE);
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(246);
						variableDeclaration();
						setState(247);
						match(SEMI);
						}
						} 
					}
					setState(253);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << NEW) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
					{
					setState(254);
					blockStatements();
					}
				}

				}
				break;
			}
			setState(259);
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
			setState(261);
			match(DEF);
			setState(262);
			((ConstructorDeclarationContext)_localctx).aa = match(IDENTIFIER);
			setState(263);
			match(LPAREN);

			                    System.out.println("ConstructorDec:"+(((ConstructorDeclarationContext)_localctx).aa!=null?((ConstructorDeclarationContext)_localctx).aa.getText():null));
			            
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(265);
				methodArguements();
				}
			}

			setState(268);
			match(RPAREN);
			setState(269);
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
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				variableDeclaration();
				setState(272);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				variableInitializer();
				setState(275);
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
			setState(279);
			((VariableDeclarationContext)_localctx).aa = match(IDENTIFIER);
			setState(280);
			match(COLON);

			                    System.out.println("VarDec:"+(((VariableDeclarationContext)_localctx).aa!=null?((VariableDeclarationContext)_localctx).aa.getText():null));
			            
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				{
				setState(282);
				listDeclaration();
				}
				break;
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
				{
				setState(283);
				type();
				}
				break;
			case IDENTIFIER:
				{
				setState(284);
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
			setState(287);
			match(IDENTIFIER);
			setState(288);
			match(COLON);
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				{
				setState(289);
				listDeclaration();
				}
				break;
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
				{
				setState(290);
				type();
				}
				break;
			case IDENTIFIER:
				{
				setState(291);
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
			setState(294);
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
			setState(296);
			match(FUNC);
			setState(297);
			match(LT);
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(298);
				match(VOID);
				}
				break;
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
				{
				{
				setState(299);
				type();
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(300);
					match(COMMA);
					setState(301);
					type();
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(309);
			match(ARROW);
			setState(310);
			type();
			setState(311);
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
			setState(313);
			match(LIST);
			setState(314);
			match(LPAREN);
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POS_INT:
				{
				{
				setState(315);
				match(POS_INT);
				setState(316);
				match(T__0);
				setState(319);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
				case INT:
				case STRING:
				case BOOL:
					{
					setState(317);
					type();
					}
					break;
				case LIST:
					{
					setState(318);
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
				setState(321);
				listBody();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(322);
					match(COMMA);
					setState(323);
					listBody();
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(331);
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
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				listvariableDeclaration();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				listDeclaration();
				}
				break;
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
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
			setState(338);
			match(LBRACE);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << NEW) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << INC) | (1L << DEC) | (1L << SUB))) != 0)) {
				{
				setState(339);
				blockStatements();
				}
			}

			setState(342);
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
			setState(345); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(344);
				blockStatement();
				}
				}
				setState(347); 
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
			setState(349);
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
			setState(355);
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
				setState(351);
				statementWithoutTrailingSubstatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				forStatement();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
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
			setState(357);
			match(IF);

			                System.out.println("Conditional:if");
			            
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(359);
					match(ELSE);
					setState(360);
					match(IF);
					setState(361);
					((IfStatementContext)_localctx).bb = condition_block();

					                System.out.println("Conditional:if");
					                System.out.println("Conditional:else");
					            
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(369);
				match(ELSE);
				setState(370);
				((IfStatementContext)_localctx).cc = statBlock();

				                System.out.println("Conditional:else");
				            
				}
			}

			setState(375);
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
			setState(377);
			expr();
			setState(378);
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
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				match(LBRACE);
				setState(382);
				block();
				setState(383);
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
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
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
				setState(389);
				expStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(391);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(392);
				returnStatement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(393);
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
			setState(396);
			statementExp();
			setState(397);
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
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				preExp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
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
			setState(405);
			match(FOR);

			                        System.out.println("Loop:for");
			                
			setState(407);
			match(LPAREN);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << SUB))) != 0)) {
				{
				setState(408);
				initialStatement();
				}
			}

			setState(411);
			match(SEMI);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACK) | (1L << NOT) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(412);
				expr();
				}
			}

			setState(415);
			match(SEMI);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << SUB))) != 0)) {
				{
				setState(416);
				updateStatement();
				}
			}

			setState(419);
			match(RPAREN);
			setState(420);
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
			setState(422);
			assignment();
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(423);
				match(COMMA);
				setState(424);
				assignment();
				}
				}
				setState(429);
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
			setState(430);
			assignment();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(431);
				match(COMMA);
				setState(432);
				assignment();
				}
				}
				setState(437);
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
			setState(438);
			match(FOREACH);
			setState(439);
			match(LPAREN);
			setState(440);
			match(IDENTIFIER);
			setState(441);
			match(IN);

			                            System.out.println("Loop:foreach");
			                    
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(443);
				match(IDENTIFIER);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(444);
					match(DOT);
					setState(445);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case 2:
				{
				setState(448);
				match(THIS);
				setState(449);
				match(DOT);
				setState(450);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(451);
				expr();
				}
				break;
			}
			setState(454);
			match(RPAREN);
			setState(455);
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
			setState(457);
			match(BREAK);
			setState(458);
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
			setState(461);
			match(CONTINUE);
			setState(462);
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
			setState(465);
			match(RETURN);

			                System.out.println("Return");
			        
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACK) | (1L << NOT) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(467);
				expr();
				}
			}

			setState(470);
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
			setState(473);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(480);
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
					setState(475);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(476);
					match(DOT);
					setState(477);
					match(IDENTIFIER);
					}
					} 
				}
				setState(482);
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
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(483);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(484);
				classAssignment();
				}
				break;
			}
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(487);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(492);
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
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				match(LPAREN);
				setState(496);
				expression();
				setState(497);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(499);
				classAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(500);
				fieldAccess();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(501);
				arrayAccess();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(502);
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
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(LPAREN);
				setState(510);
				expression();
				setState(511);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(513);
				classAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(514);
				fieldAccess();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(515);
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
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				fieldAccess_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				arrayAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
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
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				fieldAccess_lf_primary();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
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
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				match(LPAREN);
				setState(532);
				expression();
				setState(533);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				classAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(536);
				arrayAccess_lfno_primary();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(537);
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
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				literal();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				match(THIS);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				match(LPAREN);
				setState(545);
				expression();
				setState(546);
				match(RPAREN);
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(548);
				classAssignment();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(549);
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
			setState(552);
			primary();
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
			setState(556);
			match(DOT);
			setState(557);
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
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(559);
				expressionName(0);
				setState(560);
				match(LBRACK);
				setState(561);
				expression();
				setState(562);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(564);
				primaryNoNewArray_lfno_arrayAccess();
				setState(565);
				match(LBRACK);
				setState(566);
				expression();
				setState(567);
				match(RBRACK);
				}
				break;
			}
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(571);
				primaryNoNewArray_lf_arrayAccess();
				setState(572);
				match(LBRACK);
				setState(573);
				expression();
				setState(574);
				match(RBRACK);
				}
				}
				setState(580);
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
			setState(581);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(582);
			match(LBRACK);
			setState(583);
			expression();
			setState(584);
			match(RBRACK);
			}
			setState(593);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(586);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(587);
					match(LBRACK);
					setState(588);
					expression();
					setState(589);
					match(RBRACK);
					}
					} 
				}
				setState(595);
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
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(596);
				expressionName(0);
				setState(597);
				match(LBRACK);
				setState(598);
				expression();
				setState(599);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(601);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(602);
				match(LBRACK);
				setState(603);
				expression();
				setState(604);
				match(RBRACK);
				}
				break;
			}
			setState(615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(608);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(609);
					match(LBRACK);
					setState(610);
					expression();
					setState(611);
					match(RBRACK);
					}
					} 
				}
				setState(617);
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
		enterRule(_localctx, 102, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(618);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(619);
					primary();
					}
					break;
				case 3:
					{
					setState(620);
					expressionName(0);
					}
					break;
				}
				setState(623);
				match(DOT);
				}
				break;
			}
			setState(626);
			methodCallBody();

			                        System.out.println("MethodCall");
			                
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
		enterRule(_localctx, 104, RULE_methodCall2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(629);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(630);
					expressionName(0);
					}
					break;
				}
				setState(633);
				match(DOT);
				}
				break;
			}
			setState(636);
			methodCallBody();

			                           System.out.println("MethodCall");
			                   
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
		enterRule(_localctx, 106, RULE_methodCallBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(IDENTIFIER);
			setState(640);
			match(LPAREN);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACK) | (1L << NOT) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(641);
				expr();
				}
			}

			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(644);
				match(COMMA);
				setState(645);
				expr();
				}
				}
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(651);
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
		enterRule(_localctx, 108, RULE_expression);
		try {
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
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
		enterRule(_localctx, 110, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			leftHandSide();
			setState(658);
			match(ASSIGN);
			setState(659);
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
		enterRule(_localctx, 112, RULE_leftHandSide);
		try {
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				expressionName(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(663);
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
		enterRule(_localctx, 114, RULE_classAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(NEW);
			setState(667);
			match(IDENTIFIER);
			setState(668);
			match(LPAREN);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << LPAREN) | (1L << LBRACK) | (1L << NOT) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(669);
				expr();
				}
			}

			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(672);
				match(COMMA);
				setState(673);
				expr();
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
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
		enterRule(_localctx, 116, RULE_listInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(LBRACK);
			{
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(682);
				listInitializer();
				}
				break;
			case 2:
				{
				setState(683);
				expr();
				}
				break;
			}
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(686);
				match(COMMA);
				setState(689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(687);
					listInitializer();
					}
					break;
				case 2:
					{
					setState(688);
					expr();
					}
					break;
				}
				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(696);
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
		enterRule(_localctx, 118, RULE_preExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(699);
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
		enterRule(_localctx, 120, RULE_postExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			literal();
			setState(702);
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
		enterRule(_localctx, 122, RULE_expr);
		try {
			setState(706);
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
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				conditionalOrExpression(0);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
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
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(709);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(711);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(712);
					match(OR);
					setState(713);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
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
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(720);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(727);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(722);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(723);
					match(AND);
					setState(724);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode BITOR() { return getToken(sophiaParser.BITOR, 0); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(731);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(738);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(733);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(734);
					match(BITOR);
					setState(735);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode CARET() { return getToken(sophiaParser.CARET, 0); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(742);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(744);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(745);
					match(CARET);
					setState(746);
					andExpression(0);
					}
					} 
				}
				setState(751);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode BITAND() { return getToken(sophiaParser.BITAND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(753);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(760);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(755);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(756);
					match(BITAND);
					setState(757);
					equalityExpression(0);
					}
					} 
				}
				setState(762);
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
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(764);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(772);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(766);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(767);
						match(EQUAL);
						setState(768);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(769);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(770);
						match(NOTEQUAL);
						setState(771);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(776);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(sophiaParser.LT, 0); }
		public TerminalNode GT() { return getToken(sophiaParser.GT, 0); }
		public TerminalNode LE() { return getToken(sophiaParser.LE, 0); }
		public TerminalNode GE() { return getToken(sophiaParser.GE, 0); }
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
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(778);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(794);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(792);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(780);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(781);
						match(LT);
						setState(782);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(783);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(784);
						match(GT);
						setState(785);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(786);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(787);
						match(LE);
						setState(788);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(789);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(790);
						match(GE);
						setState(791);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(796);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public List<TerminalNode> LT() { return getTokens(sophiaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(sophiaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(sophiaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(sophiaParser.GT, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(798);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(815);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(813);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(800);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(801);
						match(LT);
						setState(802);
						match(LT);
						setState(803);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(804);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(805);
						match(GT);
						setState(806);
						match(GT);
						setState(807);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(808);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(809);
						match(GT);
						setState(810);
						match(GT);
						setState(811);
						match(GT);
						setState(812);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(817);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(819);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(829);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(827);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(821);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(822);
						match(ADD);
						setState(823);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(824);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(825);
						match(SUB);
						setState(826);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(833);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(846);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(844);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(835);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(836);
						match(MUL);
						setState(837);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(838);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(839);
						match(DIV);
						setState(840);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(841);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(842);
						match(MOD);
						setState(843);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
		enterRule(_localctx, 144, RULE_unaryExpression);
		try {
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				preIncrementExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(850);
				preDecrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(851);
				match(ADD);
				setState(852);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(853);
				match(SUB);
				setState(854);
				unaryExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(855);
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
		enterRule(_localctx, 146, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(INC);
			setState(859);
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
		enterRule(_localctx, 148, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(DEC);
			setState(862);
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
		public TerminalNode TILDE() { return getToken(sophiaParser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(sophiaParser.NOT, 0); }
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
		enterRule(_localctx, 150, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(869);
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
				setState(864);
				postfixExpression();
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				match(TILDE);
				setState(866);
				unaryExpression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(867);
				match(NOT);
				setState(868);
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
		enterRule(_localctx, 152, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(871);
				primary();
				}
				break;
			case 2:
				{
				setState(872);
				expressionName(0);
				}
				break;
			}
			setState(879);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(877);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(875);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(876);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(881);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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
		enterRule(_localctx, 154, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			postfixExpression();
			setState(883);
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
		enterRule(_localctx, 156, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
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
		enterRule(_localctx, 158, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			postfixExpression();
			setState(888);
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
		enterRule(_localctx, 160, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
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
		enterRule(_localctx, 162, RULE_literal);
		try {
			setState(895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POS_INT:
			case ZERO:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				intLiteral();
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				match(BOOL_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(894);
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
		enterRule(_localctx, 164, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(PRINT);
			setState(898);
			match(LPAREN);
			setState(899);
			printBody();
			setState(900);
			match(RPAREN);
			setState(901);
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
		enterRule(_localctx, 166, RULE_printBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
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
		enterRule(_localctx, 168, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
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
		enterRule(_localctx, 170, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
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
		enterRule(_localctx, 172, RULE_intLiteral);
		try {
			setState(914);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(910);
				match(ZERO);
				}
				break;
			case POS_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
				match(POS_INT);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(912);
				match(SUB);
				setState(913);
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
		case 62:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 63:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 64:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 65:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 66:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 67:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 68:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 69:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 70:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 71:
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
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 3);
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0397\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\7\2\u00b2\n\2\f\2\16\2\u00b5\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\5\3\u00bd\n\3\3\4\3\4\3\4\3\4\5\4\u00c3\n\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\7\6\u00ce\n\6\f\6\16\6\u00d1\13\6\3\6\7\6\u00d4"+
		"\n\6\f\6\16\6\u00d7\13\6\5\6\u00d9\n\6\3\7\3\7\3\7\3\7\5\7\u00df\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e7\n\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00ef"+
		"\n\t\f\t\16\t\u00f2\13\t\3\n\3\n\5\n\u00f6\n\n\3\13\3\13\3\13\3\13\7\13"+
		"\u00fc\n\13\f\13\16\13\u00ff\13\13\3\13\5\13\u0102\n\13\5\13\u0104\n\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u010d\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0118\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0120\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0127\n\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u0131\n\21\f\21\16\21\u0134\13\21\5\21\u0136\n\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0142\n\22\3\22\3\22"+
		"\3\22\7\22\u0147\n\22\f\22\16\22\u014a\13\22\5\22\u014c\n\22\3\22\3\22"+
		"\3\23\3\23\3\23\5\23\u0153\n\23\3\24\3\24\5\24\u0157\n\24\3\24\3\24\3"+
		"\25\6\25\u015c\n\25\r\25\16\25\u015d\3\26\3\26\3\27\3\27\3\27\3\27\5\27"+
		"\u0166\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u016f\n\30\f\30\16"+
		"\30\u0172\13\30\3\30\3\30\3\30\3\30\5\30\u0178\n\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u0184\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u018d\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0196"+
		"\n\35\3\36\3\36\3\36\3\36\5\36\u019c\n\36\3\36\3\36\5\36\u01a0\n\36\3"+
		"\36\3\36\5\36\u01a4\n\36\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u01ac\n\37"+
		"\f\37\16\37\u01af\13\37\3 \3 \3 \7 \u01b4\n \f \16 \u01b7\13 \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\5!\u01c1\n!\3!\3!\3!\3!\5!\u01c7\n!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\5$\u01d7\n$\3$\3$\3%\3%\3%\3%\3%\3%\7%\u01e1"+
		"\n%\f%\16%\u01e4\13%\3&\3&\5&\u01e8\n&\3&\7&\u01eb\n&\f&\16&\u01ee\13"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01fa\n\'\3(\3(\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\5)\u0207\n)\3*\3*\3*\5*\u020c\n*\3+\3+\3,\3,\5,\u0212"+
		"\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u021d\n-\3.\3.\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\5/\u0229\n/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u023c\n\62\3\62\3\62\3\62\3\62\3\62"+
		"\7\62\u0243\n\62\f\62\16\62\u0246\13\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\7\63\u0252\n\63\f\63\16\63\u0255\13\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0261\n\64\3\64\3\64\3\64"+
		"\3\64\3\64\7\64\u0268\n\64\f\64\16\64\u026b\13\64\3\65\3\65\3\65\5\65"+
		"\u0270\n\65\3\65\5\65\u0273\n\65\3\65\3\65\3\65\3\66\3\66\5\66\u027a\n"+
		"\66\3\66\5\66\u027d\n\66\3\66\3\66\3\66\3\67\3\67\3\67\5\67\u0285\n\67"+
		"\3\67\3\67\7\67\u0289\n\67\f\67\16\67\u028c\13\67\3\67\3\67\38\38\58\u0292"+
		"\n8\39\39\39\39\3:\3:\3:\5:\u029b\n:\3;\3;\3;\3;\5;\u02a1\n;\3;\3;\7;"+
		"\u02a5\n;\f;\16;\u02a8\13;\3;\3;\3<\3<\3<\5<\u02af\n<\3<\3<\3<\5<\u02b4"+
		"\n<\7<\u02b6\n<\f<\16<\u02b9\13<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\5?\u02c5"+
		"\n?\3@\3@\3@\3@\3@\3@\7@\u02cd\n@\f@\16@\u02d0\13@\3A\3A\3A\3A\3A\3A\7"+
		"A\u02d8\nA\fA\16A\u02db\13A\3B\3B\3B\3B\3B\3B\7B\u02e3\nB\fB\16B\u02e6"+
		"\13B\3C\3C\3C\3C\3C\3C\7C\u02ee\nC\fC\16C\u02f1\13C\3D\3D\3D\3D\3D\3D"+
		"\7D\u02f9\nD\fD\16D\u02fc\13D\3E\3E\3E\3E\3E\3E\3E\3E\3E\7E\u0307\nE\f"+
		"E\16E\u030a\13E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\7F\u031b"+
		"\nF\fF\16F\u031e\13F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\7"+
		"G\u0330\nG\fG\16G\u0333\13G\3H\3H\3H\3H\3H\3H\3H\3H\3H\7H\u033e\nH\fH"+
		"\16H\u0341\13H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\7I\u034f\nI\fI\16I"+
		"\u0352\13I\3J\3J\3J\3J\3J\3J\3J\5J\u035b\nJ\3K\3K\3K\3L\3L\3L\3M\3M\3"+
		"M\3M\3M\5M\u0368\nM\3N\3N\5N\u036c\nN\3N\3N\7N\u0370\nN\fN\16N\u0373\13"+
		"N\3O\3O\3O\3P\3P\3Q\3Q\3Q\3R\3R\3S\3S\3S\5S\u0382\nS\3T\3T\3T\3T\3T\3"+
		"T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3X\3X\5X\u0395\nX\3X\2\rH~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090Y\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\2\3"+
		"\3\2\678\2\u03c7\2\u00b3\3\2\2\2\4\u00bc\3\2\2\2\6\u00be\3\2\2\2\b\u00c7"+
		"\3\2\2\2\n\u00d8\3\2\2\2\f\u00de\3\2\2\2\16\u00e0\3\2\2\2\20\u00eb\3\2"+
		"\2\2\22\u00f5\3\2\2\2\24\u00f7\3\2\2\2\26\u0107\3\2\2\2\30\u0117\3\2\2"+
		"\2\32\u0119\3\2\2\2\34\u0121\3\2\2\2\36\u0128\3\2\2\2 \u012a\3\2\2\2\""+
		"\u013b\3\2\2\2$\u0152\3\2\2\2&\u0154\3\2\2\2(\u015b\3\2\2\2*\u015f\3\2"+
		"\2\2,\u0165\3\2\2\2.\u0167\3\2\2\2\60\u017b\3\2\2\2\62\u0183\3\2\2\2\64"+
		"\u018c\3\2\2\2\66\u018e\3\2\2\28\u0195\3\2\2\2:\u0197\3\2\2\2<\u01a8\3"+
		"\2\2\2>\u01b0\3\2\2\2@\u01b8\3\2\2\2B\u01cb\3\2\2\2D\u01cf\3\2\2\2F\u01d3"+
		"\3\2\2\2H\u01da\3\2\2\2J\u01e7\3\2\2\2L\u01f9\3\2\2\2N\u01fb\3\2\2\2P"+
		"\u0206\3\2\2\2R\u020b\3\2\2\2T\u020d\3\2\2\2V\u0211\3\2\2\2X\u021c\3\2"+
		"\2\2Z\u021e\3\2\2\2\\\u0228\3\2\2\2^\u022a\3\2\2\2`\u022e\3\2\2\2b\u023b"+
		"\3\2\2\2d\u0247\3\2\2\2f\u0260\3\2\2\2h\u0272\3\2\2\2j\u027c\3\2\2\2l"+
		"\u0281\3\2\2\2n\u0291\3\2\2\2p\u0293\3\2\2\2r\u029a\3\2\2\2t\u029c\3\2"+
		"\2\2v\u02ab\3\2\2\2x\u02bc\3\2\2\2z\u02bf\3\2\2\2|\u02c4\3\2\2\2~\u02c6"+
		"\3\2\2\2\u0080\u02d1\3\2\2\2\u0082\u02dc\3\2\2\2\u0084\u02e7\3\2\2\2\u0086"+
		"\u02f2\3\2\2\2\u0088\u02fd\3\2\2\2\u008a\u030b\3\2\2\2\u008c\u031f\3\2"+
		"\2\2\u008e\u0334\3\2\2\2\u0090\u0342\3\2\2\2\u0092\u035a\3\2\2\2\u0094"+
		"\u035c\3\2\2\2\u0096\u035f\3\2\2\2\u0098\u0367\3\2\2\2\u009a\u036b\3\2"+
		"\2\2\u009c\u0374\3\2\2\2\u009e\u0377\3\2\2\2\u00a0\u0379\3\2\2\2\u00a2"+
		"\u037c\3\2\2\2\u00a4\u0381\3\2\2\2\u00a6\u0383\3\2\2\2\u00a8\u038a\3\2"+
		"\2\2\u00aa\u038c\3\2\2\2\u00ac\u038e\3\2\2\2\u00ae\u0394\3\2\2\2\u00b0"+
		"\u00b2\5\6\4\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b7\7\2\2\3\u00b7\3\3\2\2\2\u00b8\u00bd\7\22\2\2\u00b9\u00bd\7\23\2"+
		"\2\u00ba\u00bd\7\24\2\2\u00bb\u00bd\5 \21\2\u00bc\u00b8\3\2\2\2\u00bc"+
		"\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\5\3\2\2\2"+
		"\u00be\u00bf\7\4\2\2\u00bf\u00c2\7\33\2\2\u00c0\u00c1\7\5\2\2\u00c1\u00c3"+
		"\7\33\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2"+
		"\u00c4\u00c5\b\4\1\2\u00c5\u00c6\5\b\5\2\u00c6\7\3\2\2\2\u00c7\u00c8\7"+
		"\"\2\2\u00c8\u00c9\5\n\6\2\u00c9\u00ca\7#\2\2\u00ca\t\3\2\2\2\u00cb\u00d9"+
		"\7&\2\2\u00cc\u00ce\5&\24\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d9\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d2\u00d4\5\f\7\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00cb\3\2\2\2\u00d8\u00cf\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9"+
		"\13\3\2\2\2\u00da\u00df\5,\27\2\u00db\u00df\5\16\b\2\u00dc\u00df\5\26"+
		"\f\2\u00dd\u00df\5\30\r\2\u00de\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\r\3\2\2\2\u00e0\u00e1\7\7\2\2"+
		"\u00e1\u00e2\5\22\n\2\u00e2\u00e3\7\33\2\2\u00e3\u00e4\7 \2\2\u00e4\u00e6"+
		"\b\b\1\2\u00e5\u00e7\5\20\t\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7!\2\2\u00e9\u00ea\5\24\13\2\u00ea\17"+
		"\3\2\2\2\u00eb\u00f0\5\34\17\2\u00ec\u00ed\7\'\2\2\u00ed\u00ef\5\34\17"+
		"\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\21\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\5\4\3\2\u00f4"+
		"\u00f6\7\25\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\23\3\2\2"+
		"\2\u00f7\u0103\7\"\2\2\u00f8\u00f9\5\32\16\2\u00f9\u00fa\7&\2\2\u00fa"+
		"\u00fc\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0102\5(\25\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2"+
		"\2\2\u0103\u00fd\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\7#\2\2\u0106\25\3\2\2\2\u0107\u0108\7\7\2\2\u0108\u0109\7\33\2"+
		"\2\u0109\u010a\7 \2\2\u010a\u010c\b\f\1\2\u010b\u010d\5\20\t\2\u010c\u010b"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7!\2\2\u010f"+
		"\u0110\5\24\13\2\u0110\27\3\2\2\2\u0111\u0112\5\32\16\2\u0112\u0113\7"+
		"&\2\2\u0113\u0118\3\2\2\2\u0114\u0115\5\36\20\2\u0115\u0116\7&\2\2\u0116"+
		"\u0118\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0114\3\2\2\2\u0118\31\3\2\2"+
		"\2\u0119\u011a\7\33\2\2\u011a\u011b\7\60\2\2\u011b\u011f\b\16\1\2\u011c"+
		"\u0120\5\"\22\2\u011d\u0120\5\4\3\2\u011e\u0120\7\33\2\2\u011f\u011c\3"+
		"\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120\33\3\2\2\2\u0121"+
		"\u0122\7\33\2\2\u0122\u0126\7\60\2\2\u0123\u0127\5\"\22\2\u0124\u0127"+
		"\5\4\3\2\u0125\u0127\7\33\2\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2"+
		"\u0126\u0125\3\2\2\2\u0127\35\3\2\2\2\u0128\u0129\5p9\2\u0129\37\3\2\2"+
		"\2\u012a\u012b\7\b\2\2\u012b\u0135\7,\2\2\u012c\u0136\7\25\2\2\u012d\u0132"+
		"\5\4\3\2\u012e\u012f\7\'\2\2\u012f\u0131\5\4\3\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0135\u012c\3\2\2\2\u0135\u012d\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\7)\2\2\u0138\u0139\5\4\3\2\u0139\u013a\7+\2"+
		"\2\u013a!\3\2\2\2\u013b\u013c\7\26\2\2\u013c\u014b\7 \2\2\u013d\u013e"+
		"\7\34\2\2\u013e\u0141\7\3\2\2\u013f\u0142\5\4\3\2\u0140\u0142\5\"\22\2"+
		"\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\u014c\3\2\2\2\u0143\u0148"+
		"\5$\23\2\u0144\u0145\7\'\2\2\u0145\u0147\5$\23\2\u0146\u0144\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014c\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014b\u013d\3\2\2\2\u014b\u0143\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\7!\2\2\u014e#\3\2\2\2\u014f\u0153\5\34\17\2"+
		"\u0150\u0153\5\"\22\2\u0151\u0153\5\4\3\2\u0152\u014f\3\2\2\2\u0152\u0150"+
		"\3\2\2\2\u0152\u0151\3\2\2\2\u0153%\3\2\2\2\u0154\u0156\7\"\2\2\u0155"+
		"\u0157\5(\25\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\7#\2\2\u0159\'\3\2\2\2\u015a\u015c\5*\26\2\u015b\u015a"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		")\3\2\2\2\u015f\u0160\5,\27\2\u0160+\3\2\2\2\u0161\u0166\5\64\33\2\u0162"+
		"\u0166\5.\30\2\u0163\u0166\5:\36\2\u0164\u0166\5@!\2\u0165\u0161\3\2\2"+
		"\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166-"+
		"\3\2\2\2\u0167\u0168\7\n\2\2\u0168\u0170\b\30\1\2\u0169\u016a\7\13\2\2"+
		"\u016a\u016b\7\n\2\2\u016b\u016c\5\60\31\2\u016c\u016d\b\30\1\2\u016d"+
		"\u016f\3\2\2\2\u016e\u0169\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0177\3\2\2\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0174\7\13\2\2\u0174\u0175\5\62\32\2\u0175\u0176\b\30\1\2\u0176\u0178"+
		"\3\2\2\2\u0177\u0173\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017a\5\60\31\2\u017a/\3\2\2\2\u017b\u017c\5|?\2\u017c\u017d\5\62\32"+
		"\2\u017d\61\3\2\2\2\u017e\u0184\5,\27\2\u017f\u0180\7\"\2\2\u0180\u0181"+
		"\5&\24\2\u0181\u0182\7#\2\2\u0182\u0184\3\2\2\2\u0183\u017e\3\2\2\2\u0183"+
		"\u017f\3\2\2\2\u0184\63\3\2\2\2\u0185\u018d\5&\24\2\u0186\u018d\5\u00aa"+
		"V\2\u0187\u018d\5\66\34\2\u0188\u018d\5B\"\2\u0189\u018d\5D#\2\u018a\u018d"+
		"\5F$\2\u018b\u018d\5\u00a6T\2\u018c\u0185\3\2\2\2\u018c\u0186\3\2\2\2"+
		"\u018c\u0187\3\2\2\2\u018c\u0188\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018a"+
		"\3\2\2\2\u018c\u018b\3\2\2\2\u018d\65\3\2\2\2\u018e\u018f\58\35\2\u018f"+
		"\u0190\7&\2\2\u0190\67\3\2\2\2\u0191\u0196\5p9\2\u0192\u0196\5h\65\2\u0193"+
		"\u0196\5x=\2\u0194\u0196\5z>\2\u0195\u0191\3\2\2\2\u0195\u0192\3\2\2\2"+
		"\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u01969\3\2\2\2\u0197\u0198\7"+
		"\f\2\2\u0198\u0199\b\36\1\2\u0199\u019b\7 \2\2\u019a\u019c\5<\37\2\u019b"+
		"\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\7&"+
		"\2\2\u019e\u01a0\5|?\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u01a3\7&\2\2\u01a2\u01a4\5> \2\u01a3\u01a2\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7!\2\2\u01a6\u01a7\5\62"+
		"\32\2\u01a7;\3\2\2\2\u01a8\u01ad\5p9\2\u01a9\u01aa\7\'\2\2\u01aa\u01ac"+
		"\5p9\2\u01ab\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae=\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b5\5p9\2\u01b1"+
		"\u01b2\7\'\2\2\u01b2\u01b4\5p9\2\u01b3\u01b1\3\2\2\2\u01b4\u01b7\3\2\2"+
		"\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6?\3\2\2\2\u01b7\u01b5"+
		"\3\2\2\2\u01b8\u01b9\7\r\2\2\u01b9\u01ba\7 \2\2\u01ba\u01bb\7\33\2\2\u01bb"+
		"\u01bc\7\27\2\2\u01bc\u01c6\b!\1\2\u01bd\u01c0\7\33\2\2\u01be\u01bf\7"+
		"(\2\2\u01bf\u01c1\7\33\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c7\3\2\2\2\u01c2\u01c3\7\6\2\2\u01c3\u01c4\7(\2\2\u01c4\u01c7\7\33"+
		"\2\2\u01c5\u01c7\5|?\2\u01c6\u01bd\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c5"+
		"\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\7!\2\2\u01c9\u01ca\5\62\32\2"+
		"\u01caA\3\2\2\2\u01cb\u01cc\7\17\2\2\u01cc\u01cd\7&\2\2\u01cd\u01ce\b"+
		"\"\1\2\u01ceC\3\2\2\2\u01cf\u01d0\7\16\2\2\u01d0\u01d1\7&\2\2\u01d1\u01d2"+
		"\b#\1\2\u01d2E\3\2\2\2\u01d3\u01d4\7\t\2\2\u01d4\u01d6\b$\1\2\u01d5\u01d7"+
		"\5|?\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d9\7&\2\2\u01d9G\3\2\2\2\u01da\u01db\b%\1\2\u01db\u01dc\7\33\2\2\u01dc"+
		"\u01e2\3\2\2\2\u01dd\u01de\f\3\2\2\u01de\u01df\7(\2\2\u01df\u01e1\7\33"+
		"\2\2\u01e0\u01dd\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3I\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e8\5X-\2\u01e6"+
		"\u01e8\5t;\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01ec\3\2\2"+
		"\2\u01e9\u01eb\5R*\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01edK\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01fa\5\u00a4S\2\u01f0\u01fa\7\6\2\2\u01f1\u01f2\7 \2\2\u01f2\u01f3\5"+
		"n8\2\u01f3\u01f4\7!\2\2\u01f4\u01fa\3\2\2\2\u01f5\u01fa\5t;\2\u01f6\u01fa"+
		"\5^\60\2\u01f7\u01fa\5b\62\2\u01f8\u01fa\5h\65\2\u01f9\u01ef\3\2\2\2\u01f9"+
		"\u01f0\3\2\2\2\u01f9\u01f1\3\2\2\2\u01f9\u01f5\3\2\2\2\u01f9\u01f6\3\2"+
		"\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01faM\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fcO\3\2\2\2\u01fd\u0207\5\u00a4S\2\u01fe\u0207\7\6\2\2\u01ff"+
		"\u0200\7 \2\2\u0200\u0201\5n8\2\u0201\u0202\7!\2\2\u0202\u0207\3\2\2\2"+
		"\u0203\u0207\5t;\2\u0204\u0207\5^\60\2\u0205\u0207\5h\65\2\u0206\u01fd"+
		"\3\2\2\2\u0206\u01fe\3\2\2\2\u0206\u01ff\3\2\2\2\u0206\u0203\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207Q\3\2\2\2\u0208\u020c\5`\61\2"+
		"\u0209\u020c\5d\63\2\u020a\u020c\5j\66\2\u020b\u0208\3\2\2\2\u020b\u0209"+
		"\3\2\2\2\u020b\u020a\3\2\2\2\u020cS\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"U\3\2\2\2\u020f\u0212\5`\61\2\u0210\u0212\5j\66\2\u0211\u020f\3\2\2\2"+
		"\u0211\u0210\3\2\2\2\u0212W\3\2\2\2\u0213\u021d\5\u00a4S\2\u0214\u021d"+
		"\7\6\2\2\u0215\u0216\7 \2\2\u0216\u0217\5n8\2\u0217\u0218\7!\2\2\u0218"+
		"\u021d\3\2\2\2\u0219\u021d\5t;\2\u021a\u021d\5f\64\2\u021b\u021d\5j\66"+
		"\2\u021c\u0213\3\2\2\2\u021c\u0214\3\2\2\2\u021c\u0215\3\2\2\2\u021c\u0219"+
		"\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021dY\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f[\3\2\2\2\u0220\u0229\5\u00a4S\2\u0221\u0229\7\6\2"+
		"\2\u0222\u0223\7 \2\2\u0223\u0224\5n8\2\u0224\u0225\7!\2\2\u0225\u0229"+
		"\3\2\2\2\u0226\u0229\5t;\2\u0227\u0229\5j\66\2\u0228\u0220\3\2\2\2\u0228"+
		"\u0221\3\2\2\2\u0228\u0222\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0227\3\2"+
		"\2\2\u0229]\3\2\2\2\u022a\u022b\5J&\2\u022b\u022c\7(\2\2\u022c\u022d\7"+
		"\33\2\2\u022d_\3\2\2\2\u022e\u022f\7(\2\2\u022f\u0230\7\33\2\2\u0230a"+
		"\3\2\2\2\u0231\u0232\5H%\2\u0232\u0233\7$\2\2\u0233\u0234\5n8\2\u0234"+
		"\u0235\7%\2\2\u0235\u023c\3\2\2\2\u0236\u0237\5P)\2\u0237\u0238\7$\2\2"+
		"\u0238\u0239\5n8\2\u0239\u023a\7%\2\2\u023a\u023c\3\2\2\2\u023b\u0231"+
		"\3\2\2\2\u023b\u0236\3\2\2\2\u023c\u0244\3\2\2\2\u023d\u023e\5N(\2\u023e"+
		"\u023f\7$\2\2\u023f\u0240\5n8\2\u0240\u0241\7%\2\2\u0241\u0243\3\2\2\2"+
		"\u0242\u023d\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245"+
		"\3\2\2\2\u0245c\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0248\5V,\2\u0248\u0249"+
		"\7$\2\2\u0249\u024a\5n8\2\u024a\u024b\7%\2\2\u024b\u0253\3\2\2\2\u024c"+
		"\u024d\5T+\2\u024d\u024e\7$\2\2\u024e\u024f\5n8\2\u024f\u0250\7%\2\2\u0250"+
		"\u0252\3\2\2\2\u0251\u024c\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2"+
		"\2\2\u0253\u0254\3\2\2\2\u0254e\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u0257"+
		"\5H%\2\u0257\u0258\7$\2\2\u0258\u0259\5n8\2\u0259\u025a\7%\2\2\u025a\u0261"+
		"\3\2\2\2\u025b\u025c\5\\/\2\u025c\u025d\7$\2\2\u025d\u025e\5n8\2\u025e"+
		"\u025f\7%\2\2\u025f\u0261\3\2\2\2\u0260\u0256\3\2\2\2\u0260\u025b\3\2"+
		"\2\2\u0261\u0269\3\2\2\2\u0262\u0263\5Z.\2\u0263\u0264\7$\2\2\u0264\u0265"+
		"\5n8\2\u0265\u0266\7%\2\2\u0266\u0268\3\2\2\2\u0267\u0262\3\2\2\2\u0268"+
		"\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026ag\3\2\2\2"+
		"\u026b\u0269\3\2\2\2\u026c\u0270\7\33\2\2\u026d\u0270\5J&\2\u026e\u0270"+
		"\5H%\2\u026f\u026c\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u026e\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u0273\7(\2\2\u0272\u026f\3\2\2\2\u0272\u0273\3\2"+
		"\2\2\u0273\u0274\3\2\2\2\u0274\u0275\5l\67\2\u0275\u0276\b\65\1\2\u0276"+
		"i\3\2\2\2\u0277\u027a\7\33\2\2\u0278\u027a\5H%\2\u0279\u0277\3\2\2\2\u0279"+
		"\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\7(\2\2\u027c\u0279\3\2"+
		"\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\5l\67\2\u027f"+
		"\u0280\b\66\1\2\u0280k\3\2\2\2\u0281\u0282\7\33\2\2\u0282\u0284\7 \2\2"+
		"\u0283\u0285\5|?\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u028a"+
		"\3\2\2\2\u0286\u0287\7\'\2\2\u0287\u0289\5|?\2\u0288\u0286\3\2\2\2\u0289"+
		"\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2"+
		"\2\2\u028c\u028a\3\2\2\2\u028d\u028e\7!\2\2\u028em\3\2\2\2\u028f\u0292"+
		"\5|?\2\u0290\u0292\5p9\2\u0291\u028f\3\2\2\2\u0291\u0290\3\2\2\2\u0292"+
		"o\3\2\2\2\u0293\u0294\5r:\2\u0294\u0295\7*\2\2\u0295\u0296\5|?\2\u0296"+
		"q\3\2\2\2\u0297\u029b\5H%\2\u0298\u029b\5^\60\2\u0299\u029b\5b\62\2\u029a"+
		"\u0297\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u0299\3\2\2\2\u029bs\3\2\2\2"+
		"\u029c\u029d\7\31\2\2\u029d\u029e\7\33\2\2\u029e\u02a0\7 \2\2\u029f\u02a1"+
		"\5|?\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a6\3\2\2\2\u02a2"+
		"\u02a3\7\'\2\2\u02a3\u02a5\5|?\2\u02a4\u02a2\3\2\2\2\u02a5\u02a8\3\2\2"+
		"\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6"+
		"\3\2\2\2\u02a9\u02aa\7!\2\2\u02aau\3\2\2\2\u02ab\u02ae\7$\2\2\u02ac\u02af"+
		"\5v<\2\u02ad\u02af\5|?\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2\2\2\u02af"+
		"\u02b7\3\2\2\2\u02b0\u02b3\7\'\2\2\u02b1\u02b4\5v<\2\u02b2\u02b4\5|?\2"+
		"\u02b3\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b0"+
		"\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"\u02ba\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bb\7%\2\2\u02bbw\3\2\2\2\u02bc"+
		"\u02bd\t\2\2\2\u02bd\u02be\5\u00a4S\2\u02bey\3\2\2\2\u02bf\u02c0\5\u00a4"+
		"S\2\u02c0\u02c1\t\2\2\2\u02c1{\3\2\2\2\u02c2\u02c5\5~@\2\u02c3\u02c5\5"+
		"v<\2\u02c4\u02c2\3\2\2\2\u02c4\u02c3\3\2\2\2\u02c5}\3\2\2\2\u02c6\u02c7"+
		"\b@\1\2\u02c7\u02c8\5\u0080A\2\u02c8\u02ce\3\2\2\2\u02c9\u02ca\f\3\2\2"+
		"\u02ca\u02cb\7\66\2\2\u02cb\u02cd\5\u0080A\2\u02cc\u02c9\3\2\2\2\u02cd"+
		"\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\177\3\2\2"+
		"\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2\bA\1\2\u02d2\u02d3\5\u0082B\2\u02d3"+
		"\u02d9\3\2\2\2\u02d4\u02d5\f\3\2\2\u02d5\u02d6\7\65\2\2\u02d6\u02d8\5"+
		"\u0082B\2\u02d7\u02d4\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2"+
		"\u02d9\u02da\3\2\2\2\u02da\u0081\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02dd"+
		"\bB\1\2\u02dd\u02de\5\u0084C\2\u02de\u02e4\3\2\2\2\u02df\u02e0\f\3\2\2"+
		"\u02e0\u02e1\7>\2\2\u02e1\u02e3\5\u0084C\2\u02e2\u02df\3\2\2\2\u02e3\u02e6"+
		"\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u0083\3\2\2\2\u02e6"+
		"\u02e4\3\2\2\2\u02e7\u02e8\bC\1\2\u02e8\u02e9\5\u0086D\2\u02e9\u02ef\3"+
		"\2\2\2\u02ea\u02eb\f\3\2\2\u02eb\u02ec\7?\2\2\u02ec\u02ee\5\u0086D\2\u02ed"+
		"\u02ea\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2"+
		"\2\2\u02f0\u0085\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3\bD\1\2\u02f3"+
		"\u02f4\5\u0088E\2\u02f4\u02fa\3\2\2\2\u02f5\u02f6\f\3\2\2\u02f6\u02f7"+
		"\7=\2\2\u02f7\u02f9\5\u0088E\2\u02f8\u02f5\3\2\2\2\u02f9\u02fc\3\2\2\2"+
		"\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u0087\3\2\2\2\u02fc\u02fa"+
		"\3\2\2\2\u02fd\u02fe\bE\1\2\u02fe\u02ff\5\u008aF\2\u02ff\u0308\3\2\2\2"+
		"\u0300\u0301\f\4\2\2\u0301\u0302\7\61\2\2\u0302\u0307\5\u008aF\2\u0303"+
		"\u0304\f\3\2\2\u0304\u0305\7\64\2\2\u0305\u0307\5\u008aF\2\u0306\u0300"+
		"\3\2\2\2\u0306\u0303\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308"+
		"\u0309\3\2\2\2\u0309\u0089\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u030c\bF"+
		"\1\2\u030c\u030d\5\u008cG\2\u030d\u031c\3\2\2\2\u030e\u030f\f\6\2\2\u030f"+
		"\u0310\7,\2\2\u0310\u031b\5\u008cG\2\u0311\u0312\f\5\2\2\u0312\u0313\7"+
		"+\2\2\u0313\u031b\5\u008cG\2\u0314\u0315\f\4\2\2\u0315\u0316\7\62\2\2"+
		"\u0316\u031b\5\u008cG\2\u0317\u0318\f\3\2\2\u0318\u0319\7\63\2\2\u0319"+
		"\u031b\5\u008cG\2\u031a\u030e\3\2\2\2\u031a\u0311\3\2\2\2\u031a\u0314"+
		"\3\2\2\2\u031a\u0317\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031c"+
		"\u031d\3\2\2\2\u031d\u008b\3\2\2\2\u031e\u031c\3\2\2\2\u031f\u0320\bG"+
		"\1\2\u0320\u0321\5\u008eH\2\u0321\u0331\3\2\2\2\u0322\u0323\f\5\2\2\u0323"+
		"\u0324\7,\2\2\u0324\u0325\7,\2\2\u0325\u0330\5\u008eH\2\u0326\u0327\f"+
		"\4\2\2\u0327\u0328\7+\2\2\u0328\u0329\7+\2\2\u0329\u0330\5\u008eH\2\u032a"+
		"\u032b\f\3\2\2\u032b\u032c\7+\2\2\u032c\u032d\7+\2\2\u032d\u032e\7+\2"+
		"\2\u032e\u0330\5\u008eH\2\u032f\u0322\3\2\2\2\u032f\u0326\3\2\2\2\u032f"+
		"\u032a\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2"+
		"\2\2\u0332\u008d\3\2\2\2\u0333\u0331\3\2\2\2\u0334\u0335\bH\1\2\u0335"+
		"\u0336\5\u0090I\2\u0336\u033f\3\2\2\2\u0337\u0338\f\4\2\2\u0338\u0339"+
		"\79\2\2\u0339\u033e\5\u0090I\2\u033a\u033b\f\3\2\2\u033b\u033c\7:\2\2"+
		"\u033c\u033e\5\u0090I\2\u033d\u0337\3\2\2\2\u033d\u033a\3\2\2\2\u033e"+
		"\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u008f\3\2"+
		"\2\2\u0341\u033f\3\2\2\2\u0342\u0343\bI\1\2\u0343\u0344\5\u0092J\2\u0344"+
		"\u0350\3\2\2\2\u0345\u0346\f\5\2\2\u0346\u0347\7;\2\2\u0347\u034f\5\u0092"+
		"J\2\u0348\u0349\f\4\2\2\u0349\u034a\7<\2\2\u034a\u034f\5\u0092J\2\u034b"+
		"\u034c\f\3\2\2\u034c\u034d\7@\2\2\u034d\u034f\5\u0092J\2\u034e\u0345\3"+
		"\2\2\2\u034e\u0348\3\2\2\2\u034e\u034b\3\2\2\2\u034f\u0352\3\2\2\2\u0350"+
		"\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0091\3\2\2\2\u0352\u0350\3\2"+
		"\2\2\u0353\u035b\5\u0094K\2\u0354\u035b\5\u0096L\2\u0355\u0356\79\2\2"+
		"\u0356\u035b\5\u0092J\2\u0357\u0358\7:\2\2\u0358\u035b\5\u0092J\2\u0359"+
		"\u035b\5\u0098M\2\u035a\u0353\3\2\2\2\u035a\u0354\3\2\2\2\u035a\u0355"+
		"\3\2\2\2\u035a\u0357\3\2\2\2\u035a\u0359\3\2\2\2\u035b\u0093\3\2\2\2\u035c"+
		"\u035d\7\67\2\2\u035d\u035e\5\u0092J\2\u035e\u0095\3\2\2\2\u035f\u0360"+
		"\78\2\2\u0360\u0361\5\u0092J\2\u0361\u0097\3\2\2\2\u0362\u0368\5\u009a"+
		"N\2\u0363\u0364\7.\2\2\u0364\u0368\5\u0092J\2\u0365\u0366\7-\2\2\u0366"+
		"\u0368\5\u0092J\2\u0367\u0362\3\2\2\2\u0367\u0363\3\2\2\2\u0367\u0365"+
		"\3\2\2\2\u0368\u0099\3\2\2\2\u0369\u036c\5J&\2\u036a\u036c\5H%\2\u036b"+
		"\u0369\3\2\2\2\u036b\u036a\3\2\2\2\u036c\u0371\3\2\2\2\u036d\u0370\5\u009e"+
		"P\2\u036e\u0370\5\u00a2R\2\u036f\u036d\3\2\2\2\u036f\u036e\3\2\2\2\u0370"+
		"\u0373\3\2\2\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u009b\3\2"+
		"\2\2\u0373\u0371\3\2\2\2\u0374\u0375\5\u009aN\2\u0375\u0376\7\67\2\2\u0376"+
		"\u009d\3\2\2\2\u0377\u0378\7\67\2\2\u0378\u009f\3\2\2\2\u0379\u037a\5"+
		"\u009aN\2\u037a\u037b\78\2\2\u037b\u00a1\3\2\2\2\u037c\u037d\78\2\2\u037d"+
		"\u00a3\3\2\2\2\u037e\u0382\5\u00aeX\2\u037f\u0382\7\37\2\2\u0380\u0382"+
		"\7\36\2\2\u0381\u037e\3\2\2\2\u0381\u037f\3\2\2\2\u0381\u0380\3\2\2\2"+
		"\u0382\u00a5\3\2\2\2\u0383\u0384\7\32\2\2\u0384\u0385\7 \2\2\u0385\u0386"+
		"\5\u00a8U\2\u0386\u0387\7!\2\2\u0387\u0388\7&\2\2\u0388\u0389\bT\1\2\u0389"+
		"\u00a7\3\2\2\2\u038a\u038b\5|?\2\u038b\u00a9\3\2\2\2\u038c\u038d\7&\2"+
		"\2\u038d\u00ab\3\2\2\2\u038e\u038f\7A\2\2\u038f\u00ad\3\2\2\2\u0390\u0395"+
		"\7\35\2\2\u0391\u0395\7\34\2\2\u0392\u0393\7:\2\2\u0393\u0395\7\34\2\2"+
		"\u0394\u0390\3\2\2\2\u0394\u0391\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u00af"+
		"\3\2\2\2[\u00b3\u00bc\u00c2\u00cf\u00d5\u00d8\u00de\u00e6\u00f0\u00f5"+
		"\u00fd\u0101\u0103\u010c\u0117\u011f\u0126\u0132\u0135\u0141\u0148\u014b"+
		"\u0152\u0156\u015d\u0165\u0170\u0177\u0183\u018c\u0195\u019b\u019f\u01a3"+
		"\u01ad\u01b5\u01c0\u01c6\u01d6\u01e2\u01e7\u01ec\u01f9\u0206\u020b\u0211"+
		"\u021c\u0228\u023b\u0244\u0253\u0260\u0269\u026f\u0272\u0279\u027c\u0284"+
		"\u028a\u0291\u029a\u02a0\u02a6\u02ae\u02b3\u02b7\u02c4\u02ce\u02d9\u02e4"+
		"\u02ef\u02fa\u0306\u0308\u031a\u031c\u032f\u0331\u033d\u033f\u034e\u0350"+
		"\u035a\u0367\u036b\u036f\u0371\u0381\u0394";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}