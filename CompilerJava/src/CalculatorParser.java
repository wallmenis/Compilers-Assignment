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
		FACTORIAL=17, PI=18, EULER=19, ROOT=20, NUM=21, WS=22, LOGIC=23, SEMICOLON=24, 
		LEFTPAR=25, RIGHTPAR=26, COMMA=27, DOT=28, ID=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "'-'", "'*'", "'/'", "'**'", "'sin'", "'cos'", "'tan'", 
		"'cot'", "'mod'", "'!'", "'&&'", "'||'", "'|/|'", "'!&'", "'log'", "'fac'", 
		"'pi'", "'e'", "'root'", "NUM", "WS", "LOGIC", "';'", "'('", "')'", "','", 
		"'.'", "ID"
	};
	public static final int
		RULE_statement = 0, RULE_math_expression = 1, RULE_logic_expression = 2, 
		RULE_string_expression = 3, RULE_expression = 4;
	public static final String[] ruleNames = {
		"statement", "math_expression", "logic_expression", "string_expression", 
		"expression"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(10); expression();
			setState(11); match(SEMICOLON);
			setState(12); match(EOF);
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
			setState(59);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new BASE_MATH_EXPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(15); match(NUM);
				}
				break;
			case PI:
				{
				_localctx = new PI_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16); match(PI);
				}
				break;
			case EULER:
				{
				_localctx = new EULER_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17); match(EULER);
				}
				break;
			case FACTORIAL:
				{
				_localctx = new FACTORIAL_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(18); match(FACTORIAL);
				setState(19); match(LEFTPAR);
				setState(20); math_expression(0);
				setState(21); match(RIGHTPAR);
				}
				break;
			case LOGARITHM:
				{
				_localctx = new LOG_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23); match(LOGARITHM);
				setState(24); match(LEFTPAR);
				setState(25); math_expression(0);
				setState(26); match(RIGHTPAR);
				}
				break;
			case SINE:
				{
				_localctx = new SINE_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28); match(SINE);
				setState(29); match(LEFTPAR);
				setState(30); math_expression(0);
				setState(31); match(RIGHTPAR);
				}
				break;
			case COSINE:
				{
				_localctx = new COSINE_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33); match(COSINE);
				setState(34); match(LEFTPAR);
				setState(35); math_expression(0);
				setState(36); match(RIGHTPAR);
				}
				break;
			case TANGENT:
				{
				_localctx = new TANGENT_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38); match(TANGENT);
				setState(39); match(LEFTPAR);
				setState(40); math_expression(0);
				setState(41); match(RIGHTPAR);
				}
				break;
			case COTAN:
				{
				_localctx = new COTANGENT_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43); match(COTAN);
				setState(44); match(LEFTPAR);
				setState(45); math_expression(0);
				setState(46); match(RIGHTPAR);
				}
				break;
			case ROOT:
				{
				_localctx = new ROOT_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48); match(ROOT);
				setState(49); match(LEFTPAR);
				setState(50); math_expression(0);
				setState(51); match(COMMA);
				setState(52); math_expression(0);
				setState(53); match(RIGHTPAR);
				}
				break;
			case LEFTPAR:
				{
				_localctx = new MATH_IN_PARENTHContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55); match(LEFTPAR);
				setState(56); math_expression(0);
				setState(57); match(RIGHTPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(79);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new EXPONENT_OPContext(new Math_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(61);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(62); match(POWER);
						setState(63); math_expression(8);
						}
						break;
					case 2:
						{
						_localctx = new DIVISION_OPContext(new Math_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(64);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(65); match(DIVIDE);
						setState(66); math_expression(7);
						}
						break;
					case 3:
						{
						_localctx = new MULTIPLICATION_OPContext(new Math_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(67);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(68); match(MULT);
						setState(69); math_expression(6);
						}
						break;
					case 4:
						{
						_localctx = new MODULUS_OPContext(new Math_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(70);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(71); match(MODULUS);
						setState(72); math_expression(5);
						}
						break;
					case 5:
						{
						_localctx = new SUBTRACTION_OPContext(new Math_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(73);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(74); match(MINUS);
						setState(75); math_expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ADDITION_OPContext(new Math_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(76);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(77); match(ADD);
						setState(78); math_expression(3);
						}
						break;
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
			setState(92);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NOT_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(85); match(NOT);
				setState(86); logic_expression(6);
				}
				break;
			case LOGIC:
				{
				_localctx = new BASE_LOGIC_EXPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87); match(LOGIC);
				}
				break;
			case LEFTPAR:
				{
				_localctx = new LOGIC_IN_PARENTHContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88); match(LEFTPAR);
				setState(89); logic_expression(0);
				setState(90); match(RIGHTPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new AND_OPContext(new Logic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
						setState(94);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(95); match(AND);
						setState(96); logic_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new NAND_OPContext(new Logic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
						setState(97);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(98); match(NAND);
						setState(99); logic_expression(5);
						}
						break;
					case 3:
						{
						_localctx = new OR_OPContext(new Logic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
						setState(100);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(101); match(OR);
						setState(102); logic_expression(4);
						}
						break;
					case 4:
						{
						_localctx = new XOR_OPContext(new Logic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
						setState(103);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(104); match(XOR);
						setState(105); logic_expression(3);
						}
						break;
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(117);
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

				setState(112); math_expression(0);
				setState(113); match(ADD);
				setState(114); string_expression(2);
				}
				break;
			case ID:
				{
				_localctx = new BASE_ID_EXPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new CONCAT_OPContext(new String_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_string_expression);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120); match(ADD);
						setState(121); string_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new CONCAT_OPContext(new String_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_string_expression);
						setState(122);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(123); match(ADD);
						setState(124); math_expression(0);
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
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
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); math_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); logic_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132); string_expression(0);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3R\n\3\f\3\16\3U\13\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4_\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4m\n\4\f\4\16\4p\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5x\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5\u0080\n\5\f\5\16\5\u0083\13\5\3\6\3\6\3\6\5\6\u0088"+
		"\n\6\3\6\2\5\4\6\b\7\2\4\6\b\n\2\2\u009f\2\f\3\2\2\2\4=\3\2\2\2\6^\3\2"+
		"\2\2\bw\3\2\2\2\n\u0087\3\2\2\2\f\r\5\n\6\2\r\16\7\32\2\2\16\17\7\2\2"+
		"\3\17\3\3\2\2\2\20\21\b\3\1\2\21>\7\27\2\2\22>\7\24\2\2\23>\7\25\2\2\24"+
		"\25\7\23\2\2\25\26\7\33\2\2\26\27\5\4\3\2\27\30\7\34\2\2\30>\3\2\2\2\31"+
		"\32\7\22\2\2\32\33\7\33\2\2\33\34\5\4\3\2\34\35\7\34\2\2\35>\3\2\2\2\36"+
		"\37\7\b\2\2\37 \7\33\2\2 !\5\4\3\2!\"\7\34\2\2\">\3\2\2\2#$\7\t\2\2$%"+
		"\7\33\2\2%&\5\4\3\2&\'\7\34\2\2\'>\3\2\2\2()\7\n\2\2)*\7\33\2\2*+\5\4"+
		"\3\2+,\7\34\2\2,>\3\2\2\2-.\7\13\2\2./\7\33\2\2/\60\5\4\3\2\60\61\7\34"+
		"\2\2\61>\3\2\2\2\62\63\7\26\2\2\63\64\7\33\2\2\64\65\5\4\3\2\65\66\7\35"+
		"\2\2\66\67\5\4\3\2\678\7\34\2\28>\3\2\2\29:\7\33\2\2:;\5\4\3\2;<\7\34"+
		"\2\2<>\3\2\2\2=\20\3\2\2\2=\22\3\2\2\2=\23\3\2\2\2=\24\3\2\2\2=\31\3\2"+
		"\2\2=\36\3\2\2\2=#\3\2\2\2=(\3\2\2\2=-\3\2\2\2=\62\3\2\2\2=9\3\2\2\2>"+
		"S\3\2\2\2?@\f\t\2\2@A\7\7\2\2AR\5\4\3\nBC\f\b\2\2CD\7\6\2\2DR\5\4\3\t"+
		"EF\f\7\2\2FG\7\5\2\2GR\5\4\3\bHI\f\6\2\2IJ\7\f\2\2JR\5\4\3\7KL\f\5\2\2"+
		"LM\7\4\2\2MR\5\4\3\6NO\f\4\2\2OP\7\3\2\2PR\5\4\3\5Q?\3\2\2\2QB\3\2\2\2"+
		"QE\3\2\2\2QH\3\2\2\2QK\3\2\2\2QN\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"T\5\3\2\2\2US\3\2\2\2VW\b\4\1\2WX\7\r\2\2X_\5\6\4\bY_\7\31\2\2Z[\7\33"+
		"\2\2[\\\5\6\4\2\\]\7\34\2\2]_\3\2\2\2^V\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2_n"+
		"\3\2\2\2`a\f\7\2\2ab\7\16\2\2bm\5\6\4\bcd\f\6\2\2de\7\21\2\2em\5\6\4\7"+
		"fg\f\5\2\2gh\7\17\2\2hm\5\6\4\6ij\f\4\2\2jk\7\20\2\2km\5\6\4\5l`\3\2\2"+
		"\2lc\3\2\2\2lf\3\2\2\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\7\3\2"+
		"\2\2pn\3\2\2\2qr\b\5\1\2rs\5\4\3\2st\7\3\2\2tu\5\b\5\4ux\3\2\2\2vx\7\37"+
		"\2\2wq\3\2\2\2wv\3\2\2\2x\u0081\3\2\2\2yz\f\5\2\2z{\7\3\2\2{\u0080\5\b"+
		"\5\6|}\f\3\2\2}~\7\3\2\2~\u0080\5\4\3\2\177y\3\2\2\2\177|\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\t\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0088\5\4\3\2\u0085\u0088\5\6\4\2\u0086\u0088\5\b"+
		"\5\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\13\3\2\2\2\f=QS^lnw\177\u0081\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}