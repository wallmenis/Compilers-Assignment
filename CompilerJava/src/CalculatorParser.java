// Generated from Calculator.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, MINUS=2, MULT=3, DIVIDE=4, POWER=5, SINE=6, COSINE=7, TANGENT=8, 
		COTAN=9, MODULUS=10, NOT=11, AND=12, OR=13, XOR=14, NAND=15, LOGARITHM=16, 
		FACTORIAL=17, PI=18, EULER=19, ROOT=20, EXIT=21, NUM=22, WS=23, LOGIC=24, 
		SEMICOLON=25, LEFTPAR=26, RIGHTPAR=27, COMMA=28, DOT=29, ID=30;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "'-'", "'*'", "'/'", "'**'", "'sin'", "'cos'", "'tan'", 
		"'cot'", "'mod'", "'!'", "'&&'", "'||'", "'|/|'", "'!&'", "'log'", "'fac'", 
		"'pi'", "'e'", "'root'", "'exit'", "NUM", "WS", "LOGIC", "';'", "'('", 
		"')'", "','", "'.'", "ID"
	};
	public static final int
		RULE_statement = 0, RULE_math_expression = 1, RULE_logic_expression = 2, 
		RULE_string_expression = 3, RULE_exit_condition = 4, RULE_expression = 5;
	public static final String[] ruleNames = {
		"statement", "math_expression", "logic_expression", "string_expression", 
		"exit_condition", "expression"
	};

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(CalculatorParser.SEMICOLON, 0); }
		public TerminalNode EOF() { return getToken(CalculatorParser.EOF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(17);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				setState(12); match(EOF);
				}
				break;
			case SINE:
			case COSINE:
			case TANGENT:
			case COTAN:
			case NOT:
			case LOGARITHM:
			case FACTORIAL:
			case PI:
			case EULER:
			case ROOT:
			case EXIT:
			case NUM:
			case LOGIC:
			case LEFTPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(13); expression();
				setState(14); match(SEMICOLON);
				setState(15); statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_expressionContext extends ParserRuleContext {
		public Math_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expression; }
	 
		public Math_expressionContext() { }
		public void copyFrom(Math_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MATH_IN_PARENTHContext extends Math_expressionContext {
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public MATH_IN_PARENTHContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMATH_IN_PARENTH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMATH_IN_PARENTH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitMATH_IN_PARENTH(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPONENT_OPContext extends Math_expressionContext {
		public TerminalNode POWER() { return getToken(CalculatorParser.POWER, 0); }
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public EXPONENT_OPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterEXPONENT_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitEXPONENT_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitEXPONENT_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DIVISION_OPContext extends Math_expressionContext {
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(CalculatorParser.DIVIDE, 0); }
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public DIVISION_OPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterDIVISION_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitDIVISION_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitDIVISION_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FACTORIAL_OPContext extends Math_expressionContext {
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode FACTORIAL() { return getToken(CalculatorParser.FACTORIAL, 0); }
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public FACTORIAL_OPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFACTORIAL_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFACTORIAL_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitFACTORIAL_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MULTIPLICATION_OPContext extends Math_expressionContext {
		public TerminalNode MULT() { return getToken(CalculatorParser.MULT, 0); }
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public MULTIPLICATION_OPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMULTIPLICATION_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMULTIPLICATION_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitMULTIPLICATION_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PI_OPContext extends Math_expressionContext {
		public TerminalNode PI() { return getToken(CalculatorParser.PI, 0); }
		public PI_OPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterPI_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitPI_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitPI_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class COSINE_OPContext extends Math_expressionContext {
		public TerminalNode COSINE() { return getToken(CalculatorParser.COSINE, 0); }
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public COSINE_OPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterCOSINE_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitCOSINE_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitCOSINE_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ROOT_OPContext extends Math_expressionContext {
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CalculatorParser.COMMA, 0); }
		public TerminalNode ROOT() { return getToken(CalculatorParser.ROOT, 0); }
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public ROOT_OPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterROOT_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitROOT_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitROOT_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EULER_OPContext extends Math_expressionContext {
		public TerminalNode EULER() { return getToken(CalculatorParser.EULER, 0); }
		public EULER_OPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterEULER_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitEULER_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitEULER_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SINE_OPContext extends Math_expressionContext {
		public TerminalNode SINE() { return getToken(CalculatorParser.SINE, 0); }
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public SINE_OPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterSINE_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitSINE_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitSINE_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class COTANGENT_OPContext extends Math_expressionContext {
		public TerminalNode COTAN() { return getToken(CalculatorParser.COTAN, 0); }
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public COTANGENT_OPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterCOTANGENT_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitCOTANGENT_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitCOTANGENT_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MODULUS_OPContext extends Math_expressionContext {
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public TerminalNode MODULUS() { return getToken(CalculatorParser.MODULUS, 0); }
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public MODULUS_OPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMODULUS_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMODULUS_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitMODULUS_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BASE_MATH_EXPContext extends Math_expressionContext {
		public TerminalNode NUM() { return getToken(CalculatorParser.NUM, 0); }
		public BASE_MATH_EXPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBASE_MATH_EXP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBASE_MATH_EXP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitBASE_MATH_EXP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ADDITION_OPContext extends Math_expressionContext {
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CalculatorParser.ADD, 0); }
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public ADDITION_OPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterADDITION_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitADDITION_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitADDITION_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LOG_OPContext extends Math_expressionContext {
		public TerminalNode LOGARITHM() { return getToken(CalculatorParser.LOGARITHM, 0); }
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public LOG_OPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterLOG_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitLOG_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitLOG_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TANGENT_OPContext extends Math_expressionContext {
		public TerminalNode TANGENT() { return getToken(CalculatorParser.TANGENT, 0); }
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public TANGENT_OPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterTANGENT_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitTANGENT_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitTANGENT_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SUBTRACTION_OPContext extends Math_expressionContext {
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public SUBTRACTION_OPContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterSUBTRACTION_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitSUBTRACTION_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitSUBTRACTION_OP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expressionContext math_expression() throws RecognitionException {
		return math_expression(0);
	}

	private Math_expressionContext math_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_expressionContext _localctx = new Math_expressionContext(_ctx, _parentState);
		Math_expressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_math_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new BASE_MATH_EXPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(20); match(NUM);
				}
				break;
			case PI:
				{
				_localctx = new PI_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21); match(PI);
				}
				break;
			case EULER:
				{
				_localctx = new EULER_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22); match(EULER);
				}
				break;
			case FACTORIAL:
				{
				_localctx = new FACTORIAL_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23); match(FACTORIAL);
				setState(24); match(LEFTPAR);
				setState(25); math_expression(0);
				setState(26); match(RIGHTPAR);
				}
				break;
			case LOGARITHM:
				{
				_localctx = new LOG_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28); match(LOGARITHM);
				setState(29); match(LEFTPAR);
				setState(30); math_expression(0);
				setState(31); match(RIGHTPAR);
				}
				break;
			case SINE:
				{
				_localctx = new SINE_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33); match(SINE);
				setState(34); match(LEFTPAR);
				setState(35); math_expression(0);
				setState(36); match(RIGHTPAR);
				}
				break;
			case COSINE:
				{
				_localctx = new COSINE_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38); match(COSINE);
				setState(39); match(LEFTPAR);
				setState(40); math_expression(0);
				setState(41); match(RIGHTPAR);
				}
				break;
			case TANGENT:
				{
				_localctx = new TANGENT_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43); match(TANGENT);
				setState(44); match(LEFTPAR);
				setState(45); math_expression(0);
				setState(46); match(RIGHTPAR);
				}
				break;
			case COTAN:
				{
				_localctx = new COTANGENT_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48); match(COTAN);
				setState(49); match(LEFTPAR);
				setState(50); math_expression(0);
				setState(51); match(RIGHTPAR);
				}
				break;
			case ROOT:
				{
				_localctx = new ROOT_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53); match(ROOT);
				setState(54); match(LEFTPAR);
				setState(55); math_expression(0);
				setState(56); match(COMMA);
				setState(57); math_expression(0);
				setState(58); match(RIGHTPAR);
				}
				break;
			case LEFTPAR:
				{
				_localctx = new MATH_IN_PARENTHContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60); match(LEFTPAR);
				setState(61); math_expression(0);
				setState(62); match(RIGHTPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(84);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new EXPONENT_OPContext(new Math_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(66);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(67); match(POWER);
						setState(68); math_expression(8);
						}
						break;
					case 2:
						{
						_localctx = new DIVISION_OPContext(new Math_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(69);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(70); match(DIVIDE);
						setState(71); math_expression(7);
						}
						break;
					case 3:
						{
						_localctx = new MULTIPLICATION_OPContext(new Math_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(72);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(73); match(MULT);
						setState(74); math_expression(6);
						}
						break;
					case 4:
						{
						_localctx = new MODULUS_OPContext(new Math_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(75);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(76); match(MODULUS);
						setState(77); math_expression(5);
						}
						break;
					case 5:
						{
						_localctx = new SUBTRACTION_OPContext(new Math_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(78);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(79); match(MINUS);
						setState(80); math_expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ADDITION_OPContext(new Math_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(81);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(82); match(ADD);
						setState(83); math_expression(3);
						}
						break;
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logic_expressionContext extends ParserRuleContext {
		public Logic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expression; }
	 
		public Logic_expressionContext() { }
		public void copyFrom(Logic_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OR_OPContext extends Logic_expressionContext {
		public Logic_expressionContext logic_expression(int i) {
			return getRuleContext(Logic_expressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(CalculatorParser.OR, 0); }
		public List<Logic_expressionContext> logic_expression() {
			return getRuleContexts(Logic_expressionContext.class);
		}
		public OR_OPContext(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterOR_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitOR_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitOR_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NOT_OPContext extends Logic_expressionContext {
		public TerminalNode NOT() { return getToken(CalculatorParser.NOT, 0); }
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public NOT_OPContext(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterNOT_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitNOT_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitNOT_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BASE_LOGIC_EXPContext extends Logic_expressionContext {
		public TerminalNode LOGIC() { return getToken(CalculatorParser.LOGIC, 0); }
		public BASE_LOGIC_EXPContext(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBASE_LOGIC_EXP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBASE_LOGIC_EXP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitBASE_LOGIC_EXP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LOGIC_IN_PARENTHContext extends Logic_expressionContext {
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public LOGIC_IN_PARENTHContext(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterLOGIC_IN_PARENTH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitLOGIC_IN_PARENTH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitLOGIC_IN_PARENTH(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NAND_OPContext extends Logic_expressionContext {
		public Logic_expressionContext logic_expression(int i) {
			return getRuleContext(Logic_expressionContext.class,i);
		}
		public TerminalNode NAND() { return getToken(CalculatorParser.NAND, 0); }
		public List<Logic_expressionContext> logic_expression() {
			return getRuleContexts(Logic_expressionContext.class);
		}
		public NAND_OPContext(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterNAND_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitNAND_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitNAND_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AND_OPContext extends Logic_expressionContext {
		public Logic_expressionContext logic_expression(int i) {
			return getRuleContext(Logic_expressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(CalculatorParser.AND, 0); }
		public List<Logic_expressionContext> logic_expression() {
			return getRuleContexts(Logic_expressionContext.class);
		}
		public AND_OPContext(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterAND_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitAND_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitAND_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XOR_OPContext extends Logic_expressionContext {
		public TerminalNode XOR() { return getToken(CalculatorParser.XOR, 0); }
		public Logic_expressionContext logic_expression(int i) {
			return getRuleContext(Logic_expressionContext.class,i);
		}
		public List<Logic_expressionContext> logic_expression() {
			return getRuleContexts(Logic_expressionContext.class);
		}
		public XOR_OPContext(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterXOR_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitXOR_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitXOR_OP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_expressionContext logic_expression() throws RecognitionException {
		return logic_expression(0);
	}

	private Logic_expressionContext logic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logic_expressionContext _localctx = new Logic_expressionContext(_ctx, _parentState);
		Logic_expressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_logic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NOT_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(90); match(NOT);
				setState(91); logic_expression(6);
				}
				break;
			case LOGIC:
				{
				_localctx = new BASE_LOGIC_EXPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92); match(LOGIC);
				}
				break;
			case LEFTPAR:
				{
				_localctx = new LOGIC_IN_PARENTHContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93); match(LEFTPAR);
				setState(94); logic_expression(0);
				setState(95); match(RIGHTPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new AND_OPContext(new Logic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
						setState(99);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(100); match(AND);
						setState(101); logic_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new NAND_OPContext(new Logic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
						setState(102);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(103); match(NAND);
						setState(104); logic_expression(5);
						}
						break;
					case 3:
						{
						_localctx = new OR_OPContext(new Logic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
						setState(105);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(106); match(OR);
						setState(107); logic_expression(4);
						}
						break;
					case 4:
						{
						_localctx = new XOR_OPContext(new Logic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
						setState(108);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(109); match(XOR);
						setState(110); logic_expression(3);
						}
						break;
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class String_expressionContext extends ParserRuleContext {
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
	 
		public String_expressionContext() { }
		public void copyFrom(String_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CONCAT_OPContext extends String_expressionContext {
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public TerminalNode ADD() { return getToken(CalculatorParser.ADD, 0); }
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public CONCAT_OPContext(String_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterCONCAT_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitCONCAT_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitCONCAT_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BASE_ID_EXPContext extends String_expressionContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public BASE_ID_EXPContext(String_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBASE_ID_EXP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBASE_ID_EXP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitBASE_ID_EXP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		return string_expression(0);
	}

	private String_expressionContext string_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_expressionContext _localctx = new String_expressionContext(_ctx, _parentState);
		String_expressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_string_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			switch (_input.LA(1)) {
			case SINE:
			case COSINE:
			case TANGENT:
			case COTAN:
			case LOGARITHM:
			case FACTORIAL:
			case PI:
			case EULER:
			case ROOT:
			case NUM:
			case LEFTPAR:
				{
				_localctx = new CONCAT_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(117); math_expression(0);
				setState(118); match(ADD);
				setState(119); string_expression(2);
				}
				break;
			case ID:
				{
				_localctx = new BASE_ID_EXPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new CONCAT_OPContext(new String_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_string_expression);
						setState(124);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(125); match(ADD);
						setState(126); string_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new CONCAT_OPContext(new String_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_string_expression);
						setState(127);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(128); match(ADD);
						setState(129); math_expression(0);
						}
						break;
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Exit_conditionContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(CalculatorParser.EXIT, 0); }
		public Exit_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExit_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExit_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitExit_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_conditionContext exit_condition() throws RecognitionException {
		Exit_conditionContext _localctx = new Exit_conditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exit_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(EXIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Exit_conditionContext exit_condition() {
			return getRuleContext(Exit_conditionContext.class,0);
		}
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); math_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); logic_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139); exit_condition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return math_expression_sempred((Math_expressionContext)_localctx, predIndex);
		case 2: return logic_expression_sempred((Logic_expressionContext)_localctx, predIndex);
		case 3: return string_expression_sempred((String_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean string_expression_sempred(String_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return precpred(_ctx, 3);
		case 11: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean math_expression_sempred(Math_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 6);
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		case 4: return precpred(_ctx, 3);
		case 5: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logic_expression_sempred(Logic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 5);
		case 7: return precpred(_ctx, 4);
		case 8: return precpred(_ctx, 3);
		case 9: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u0091\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\5\2\24\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3C\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3W\n\3\f\3\16\3"+
		"Z\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4d\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4r\n\4\f\4\16\4u\13\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5}\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0085\n\5\f\5\16\5\u0088\13"+
		"\5\3\6\3\6\3\7\3\7\3\7\5\7\u008f\n\7\3\7\2\5\4\6\b\b\2\4\6\b\n\f\2\2\u00a6"+
		"\2\23\3\2\2\2\4B\3\2\2\2\6c\3\2\2\2\b|\3\2\2\2\n\u0089\3\2\2\2\f\u008e"+
		"\3\2\2\2\16\24\7\2\2\3\17\20\5\f\7\2\20\21\7\33\2\2\21\22\5\2\2\2\22\24"+
		"\3\2\2\2\23\16\3\2\2\2\23\17\3\2\2\2\24\3\3\2\2\2\25\26\b\3\1\2\26C\7"+
		"\30\2\2\27C\7\24\2\2\30C\7\25\2\2\31\32\7\23\2\2\32\33\7\34\2\2\33\34"+
		"\5\4\3\2\34\35\7\35\2\2\35C\3\2\2\2\36\37\7\22\2\2\37 \7\34\2\2 !\5\4"+
		"\3\2!\"\7\35\2\2\"C\3\2\2\2#$\7\b\2\2$%\7\34\2\2%&\5\4\3\2&\'\7\35\2\2"+
		"\'C\3\2\2\2()\7\t\2\2)*\7\34\2\2*+\5\4\3\2+,\7\35\2\2,C\3\2\2\2-.\7\n"+
		"\2\2./\7\34\2\2/\60\5\4\3\2\60\61\7\35\2\2\61C\3\2\2\2\62\63\7\13\2\2"+
		"\63\64\7\34\2\2\64\65\5\4\3\2\65\66\7\35\2\2\66C\3\2\2\2\678\7\26\2\2"+
		"89\7\34\2\29:\5\4\3\2:;\7\36\2\2;<\5\4\3\2<=\7\35\2\2=C\3\2\2\2>?\7\34"+
		"\2\2?@\5\4\3\2@A\7\35\2\2AC\3\2\2\2B\25\3\2\2\2B\27\3\2\2\2B\30\3\2\2"+
		"\2B\31\3\2\2\2B\36\3\2\2\2B#\3\2\2\2B(\3\2\2\2B-\3\2\2\2B\62\3\2\2\2B"+
		"\67\3\2\2\2B>\3\2\2\2CX\3\2\2\2DE\f\t\2\2EF\7\7\2\2FW\5\4\3\nGH\f\b\2"+
		"\2HI\7\6\2\2IW\5\4\3\tJK\f\7\2\2KL\7\5\2\2LW\5\4\3\bMN\f\6\2\2NO\7\f\2"+
		"\2OW\5\4\3\7PQ\f\5\2\2QR\7\4\2\2RW\5\4\3\6ST\f\4\2\2TU\7\3\2\2UW\5\4\3"+
		"\5VD\3\2\2\2VG\3\2\2\2VJ\3\2\2\2VM\3\2\2\2VP\3\2\2\2VS\3\2\2\2WZ\3\2\2"+
		"\2XV\3\2\2\2XY\3\2\2\2Y\5\3\2\2\2ZX\3\2\2\2[\\\b\4\1\2\\]\7\r\2\2]d\5"+
		"\6\4\b^d\7\32\2\2_`\7\34\2\2`a\5\6\4\2ab\7\35\2\2bd\3\2\2\2c[\3\2\2\2"+
		"c^\3\2\2\2c_\3\2\2\2ds\3\2\2\2ef\f\7\2\2fg\7\16\2\2gr\5\6\4\bhi\f\6\2"+
		"\2ij\7\21\2\2jr\5\6\4\7kl\f\5\2\2lm\7\17\2\2mr\5\6\4\6no\f\4\2\2op\7\20"+
		"\2\2pr\5\6\4\5qe\3\2\2\2qh\3\2\2\2qk\3\2\2\2qn\3\2\2\2ru\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2t\7\3\2\2\2us\3\2\2\2vw\b\5\1\2wx\5\4\3\2xy\7\3\2\2yz\5"+
		"\b\5\4z}\3\2\2\2{}\7 \2\2|v\3\2\2\2|{\3\2\2\2}\u0086\3\2\2\2~\177\f\5"+
		"\2\2\177\u0080\7\3\2\2\u0080\u0085\5\b\5\6\u0081\u0082\f\3\2\2\u0082\u0083"+
		"\7\3\2\2\u0083\u0085\5\4\3\2\u0084~\3\2\2\2\u0084\u0081\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\t\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0089\u008a\7\27\2\2\u008a\13\3\2\2\2\u008b\u008f"+
		"\5\4\3\2\u008c\u008f\5\6\4\2\u008d\u008f\5\n\6\2\u008e\u008b\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\r\3\2\2\2\r\23BVXcqs|\u0084\u0086"+
		"\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}