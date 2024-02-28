// Generated from Calculator.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code OR_OP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterOR_OP(@NotNull CalculatorParser.OR_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OR_OP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitOR_OP(@NotNull CalculatorParser.OR_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BASE_LOGIC_EXP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterBASE_LOGIC_EXP(@NotNull CalculatorParser.BASE_LOGIC_EXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BASE_LOGIC_EXP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitBASE_LOGIC_EXP(@NotNull CalculatorParser.BASE_LOGIC_EXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAND_OP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterNAND_OP(@NotNull CalculatorParser.NAND_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAND_OP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitNAND_OP(@NotNull CalculatorParser.NAND_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FACTORIAL_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterFACTORIAL_OP(@NotNull CalculatorParser.FACTORIAL_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FACTORIAL_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitFACTORIAL_OP(@NotNull CalculatorParser.FACTORIAL_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XOR_OP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterXOR_OP(@NotNull CalculatorParser.XOR_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XOR_OP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitXOR_OP(@NotNull CalculatorParser.XOR_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ROOT_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterROOT_OP(@NotNull CalculatorParser.ROOT_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ROOT_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitROOT_OP(@NotNull CalculatorParser.ROOT_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EULER_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterEULER_OP(@NotNull CalculatorParser.EULER_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EULER_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitEULER_OP(@NotNull CalculatorParser.EULER_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COTANGENT_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterCOTANGENT_OP(@NotNull CalculatorParser.COTANGENT_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COTANGENT_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitCOTANGENT_OP(@NotNull CalculatorParser.COTANGENT_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BASE_MATH_EXP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterBASE_MATH_EXP(@NotNull CalculatorParser.BASE_MATH_EXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BASE_MATH_EXP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitBASE_MATH_EXP(@NotNull CalculatorParser.BASE_MATH_EXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADDITION_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterADDITION_OP(@NotNull CalculatorParser.ADDITION_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADDITION_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitADDITION_OP(@NotNull CalculatorParser.ADDITION_OPContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull CalculatorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull CalculatorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TANGENT_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterTANGENT_OP(@NotNull CalculatorParser.TANGENT_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TANGENT_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitTANGENT_OP(@NotNull CalculatorParser.TANGENT_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUBTRACTION_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterSUBTRACTION_OP(@NotNull CalculatorParser.SUBTRACTION_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUBTRACTION_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitSUBTRACTION_OP(@NotNull CalculatorParser.SUBTRACTION_OPContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull CalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull CalculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MATH_IN_PARENTH}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterMATH_IN_PARENTH(@NotNull CalculatorParser.MATH_IN_PARENTHContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MATH_IN_PARENTH}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitMATH_IN_PARENTH(@NotNull CalculatorParser.MATH_IN_PARENTHContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPONENT_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPONENT_OP(@NotNull CalculatorParser.EXPONENT_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPONENT_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPONENT_OP(@NotNull CalculatorParser.EXPONENT_OPContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#exit_condition}.
	 * @param ctx the parse tree
	 */
	void enterExit_condition(@NotNull CalculatorParser.Exit_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#exit_condition}.
	 * @param ctx the parse tree
	 */
	void exitExit_condition(@NotNull CalculatorParser.Exit_conditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DIVISION_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterDIVISION_OP(@NotNull CalculatorParser.DIVISION_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DIVISION_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitDIVISION_OP(@NotNull CalculatorParser.DIVISION_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULTIPLICATION_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterMULTIPLICATION_OP(@NotNull CalculatorParser.MULTIPLICATION_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULTIPLICATION_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitMULTIPLICATION_OP(@NotNull CalculatorParser.MULTIPLICATION_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PI_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterPI_OP(@NotNull CalculatorParser.PI_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PI_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitPI_OP(@NotNull CalculatorParser.PI_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BASE_ID_EXP}
	 * labeled alternative in {@link CalculatorParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterBASE_ID_EXP(@NotNull CalculatorParser.BASE_ID_EXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BASE_ID_EXP}
	 * labeled alternative in {@link CalculatorParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitBASE_ID_EXP(@NotNull CalculatorParser.BASE_ID_EXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COSINE_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterCOSINE_OP(@NotNull CalculatorParser.COSINE_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COSINE_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitCOSINE_OP(@NotNull CalculatorParser.COSINE_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONCAT_OP}
	 * labeled alternative in {@link CalculatorParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterCONCAT_OP(@NotNull CalculatorParser.CONCAT_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONCAT_OP}
	 * labeled alternative in {@link CalculatorParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitCONCAT_OP(@NotNull CalculatorParser.CONCAT_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SINE_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterSINE_OP(@NotNull CalculatorParser.SINE_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SINE_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitSINE_OP(@NotNull CalculatorParser.SINE_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MODULUS_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterMODULUS_OP(@NotNull CalculatorParser.MODULUS_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MODULUS_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitMODULUS_OP(@NotNull CalculatorParser.MODULUS_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOG_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterLOG_OP(@NotNull CalculatorParser.LOG_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOG_OP}
	 * labeled alternative in {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitLOG_OP(@NotNull CalculatorParser.LOG_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOT_OP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterNOT_OP(@NotNull CalculatorParser.NOT_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOT_OP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitNOT_OP(@NotNull CalculatorParser.NOT_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOGIC_IN_PARENTH}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLOGIC_IN_PARENTH(@NotNull CalculatorParser.LOGIC_IN_PARENTHContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOGIC_IN_PARENTH}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLOGIC_IN_PARENTH(@NotNull CalculatorParser.LOGIC_IN_PARENTHContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AND_OP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterAND_OP(@NotNull CalculatorParser.AND_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AND_OP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitAND_OP(@NotNull CalculatorParser.AND_OPContext ctx);
}