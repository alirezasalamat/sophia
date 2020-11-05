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
		T__0=1, BOOL_LITERAL=2, CLASS=3, EXTENDS=4, THIS=5, DEF=6, FUNC=7, RETURN=8, 
		IF=9, ELSE=10, FOR=11, FOREACH=12, CONTINUE=13, BREAK=14, FALSE=15, TRUE=16, 
		INT=17, STRING=18, BOOL=19, VOID=20, LIST=21, IN=22, NULL=23, NEW=24, 
		PRINT=25, IDENTIFIER=26, POS_INT=27, ZERO=28, STRING_LITERAL=29, LPAREN=30, 
		RPAREN=31, LBRACE=32, RBRACE=33, LBRACK=34, RBRACK=35, SEMI=36, COMMA=37, 
		DOT=38, ARROW=39, ASSIGN=40, GT=41, LT=42, NOT=43, COLON=44, EQUAL=45, 
		LE=46, GE=47, NOTEQUAL=48, AND=49, OR=50, INC=51, DEC=52, ADD=53, SUB=54, 
		MUL=55, DIV=56, MOD=57, COMMENT=58, WS=59;
	public static final int
		RULE_sophia = 0, RULE_type = 1, RULE_classDeclaration = 2, RULE_classBody = 3, 
		RULE_classBodyDeclaration = 4, RULE_memberDeclaration = 5, RULE_methodDeclaration = 6, 
		RULE_methodArguements = 7, RULE_methodType = 8, RULE_methodBody = 9, RULE_constructorDeclaration = 10, 
		RULE_fieldDeclaration = 11, RULE_variableDeclaration = 12, RULE_listvariableDeclaration = 13, 
		RULE_variableInitializer = 14, RULE_funcPointerDeclarationBody = 15, RULE_listDeclaration = 16, 
		RULE_listBody = 17, RULE_block = 18, RULE_blockStatements = 19, RULE_blockStatement = 20, 
		RULE_statement = 21, RULE_ifStatement = 22, RULE_conditionBlock = 23, 
		RULE_statBlock = 24, RULE_statementWithoutSubstatement = 25, RULE_expStatement = 26, 
		RULE_statementExp = 27, RULE_forStatement = 28, RULE_initialStatement = 29, 
		RULE_updateStatement = 30, RULE_foreachStatement = 31, RULE_breakStatement = 32, 
		RULE_continueStatement = 33, RULE_returnStatement = 34, RULE_expressionName = 35, 
		RULE_primary = 36, RULE_primary4 = 37, RULE_primary5 = 38, RULE_primary3 = 39, 
		RULE_primary6 = 40, RULE_primary2 = 41, RULE_fieldCall = 42, RULE_fieldCallPrimary = 43, 
		RULE_arrayCall = 44, RULE_aarrayCallPrimary = 45, RULE_arrayCallNoPrimary = 46, 
		RULE_returnFuncPointer = 47, RULE_methodCall = 48, RULE_methodCall2 = 49, 
		RULE_methodCallBody = 50, RULE_empty = 51, RULE_expression = 52, RULE_assignment = 53, 
		RULE_leftSide = 54, RULE_classAssignment = 55, RULE_listInitializer = 56, 
		RULE_exprBody = 57, RULE_conditionalOrExpression = 58, RULE_conditionalAndExpression = 59, 
		RULE_equalityExpression = 60, RULE_relationExpression = 61, RULE_addExpression = 62, 
		RULE_multipleExpression = 63, RULE_unaryExpression = 64, RULE_preIncrementExpression = 65, 
		RULE_preDecrementExpression = 66, RULE_unaryExpressionNotPlusMinus = 67, 
		RULE_postfixExpression = 68, RULE_postIncExpressionPostfix = 69, RULE_postDecExpressionPostfix = 70, 
		RULE_literal = 71, RULE_printStatement = 72, RULE_printBody = 73, RULE_emptyStatement = 74, 
		RULE_comment = 75, RULE_intLiteral = 76;
	private static String[] makeRuleNames() {
		return new String[] {
			"sophia", "type", "classDeclaration", "classBody", "classBodyDeclaration", 
			"memberDeclaration", "methodDeclaration", "methodArguements", "methodType", 
			"methodBody", "constructorDeclaration", "fieldDeclaration", "variableDeclaration", 
			"listvariableDeclaration", "variableInitializer", "funcPointerDeclarationBody", 
			"listDeclaration", "listBody", "block", "blockStatements", "blockStatement", 
			"statement", "ifStatement", "conditionBlock", "statBlock", "statementWithoutSubstatement", 
			"expStatement", "statementExp", "forStatement", "initialStatement", "updateStatement", 
			"foreachStatement", "breakStatement", "continueStatement", "returnStatement", 
			"expressionName", "primary", "primary4", "primary5", "primary3", "primary6", 
			"primary2", "fieldCall", "fieldCallPrimary", "arrayCall", "aarrayCallPrimary", 
			"arrayCallNoPrimary", "returnFuncPointer", "methodCall", "methodCall2", 
			"methodCallBody", "empty", "expression", "assignment", "leftSide", "classAssignment", 
			"listInitializer", "exprBody", "conditionalOrExpression", "conditionalAndExpression", 
			"equalityExpression", "relationExpression", "addExpression", "multipleExpression", 
			"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
			"unaryExpressionNotPlusMinus", "postfixExpression", "postIncExpressionPostfix", 
			"postDecExpressionPostfix", "literal", "printStatement", "printBody", 
			"emptyStatement", "comment", "intLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", null, "'class'", "'extends'", "'this'", "'def'", "'func'", 
			"'return'", "'if'", "'else'", "'for'", "'foreach'", "'continue'", "'break'", 
			"'false'", "'true'", "'int'", "'string'", "'bool'", "'void'", "'list'", 
			"'in'", "'null'", "'new'", "'print'", null, null, "'0'", null, "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'='", 
			"'>'", "'<'", "'!'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BOOL_LITERAL", "CLASS", "EXTENDS", "THIS", "DEF", "FUNC", 
			"RETURN", "IF", "ELSE", "FOR", "FOREACH", "CONTINUE", "BREAK", "FALSE", 
			"TRUE", "INT", "STRING", "BOOL", "VOID", "LIST", "IN", "NULL", "NEW", 
			"PRINT", "IDENTIFIER", "POS_INT", "ZERO", "STRING_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ARROW", "ASSIGN", "GT", "LT", "NOT", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "COMMENT", 
			"WS"
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
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(154);
				classDeclaration();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
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
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(INT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(BOOL);
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
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
			setState(168);
			match(CLASS);
			setState(169);
			((ClassDeclarationContext)_localctx).aa = match(IDENTIFIER);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(170);
				match(EXTENDS);
				setState(171);
				((ClassDeclarationContext)_localctx).bb = match(IDENTIFIER);
				}
			}


			           if ((((ClassDeclarationContext)_localctx).bb!=null?((ClassDeclarationContext)_localctx).bb.getText():null) == null){
			               System.out.println("ClassDec:"+(((ClassDeclarationContext)_localctx).aa!=null?((ClassDeclarationContext)_localctx).aa.getText():null));
			           } else {
			               System.out.println("ClassDec:"+(((ClassDeclarationContext)_localctx).aa!=null?((ClassDeclarationContext)_localctx).aa.getText():null)+","+(((ClassDeclarationContext)_localctx).bb!=null?((ClassDeclarationContext)_localctx).bb.getText():null));
			           }
			       
			setState(175);
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
			setState(177);
			match(LBRACE);
			setState(178);
			classBodyDeclaration();
			setState(179);
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACE) {
					{
					{
					setState(182);
					block();
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_LITERAL) | (1L << THIS) | (1L << DEF) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << NEW) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SEMI) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
					{
					{
					setState(188);
					memberDeclaration();
					}
					}
					setState(193);
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
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
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
			setState(202);
			match(DEF);
			setState(203);
			methodType();
			setState(204);
			((MethodDeclarationContext)_localctx).aa = match(IDENTIFIER);
			setState(205);
			match(LPAREN);

			                System.out.println("MethodDec:"+(((MethodDeclarationContext)_localctx).aa!=null?((MethodDeclarationContext)_localctx).aa.getText():null));
			        
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(207);
				methodArguements();
				}
			}

			setState(210);
			match(RPAREN);
			setState(211);
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
			setState(213);
			listvariableDeclaration();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214);
				match(COMMA);
				setState(215);
				listvariableDeclaration();
				}
				}
				setState(220);
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
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
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
			setState(225);
			match(LBRACE);
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(226);
						variableDeclaration();
						setState(227);
						match(SEMI);
						}
						} 
					}
					setState(233);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_LITERAL) | (1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << NEW) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SEMI) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
					{
					setState(234);
					blockStatements();
					}
				}

				}
				break;
			}
			setState(239);
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
			setState(241);
			match(DEF);
			setState(242);
			((ConstructorDeclarationContext)_localctx).aa = match(IDENTIFIER);
			setState(243);
			match(LPAREN);

			                    System.out.println("ConstructorDec:"+(((ConstructorDeclarationContext)_localctx).aa!=null?((ConstructorDeclarationContext)_localctx).aa.getText():null));
			            
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(245);
				methodArguements();
				}
			}

			setState(248);
			match(RPAREN);
			setState(249);
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
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				variableDeclaration();
				setState(252);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				variableInitializer();
				setState(255);
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
			setState(259);
			((VariableDeclarationContext)_localctx).aa = match(IDENTIFIER);
			setState(260);
			match(COLON);

			                    System.out.println("VarDec:"+(((VariableDeclarationContext)_localctx).aa!=null?((VariableDeclarationContext)_localctx).aa.getText():null));
			            
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				{
				setState(262);
				listDeclaration();
				}
				break;
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
				{
				setState(263);
				type();
				}
				break;
			case IDENTIFIER:
				{
				setState(264);
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
			setState(267);
			match(IDENTIFIER);
			setState(268);
			match(COLON);
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				{
				setState(269);
				listDeclaration();
				}
				break;
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
				{
				setState(270);
				type();
				}
				break;
			case IDENTIFIER:
				{
				setState(271);
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
			setState(274);
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
			setState(276);
			match(FUNC);
			setState(277);
			match(LT);
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(278);
				match(VOID);
				}
				break;
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
				{
				{
				setState(279);
				type();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(280);
					match(COMMA);
					setState(281);
					type();
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(289);
			match(ARROW);
			setState(290);
			type();
			setState(291);
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
			setState(293);
			match(LIST);
			setState(294);
			match(LPAREN);
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POS_INT:
				{
				{
				setState(295);
				match(POS_INT);
				setState(296);
				match(T__0);
				setState(299);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
				case INT:
				case STRING:
				case BOOL:
					{
					setState(297);
					type();
					}
					break;
				case LIST:
					{
					setState(298);
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
				setState(301);
				listBody();
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(302);
					match(COMMA);
					setState(303);
					listBody();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(311);
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
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				listvariableDeclaration();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				listDeclaration();
				}
				break;
			case FUNC:
			case INT:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
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
			setState(318);
			match(LBRACE);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_LITERAL) | (1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << NEW) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SEMI) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(319);
				blockStatements();
				}
			}

			setState(322);
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
			setState(325); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(324);
				blockStatement();
				}
				}
				setState(327); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_LITERAL) | (1L << THIS) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << NEW) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SEMI) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(329);
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
		public StatementWithoutSubstatementContext statementWithoutSubstatement() {
			return getRuleContext(StatementWithoutSubstatementContext.class,0);
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
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
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
			case LPAREN:
			case LBRACE:
			case LBRACK:
			case SEMI:
			case NOT:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				statementWithoutSubstatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				forStatement();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
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
		public ConditionBlockContext bb;
		public StatBlockContext cc;
		public List<TerminalNode> IF() { return getTokens(sophiaParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(sophiaParser.IF, i);
		}
		public List<ConditionBlockContext> conditionBlock() {
			return getRuleContexts(ConditionBlockContext.class);
		}
		public ConditionBlockContext conditionBlock(int i) {
			return getRuleContext(ConditionBlockContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(IF);

			                System.out.println("Conditional:if");
			            
			setState(339);
			conditionBlock();
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340);
					match(ELSE);
					setState(341);
					match(IF);
					setState(342);
					((IfStatementContext)_localctx).bb = conditionBlock();

					                System.out.println("Conditional:else");
					                System.out.println("Conditional:if");
					            
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(350);
				match(ELSE);
				setState(351);
				((IfStatementContext)_localctx).cc = statBlock();

				                System.out.println("Conditional:else");
				            
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

	public static class ConditionBlockContext extends ParserRuleContext {
		public ExprBodyContext exprBody() {
			return getRuleContext(ExprBodyContext.class,0);
		}
		public StatBlockContext statBlock() {
			return getRuleContext(StatBlockContext.class,0);
		}
		public ConditionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterConditionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitConditionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitConditionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionBlockContext conditionBlock() throws RecognitionException {
		ConditionBlockContext _localctx = new ConditionBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conditionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			exprBody();
			setState(357);
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
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(LBRACE);
				setState(361);
				block();
				setState(362);
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

	public static class StatementWithoutSubstatementContext extends ParserRuleContext {
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
		public StatementWithoutSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterStatementWithoutSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitStatementWithoutSubstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitStatementWithoutSubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutSubstatementContext statementWithoutSubstatement() throws RecognitionException {
		StatementWithoutSubstatementContext _localctx = new StatementWithoutSubstatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statementWithoutSubstatement);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				emptyStatement();
				}
				break;
			case BOOL_LITERAL:
			case THIS:
			case NEW:
			case IDENTIFIER:
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case LPAREN:
			case LBRACK:
			case NOT:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				expStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(370);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(371);
				returnStatement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(372);
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
			setState(375);
			statementExp();
			setState(376);
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
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				methodCall();
				 System.out.println("MethodCall");
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
		public ExprBodyContext exprBody() {
			return getRuleContext(ExprBodyContext.class,0);
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
			setState(384);
			match(FOR);

			                        System.out.println("Loop:for");
			                
			setState(386);
			match(LPAREN);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_LITERAL) | (1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << LBRACK) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(387);
				initialStatement();
				}
			}

			setState(390);
			match(SEMI);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_LITERAL) | (1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << LBRACK) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(391);
				exprBody();
				}
			}

			setState(394);
			match(SEMI);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_LITERAL) | (1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << LBRACK) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(395);
				updateStatement();
				}
			}

			setState(398);
			match(RPAREN);
			setState(399);
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
			setState(401);
			assignment();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(402);
				match(COMMA);
				setState(403);
				assignment();
				}
				}
				setState(408);
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
			setState(409);
			assignment();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(410);
				match(COMMA);
				setState(411);
				assignment();
				}
				}
				setState(416);
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
		public ExprBodyContext exprBody() {
			return getRuleContext(ExprBodyContext.class,0);
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
			setState(417);
			match(FOREACH);
			setState(418);
			match(LPAREN);
			setState(419);
			match(IDENTIFIER);
			setState(420);
			match(IN);

			                            System.out.println("Loop:foreach");
			                    
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(422);
				match(IDENTIFIER);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(423);
					match(DOT);
					setState(424);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case 2:
				{
				setState(427);
				match(THIS);
				setState(428);
				match(DOT);
				setState(429);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(430);
				exprBody();
				}
				break;
			}
			setState(433);
			match(RPAREN);
			setState(434);
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
			setState(436);
			match(BREAK);
			setState(437);
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
			setState(440);
			match(CONTINUE);
			setState(441);
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
		public ExprBodyContext exprBody() {
			return getRuleContext(ExprBodyContext.class,0);
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
			setState(444);
			match(RETURN);

			                System.out.println("Return");
			        
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_LITERAL) | (1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << LBRACK) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(446);
				exprBody();
				}
			}

			setState(449);
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
			setState(452);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(459);
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
					setState(454);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(455);
					match(DOT);
					setState(456);
					match(IDENTIFIER);
					}
					} 
				}
				setState(461);
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
		public Primary6Context primary6() {
			return getRuleContext(Primary6Context.class,0);
		}
		public ClassAssignmentContext classAssignment() {
			return getRuleContext(ClassAssignmentContext.class,0);
		}
		public List<Primary5Context> primary5() {
			return getRuleContexts(Primary5Context.class);
		}
		public Primary5Context primary5(int i) {
			return getRuleContext(Primary5Context.class,i);
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
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(462);
				primary6();
				}
				break;
			case 2:
				{
				setState(463);
				classAssignment();
				}
				break;
			}
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(466);
					primary5();
					}
					} 
				}
				setState(471);
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

	public static class Primary4Context extends ParserRuleContext {
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
		public FieldCallContext fieldCall() {
			return getRuleContext(FieldCallContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ReturnFuncPointerContext returnFuncPointer() {
			return getRuleContext(ReturnFuncPointerContext.class,0);
		}
		public Primary4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrimary4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrimary4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrimary4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary4Context primary4() throws RecognitionException {
		Primary4Context _localctx = new Primary4Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_primary4);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(LPAREN);
				setState(475);
				expression();
				setState(476);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(478);
				classAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(479);
				fieldCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(480);
				methodCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(481);
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

	public static class Primary5Context extends ParserRuleContext {
		public FieldCallPrimaryContext fieldCallPrimary() {
			return getRuleContext(FieldCallPrimaryContext.class,0);
		}
		public AarrayCallPrimaryContext aarrayCallPrimary() {
			return getRuleContext(AarrayCallPrimaryContext.class,0);
		}
		public MethodCall2Context methodCall2() {
			return getRuleContext(MethodCall2Context.class,0);
		}
		public ReturnFuncPointerContext returnFuncPointer() {
			return getRuleContext(ReturnFuncPointerContext.class,0);
		}
		public Primary5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrimary5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrimary5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrimary5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary5Context primary5() throws RecognitionException {
		Primary5Context _localctx = new Primary5Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_primary5);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				fieldCallPrimary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				aarrayCallPrimary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				methodCall2();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
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

	public static class Primary3Context extends ParserRuleContext {
		public FieldCallPrimaryContext fieldCallPrimary() {
			return getRuleContext(FieldCallPrimaryContext.class,0);
		}
		public MethodCall2Context methodCall2() {
			return getRuleContext(MethodCall2Context.class,0);
		}
		public ReturnFuncPointerContext returnFuncPointer() {
			return getRuleContext(ReturnFuncPointerContext.class,0);
		}
		public Primary3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrimary3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrimary3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrimary3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary3Context primary3() throws RecognitionException {
		Primary3Context _localctx = new Primary3Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_primary3);
		try {
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				fieldCallPrimary();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				methodCall2();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				returnFuncPointer();
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

	public static class Primary6Context extends ParserRuleContext {
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
		public ArrayCallNoPrimaryContext arrayCallNoPrimary() {
			return getRuleContext(ArrayCallNoPrimaryContext.class,0);
		}
		public MethodCall2Context methodCall2() {
			return getRuleContext(MethodCall2Context.class,0);
		}
		public Primary6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrimary6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrimary6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrimary6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary6Context primary6() throws RecognitionException {
		Primary6Context _localctx = new Primary6Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_primary6);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				match(LPAREN);
				setState(498);
				expression();
				setState(499);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(501);
				classAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(502);
				arrayCallNoPrimary();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(503);
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

	public static class Primary2Context extends ParserRuleContext {
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
		public Primary2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPrimary2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPrimary2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPrimary2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary2Context primary2() throws RecognitionException {
		Primary2Context _localctx = new Primary2Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_primary2);
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				literal();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(THIS);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				match(LPAREN);
				setState(509);
				expression();
				setState(510);
				match(RPAREN);
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
				classAssignment();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(513);
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

	public static class FieldCallContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(sophiaParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
		public FieldCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterFieldCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitFieldCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitFieldCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldCallContext fieldCall() throws RecognitionException {
		FieldCallContext _localctx = new FieldCallContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fieldCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			primary();
			setState(517);
			match(DOT);
			setState(518);
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

	public static class FieldCallPrimaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(sophiaParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(sophiaParser.IDENTIFIER, 0); }
		public FieldCallPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldCallPrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterFieldCallPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitFieldCallPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitFieldCallPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldCallPrimaryContext fieldCallPrimary() throws RecognitionException {
		FieldCallPrimaryContext _localctx = new FieldCallPrimaryContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fieldCallPrimary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(DOT);
			setState(521);
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

	public static class ArrayCallContext extends ParserRuleContext {
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
		public Primary4Context primary4() {
			return getRuleContext(Primary4Context.class,0);
		}
		public ArrayCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterArrayCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitArrayCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitArrayCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCallContext arrayCall() throws RecognitionException {
		ArrayCallContext _localctx = new ArrayCallContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arrayCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(523);
				expressionName(0);
				setState(524);
				match(LBRACK);
				setState(525);
				expression();
				setState(526);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(528);
				primary4();
				setState(529);
				match(LBRACK);
				setState(530);
				expression();
				setState(531);
				match(RBRACK);
				}
				break;
			}
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(535);
				match(LBRACK);
				setState(536);
				expression();
				setState(537);
				match(RBRACK);
				}
				}
				setState(543);
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

	public static class AarrayCallPrimaryContext extends ParserRuleContext {
		public Primary3Context primary3() {
			return getRuleContext(Primary3Context.class,0);
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
		public AarrayCallPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aarrayCallPrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterAarrayCallPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitAarrayCallPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitAarrayCallPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AarrayCallPrimaryContext aarrayCallPrimary() throws RecognitionException {
		AarrayCallPrimaryContext _localctx = new AarrayCallPrimaryContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_aarrayCallPrimary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(544);
			primary3();
			setState(545);
			match(LBRACK);
			setState(546);
			expression();
			setState(547);
			match(RBRACK);
			}
			setState(555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(549);
					match(LBRACK);
					setState(550);
					expression();
					setState(551);
					match(RBRACK);
					}
					} 
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class ArrayCallNoPrimaryContext extends ParserRuleContext {
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
		public Primary2Context primary2() {
			return getRuleContext(Primary2Context.class,0);
		}
		public ArrayCallNoPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCallNoPrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterArrayCallNoPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitArrayCallNoPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitArrayCallNoPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCallNoPrimaryContext arrayCallNoPrimary() throws RecognitionException {
		ArrayCallNoPrimaryContext _localctx = new ArrayCallNoPrimaryContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_arrayCallNoPrimary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(558);
				expressionName(0);
				setState(559);
				match(LBRACK);
				setState(560);
				expression();
				setState(561);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(563);
				primary2();
				setState(564);
				match(LBRACK);
				setState(565);
				expression();
				setState(566);
				match(RBRACK);
				}
				break;
			}
			setState(576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(570);
					match(LBRACK);
					setState(571);
					expression();
					setState(572);
					match(RBRACK);
					}
					} 
				}
				setState(578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public List<ExprBodyContext> exprBody() {
			return getRuleContexts(ExprBodyContext.class);
		}
		public ExprBodyContext exprBody(int i) {
			return getRuleContext(ExprBodyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(sophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sophiaParser.COMMA, i);
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
		enterRule(_localctx, 94, RULE_returnFuncPointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(LPAREN);
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
				{
				setState(580);
				empty();
				}
				break;
			case BOOL_LITERAL:
			case THIS:
			case NEW:
			case IDENTIFIER:
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case LPAREN:
			case LBRACK:
			case NOT:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				{
				setState(581);
				exprBody();
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(582);
					match(COMMA);
					setState(583);
					exprBody();
					}
					}
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(591);
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
		enterRule(_localctx, 96, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(596);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(593);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(594);
					primary();
					}
					break;
				case 3:
					{
					setState(595);
					expressionName(0);
					}
					break;
				}
				setState(598);
				match(DOT);
				}
				break;
			}
			setState(601);
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
		enterRule(_localctx, 98, RULE_methodCall2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(603);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(604);
					expressionName(0);
					}
					break;
				}
				setState(607);
				match(DOT);
				}
				break;
			}
			setState(610);
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
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public List<ExprBodyContext> exprBody() {
			return getRuleContexts(ExprBodyContext.class);
		}
		public ExprBodyContext exprBody(int i) {
			return getRuleContext(ExprBodyContext.class,i);
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
		enterRule(_localctx, 100, RULE_methodCallBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(IDENTIFIER);
			setState(613);
			match(LPAREN);
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
				{
				setState(614);
				empty();
				}
				break;
			case BOOL_LITERAL:
			case THIS:
			case NEW:
			case IDENTIFIER:
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case LPAREN:
			case LBRACK:
			case NOT:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				{
				setState(615);
				exprBody();
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(616);
					match(COMMA);
					setState(617);
					exprBody();
					}
					}
					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(625);
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

	public static class EmptyContext extends ParserRuleContext {
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_empty);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExprBodyContext exprBody() {
			return getRuleContext(ExprBodyContext.class,0);
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
		enterRule(_localctx, 104, RULE_expression);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				exprBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
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
		public LeftSideContext leftSide() {
			return getRuleContext(LeftSideContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(sophiaParser.ASSIGN, 0); }
		public ExprBodyContext exprBody() {
			return getRuleContext(ExprBodyContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
		enterRule(_localctx, 106, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			leftSide();
			setState(634);
			match(ASSIGN);
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(635);
				exprBody();
				}
				break;
			case 2:
				{
				setState(636);
				assignment();
				}
				break;
			}

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

	public static class LeftSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldCallContext fieldCall() {
			return getRuleContext(FieldCallContext.class,0);
		}
		public ArrayCallContext arrayCall() {
			return getRuleContext(ArrayCallContext.class,0);
		}
		public ExprBodyContext exprBody() {
			return getRuleContext(ExprBodyContext.class,0);
		}
		public LeftSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterLeftSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitLeftSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitLeftSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftSideContext leftSide() throws RecognitionException {
		LeftSideContext _localctx = new LeftSideContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_leftSide);
		try {
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				expressionName(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				fieldCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(643);
				arrayCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(644);
				exprBody();
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
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public List<ExprBodyContext> exprBody() {
			return getRuleContexts(ExprBodyContext.class);
		}
		public ExprBodyContext exprBody(int i) {
			return getRuleContext(ExprBodyContext.class,i);
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
		enterRule(_localctx, 110, RULE_classAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(NEW);
			setState(648);
			match(IDENTIFIER);
			setState(649);
			match(LPAREN);
			setState(659);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
				{
				setState(650);
				empty();
				}
				break;
			case BOOL_LITERAL:
			case THIS:
			case NEW:
			case IDENTIFIER:
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case LPAREN:
			case LBRACK:
			case NOT:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				{
				setState(651);
				exprBody();
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(652);
					match(COMMA);
					setState(653);
					exprBody();
					}
					}
					setState(658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(661);
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
		public List<ExprBodyContext> exprBody() {
			return getRuleContexts(ExprBodyContext.class);
		}
		public ExprBodyContext exprBody(int i) {
			return getRuleContext(ExprBodyContext.class,i);
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
		enterRule(_localctx, 112, RULE_listInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(LBRACK);
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_LITERAL) | (1L << THIS) | (1L << NEW) | (1L << IDENTIFIER) | (1L << POS_INT) | (1L << ZERO) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << LBRACK) | (1L << NOT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(664);
					listInitializer();
					}
					break;
				case 2:
					{
					setState(665);
					exprBody();
					}
					break;
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(668);
					match(COMMA);
					setState(671);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(669);
						listInitializer();
						}
						break;
					case 2:
						{
						setState(670);
						exprBody();
						}
						break;
					}
					}
					}
					setState(677);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(680);
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

	public static class ExprBodyContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ListInitializerContext listInitializer() {
			return getRuleContext(ListInitializerContext.class,0);
		}
		public ExprBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterExprBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitExprBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitExprBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprBodyContext exprBody() throws RecognitionException {
		ExprBodyContext _localctx = new ExprBodyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_exprBody);
		try {
			setState(684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
			case THIS:
			case NEW:
			case IDENTIFIER:
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case LPAREN:
			case NOT:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				conditionalOrExpression(0);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(687);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(696);
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
					setState(689);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(690);
					match(OR);
					setState(691);
					conditionalAndExpression(0);

					                      System.out.println("Operator:||");
					                  
					}
					} 
				}
				setState(698);
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(700);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(709);
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
					setState(702);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(703);
					match(AND);
					setState(704);
					equalityExpression(0);

					                      System.out.println("Operator:&&");
					                  
					}
					} 
				}
				setState(711);
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
		public RelationExpressionContext relationExpression() {
			return getRuleContext(RelationExpressionContext.class,0);
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
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_equalityExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(713);
			relationExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(722);
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
					setState(715);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(716);
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
					setState(717);
					relationExpression(0);

					                      System.out.println("Operator:"+(((EqualityExpressionContext)_localctx).op!=null?((EqualityExpressionContext)_localctx).op.getText():null));
					                  
					}
					} 
				}
				setState(724);
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

	public static class RelationExpressionContext extends ParserRuleContext {
		public Token op;
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public RelationExpressionContext relationExpression() {
			return getRuleContext(RelationExpressionContext.class,0);
		}
		public TerminalNode LE() { return getToken(sophiaParser.LE, 0); }
		public TerminalNode GE() { return getToken(sophiaParser.GE, 0); }
		public TerminalNode LT() { return getToken(sophiaParser.LT, 0); }
		public TerminalNode GT() { return getToken(sophiaParser.GT, 0); }
		public RelationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterRelationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitRelationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitRelationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationExpressionContext relationExpression() throws RecognitionException {
		return relationExpression(0);
	}

	private RelationExpressionContext relationExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationExpressionContext _localctx = new RelationExpressionContext(_ctx, _parentState);
		RelationExpressionContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_relationExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(726);
			addExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(735);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationExpression);
					setState(728);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(729);
					((RelationExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
						((RelationExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(730);
					addExpression(0);

					                      System.out.println("Operator:"+(((RelationExpressionContext)_localctx).op!=null?((RelationExpressionContext)_localctx).op.getText():null));
					                  
					}
					} 
				}
				setState(737);
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

	public static class AddExpressionContext extends ParserRuleContext {
		public Token op;
		public MultipleExpressionContext multipleExpression() {
			return getRuleContext(MultipleExpressionContext.class,0);
		}
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(sophiaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(sophiaParser.SUB, 0); }
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		return addExpression(0);
	}

	private AddExpressionContext addExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, _parentState);
		AddExpressionContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_addExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(739);
			multipleExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_addExpression);
					setState(741);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(742);
					((AddExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
						((AddExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(743);
					multipleExpression(0);

					                              System.out.println("Operator:"+(((AddExpressionContext)_localctx).op!=null?((AddExpressionContext)_localctx).op.getText():null));
					                          
					}
					} 
				}
				setState(750);
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

	public static class MultipleExpressionContext extends ParserRuleContext {
		public Token op;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultipleExpressionContext multipleExpression() {
			return getRuleContext(MultipleExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(sophiaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(sophiaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(sophiaParser.MOD, 0); }
		public MultipleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterMultipleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitMultipleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitMultipleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleExpressionContext multipleExpression() throws RecognitionException {
		return multipleExpression(0);
	}

	private MultipleExpressionContext multipleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultipleExpressionContext _localctx = new MultipleExpressionContext(_ctx, _parentState);
		MultipleExpressionContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_multipleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(752);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multipleExpression);
					setState(754);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(755);
					((MultipleExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						((MultipleExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(756);
					unaryExpression();

					                  System.out.println("Operator:"+(((MultipleExpressionContext)_localctx).op!=null?((MultipleExpressionContext)_localctx).op.getText():null));
					              
					}
					} 
				}
				setState(763);
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
		enterRule(_localctx, 128, RULE_unaryExpression);
		try {
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				preIncrementExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				preDecrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(766);
				match(ADD);
				setState(767);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(768);
				match(SUB);
				setState(769);
				unaryExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(770);
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
		enterRule(_localctx, 130, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(INC);
			setState(774);
			unaryExpression();

			                    System.out.println("Operator:++");
			                
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 132, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(DEC);
			setState(778);
			unaryExpression();

			                    System.out.println("Operator:--");
			                
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 134, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
			case THIS:
			case NEW:
			case IDENTIFIER:
			case POS_INT:
			case ZERO:
			case STRING_LITERAL:
			case LPAREN:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				postfixExpression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				match(NOT);
				setState(783);
				unaryExpression();

				                    System.out.println("Operator:!");
				                
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
		public List<PostIncExpressionPostfixContext> postIncExpressionPostfix() {
			return getRuleContexts(PostIncExpressionPostfixContext.class);
		}
		public PostIncExpressionPostfixContext postIncExpressionPostfix(int i) {
			return getRuleContext(PostIncExpressionPostfixContext.class,i);
		}
		public List<PostDecExpressionPostfixContext> postDecExpressionPostfix() {
			return getRuleContexts(PostDecExpressionPostfixContext.class);
		}
		public PostDecExpressionPostfixContext postDecExpressionPostfix(int i) {
			return getRuleContext(PostDecExpressionPostfixContext.class,i);
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
		enterRule(_localctx, 136, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(788);
				primary();
				}
				break;
			case 2:
				{
				setState(789);
				expressionName(0);
				}
				break;
			}
			setState(796);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(794);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(792);
						postIncExpressionPostfix();
						}
						break;
					case DEC:
						{
						setState(793);
						postDecExpressionPostfix();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(798);
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

	public static class PostIncExpressionPostfixContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(sophiaParser.INC, 0); }
		public PostIncExpressionPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncExpressionPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPostIncExpressionPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPostIncExpressionPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPostIncExpressionPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncExpressionPostfixContext postIncExpressionPostfix() throws RecognitionException {
		PostIncExpressionPostfixContext _localctx = new PostIncExpressionPostfixContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_postIncExpressionPostfix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(INC);

			                    System.out.println("Operator:++");
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecExpressionPostfixContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(sophiaParser.DEC, 0); }
		public PostDecExpressionPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecExpressionPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).enterPostDecExpressionPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sophiaListener ) ((sophiaListener)listener).exitPostDecExpressionPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sophiaVisitor ) return ((sophiaVisitor<? extends T>)visitor).visitPostDecExpressionPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecExpressionPostfixContext postDecExpressionPostfix() throws RecognitionException {
		PostDecExpressionPostfixContext _localctx = new PostDecExpressionPostfixContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_postDecExpressionPostfix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(DEC);

			                    System.out.println("Operator:--");
			                
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 142, RULE_literal);
		try {
			setState(808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POS_INT:
			case ZERO:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				intLiteral();
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				match(BOOL_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(807);
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
		enterRule(_localctx, 144, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(PRINT);
			setState(811);
			match(LPAREN);
			setState(812);
			printBody();
			setState(813);
			match(RPAREN);
			setState(814);
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
		public ExprBodyContext exprBody() {
			return getRuleContext(ExprBodyContext.class,0);
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
		enterRule(_localctx, 146, RULE_printBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			exprBody();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 148, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
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
		enterRule(_localctx, 150, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
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
		enterRule(_localctx, 152, RULE_intLiteral);
		try {
			setState(827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				match(ZERO);
				}
				break;
			case POS_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				match(POS_INT);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
				match(SUB);
				setState(826);
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
		case 58:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 59:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 60:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 61:
			return relationExpression_sempred((RelationExpressionContext)_localctx, predIndex);
		case 62:
			return addExpression_sempred((AddExpressionContext)_localctx, predIndex);
		case 63:
			return multipleExpression_sempred((MultipleExpressionContext)_localctx, predIndex);
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
	private boolean relationExpression_sempred(RelationExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addExpression_sempred(AddExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multipleExpression_sempred(MultipleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0340\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\7\2\u009e\n\2\f\2\16\2\u00a1\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u00a9\n\3\3\4\3\4\3\4\3\4\5\4\u00af\n\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\7\6\u00ba\n\6\f\6\16\6\u00bd\13\6"+
		"\3\6\7\6\u00c0\n\6\f\6\16\6\u00c3\13\6\5\6\u00c5\n\6\3\7\3\7\3\7\3\7\5"+
		"\7\u00cb\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d3\n\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\7\t\u00db\n\t\f\t\16\t\u00de\13\t\3\n\3\n\5\n\u00e2\n\n\3\13\3\13"+
		"\3\13\3\13\7\13\u00e8\n\13\f\13\16\13\u00eb\13\13\3\13\5\13\u00ee\n\13"+
		"\5\13\u00f0\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00f9\n\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0104\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u010c\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0113\n\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\7\21\u011d\n\21\f\21\16\21\u0120\13\21\5"+
		"\21\u0122\n\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u012e\n\22\3\22\3\22\3\22\7\22\u0133\n\22\f\22\16\22\u0136\13\22\5\22"+
		"\u0138\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u013f\n\23\3\24\3\24\5\24\u0143"+
		"\n\24\3\24\3\24\3\25\6\25\u0148\n\25\r\25\16\25\u0149\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\5\27\u0152\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u015c\n\30\f\30\16\30\u015f\13\30\3\30\3\30\3\30\3\30\5\30\u0165"+
		"\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u016f\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0178\n\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\5\35\u0181\n\35\3\36\3\36\3\36\3\36\5\36\u0187\n\36\3\36\3\36\5"+
		"\36\u018b\n\36\3\36\3\36\5\36\u018f\n\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\7\37\u0197\n\37\f\37\16\37\u019a\13\37\3 \3 \3 \7 \u019f\n \f \16 \u01a2"+
		"\13 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u01ac\n!\3!\3!\3!\3!\5!\u01b2\n!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\5$\u01c2\n$\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\7%\u01cc\n%\f%\16%\u01cf\13%\3&\3&\5&\u01d3\n&\3&\7&\u01d6\n&"+
		"\f&\16&\u01d9\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01e5\n"+
		"\'\3(\3(\3(\3(\5(\u01eb\n(\3)\3)\3)\5)\u01f0\n)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\5*\u01fb\n*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0205\n+\3,\3,\3,\3,\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0218\n.\3.\3.\3.\3.\7.\u021e\n"+
		".\f.\16.\u0221\13.\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u022c\n/\f/\16/\u022f"+
		"\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u023b\n\60"+
		"\3\60\3\60\3\60\3\60\7\60\u0241\n\60\f\60\16\60\u0244\13\60\3\61\3\61"+
		"\3\61\3\61\3\61\7\61\u024b\n\61\f\61\16\61\u024e\13\61\5\61\u0250\n\61"+
		"\3\61\3\61\3\62\3\62\3\62\5\62\u0257\n\62\3\62\5\62\u025a\n\62\3\62\3"+
		"\62\3\63\3\63\5\63\u0260\n\63\3\63\5\63\u0263\n\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\7\64\u026d\n\64\f\64\16\64\u0270\13\64\5\64\u0272"+
		"\n\64\3\64\3\64\3\65\3\65\3\66\3\66\5\66\u027a\n\66\3\67\3\67\3\67\3\67"+
		"\5\67\u0280\n\67\3\67\3\67\38\38\38\38\58\u0288\n8\39\39\39\39\39\39\3"+
		"9\79\u0291\n9\f9\169\u0294\139\59\u0296\n9\39\39\3:\3:\3:\5:\u029d\n:"+
		"\3:\3:\3:\5:\u02a2\n:\7:\u02a4\n:\f:\16:\u02a7\13:\5:\u02a9\n:\3:\3:\3"+
		";\3;\5;\u02af\n;\3<\3<\3<\3<\3<\3<\3<\3<\7<\u02b9\n<\f<\16<\u02bc\13<"+
		"\3=\3=\3=\3=\3=\3=\3=\3=\7=\u02c6\n=\f=\16=\u02c9\13=\3>\3>\3>\3>\3>\3"+
		">\3>\3>\7>\u02d3\n>\f>\16>\u02d6\13>\3?\3?\3?\3?\3?\3?\3?\3?\7?\u02e0"+
		"\n?\f?\16?\u02e3\13?\3@\3@\3@\3@\3@\3@\3@\3@\7@\u02ed\n@\f@\16@\u02f0"+
		"\13@\3A\3A\3A\3A\3A\3A\3A\3A\7A\u02fa\nA\fA\16A\u02fd\13A\3B\3B\3B\3B"+
		"\3B\3B\3B\5B\u0306\nB\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3E\5E\u0315"+
		"\nE\3F\3F\5F\u0319\nF\3F\3F\7F\u031d\nF\fF\16F\u0320\13F\3G\3G\3G\3H\3"+
		"H\3H\3I\3I\3I\5I\u032b\nI\3J\3J\3J\3J\3J\3J\3J\3K\3K\3L\3L\3M\3M\3N\3"+
		"N\3N\3N\5N\u033e\nN\3N\2\tHvxz|~\u0080O\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\2\6\4\2//\62\62\4\2+,\60\61\3\2\678\3\29;\2\u036d\2\u009f\3\2\2"+
		"\2\4\u00a8\3\2\2\2\6\u00aa\3\2\2\2\b\u00b3\3\2\2\2\n\u00c4\3\2\2\2\f\u00ca"+
		"\3\2\2\2\16\u00cc\3\2\2\2\20\u00d7\3\2\2\2\22\u00e1\3\2\2\2\24\u00e3\3"+
		"\2\2\2\26\u00f3\3\2\2\2\30\u0103\3\2\2\2\32\u0105\3\2\2\2\34\u010d\3\2"+
		"\2\2\36\u0114\3\2\2\2 \u0116\3\2\2\2\"\u0127\3\2\2\2$\u013e\3\2\2\2&\u0140"+
		"\3\2\2\2(\u0147\3\2\2\2*\u014b\3\2\2\2,\u0151\3\2\2\2.\u0153\3\2\2\2\60"+
		"\u0166\3\2\2\2\62\u016e\3\2\2\2\64\u0177\3\2\2\2\66\u0179\3\2\2\28\u0180"+
		"\3\2\2\2:\u0182\3\2\2\2<\u0193\3\2\2\2>\u019b\3\2\2\2@\u01a3\3\2\2\2B"+
		"\u01b6\3\2\2\2D\u01ba\3\2\2\2F\u01be\3\2\2\2H\u01c5\3\2\2\2J\u01d2\3\2"+
		"\2\2L\u01e4\3\2\2\2N\u01ea\3\2\2\2P\u01ef\3\2\2\2R\u01fa\3\2\2\2T\u0204"+
		"\3\2\2\2V\u0206\3\2\2\2X\u020a\3\2\2\2Z\u0217\3\2\2\2\\\u0222\3\2\2\2"+
		"^\u023a\3\2\2\2`\u0245\3\2\2\2b\u0259\3\2\2\2d\u0262\3\2\2\2f\u0266\3"+
		"\2\2\2h\u0275\3\2\2\2j\u0279\3\2\2\2l\u027b\3\2\2\2n\u0287\3\2\2\2p\u0289"+
		"\3\2\2\2r\u0299\3\2\2\2t\u02ae\3\2\2\2v\u02b0\3\2\2\2x\u02bd\3\2\2\2z"+
		"\u02ca\3\2\2\2|\u02d7\3\2\2\2~\u02e4\3\2\2\2\u0080\u02f1\3\2\2\2\u0082"+
		"\u0305\3\2\2\2\u0084\u0307\3\2\2\2\u0086\u030b\3\2\2\2\u0088\u0314\3\2"+
		"\2\2\u008a\u0318\3\2\2\2\u008c\u0321\3\2\2\2\u008e\u0324\3\2\2\2\u0090"+
		"\u032a\3\2\2\2\u0092\u032c\3\2\2\2\u0094\u0333\3\2\2\2\u0096\u0335\3\2"+
		"\2\2\u0098\u0337\3\2\2\2\u009a\u033d\3\2\2\2\u009c\u009e\5\6\4\2\u009d"+
		"\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\2\2\3\u00a3"+
		"\3\3\2\2\2\u00a4\u00a9\7\23\2\2\u00a5\u00a9\7\24\2\2\u00a6\u00a9\7\25"+
		"\2\2\u00a7\u00a9\5 \21\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\5\3\2\2\2\u00aa\u00ab\7\5\2\2"+
		"\u00ab\u00ae\7\34\2\2\u00ac\u00ad\7\6\2\2\u00ad\u00af\7\34\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\4\1\2\u00b1"+
		"\u00b2\5\b\5\2\u00b2\7\3\2\2\2\u00b3\u00b4\7\"\2\2\u00b4\u00b5\5\n\6\2"+
		"\u00b5\u00b6\7#\2\2\u00b6\t\3\2\2\2\u00b7\u00c5\7&\2\2\u00b8\u00ba\5&"+
		"\24\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00c5\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\5\f"+
		"\7\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00b7\3\2"+
		"\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c5\13\3\2\2\2\u00c6\u00cb"+
		"\5,\27\2\u00c7\u00cb\5\16\b\2\u00c8\u00cb\5\26\f\2\u00c9\u00cb\5\30\r"+
		"\2\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\r\3\2\2\2\u00cc\u00cd\7\b\2\2\u00cd\u00ce\5\22\n\2\u00ce"+
		"\u00cf\7\34\2\2\u00cf\u00d0\7 \2\2\u00d0\u00d2\b\b\1\2\u00d1\u00d3\5\20"+
		"\t\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\7!\2\2\u00d5\u00d6\5\24\13\2\u00d6\17\3\2\2\2\u00d7\u00dc\5\34"+
		"\17\2\u00d8\u00d9\7\'\2\2\u00d9\u00db\5\34\17\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\21\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00df\u00e2\5\4\3\2\u00e0\u00e2\7\26\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\23\3\2\2\2\u00e3\u00ef\7\"\2"+
		"\2\u00e4\u00e5\5\32\16\2\u00e5\u00e6\7&\2\2\u00e6\u00e8\3\2\2\2\u00e7"+
		"\u00e4\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\5(\25\2\u00ed"+
		"\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00e9\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7#\2\2\u00f2"+
		"\25\3\2\2\2\u00f3\u00f4\7\b\2\2\u00f4\u00f5\7\34\2\2\u00f5\u00f6\7 \2"+
		"\2\u00f6\u00f8\b\f\1\2\u00f7\u00f9\5\20\t\2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7!\2\2\u00fb\u00fc\5\24"+
		"\13\2\u00fc\27\3\2\2\2\u00fd\u00fe\5\32\16\2\u00fe\u00ff\7&\2\2\u00ff"+
		"\u0104\3\2\2\2\u0100\u0101\5\36\20\2\u0101\u0102\7&\2\2\u0102\u0104\3"+
		"\2\2\2\u0103\u00fd\3\2\2\2\u0103\u0100\3\2\2\2\u0104\31\3\2\2\2\u0105"+
		"\u0106\7\34\2\2\u0106\u0107\7.\2\2\u0107\u010b\b\16\1\2\u0108\u010c\5"+
		"\"\22\2\u0109\u010c\5\4\3\2\u010a\u010c\7\34\2\2\u010b\u0108\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\33\3\2\2\2\u010d\u010e\7\34\2"+
		"\2\u010e\u0112\7.\2\2\u010f\u0113\5\"\22\2\u0110\u0113\5\4\3\2\u0111\u0113"+
		"\7\34\2\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2"+
		"\u0113\35\3\2\2\2\u0114\u0115\5l\67\2\u0115\37\3\2\2\2\u0116\u0117\7\t"+
		"\2\2\u0117\u0121\7,\2\2\u0118\u0122\7\26\2\2\u0119\u011e\5\4\3\2\u011a"+
		"\u011b\7\'\2\2\u011b\u011d\5\4\3\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2"+
		"\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0118\3\2\2\2\u0121\u0119\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0124\7)\2\2\u0124\u0125\5\4\3\2\u0125\u0126\7+\2\2\u0126!"+
		"\3\2\2\2\u0127\u0128\7\27\2\2\u0128\u0137\7 \2\2\u0129\u012a\7\35\2\2"+
		"\u012a\u012d\7\3\2\2\u012b\u012e\5\4\3\2\u012c\u012e\5\"\22\2\u012d\u012b"+
		"\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u0138\3\2\2\2\u012f\u0134\5$\23\2\u0130"+
		"\u0131\7\'\2\2\u0131\u0133\5$\23\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0137\u0129\3\2\2\2\u0137\u012f\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7!\2\2\u013a#\3\2\2\2\u013b\u013f"+
		"\5\34\17\2\u013c\u013f\5\"\22\2\u013d\u013f\5\4\3\2\u013e\u013b\3\2\2"+
		"\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f%\3\2\2\2\u0140\u0142"+
		"\7\"\2\2\u0141\u0143\5(\25\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0145\7#\2\2\u0145\'\3\2\2\2\u0146\u0148\5*\26\2"+
		"\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a)\3\2\2\2\u014b\u014c\5,\27\2\u014c+\3\2\2\2\u014d\u0152"+
		"\5\64\33\2\u014e\u0152\5.\30\2\u014f\u0152\5:\36\2\u0150\u0152\5@!\2\u0151"+
		"\u014d\3\2\2\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2"+
		"\2\2\u0152-\3\2\2\2\u0153\u0154\7\13\2\2\u0154\u0155\b\30\1\2\u0155\u015d"+
		"\5\60\31\2\u0156\u0157\7\f\2\2\u0157\u0158\7\13\2\2\u0158\u0159\5\60\31"+
		"\2\u0159\u015a\b\30\1\2\u015a\u015c\3\2\2\2\u015b\u0156\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0164\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7\f\2\2\u0161\u0162\5\62\32\2\u0162"+
		"\u0163\b\30\1\2\u0163\u0165\3\2\2\2\u0164\u0160\3\2\2\2\u0164\u0165\3"+
		"\2\2\2\u0165/\3\2\2\2\u0166\u0167\5t;\2\u0167\u0168\5\62\32\2\u0168\61"+
		"\3\2\2\2\u0169\u016f\5,\27\2\u016a\u016b\7\"\2\2\u016b\u016c\5&\24\2\u016c"+
		"\u016d\7#\2\2\u016d\u016f\3\2\2\2\u016e\u0169\3\2\2\2\u016e\u016a\3\2"+
		"\2\2\u016f\63\3\2\2\2\u0170\u0178\5&\24\2\u0171\u0178\5\u0096L\2\u0172"+
		"\u0178\5\66\34\2\u0173\u0178\5B\"\2\u0174\u0178\5D#\2\u0175\u0178\5F$"+
		"\2\u0176\u0178\5\u0092J\2\u0177\u0170\3\2\2\2\u0177\u0171\3\2\2\2\u0177"+
		"\u0172\3\2\2\2\u0177\u0173\3\2\2\2\u0177\u0174\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0177\u0176\3\2\2\2\u0178\65\3\2\2\2\u0179\u017a\58\35\2\u017a\u017b"+
		"\7&\2\2\u017b\67\3\2\2\2\u017c\u0181\5l\67\2\u017d\u017e\5b\62\2\u017e"+
		"\u017f\b\35\1\2\u017f\u0181\3\2\2\2\u0180\u017c\3\2\2\2\u0180\u017d\3"+
		"\2\2\2\u01819\3\2\2\2\u0182\u0183\7\r\2\2\u0183\u0184\b\36\1\2\u0184\u0186"+
		"\7 \2\2\u0185\u0187\5<\37\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u018a\7&\2\2\u0189\u018b\5t;\2\u018a\u0189\3\2\2"+
		"\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\7&\2\2\u018d\u018f"+
		"\5> \2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0191\7!\2\2\u0191\u0192\5\62\32\2\u0192;\3\2\2\2\u0193\u0198\5l\67\2"+
		"\u0194\u0195\7\'\2\2\u0195\u0197\5l\67\2\u0196\u0194\3\2\2\2\u0197\u019a"+
		"\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199=\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u01a0\5l\67\2\u019c\u019d\7\'\2\2\u019d\u019f\5l"+
		"\67\2\u019e\u019c\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1?\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\7\16\2\2"+
		"\u01a4\u01a5\7 \2\2\u01a5\u01a6\7\34\2\2\u01a6\u01a7\7\30\2\2\u01a7\u01b1"+
		"\b!\1\2\u01a8\u01ab\7\34\2\2\u01a9\u01aa\7(\2\2\u01aa\u01ac\7\34\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01b2\3\2\2\2\u01ad\u01ae\7\7"+
		"\2\2\u01ae\u01af\7(\2\2\u01af\u01b2\7\34\2\2\u01b0\u01b2\5t;\2\u01b1\u01a8"+
		"\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b4\7!\2\2\u01b4\u01b5\5\62\32\2\u01b5A\3\2\2\2\u01b6\u01b7\7\20\2"+
		"\2\u01b7\u01b8\7&\2\2\u01b8\u01b9\b\"\1\2\u01b9C\3\2\2\2\u01ba\u01bb\7"+
		"\17\2\2\u01bb\u01bc\7&\2\2\u01bc\u01bd\b#\1\2\u01bdE\3\2\2\2\u01be\u01bf"+
		"\7\n\2\2\u01bf\u01c1\b$\1\2\u01c0\u01c2\5t;\2\u01c1\u01c0\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\7&\2\2\u01c4G\3\2\2\2\u01c5"+
		"\u01c6\b%\1\2\u01c6\u01c7\7\34\2\2\u01c7\u01cd\3\2\2\2\u01c8\u01c9\f\3"+
		"\2\2\u01c9\u01ca\7(\2\2\u01ca\u01cc\7\34\2\2\u01cb\u01c8\3\2\2\2\u01cc"+
		"\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ceI\3\2\2\2"+
		"\u01cf\u01cd\3\2\2\2\u01d0\u01d3\5R*\2\u01d1\u01d3\5p9\2\u01d2\u01d0\3"+
		"\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d7\3\2\2\2\u01d4\u01d6\5N(\2\u01d5"+
		"\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8K\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01e5\5\u0090I\2\u01db\u01e5"+
		"\7\7\2\2\u01dc\u01dd\7 \2\2\u01dd\u01de\5j\66\2\u01de\u01df\7!\2\2\u01df"+
		"\u01e5\3\2\2\2\u01e0\u01e5\5p9\2\u01e1\u01e5\5V,\2\u01e2\u01e5\5b\62\2"+
		"\u01e3\u01e5\5`\61\2\u01e4\u01da\3\2\2\2\u01e4\u01db\3\2\2\2\u01e4\u01dc"+
		"\3\2\2\2\u01e4\u01e0\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e3\3\2\2\2\u01e5M\3\2\2\2\u01e6\u01eb\5X-\2\u01e7\u01eb\5\\/\2\u01e8"+
		"\u01eb\5d\63\2\u01e9\u01eb\5`\61\2\u01ea\u01e6\3\2\2\2\u01ea\u01e7\3\2"+
		"\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01ebO\3\2\2\2\u01ec\u01f0"+
		"\5X-\2\u01ed\u01f0\5d\63\2\u01ee\u01f0\5`\61\2\u01ef\u01ec\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0Q\3\2\2\2\u01f1\u01fb\5\u0090"+
		"I\2\u01f2\u01fb\7\7\2\2\u01f3\u01f4\7 \2\2\u01f4\u01f5\5j\66\2\u01f5\u01f6"+
		"\7!\2\2\u01f6\u01fb\3\2\2\2\u01f7\u01fb\5p9\2\u01f8\u01fb\5^\60\2\u01f9"+
		"\u01fb\5d\63\2\u01fa\u01f1\3\2\2\2\u01fa\u01f2\3\2\2\2\u01fa\u01f3\3\2"+
		"\2\2\u01fa\u01f7\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb"+
		"S\3\2\2\2\u01fc\u0205\5\u0090I\2\u01fd\u0205\7\7\2\2\u01fe\u01ff\7 \2"+
		"\2\u01ff\u0200\5j\66\2\u0200\u0201\7!\2\2\u0201\u0205\3\2\2\2\u0202\u0205"+
		"\5p9\2\u0203\u0205\5d\63\2\u0204\u01fc\3\2\2\2\u0204\u01fd\3\2\2\2\u0204"+
		"\u01fe\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205U\3\2\2\2"+
		"\u0206\u0207\5J&\2\u0207\u0208\7(\2\2\u0208\u0209\7\34\2\2\u0209W\3\2"+
		"\2\2\u020a\u020b\7(\2\2\u020b\u020c\7\34\2\2\u020cY\3\2\2\2\u020d\u020e"+
		"\5H%\2\u020e\u020f\7$\2\2\u020f\u0210\5j\66\2\u0210\u0211\7%\2\2\u0211"+
		"\u0218\3\2\2\2\u0212\u0213\5L\'\2\u0213\u0214\7$\2\2\u0214\u0215\5j\66"+
		"\2\u0215\u0216\7%\2\2\u0216\u0218\3\2\2\2\u0217\u020d\3\2\2\2\u0217\u0212"+
		"\3\2\2\2\u0218\u021f\3\2\2\2\u0219\u021a\7$\2\2\u021a\u021b\5j\66\2\u021b"+
		"\u021c\7%\2\2\u021c\u021e\3\2\2\2\u021d\u0219\3\2\2\2\u021e\u0221\3\2"+
		"\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220[\3\2\2\2\u0221\u021f"+
		"\3\2\2\2\u0222\u0223\5P)\2\u0223\u0224\7$\2\2\u0224\u0225\5j\66\2\u0225"+
		"\u0226\7%\2\2\u0226\u022d\3\2\2\2\u0227\u0228\7$\2\2\u0228\u0229\5j\66"+
		"\2\u0229\u022a\7%\2\2\u022a\u022c\3\2\2\2\u022b\u0227\3\2\2\2\u022c\u022f"+
		"\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e]\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u0230\u0231\5H%\2\u0231\u0232\7$\2\2\u0232\u0233\5j\66"+
		"\2\u0233\u0234\7%\2\2\u0234\u023b\3\2\2\2\u0235\u0236\5T+\2\u0236\u0237"+
		"\7$\2\2\u0237\u0238\5j\66\2\u0238\u0239\7%\2\2\u0239\u023b\3\2\2\2\u023a"+
		"\u0230\3\2\2\2\u023a\u0235\3\2\2\2\u023b\u0242\3\2\2\2\u023c\u023d\7$"+
		"\2\2\u023d\u023e\5j\66\2\u023e\u023f\7%\2\2\u023f\u0241\3\2\2\2\u0240"+
		"\u023c\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2"+
		"\2\2\u0243_\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u024f\7 \2\2\u0246\u0250"+
		"\5h\65\2\u0247\u024c\5t;\2\u0248\u0249\7\'\2\2\u0249\u024b\5t;\2\u024a"+
		"\u0248\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0246\3\2\2\2\u024f"+
		"\u0247\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\7!\2\2\u0252a\3\2\2\2\u0253"+
		"\u0257\7\34\2\2\u0254\u0257\5J&\2\u0255\u0257\5H%\2\u0256\u0253\3\2\2"+
		"\2\u0256\u0254\3\2\2\2\u0256\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a"+
		"\7(\2\2\u0259\u0256\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025c\5f\64\2\u025cc\3\2\2\2\u025d\u0260\7\34\2\2\u025e\u0260\5H%\2\u025f"+
		"\u025d\3\2\2\2\u025f\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\7("+
		"\2\2\u0262\u025f\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"\u0265\5f\64\2\u0265e\3\2\2\2\u0266\u0267\7\34\2\2\u0267\u0271\7 \2\2"+
		"\u0268\u0272\5h\65\2\u0269\u026e\5t;\2\u026a\u026b\7\'\2\2\u026b\u026d"+
		"\5t;\2\u026c\u026a\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e"+
		"\u026f\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0268\3\2"+
		"\2\2\u0271\u0269\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\7!\2\2\u0274"+
		"g\3\2\2\2\u0275\u0276\3\2\2\2\u0276i\3\2\2\2\u0277\u027a\5t;\2\u0278\u027a"+
		"\5l\67\2\u0279\u0277\3\2\2\2\u0279\u0278\3\2\2\2\u027ak\3\2\2\2\u027b"+
		"\u027c\5n8\2\u027c\u027f\7*\2\2\u027d\u0280\5t;\2\u027e\u0280\5l\67\2"+
		"\u027f\u027d\3\2\2\2\u027f\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282"+
		"\b\67\1\2\u0282m\3\2\2\2\u0283\u0288\5H%\2\u0284\u0288\5V,\2\u0285\u0288"+
		"\5Z.\2\u0286\u0288\5t;\2\u0287\u0283\3\2\2\2\u0287\u0284\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0287\u0286\3\2\2\2\u0288o\3\2\2\2\u0289\u028a\7\32\2\2"+
		"\u028a\u028b\7\34\2\2\u028b\u0295\7 \2\2\u028c\u0296\5h\65\2\u028d\u0292"+
		"\5t;\2\u028e\u028f\7\'\2\2\u028f\u0291\5t;\2\u0290\u028e\3\2\2\2\u0291"+
		"\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0296\3\2"+
		"\2\2\u0294\u0292\3\2\2\2\u0295\u028c\3\2\2\2\u0295\u028d\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u0298\7!\2\2\u0298q\3\2\2\2\u0299\u02a8\7$\2\2\u029a"+
		"\u029d\5r:\2\u029b\u029d\5t;\2\u029c\u029a\3\2\2\2\u029c\u029b\3\2\2\2"+
		"\u029d\u02a5\3\2\2\2\u029e\u02a1\7\'\2\2\u029f\u02a2\5r:\2\u02a0\u02a2"+
		"\5t;\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3"+
		"\u029e\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2"+
		"\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u029c\3\2\2\2\u02a8"+
		"\u02a9\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\7%\2\2\u02abs\3\2\2\2\u02ac"+
		"\u02af\5v<\2\u02ad\u02af\5r:\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2\2\2"+
		"\u02afu\3\2\2\2\u02b0\u02b1\b<\1\2\u02b1\u02b2\5x=\2\u02b2\u02ba\3\2\2"+
		"\2\u02b3\u02b4\f\3\2\2\u02b4\u02b5\7\64\2\2\u02b5\u02b6\5x=\2\u02b6\u02b7"+
		"\b<\1\2\u02b7\u02b9\3\2\2\2\u02b8\u02b3\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba"+
		"\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bbw\3\2\2\2\u02bc\u02ba\3\2\2\2"+
		"\u02bd\u02be\b=\1\2\u02be\u02bf\5z>\2\u02bf\u02c7\3\2\2\2\u02c0\u02c1"+
		"\f\3\2\2\u02c1\u02c2\7\63\2\2\u02c2\u02c3\5z>\2\u02c3\u02c4\b=\1\2\u02c4"+
		"\u02c6\3\2\2\2\u02c5\u02c0\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2"+
		"\2\2\u02c7\u02c8\3\2\2\2\u02c8y\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cb"+
		"\b>\1\2\u02cb\u02cc\5|?\2\u02cc\u02d4\3\2\2\2\u02cd\u02ce\f\3\2\2\u02ce"+
		"\u02cf\t\2\2\2\u02cf\u02d0\5|?\2\u02d0\u02d1\b>\1\2\u02d1\u02d3\3\2\2"+
		"\2\u02d2\u02cd\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5"+
		"\3\2\2\2\u02d5{\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d8\b?\1\2\u02d8\u02d9"+
		"\5~@\2\u02d9\u02e1\3\2\2\2\u02da\u02db\f\3\2\2\u02db\u02dc\t\3\2\2\u02dc"+
		"\u02dd\5~@\2\u02dd\u02de\b?\1\2\u02de\u02e0\3\2\2\2\u02df\u02da\3\2\2"+
		"\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2}"+
		"\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4\u02e5\b@\1\2\u02e5\u02e6\5\u0080A\2"+
		"\u02e6\u02ee\3\2\2\2\u02e7\u02e8\f\3\2\2\u02e8\u02e9\t\4\2\2\u02e9\u02ea"+
		"\5\u0080A\2\u02ea\u02eb\b@\1\2\u02eb\u02ed\3\2\2\2\u02ec\u02e7\3\2\2\2"+
		"\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\177"+
		"\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f2\bA\1\2\u02f2\u02f3\5\u0082B\2"+
		"\u02f3\u02fb\3\2\2\2\u02f4\u02f5\f\3\2\2\u02f5\u02f6\t\5\2\2\u02f6\u02f7"+
		"\5\u0082B\2\u02f7\u02f8\bA\1\2\u02f8\u02fa\3\2\2\2\u02f9\u02f4\3\2\2\2"+
		"\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u0081"+
		"\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u0306\5\u0084C\2\u02ff\u0306\5\u0086"+
		"D\2\u0300\u0301\7\67\2\2\u0301\u0306\5\u0082B\2\u0302\u0303\78\2\2\u0303"+
		"\u0306\5\u0082B\2\u0304\u0306\5\u0088E\2\u0305\u02fe\3\2\2\2\u0305\u02ff"+
		"\3\2\2\2\u0305\u0300\3\2\2\2\u0305\u0302\3\2\2\2\u0305\u0304\3\2\2\2\u0306"+
		"\u0083\3\2\2\2\u0307\u0308\7\65\2\2\u0308\u0309\5\u0082B\2\u0309\u030a"+
		"\bC\1\2\u030a\u0085\3\2\2\2\u030b\u030c\7\66\2\2\u030c\u030d\5\u0082B"+
		"\2\u030d\u030e\bD\1\2\u030e\u0087\3\2\2\2\u030f\u0315\5\u008aF\2\u0310"+
		"\u0311\7-\2\2\u0311\u0312\5\u0082B\2\u0312\u0313\bE\1\2\u0313\u0315\3"+
		"\2\2\2\u0314\u030f\3\2\2\2\u0314\u0310\3\2\2\2\u0315\u0089\3\2\2\2\u0316"+
		"\u0319\5J&\2\u0317\u0319\5H%\2\u0318\u0316\3\2\2\2\u0318\u0317\3\2\2\2"+
		"\u0319\u031e\3\2\2\2\u031a\u031d\5\u008cG\2\u031b\u031d\5\u008eH\2\u031c"+
		"\u031a\3\2\2\2\u031c\u031b\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2"+
		"\2\2\u031e\u031f\3\2\2\2\u031f\u008b\3\2\2\2\u0320\u031e\3\2\2\2\u0321"+
		"\u0322\7\65\2\2\u0322\u0323\bG\1\2\u0323\u008d\3\2\2\2\u0324\u0325\7\66"+
		"\2\2\u0325\u0326\bH\1\2\u0326\u008f\3\2\2\2\u0327\u032b\5\u009aN\2\u0328"+
		"\u032b\7\4\2\2\u0329\u032b\7\37\2\2\u032a\u0327\3\2\2\2\u032a\u0328\3"+
		"\2\2\2\u032a\u0329\3\2\2\2\u032b\u0091\3\2\2\2\u032c\u032d\7\33\2\2\u032d"+
		"\u032e\7 \2\2\u032e\u032f\5\u0094K\2\u032f\u0330\7!\2\2\u0330\u0331\7"+
		"&\2\2\u0331\u0332\bJ\1\2\u0332\u0093\3\2\2\2\u0333\u0334\5t;\2\u0334\u0095"+
		"\3\2\2\2\u0335\u0336\7&\2\2\u0336\u0097\3\2\2\2\u0337\u0338\7<\2\2\u0338"+
		"\u0099\3\2\2\2\u0339\u033e\7\36\2\2\u033a\u033e\7\35\2\2\u033b\u033c\7"+
		"8\2\2\u033c\u033e\7\35\2\2\u033d\u0339\3\2\2\2\u033d\u033a\3\2\2\2\u033d"+
		"\u033b\3\2\2\2\u033e\u009b\3\2\2\2U\u009f\u00a8\u00ae\u00bb\u00c1\u00c4"+
		"\u00ca\u00d2\u00dc\u00e1\u00e9\u00ed\u00ef\u00f8\u0103\u010b\u0112\u011e"+
		"\u0121\u012d\u0134\u0137\u013e\u0142\u0149\u0151\u015d\u0164\u016e\u0177"+
		"\u0180\u0186\u018a\u018e\u0198\u01a0\u01ab\u01b1\u01c1\u01cd\u01d2\u01d7"+
		"\u01e4\u01ea\u01ef\u01fa\u0204\u0217\u021f\u022d\u023a\u0242\u024c\u024f"+
		"\u0256\u0259\u025f\u0262\u026e\u0271\u0279\u027f\u0287\u0292\u0295\u029c"+
		"\u02a1\u02a5\u02a8\u02ae\u02ba\u02c7\u02d4\u02e1\u02ee\u02fb\u0305\u0314"+
		"\u0318\u031c\u031e\u032a\u033d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}