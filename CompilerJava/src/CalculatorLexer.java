// Generated from Calculator.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, MINUS=2, MULT=3, DIVIDE=4, POWER=5, SINE=6, COSINE=7, TANGENT=8, 
		COTAN=9, MODULUS=10, NOT=11, AND=12, OR=13, XOR=14, NAND=15, LOGARITHM=16, 
		FACTORIAL=17, PI=18, EULER=19, ROOT=20, NUM=21, WS=22, LOGIC=23, SEMICOLON=24, 
		LEFTPAR=25, RIGHTPAR=26, COMMA=27, DOT=28, ID=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'"
	};
	public static final String[] ruleNames = {
		"ADD", "MINUS", "MULT", "DIVIDE", "POWER", "SINE", "COSINE", "TANGENT", 
		"COTAN", "MODULUS", "NOT", "AND", "OR", "XOR", "NAND", "LOGARITHM", "FACTORIAL", 
		"PI", "EULER", "ROOT", "NUM", "WS", "LOGIC", "SEMICOLON", "LEFTPAR", "RIGHTPAR", 
		"COMMA", "DOT", "ID"
	};


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00c9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\5\26\177\n\26\3\26\6\26\u0082\n\26\r\26\16\26\u0083\3\26\5\26\u0087\n"+
		"\26\3\26\6\26\u008a\n\26\r\26\16\26\u008b\3\26\3\26\3\26\5\26\u0091\n"+
		"\26\3\27\6\27\u0094\n\27\r\27\16\27\u0095\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u00a3\n\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\6\36\u00b0\n\36\r\36\16\36\u00b1\3\36\6\36\u00b5"+
		"\n\36\r\36\16\36\u00b6\3\36\6\36\u00ba\n\36\r\36\16\36\u00bb\3\36\6\36"+
		"\u00bf\n\36\r\36\16\36\u00c0\3\36\6\36\u00c4\n\36\r\36\16\36\u00c5\5\36"+
		"\u00c8\n\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37\3\2\6\3\2//\3\2\62;\5\2\13\f\17\17\"\"\4\2C\\c|\u00d6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rH\3\2"+
		"\2\2\17L\3\2\2\2\21P\3\2\2\2\23T\3\2\2\2\25X\3\2\2\2\27\\\3\2\2\2\31^"+
		"\3\2\2\2\33a\3\2\2\2\35d\3\2\2\2\37h\3\2\2\2!k\3\2\2\2#o\3\2\2\2%s\3\2"+
		"\2\2\'v\3\2\2\2)x\3\2\2\2+\u0090\3\2\2\2-\u0093\3\2\2\2/\u00a2\3\2\2\2"+
		"\61\u00a4\3\2\2\2\63\u00a6\3\2\2\2\65\u00a8\3\2\2\2\67\u00aa\3\2\2\29"+
		"\u00ac\3\2\2\2;\u00c7\3\2\2\2=>\7-\2\2>\4\3\2\2\2?@\7/\2\2@\6\3\2\2\2"+
		"AB\7,\2\2B\b\3\2\2\2CD\7\61\2\2D\n\3\2\2\2EF\7,\2\2FG\7,\2\2G\f\3\2\2"+
		"\2HI\7u\2\2IJ\7k\2\2JK\7p\2\2K\16\3\2\2\2LM\7e\2\2MN\7q\2\2NO\7u\2\2O"+
		"\20\3\2\2\2PQ\7v\2\2QR\7c\2\2RS\7p\2\2S\22\3\2\2\2TU\7e\2\2UV\7q\2\2V"+
		"W\7v\2\2W\24\3\2\2\2XY\7o\2\2YZ\7q\2\2Z[\7f\2\2[\26\3\2\2\2\\]\7#\2\2"+
		"]\30\3\2\2\2^_\7(\2\2_`\7(\2\2`\32\3\2\2\2ab\7~\2\2bc\7~\2\2c\34\3\2\2"+
		"\2de\7~\2\2ef\7\61\2\2fg\7~\2\2g\36\3\2\2\2hi\7#\2\2ij\7(\2\2j \3\2\2"+
		"\2kl\7n\2\2lm\7q\2\2mn\7i\2\2n\"\3\2\2\2op\7h\2\2pq\7c\2\2qr\7e\2\2r$"+
		"\3\2\2\2st\7r\2\2tu\7k\2\2u&\3\2\2\2vw\7g\2\2w(\3\2\2\2xy\7t\2\2yz\7q"+
		"\2\2z{\7q\2\2{|\7v\2\2|*\3\2\2\2}\177\t\2\2\2~}\3\2\2\2~\177\3\2\2\2\177"+
		"\u0081\3\2\2\2\u0080\u0082\t\3\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2"+
		"\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0091\3\2\2\2\u0085"+
		"\u0087\t\2\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2"+
		"\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\59"+
		"\35\2\u008e\u008f\t\3\2\2\u008f\u0091\3\2\2\2\u0090~\3\2\2\2\u0090\u0086"+
		"\3\2\2\2\u0091,\3\2\2\2\u0092\u0094\t\4\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\b\27\2\2\u0098.\3\2\2\2\u0099\u009a\7v\2\2\u009a\u009b"+
		"\7t\2\2\u009b\u009c\7w\2\2\u009c\u00a3\7g\2\2\u009d\u009e\7h\2\2\u009e"+
		"\u009f\7c\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a3\7g\2\2"+
		"\u00a2\u0099\3\2\2\2\u00a2\u009d\3\2\2\2\u00a3\60\3\2\2\2\u00a4\u00a5"+
		"\7=\2\2\u00a5\62\3\2\2\2\u00a6\u00a7\7*\2\2\u00a7\64\3\2\2\2\u00a8\u00a9"+
		"\7+\2\2\u00a9\66\3\2\2\2\u00aa\u00ab\7.\2\2\u00ab8\3\2\2\2\u00ac\u00ad"+
		"\7\60\2\2\u00ad:\3\2\2\2\u00ae\u00b0\t\5\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00c8\3\2"+
		"\2\2\u00b3\u00b5\t\5\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00ba\t\3"+
		"\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00c8\3\2\2\2\u00bd\u00bf\t\3\2\2\u00be\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00c4\t\5\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00af\3\2\2\2\u00c7\u00b4\3\2\2\2\u00c7\u00be\3\2\2\2\u00c8<\3\2\2\2"+
		"\20\2~\u0083\u0086\u008b\u0090\u0095\u00a2\u00b1\u00b6\u00bb\u00c0\u00c5"+
		"\u00c7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}