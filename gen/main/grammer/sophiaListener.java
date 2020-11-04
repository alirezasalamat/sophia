// Generated from F:/university term 5/compiler/sophia/src/main/grammer\sophia.g4 by ANTLR 4.8
package main.grammer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sophiaParser}.
 */
public interface sophiaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sophiaParser#sophia}.
	 * @param ctx the parse tree
	 */
	void enterSophia(sophiaParser.SophiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#sophia}.
	 * @param ctx the parse tree
	 */
	void exitSophia(sophiaParser.SophiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(sophiaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(sophiaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(sophiaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(sophiaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(sophiaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(sophiaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(sophiaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(sophiaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(sophiaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(sophiaParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(sophiaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(sophiaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#methodArguements}.
	 * @param ctx the parse tree
	 */
	void enterMethodArguements(sophiaParser.MethodArguementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#methodArguements}.
	 * @param ctx the parse tree
	 */
	void exitMethodArguements(sophiaParser.MethodArguementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(sophiaParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(sophiaParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(sophiaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(sophiaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(sophiaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(sophiaParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#methodCallBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallBody(sophiaParser.MethodCallBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#methodCallBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallBody(sophiaParser.MethodCallBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(sophiaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(sophiaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(sophiaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(sophiaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(sophiaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(sophiaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(sophiaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(sophiaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#funcPointerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncPointerDeclaration(sophiaParser.FuncPointerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#funcPointerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncPointerDeclaration(sophiaParser.FuncPointerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#funcPointerDeclarationBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncPointerDeclarationBody(sophiaParser.FuncPointerDeclarationBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#funcPointerDeclarationBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncPointerDeclarationBody(sophiaParser.FuncPointerDeclarationBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(sophiaParser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(sophiaParser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#listBody}.
	 * @param ctx the parse tree
	 */
	void enterListBody(sophiaParser.ListBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#listBody}.
	 * @param ctx the parse tree
	 */
	void exitListBody(sophiaParser.ListBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(sophiaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(sophiaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(sophiaParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(sophiaParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(sophiaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(sophiaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(sophiaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(sophiaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(sophiaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(sophiaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(sophiaParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(sophiaParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#statBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatBlock(sophiaParser.StatBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#statBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatBlock(sophiaParser.StatBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(sophiaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(sophiaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#expStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpStatement(sophiaParser.ExpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#expStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpStatement(sophiaParser.ExpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#statementExp}.
	 * @param ctx the parse tree
	 */
	void enterStatementExp(sophiaParser.StatementExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#statementExp}.
	 * @param ctx the parse tree
	 */
	void exitStatementExp(sophiaParser.StatementExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(sophiaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(sophiaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#initialStatement}.
	 * @param ctx the parse tree
	 */
	void enterInitialStatement(sophiaParser.InitialStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#initialStatement}.
	 * @param ctx the parse tree
	 */
	void exitInitialStatement(sophiaParser.InitialStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(sophiaParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(sophiaParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(sophiaParser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(sophiaParser.ForeachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(sophiaParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(sophiaParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(sophiaParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(sophiaParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(sophiaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(sophiaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(sophiaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(sophiaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#classAssignment}.
	 * @param ctx the parse tree
	 */
	void enterClassAssignment(sophiaParser.ClassAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#classAssignment}.
	 * @param ctx the parse tree
	 */
	void exitClassAssignment(sophiaParser.ClassAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#listInitializer}.
	 * @param ctx the parse tree
	 */
	void enterListInitializer(sophiaParser.ListInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#listInitializer}.
	 * @param ctx the parse tree
	 */
	void exitListInitializer(sophiaParser.ListInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#preExp}.
	 * @param ctx the parse tree
	 */
	void enterPreExp(sophiaParser.PreExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#preExp}.
	 * @param ctx the parse tree
	 */
	void exitPreExp(sophiaParser.PreExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#postExp}.
	 * @param ctx the parse tree
	 */
	void enterPostExp(sophiaParser.PostExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#postExp}.
	 * @param ctx the parse tree
	 */
	void exitPostExp(sophiaParser.PostExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(sophiaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(sophiaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(sophiaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(sophiaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(sophiaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(sophiaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#printBody}.
	 * @param ctx the parse tree
	 */
	void enterPrintBody(sophiaParser.PrintBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#printBody}.
	 * @param ctx the parse tree
	 */
	void exitPrintBody(sophiaParser.PrintBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(sophiaParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(sophiaParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(sophiaParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(sophiaParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link sophiaParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(sophiaParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link sophiaParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(sophiaParser.IntLiteralContext ctx);
}