// Generated from Calculator.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(@NotNull CalculatorParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(@NotNull CalculatorParser.RContext ctx);
}