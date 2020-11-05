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
	 * Visit a parse tree produced by {@link sophiaParser#conditionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBlock(sophiaParser.ConditionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#statBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatBlock(sophiaParser.StatBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#statementWithoutSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutSubstatement(sophiaParser.StatementWithoutSubstatementContext ctx);
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
	 * Visit a parse tree produced by {@link sophiaParser#primary4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary4(sophiaParser.Primary4Context ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#primary5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary5(sophiaParser.Primary5Context ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#primary3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary3(sophiaParser.Primary3Context ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#primary6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary6(sophiaParser.Primary6Context ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#primary2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary2(sophiaParser.Primary2Context ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#fieldCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldCall(sophiaParser.FieldCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#fieldCallPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldCallPrimary(sophiaParser.FieldCallPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#arrayCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCall(sophiaParser.ArrayCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#aarrayCallPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAarrayCallPrimary(sophiaParser.AarrayCallPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#arrayCallNoPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCallNoPrimary(sophiaParser.ArrayCallNoPrimaryContext ctx);
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
	 * Visit a parse tree produced by {@link sophiaParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(sophiaParser.EmptyContext ctx);
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
	 * Visit a parse tree produced by {@link sophiaParser#leftSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftSide(sophiaParser.LeftSideContext ctx);
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
	 * Visit a parse tree produced by {@link sophiaParser#exprBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBody(sophiaParser.ExprBodyContext ctx);
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
	 * Visit a parse tree produced by {@link sophiaParser#relationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpression(sophiaParser.RelationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(sophiaParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#multipleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleExpression(sophiaParser.MultipleExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link sophiaParser#postIncExpressionPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncExpressionPostfix(sophiaParser.PostIncExpressionPostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#postDecExpressionPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecExpressionPostfix(sophiaParser.PostDecExpressionPostfixContext ctx);
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