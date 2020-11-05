// Generated from F:/university term 5/compiler/sophia/src/main/grammer\sophia.g4 by ANTLR 4.8
package main.grammer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link sophiaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface sophiaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link sophiaParser#sophia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSophia(sophiaParser.SophiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(sophiaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(sophiaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(sophiaParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(sophiaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(sophiaParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(sophiaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#methodArguements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodArguements(sophiaParser.MethodArguementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodType(sophiaParser.MethodTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(sophiaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(sophiaParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(sophiaParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(sophiaParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#listvariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListvariableDeclaration(sophiaParser.ListvariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(sophiaParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#funcPointerDeclarationBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncPointerDeclarationBody(sophiaParser.FuncPointerDeclarationBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#listDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDeclaration(sophiaParser.ListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#listBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListBody(sophiaParser.ListBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(sophiaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(sophiaParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(sophiaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(sophiaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(sophiaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(sophiaParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#statBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatBlock(sophiaParser.StatBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(sophiaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#expStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpStatement(sophiaParser.ExpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#statementExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExp(sophiaParser.StatementExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(sophiaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#initialStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialStatement(sophiaParser.InitialStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(sophiaParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#foreachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachStatement(sophiaParser.ForeachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(sophiaParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(sophiaParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(sophiaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(sophiaParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(sophiaParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(sophiaParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(sophiaParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(sophiaParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(sophiaParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(sophiaParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(sophiaParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(sophiaParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(sophiaParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(sophiaParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(sophiaParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(sophiaParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(sophiaParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(sophiaParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(sophiaParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#returnFuncPointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFuncPointer(sophiaParser.ReturnFuncPointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(sophiaParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#methodCall2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall2(sophiaParser.MethodCall2Context ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#methodCallBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallBody(sophiaParser.MethodCallBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(sophiaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(sophiaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(sophiaParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#classAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAssignment(sophiaParser.ClassAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#listInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListInitializer(sophiaParser.ListInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#preExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreExp(sophiaParser.PreExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#postExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostExp(sophiaParser.PostExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(sophiaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(sophiaParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(sophiaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(sophiaParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(sophiaParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(sophiaParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(sophiaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(sophiaParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(sophiaParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(sophiaParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(sophiaParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(sophiaParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(sophiaParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(sophiaParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(sophiaParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(sophiaParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(sophiaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(sophiaParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#printBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintBody(sophiaParser.PrintBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(sophiaParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(sophiaParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#intLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(sophiaParser.IntLiteralContext ctx);
}