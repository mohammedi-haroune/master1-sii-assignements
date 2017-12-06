// Generated from /home/mohammedi/OpenSourceProjects/master1-sii-assignements/Compil/FinalProject/src/FinalProject.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FinalProjectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FinalProjectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#start_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_rule(FinalProjectParser.Start_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(FinalProjectParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(FinalProjectParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(FinalProjectParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(FinalProjectParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FinalProjectParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(FinalProjectParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#instAff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstAff(FinalProjectParser.InstAffContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#instIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstIf(FinalProjectParser.InstIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#instElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstElse(FinalProjectParser.InstElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#instScan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstScan(FinalProjectParser.InstScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#instPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstPrint(FinalProjectParser.InstPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#instFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstFor(FinalProjectParser.InstForContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#instWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstWhile(FinalProjectParser.InstWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#instCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstCase(FinalProjectParser.InstCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases(FinalProjectParser.CasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(FinalProjectParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(FinalProjectParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FinalProjectParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1(FinalProjectParser.Expression1Context ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#pm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPm(FinalProjectParser.PmContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#md}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMd(FinalProjectParser.MdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression2(FinalProjectParser.Expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link FinalProjectParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(FinalProjectParser.ValueContext ctx);
}