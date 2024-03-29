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
		FACTORIAL=17, PI=18, EULER=19, ROOT=20, EXIT=21, NUM=22, WS=23, LOGIC=24, 
		SEMICOLON=25, LEFTPAR=26, RIGHTPAR=27, COMMA=28, DOT=29, ID=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'"
	};
	public static final String[] ruleNames = {
		"ADD", "MINUS", "MULT", "DIVIDE", "POWER", "SINE", "COSINE", "TANGENT", 
		"COTAN", "MODULUS", "NOT", "AND", "OR", "XOR", "NAND", "LOGARITHM", "FACTORIAL", 
		"PI", "EULER", "ROOT", "EXIT", "NUM", "WS", "LOGIC", "SEMICOLON", "LEFTPAR", 
		"RIGHTPAR", "COMMA", "DOT", "ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00d0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\5\27\u0086\n\27\3\27\6\27\u0089\n\27\r\27"+
		"\16\27\u008a\3\27\5\27\u008e\n\27\3\27\6\27\u0091\n\27\r\27\16\27\u0092"+
		"\3\27\3\27\3\27\5\27\u0098\n\27\3\30\6\30\u009b\n\30\r\30\16\30\u009c"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00aa\n\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\6\37\u00b7\n\37"+
		"\r\37\16\37\u00b8\3\37\6\37\u00bc\n\37\r\37\16\37\u00bd\3\37\6\37\u00c1"+
		"\n\37\r\37\16\37\u00c2\3\37\6\37\u00c6\n\37\r\37\16\37\u00c7\3\37\6\37"+
		"\u00cb\n\37\r\37\16\37\u00cc\5\37\u00cf\n\37\2\2 \3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\6\3\2//\3\2\62"+
		";\5\2\13\f\17\17\"\"\4\2C\\c|\u00dd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2"+
		"\2\2\7C\3\2\2\2\tE\3\2\2\2\13G\3\2\2\2\rJ\3\2\2\2\17N\3\2\2\2\21R\3\2"+
		"\2\2\23V\3\2\2\2\25Z\3\2\2\2\27^\3\2\2\2\31`\3\2\2\2\33c\3\2\2\2\35f\3"+
		"\2\2\2\37j\3\2\2\2!m\3\2\2\2#q\3\2\2\2%u\3\2\2\2\'x\3\2\2\2)z\3\2\2\2"+
		"+\177\3\2\2\2-\u0097\3\2\2\2/\u009a\3\2\2\2\61\u00a9\3\2\2\2\63\u00ab"+
		"\3\2\2\2\65\u00ad\3\2\2\2\67\u00af\3\2\2\29\u00b1\3\2\2\2;\u00b3\3\2\2"+
		"\2=\u00ce\3\2\2\2?@\7-\2\2@\4\3\2\2\2AB\7/\2\2B\6\3\2\2\2CD\7,\2\2D\b"+
		"\3\2\2\2EF\7\61\2\2F\n\3\2\2\2GH\7,\2\2HI\7,\2\2I\f\3\2\2\2JK\7u\2\2K"+
		"L\7k\2\2LM\7p\2\2M\16\3\2\2\2NO\7e\2\2OP\7q\2\2PQ\7u\2\2Q\20\3\2\2\2R"+
		"S\7v\2\2ST\7c\2\2TU\7p\2\2U\22\3\2\2\2VW\7e\2\2WX\7q\2\2XY\7v\2\2Y\24"+
		"\3\2\2\2Z[\7o\2\2[\\\7q\2\2\\]\7f\2\2]\26\3\2\2\2^_\7#\2\2_\30\3\2\2\2"+
		"`a\7(\2\2ab\7(\2\2b\32\3\2\2\2cd\7~\2\2de\7~\2\2e\34\3\2\2\2fg\7~\2\2"+
		"gh\7\61\2\2hi\7~\2\2i\36\3\2\2\2jk\7#\2\2kl\7(\2\2l \3\2\2\2mn\7n\2\2"+
		"no\7q\2\2op\7i\2\2p\"\3\2\2\2qr\7h\2\2rs\7c\2\2st\7e\2\2t$\3\2\2\2uv\7"+
		"r\2\2vw\7k\2\2w&\3\2\2\2xy\7g\2\2y(\3\2\2\2z{\7t\2\2{|\7q\2\2|}\7q\2\2"+
		"}~\7v\2\2~*\3\2\2\2\177\u0080\7g\2\2\u0080\u0081\7z\2\2\u0081\u0082\7"+
		"k\2\2\u0082\u0083\7v\2\2\u0083,\3\2\2\2\u0084\u0086\t\2\2\2\u0085\u0084"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\t\3\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u0098\3\2\2\2\u008c\u008e\t\2\2\2\u008d\u008c\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0091\t\3\2\2\u0090\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\5;\36\2\u0095\u0096\t\3\2\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0085\3\2\2\2\u0097\u008d\3\2\2\2\u0098.\3\2\2\2\u0099\u009b"+
		"\t\4\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\30\2\2\u009f\60\3\2\2"+
		"\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7w\2\2\u00a3\u00aa"+
		"\7g\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7n\2\2\u00a7"+
		"\u00a8\7u\2\2\u00a8\u00aa\7g\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a4\3\2\2"+
		"\2\u00aa\62\3\2\2\2\u00ab\u00ac\7=\2\2\u00ac\64\3\2\2\2\u00ad\u00ae\7"+
		"*\2\2\u00ae\66\3\2\2\2\u00af\u00b0\7+\2\2\u00b08\3\2\2\2\u00b1\u00b2\7"+
		".\2\2\u00b2:\3\2\2\2\u00b3\u00b4\7\60\2\2\u00b4<\3\2\2\2\u00b5\u00b7\t"+
		"\5\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00cf\3\2\2\2\u00ba\u00bc\t\5\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00c1\t\3\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00cf\3\2\2\2\u00c4"+
		"\u00c6\t\3\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00cb\t\5\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00b6\3\2\2\2\u00ce\u00bb\3\2\2\2\u00ce"+
		"\u00c5\3\2\2\2\u00cf>\3\2\2\2\20\2\u0085\u008a\u008d\u0092\u0097\u009c"+
		"\u00a9\u00b8\u00bd\u00c2\u00c7\u00cc\u00ce\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}