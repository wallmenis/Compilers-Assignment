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
		RULE_statement = 0, RULE_math_base = 1, RULE_level1prioritymath = 2, RULE_level2prioritymath = 3, 
		RULE_level3prioritymath = 4, RULE_math_expression = 5, RULE_logic_expression = 6, 
		RULE_string_expression = 7, RULE_expression = 8;
	public static final String[] ruleNames = {
		"statement", "math_base", "level1prioritymath", "level2prioritymath", 
		"level3prioritymath", "math_expression", "logic_expression", "string_expression", 
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
			setState(18); expression();
			setState(19); match(SEMICOLON);
			setState(20); match(EOF);
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

	public static class Math_baseContext extends ParserRuleContext {
		public Math_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_base; }
	 
		public Math_baseContext() { }
		public void copyFrom(Math_baseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EULER_OPContext extends Math_baseContext {
		public TerminalNode EULER() { return getToken(CalculatorParser.EULER, 0); }
		public EULER_OPContext(Math_baseContext ctx) { copyFrom(ctx); }
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
	public static class BASE_MATH_EXPContext extends Math_baseContext {
		public TerminalNode NUM() { return getToken(CalculatorParser.NUM, 0); }
		public BASE_MATH_EXPContext(Math_baseContext ctx) { copyFrom(ctx); }
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
	public static class PI_OPContext extends Math_baseContext {
		public TerminalNode PI() { return getToken(CalculatorParser.PI, 0); }
		public PI_OPContext(Math_baseContext ctx) { copyFrom(ctx); }
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

	public final Math_baseContext math_base() throws RecognitionException {
		Math_baseContext _localctx = new Math_baseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_math_base);
		try {
			setState(25);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new BASE_MATH_EXPContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22); match(NUM);
				}
				break;
			case PI:
				_localctx = new PI_OPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23); match(PI);
				}
				break;
			case EULER:
				_localctx = new EULER_OPContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(24); match(EULER);
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

	public static class Level1prioritymathContext extends ParserRuleContext {
		public Level1prioritymathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level1prioritymath; }
	 
		public Level1prioritymathContext() { }
		public void copyFrom(Level1prioritymathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ADDITION_OPContext extends Level1prioritymathContext {
		public Math_baseContext math_base() {
			return getRuleContext(Math_baseContext.class,0);
		}
		public Level2prioritymathContext level2prioritymath() {
			return getRuleContext(Level2prioritymathContext.class,0);
		}
		public TerminalNode ADD() { return getToken(CalculatorParser.ADD, 0); }
		public ADDITION_OPContext(Level1prioritymathContext ctx) { copyFrom(ctx); }
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
	public static class SUBTRACTION_OPContext extends Level1prioritymathContext {
		public Math_baseContext math_base() {
			return getRuleContext(Math_baseContext.class,0);
		}
		public Level2prioritymathContext level2prioritymath() {
			return getRuleContext(Level2prioritymathContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public SUBTRACTION_OPContext(Level1prioritymathContext ctx) { copyFrom(ctx); }
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

	public final Level1prioritymathContext level1prioritymath() throws RecognitionException {
		Level1prioritymathContext _localctx = new Level1prioritymathContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_level1prioritymath);
		try {
			setState(35);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new SUBTRACTION_OPContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27); math_base();
				setState(28); match(MINUS);
				setState(29); level2prioritymath();
				}
				break;
			case 2:
				_localctx = new ADDITION_OPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31); math_base();
				setState(32); match(ADD);
				setState(33); level2prioritymath();
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

	public static class Level2prioritymathContext extends ParserRuleContext {
		public Level2prioritymathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level2prioritymath; }
	 
		public Level2prioritymathContext() { }
		public void copyFrom(Level2prioritymathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MODULUS_OPContext extends Level2prioritymathContext {
		public Math_baseContext math_base() {
			return getRuleContext(Math_baseContext.class,0);
		}
		public TerminalNode MODULUS() { return getToken(CalculatorParser.MODULUS, 0); }
		public Level3prioritymathContext level3prioritymath() {
			return getRuleContext(Level3prioritymathContext.class,0);
		}
		public MODULUS_OPContext(Level2prioritymathContext ctx) { copyFrom(ctx); }
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
	public static class EXPONENT_OPContext extends Level2prioritymathContext {
		public TerminalNode POWER() { return getToken(CalculatorParser.POWER, 0); }
		public Math_baseContext math_base() {
			return getRuleContext(Math_baseContext.class,0);
		}
		public Level3prioritymathContext level3prioritymath() {
			return getRuleContext(Level3prioritymathContext.class,0);
		}
		public EXPONENT_OPContext(Level2prioritymathContext ctx) { copyFrom(ctx); }
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
	public static class L1PContext extends Level2prioritymathContext {
		public Level1prioritymathContext level1prioritymath() {
			return getRuleContext(Level1prioritymathContext.class,0);
		}
		public L1PContext(Level2prioritymathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterL1P(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitL1P(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitL1P(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DIVISION_OPContext extends Level2prioritymathContext {
		public Math_baseContext math_base() {
			return getRuleContext(Math_baseContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(CalculatorParser.DIVIDE, 0); }
		public Level3prioritymathContext level3prioritymath() {
			return getRuleContext(Level3prioritymathContext.class,0);
		}
		public DIVISION_OPContext(Level2prioritymathContext ctx) { copyFrom(ctx); }
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
	public static class MULTIPLICATION_OPContext extends Level2prioritymathContext {
		public Math_baseContext math_base() {
			return getRuleContext(Math_baseContext.class,0);
		}
		public TerminalNode MULT() { return getToken(CalculatorParser.MULT, 0); }
		public Level3prioritymathContext level3prioritymath() {
			return getRuleContext(Level3prioritymathContext.class,0);
		}
		public MULTIPLICATION_OPContext(Level2prioritymathContext ctx) { copyFrom(ctx); }
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

	public final Level2prioritymathContext level2prioritymath() throws RecognitionException {
		Level2prioritymathContext _localctx = new Level2prioritymathContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_level2prioritymath);
		try {
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new L1PContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37); level1prioritymath();
				}
				break;
			case 2:
				_localctx = new EXPONENT_OPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38); math_base();
				setState(39); match(POWER);
				setState(40); level3prioritymath();
				}
				break;
			case 3:
				_localctx = new DIVISION_OPContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42); math_base();
				setState(43); match(DIVIDE);
				setState(44); level3prioritymath();
				}
				break;
			case 4:
				_localctx = new MULTIPLICATION_OPContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46); math_base();
				setState(47); match(MULT);
				setState(48); level3prioritymath();
				}
				break;
			case 5:
				_localctx = new MODULUS_OPContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(50); math_base();
				setState(51); match(MODULUS);
				setState(52); level3prioritymath();
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

	public static class Level3prioritymathContext extends ParserRuleContext {
		public Level3prioritymathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level3prioritymath; }
	 
		public Level3prioritymathContext() { }
		public void copyFrom(Level3prioritymathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ROOT_OPContext extends Level3prioritymathContext {
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
		public ROOT_OPContext(Level3prioritymathContext ctx) { copyFrom(ctx); }
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
	public static class SINE_OPContext extends Level3prioritymathContext {
		public TerminalNode SINE() { return getToken(CalculatorParser.SINE, 0); }
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public SINE_OPContext(Level3prioritymathContext ctx) { copyFrom(ctx); }
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
	public static class COTANGENT_OPContext extends Level3prioritymathContext {
		public TerminalNode COTAN() { return getToken(CalculatorParser.COTAN, 0); }
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public COTANGENT_OPContext(Level3prioritymathContext ctx) { copyFrom(ctx); }
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
	public static class MATH_IN_PARENTHContext extends Level3prioritymathContext {
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public MATH_IN_PARENTHContext(Level3prioritymathContext ctx) { copyFrom(ctx); }
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
	public static class LOG_OPContext extends Level3prioritymathContext {
		public TerminalNode LOGARITHM() { return getToken(CalculatorParser.LOGARITHM, 0); }
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public LOG_OPContext(Level3prioritymathContext ctx) { copyFrom(ctx); }
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
	public static class L3PContext extends Level3prioritymathContext {
		public Level2prioritymathContext level2prioritymath() {
			return getRuleContext(Level2prioritymathContext.class,0);
		}
		public L3PContext(Level3prioritymathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterL3P(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitL3P(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitL3P(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TANGENT_OPContext extends Level3prioritymathContext {
		public TerminalNode TANGENT() { return getToken(CalculatorParser.TANGENT, 0); }
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public TANGENT_OPContext(Level3prioritymathContext ctx) { copyFrom(ctx); }
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
	public static class FACTORIAL_OPContext extends Level3prioritymathContext {
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode FACTORIAL() { return getToken(CalculatorParser.FACTORIAL, 0); }
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public FACTORIAL_OPContext(Level3prioritymathContext ctx) { copyFrom(ctx); }
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
	public static class COSINE_OPContext extends Level3prioritymathContext {
		public TerminalNode COSINE() { return getToken(CalculatorParser.COSINE, 0); }
		public TerminalNode RIGHTPAR() { return getToken(CalculatorParser.RIGHTPAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(CalculatorParser.LEFTPAR, 0); }
		public COSINE_OPContext(Level3prioritymathContext ctx) { copyFrom(ctx); }
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

	public final Level3prioritymathContext level3prioritymath() throws RecognitionException {
		Level3prioritymathContext _localctx = new Level3prioritymathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_level3prioritymath);
		try {
			setState(98);
			switch (_input.LA(1)) {
			case PI:
			case EULER:
			case NUM:
				_localctx = new L3PContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56); level2prioritymath();
				}
				break;
			case FACTORIAL:
				_localctx = new FACTORIAL_OPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57); match(FACTORIAL);
				setState(58); match(LEFTPAR);
				setState(59); math_expression();
				setState(60); match(RIGHTPAR);
				}
				break;
			case LOGARITHM:
				_localctx = new LOG_OPContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(62); match(LOGARITHM);
				setState(63); match(LEFTPAR);
				setState(64); math_expression();
				setState(65); match(RIGHTPAR);
				}
				break;
			case SINE:
				_localctx = new SINE_OPContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(67); match(SINE);
				setState(68); match(LEFTPAR);
				setState(69); math_expression();
				setState(70); match(RIGHTPAR);
				}
				break;
			case COSINE:
				_localctx = new COSINE_OPContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(72); match(COSINE);
				setState(73); match(LEFTPAR);
				setState(74); math_expression();
				setState(75); match(RIGHTPAR);
				}
				break;
			case TANGENT:
				_localctx = new TANGENT_OPContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(77); match(TANGENT);
				setState(78); match(LEFTPAR);
				setState(79); math_expression();
				setState(80); match(RIGHTPAR);
				}
				break;
			case COTAN:
				_localctx = new COTANGENT_OPContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(82); match(COTAN);
				setState(83); match(LEFTPAR);
				setState(84); math_expression();
				setState(85); match(RIGHTPAR);
				}
				break;
			case ROOT:
				_localctx = new ROOT_OPContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(87); match(ROOT);
				setState(88); match(LEFTPAR);
				setState(89); math_expression();
				setState(90); match(COMMA);
				setState(91); math_expression();
				setState(92); match(RIGHTPAR);
				}
				break;
			case LEFTPAR:
				_localctx = new MATH_IN_PARENTHContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(94); match(LEFTPAR);
				setState(95); math_expression();
				setState(96); match(RIGHTPAR);
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
		public Math_baseContext math_base() {
			return getRuleContext(Math_baseContext.class,0);
		}
		public Level2prioritymathContext level2prioritymath() {
			return getRuleContext(Level2prioritymathContext.class,0);
		}
		public Level1prioritymathContext level1prioritymath() {
			return getRuleContext(Level1prioritymathContext.class,0);
		}
		public Level3prioritymathContext level3prioritymath() {
			return getRuleContext(Level3prioritymathContext.class,0);
		}
		public Math_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMath_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMath_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitMath_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expressionContext math_expression() throws RecognitionException {
		Math_expressionContext _localctx = new Math_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_math_expression);
		try {
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); math_base();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); level3prioritymath();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); level2prioritymath();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103); level1prioritymath();
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
		public TerminalNode LOGIC() { return getToken(CalculatorParser.LOGIC, 0); }
		public TerminalNode OR() { return getToken(CalculatorParser.OR, 0); }
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
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
		public TerminalNode LOGIC() { return getToken(CalculatorParser.LOGIC, 0); }
		public TerminalNode NAND() { return getToken(CalculatorParser.NAND, 0); }
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
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
		public TerminalNode LOGIC() { return getToken(CalculatorParser.LOGIC, 0); }
		public TerminalNode AND() { return getToken(CalculatorParser.AND, 0); }
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
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
		public TerminalNode LOGIC() { return getToken(CalculatorParser.LOGIC, 0); }
		public TerminalNode XOR() { return getToken(CalculatorParser.XOR, 0); }
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
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
		Logic_expressionContext _localctx = new Logic_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_logic_expression);
		try {
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new BASE_LOGIC_EXPContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106); match(LOGIC);
				}
				break;
			case 2:
				_localctx = new NOT_OPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107); match(NOT);
				setState(108); logic_expression();
				}
				break;
			case 3:
				_localctx = new AND_OPContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109); match(LOGIC);
				setState(110); match(AND);
				setState(111); logic_expression();
				}
				break;
			case 4:
				_localctx = new NAND_OPContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(112); match(LOGIC);
				setState(113); match(NAND);
				setState(114); logic_expression();
				}
				break;
			case 5:
				_localctx = new OR_OPContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(115); match(LOGIC);
				setState(116); match(OR);
				setState(117); logic_expression();
				}
				break;
			case 6:
				_localctx = new XOR_OPContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(118); match(LOGIC);
				setState(119); match(XOR);
				setState(120); logic_expression();
				}
				break;
			case 7:
				_localctx = new LOGIC_IN_PARENTHContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(121); match(LEFTPAR);
				setState(122); logic_expression();
				setState(123); match(RIGHTPAR);
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
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(CalculatorParser.ADD, 0); }
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_string_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new CONCAT_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(128); match(ID);
				setState(129); match(ADD);
				setState(130); string_expression(3);
				}
				break;
			case 2:
				{
				_localctx = new CONCAT_OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131); math_expression();
				setState(132); match(ADD);
				setState(133); string_expression(2);
				}
				break;
			case 3:
				{
				_localctx = new BASE_ID_EXPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CONCAT_OPContext(new String_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_string_expression);
					setState(138);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(139); match(ADD);
					setState(140); math_expression();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 16, RULE_expression);
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146); math_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); logic_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148); string_expression(0);
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
		case 7: return string_expression_sempred((String_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean string_expression_sempred(String_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u009a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"&\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\59\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6e\n\6\3\7\3\7\3\7\3\7\5"+
		"\7k\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u0080\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008b"+
		"\n\t\3\t\3\t\3\t\7\t\u0090\n\t\f\t\16\t\u0093\13\t\3\n\3\n\3\n\5\n\u0098"+
		"\n\n\3\n\2\3\20\13\2\4\6\b\n\f\16\20\22\2\2\u00ad\2\24\3\2\2\2\4\33\3"+
		"\2\2\2\6%\3\2\2\2\b8\3\2\2\2\nd\3\2\2\2\fj\3\2\2\2\16\177\3\2\2\2\20\u008a"+
		"\3\2\2\2\22\u0097\3\2\2\2\24\25\5\22\n\2\25\26\7\32\2\2\26\27\7\2\2\3"+
		"\27\3\3\2\2\2\30\34\7\27\2\2\31\34\7\24\2\2\32\34\7\25\2\2\33\30\3\2\2"+
		"\2\33\31\3\2\2\2\33\32\3\2\2\2\34\5\3\2\2\2\35\36\5\4\3\2\36\37\7\4\2"+
		"\2\37 \5\b\5\2 &\3\2\2\2!\"\5\4\3\2\"#\7\3\2\2#$\5\b\5\2$&\3\2\2\2%\35"+
		"\3\2\2\2%!\3\2\2\2&\7\3\2\2\2\'9\5\6\4\2()\5\4\3\2)*\7\7\2\2*+\5\n\6\2"+
		"+9\3\2\2\2,-\5\4\3\2-.\7\6\2\2./\5\n\6\2/9\3\2\2\2\60\61\5\4\3\2\61\62"+
		"\7\5\2\2\62\63\5\n\6\2\639\3\2\2\2\64\65\5\4\3\2\65\66\7\f\2\2\66\67\5"+
		"\n\6\2\679\3\2\2\28\'\3\2\2\28(\3\2\2\28,\3\2\2\28\60\3\2\2\28\64\3\2"+
		"\2\29\t\3\2\2\2:e\5\b\5\2;<\7\23\2\2<=\7\33\2\2=>\5\f\7\2>?\7\34\2\2?"+
		"e\3\2\2\2@A\7\22\2\2AB\7\33\2\2BC\5\f\7\2CD\7\34\2\2De\3\2\2\2EF\7\b\2"+
		"\2FG\7\33\2\2GH\5\f\7\2HI\7\34\2\2Ie\3\2\2\2JK\7\t\2\2KL\7\33\2\2LM\5"+
		"\f\7\2MN\7\34\2\2Ne\3\2\2\2OP\7\n\2\2PQ\7\33\2\2QR\5\f\7\2RS\7\34\2\2"+
		"Se\3\2\2\2TU\7\13\2\2UV\7\33\2\2VW\5\f\7\2WX\7\34\2\2Xe\3\2\2\2YZ\7\26"+
		"\2\2Z[\7\33\2\2[\\\5\f\7\2\\]\7\35\2\2]^\5\f\7\2^_\7\34\2\2_e\3\2\2\2"+
		"`a\7\33\2\2ab\5\f\7\2bc\7\34\2\2ce\3\2\2\2d:\3\2\2\2d;\3\2\2\2d@\3\2\2"+
		"\2dE\3\2\2\2dJ\3\2\2\2dO\3\2\2\2dT\3\2\2\2dY\3\2\2\2d`\3\2\2\2e\13\3\2"+
		"\2\2fk\5\4\3\2gk\5\n\6\2hk\5\b\5\2ik\5\6\4\2jf\3\2\2\2jg\3\2\2\2jh\3\2"+
		"\2\2ji\3\2\2\2k\r\3\2\2\2l\u0080\7\31\2\2mn\7\r\2\2n\u0080\5\16\b\2op"+
		"\7\31\2\2pq\7\16\2\2q\u0080\5\16\b\2rs\7\31\2\2st\7\21\2\2t\u0080\5\16"+
		"\b\2uv\7\31\2\2vw\7\17\2\2w\u0080\5\16\b\2xy\7\31\2\2yz\7\20\2\2z\u0080"+
		"\5\16\b\2{|\7\33\2\2|}\5\16\b\2}~\7\34\2\2~\u0080\3\2\2\2\177l\3\2\2\2"+
		"\177m\3\2\2\2\177o\3\2\2\2\177r\3\2\2\2\177u\3\2\2\2\177x\3\2\2\2\177"+
		"{\3\2\2\2\u0080\17\3\2\2\2\u0081\u0082\b\t\1\2\u0082\u0083\7\37\2\2\u0083"+
		"\u0084\7\3\2\2\u0084\u008b\5\20\t\5\u0085\u0086\5\f\7\2\u0086\u0087\7"+
		"\3\2\2\u0087\u0088\5\20\t\4\u0088\u008b\3\2\2\2\u0089\u008b\7\37\2\2\u008a"+
		"\u0081\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u0091\3\2"+
		"\2\2\u008c\u008d\f\3\2\2\u008d\u008e\7\3\2\2\u008e\u0090\5\f\7\2\u008f"+
		"\u008c\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\21\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0098\5\f\7\2\u0095\u0098"+
		"\5\16\b\2\u0096\u0098\5\20\t\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2"+
		"\u0097\u0096\3\2\2\2\u0098\23\3\2\2\2\13\33%8dj\177\u008a\u0091\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}