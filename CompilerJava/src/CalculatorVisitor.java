// Generated from Calculator.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code OR_OP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOR_OP(@NotNull CalculatorParser.OR_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code L3P}
	 * labeled alternative in {@link CalculatorParser#level3prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL3P(@NotNull CalculatorParser.L3PContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BASE_LOGIC_EXP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBASE_LOGIC_EXP(@NotNull CalculatorParser.BASE_LOGIC_EXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code L1P}
	 * labeled alternative in {@link CalculatorParser#level2prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL1P(@NotNull CalculatorParser.L1PContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NAND_OP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNAND_OP(@NotNull CalculatorParser.NAND_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FACTORIAL_OP}
	 * labeled alternative in {@link CalculatorParser#level3prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFACTORIAL_OP(@NotNull CalculatorParser.FACTORIAL_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XOR_OP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXOR_OP(@NotNull CalculatorParser.XOR_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ROOT_OP}
	 * labeled alternative in {@link CalculatorParser#level3prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitROOT_OP(@NotNull CalculatorParser.ROOT_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EULER_OP}
	 * labeled alternative in {@link CalculatorParser#math_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEULER_OP(@NotNull CalculatorParser.EULER_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COTANGENT_OP}
	 * labeled alternative in {@link CalculatorParser#level3prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOTANGENT_OP(@NotNull CalculatorParser.COTANGENT_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BASE_MATH_EXP}
	 * labeled alternative in {@link CalculatorParser#math_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBASE_MATH_EXP(@NotNull CalculatorParser.BASE_MATH_EXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADDITION_OP}
	 * labeled alternative in {@link CalculatorParser#level1prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADDITION_OP(@NotNull CalculatorParser.ADDITION_OPContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull CalculatorParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TANGENT_OP}
	 * labeled alternative in {@link CalculatorParser#level3prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTANGENT_OP(@NotNull CalculatorParser.TANGENT_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUBTRACTION_OP}
	 * labeled alternative in {@link CalculatorParser#level1prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUBTRACTION_OP(@NotNull CalculatorParser.SUBTRACTION_OPContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull CalculatorParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MATH_IN_PARENTH}
	 * labeled alternative in {@link CalculatorParser#level3prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMATH_IN_PARENTH(@NotNull CalculatorParser.MATH_IN_PARENTHContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPONENT_OP}
	 * labeled alternative in {@link CalculatorParser#level2prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPONENT_OP(@NotNull CalculatorParser.EXPONENT_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DIVISION_OP}
	 * labeled alternative in {@link CalculatorParser#level2prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIVISION_OP(@NotNull CalculatorParser.DIVISION_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULTIPLICATION_OP}
	 * labeled alternative in {@link CalculatorParser#level2prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULTIPLICATION_OP(@NotNull CalculatorParser.MULTIPLICATION_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PI_OP}
	 * labeled alternative in {@link CalculatorParser#math_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPI_OP(@NotNull CalculatorParser.PI_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BASE_ID_EXP}
	 * labeled alternative in {@link CalculatorParser#string_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBASE_ID_EXP(@NotNull CalculatorParser.BASE_ID_EXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COSINE_OP}
	 * labeled alternative in {@link CalculatorParser#level3prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOSINE_OP(@NotNull CalculatorParser.COSINE_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONCAT_OP}
	 * labeled alternative in {@link CalculatorParser#string_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONCAT_OP(@NotNull CalculatorParser.CONCAT_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SINE_OP}
	 * labeled alternative in {@link CalculatorParser#level3prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSINE_OP(@NotNull CalculatorParser.SINE_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MODULUS_OP}
	 * labeled alternative in {@link CalculatorParser#level2prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMODULUS_OP(@NotNull CalculatorParser.MODULUS_OPContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expression(@NotNull CalculatorParser.Math_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOG_OP}
	 * labeled alternative in {@link CalculatorParser#level3prioritymath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOG_OP(@NotNull CalculatorParser.LOG_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOT_OP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOT_OP(@NotNull CalculatorParser.NOT_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOGIC_IN_PARENTH}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOGIC_IN_PARENTH(@NotNull CalculatorParser.LOGIC_IN_PARENTHContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AND_OP}
	 * labeled alternative in {@link CalculatorParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAND_OP(@NotNull CalculatorParser.AND_OPContext ctx);
}