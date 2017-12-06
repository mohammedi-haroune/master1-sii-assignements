// Generated from /home/mohammedi/OpenSourceProjects/master1-sii-assignements/Compil/FinalProject/src/TP2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TP2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TP2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TP2Parser#start_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_rule(TP2Parser.Start_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(TP2Parser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(TP2Parser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(TP2Parser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(TP2Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TP2Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(TP2Parser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#instAff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstAff(TP2Parser.InstAffContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#instIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstIf(TP2Parser.InstIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#instElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstElse(TP2Parser.InstElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#instScan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstScan(TP2Parser.InstScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#instPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstPrint(TP2Parser.InstPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#instFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstFor(TP2Parser.InstForContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#instWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstWhile(TP2Parser.InstWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#instCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstCase(TP2Parser.InstCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases(TP2Parser.CasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(TP2Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(TP2Parser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TP2Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1(TP2Parser.Expression1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#pm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPm(TP2Parser.PmContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#md}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMd(TP2Parser.MdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression2(TP2Parser.Expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link TP2Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(TP2Parser.ValueContext ctx);
}