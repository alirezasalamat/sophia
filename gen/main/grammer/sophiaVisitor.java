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
	 * Visit a parse tree produced by {@link sophiaParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(sophiaParser.MethodCallContext ctx);
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
	 * Visit a parse tree produced by {@link sophiaParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(sophiaParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#funcPointerDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncPointerDeclaration(sophiaParser.FuncPointerDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link sophiaParser#statementExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExp(sophiaParser.StatementExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#expStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpStatement(sophiaParser.ExpStatementContext ctx);
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
	 * Visit a parse tree produced by {@link sophiaParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(sophiaParser.EmptyStatementContext ctx);
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
	 * Visit a parse tree produced by {@link sophiaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(sophiaParser.AssignmentContext ctx);
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
	 * Visit a parse tree produced by {@link sophiaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(sophiaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#print_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stat(sophiaParser.Print_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#print_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_body(sophiaParser.Print_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link sophiaParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(sophiaParser.CommentContext ctx);
}