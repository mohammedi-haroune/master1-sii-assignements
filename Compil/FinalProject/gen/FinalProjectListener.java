// Generated from /home/mohammedi/OpenSourceProjects/master1-sii-assignements/Compil/FinalProject/src/FinalProject.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FinalProjectParser}.
 */
public interface FinalProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void enterStart_rule(FinalProjectParser.Start_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void exitStart_rule(FinalProjectParser.Start_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(FinalProjectParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(FinalProjectParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(FinalProjectParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(FinalProjectParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(FinalProjectParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(FinalProjectParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(FinalProjectParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(FinalProjectParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FinalProjectParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FinalProjectParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(FinalProjectParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(FinalProjectParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#instAff}.
	 * @param ctx the parse tree
	 */
	void enterInstAff(FinalProjectParser.InstAffContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#instAff}.
	 * @param ctx the parse tree
	 */
	void exitInstAff(FinalProjectParser.InstAffContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#instIf}.
	 * @param ctx the parse tree
	 */
	void enterInstIf(FinalProjectParser.InstIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#instIf}.
	 * @param ctx the parse tree
	 */
	void exitInstIf(FinalProjectParser.InstIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#instElse}.
	 * @param ctx the parse tree
	 */
	void enterInstElse(FinalProjectParser.InstElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#instElse}.
	 * @param ctx the parse tree
	 */
	void exitInstElse(FinalProjectParser.InstElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#instScan}.
	 * @param ctx the parse tree
	 */
	void enterInstScan(FinalProjectParser.InstScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#instScan}.
	 * @param ctx the parse tree
	 */
	void exitInstScan(FinalProjectParser.InstScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#instPrint}.
	 * @param ctx the parse tree
	 */
	void enterInstPrint(FinalProjectParser.InstPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#instPrint}.
	 * @param ctx the parse tree
	 */
	void exitInstPrint(FinalProjectParser.InstPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#instFor}.
	 * @param ctx the parse tree
	 */
	void enterInstFor(FinalProjectParser.InstForContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#instFor}.
	 * @param ctx the parse tree
	 */
	void exitInstFor(FinalProjectParser.InstForContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#instWhile}.
	 * @param ctx the parse tree
	 */
	void enterInstWhile(FinalProjectParser.InstWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#instWhile}.
	 * @param ctx the parse tree
	 */
	void exitInstWhile(FinalProjectParser.InstWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#instCase}.
	 * @param ctx the parse tree
	 */
	void enterInstCase(FinalProjectParser.InstCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#instCase}.
	 * @param ctx the parse tree
	 */
	void exitInstCase(FinalProjectParser.InstCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(FinalProjectParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(FinalProjectParser.CasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(FinalProjectParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(FinalProjectParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(FinalProjectParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(FinalProjectParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FinalProjectParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FinalProjectParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterExpression1(FinalProjectParser.Expression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitExpression1(FinalProjectParser.Expression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#pm}.
	 * @param ctx the parse tree
	 */
	void enterPm(FinalProjectParser.PmContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#pm}.
	 * @param ctx the parse tree
	 */
	void exitPm(FinalProjectParser.PmContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#md}.
	 * @param ctx the parse tree
	 */
	void enterMd(FinalProjectParser.MdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#md}.
	 * @param ctx the parse tree
	 */
	void exitMd(FinalProjectParser.MdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterExpression2(FinalProjectParser.Expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitExpression2(FinalProjectParser.Expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link FinalProjectParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(FinalProjectParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalProjectParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(FinalProjectParser.ValueContext ctx);
}