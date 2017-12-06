// Generated from /home/mohammedi/OpenSourceProjects/master1-sii-assignements/Compil/FinalProject/src/FinalProject.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FinalProjectLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INTcompil=9, 
		FLOATcompil=10, SCANcompil=11, PRINTcompil=12, CASE=13, ARROW=14, BREAK=15, 
		START=16, IF=17, THEN=18, ELSE=19, ENDIF=20, MATCH=21, FOR=22, WHILE=23, 
		PLUS=24, MINUS=25, MULT=26, DIV=27, SUP=28, INF=29, PROGNAME=30, ID=31, 
		FLOAT=32, INT=33, COMMENT=34, TEXT=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "INTcompil", 
		"FLOATcompil", "SCANcompil", "PRINTcompil", "CASE", "ARROW", "BREAK", 
		"START", "IF", "THEN", "ELSE", "ENDIF", "MATCH", "FOR", "WHILE", "PLUS", 
		"MINUS", "MULT", "DIV", "SUP", "INF", "PROGNAME", "ID", "FLOAT", "INT", 
		"COMMENT", "TEXT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'compil'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'intCompil'", 
		"'floatCompil'", "'scancompil'", "'printcompil'", "'case'", "'=>'", "'break'", 
		"'start'", "'if'", "'then'", "'else'", "'endif'", "'match'", "'for'", 
		"'while'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "INTcompil", "FLOATcompil", 
		"SCANcompil", "PRINTcompil", "CASE", "ARROW", "BREAK", "START", "IF", 
		"THEN", "ELSE", "ENDIF", "MATCH", "FOR", "WHILE", "PLUS", "MINUS", "MULT", 
		"DIV", "SUP", "INF", "PROGNAME", "ID", "FLOAT", "INT", "COMMENT", "TEXT", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public FinalProjectLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FinalProject.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u011d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\6\37\u00d2\n\37\r\37\16\37\u00d3\3\37\7\37\u00d7\n"+
		"\37\f\37\16\37\u00da\13\37\3 \6 \u00dd\n \r \16 \u00de\3 \7 \u00e2\n "+
		"\f \16 \u00e5\13 \3!\5!\u00e8\n!\3!\3!\3!\3!\3!\5!\u00ef\n!\3!\5!\u00f2"+
		"\n!\3\"\3\"\3\"\7\"\u00f7\n\"\f\"\16\"\u00fa\13\"\5\"\u00fc\n\"\3#\3#"+
		"\3#\3#\7#\u0102\n#\f#\16#\u0105\13#\3#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u0110"+
		"\n$\f$\16$\u0113\13$\3$\3$\3%\6%\u0118\n%\r%\16%\u0119\3%\3%\3\u0103\2"+
		"&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&\3\2\n\3\2C\\\6\2\62;C\\aac|\4\2C\\c|\5\2\62;C\\c|\3\2"+
		"\63;\3\2\62;\3\2$$\5\2\13\f\17\17\"\"\2\u0129\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2"+
		"\5R\3\2\2\2\7T\3\2\2\2\tV\3\2\2\2\13X\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2"+
		"\21^\3\2\2\2\23`\3\2\2\2\25j\3\2\2\2\27v\3\2\2\2\31\u0081\3\2\2\2\33\u008d"+
		"\3\2\2\2\35\u0092\3\2\2\2\37\u0095\3\2\2\2!\u009b\3\2\2\2#\u00a1\3\2\2"+
		"\2%\u00a4\3\2\2\2\'\u00a9\3\2\2\2)\u00ae\3\2\2\2+\u00b4\3\2\2\2-\u00ba"+
		"\3\2\2\2/\u00be\3\2\2\2\61\u00c4\3\2\2\2\63\u00c6\3\2\2\2\65\u00c8\3\2"+
		"\2\2\67\u00ca\3\2\2\29\u00cc\3\2\2\2;\u00ce\3\2\2\2=\u00d1\3\2\2\2?\u00dc"+
		"\3\2\2\2A\u00f1\3\2\2\2C\u00fb\3\2\2\2E\u00fd\3\2\2\2G\u010b\3\2\2\2I"+
		"\u0117\3\2\2\2KL\7e\2\2LM\7q\2\2MN\7o\2\2NO\7r\2\2OP\7k\2\2PQ\7n\2\2Q"+
		"\4\3\2\2\2RS\7*\2\2S\6\3\2\2\2TU\7+\2\2U\b\3\2\2\2VW\7}\2\2W\n\3\2\2\2"+
		"XY\7\177\2\2Y\f\3\2\2\2Z[\7=\2\2[\16\3\2\2\2\\]\7.\2\2]\20\3\2\2\2^_\7"+
		"?\2\2_\22\3\2\2\2`a\7k\2\2ab\7p\2\2bc\7v\2\2cd\7E\2\2de\7q\2\2ef\7o\2"+
		"\2fg\7r\2\2gh\7k\2\2hi\7n\2\2i\24\3\2\2\2jk\7h\2\2kl\7n\2\2lm\7q\2\2m"+
		"n\7c\2\2no\7v\2\2op\7E\2\2pq\7q\2\2qr\7o\2\2rs\7r\2\2st\7k\2\2tu\7n\2"+
		"\2u\26\3\2\2\2vw\7u\2\2wx\7e\2\2xy\7c\2\2yz\7p\2\2z{\7e\2\2{|\7q\2\2|"+
		"}\7o\2\2}~\7r\2\2~\177\7k\2\2\177\u0080\7n\2\2\u0080\30\3\2\2\2\u0081"+
		"\u0082\7r\2\2\u0082\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2"+
		"\u0085\u0086\7v\2\2\u0086\u0087\7e\2\2\u0087\u0088\7q\2\2\u0088\u0089"+
		"\7o\2\2\u0089\u008a\7r\2\2\u008a\u008b\7k\2\2\u008b\u008c\7n\2\2\u008c"+
		"\32\3\2\2\2\u008d\u008e\7e\2\2\u008e\u008f\7c\2\2\u008f\u0090\7u\2\2\u0090"+
		"\u0091\7g\2\2\u0091\34\3\2\2\2\u0092\u0093\7?\2\2\u0093\u0094\7@\2\2\u0094"+
		"\36\3\2\2\2\u0095\u0096\7d\2\2\u0096\u0097\7t\2\2\u0097\u0098\7g\2\2\u0098"+
		"\u0099\7c\2\2\u0099\u009a\7m\2\2\u009a \3\2\2\2\u009b\u009c\7u\2\2\u009c"+
		"\u009d\7v\2\2\u009d\u009e\7c\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7v\2\2"+
		"\u00a0\"\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7h\2\2\u00a3$\3\2\2\2"+
		"\u00a4\u00a5\7v\2\2\u00a5\u00a6\7j\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8"+
		"\7p\2\2\u00a8&\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac"+
		"\7u\2\2\u00ac\u00ad\7g\2\2\u00ad(\3\2\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7p\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7h\2\2\u00b3"+
		"*\3\2\2\2\u00b4\u00b5\7o\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7v\2\2\u00b7"+
		"\u00b8\7e\2\2\u00b8\u00b9\7j\2\2\u00b9,\3\2\2\2\u00ba\u00bb\7h\2\2\u00bb"+
		"\u00bc\7q\2\2\u00bc\u00bd\7t\2\2\u00bd.\3\2\2\2\u00be\u00bf\7y\2\2\u00bf"+
		"\u00c0\7j\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7g\2\2"+
		"\u00c3\60\3\2\2\2\u00c4\u00c5\7-\2\2\u00c5\62\3\2\2\2\u00c6\u00c7\7/\2"+
		"\2\u00c7\64\3\2\2\2\u00c8\u00c9\7,\2\2\u00c9\66\3\2\2\2\u00ca\u00cb\7"+
		"\61\2\2\u00cb8\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd:\3\2\2\2\u00ce\u00cf\7"+
		">\2\2\u00cf<\3\2\2\2\u00d0\u00d2\t\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d8\3\2\2\2\u00d5"+
		"\u00d7\t\3\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9>\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd"+
		"\t\4\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e2\t\5\2\2\u00e1\u00e0\3\2"+
		"\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"@\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\7/\2\2\u00e7\u00e6\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\5C\"\2\u00ea\u00eb\7\60"+
		"\2\2\u00eb\u00ec\5C\"\2\u00ec\u00f2\3\2\2\2\u00ed\u00ef\7/\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\5C\"\2\u00f1"+
		"\u00e7\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2B\3\2\2\2\u00f3\u00fc\7\62\2\2"+
		"\u00f4\u00f8\t\6\2\2\u00f5\u00f7\t\7\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fcD\3\2\2\2"+
		"\u00fd\u00fe\7\61\2\2\u00fe\u00ff\7,\2\2\u00ff\u0103\3\2\2\2\u0100\u0102"+
		"\13\2\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0104\3\2\2\2"+
		"\u0103\u0101\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107"+
		"\7,\2\2\u0107\u0108\7\61\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b#\2\2\u010a"+
		"F\3\2\2\2\u010b\u0111\7$\2\2\u010c\u0110\n\b\2\2\u010d\u010e\7^\2\2\u010e"+
		"\u0110\7$\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0115\7$\2\2\u0115H\3\2\2\2\u0116\u0118\t\t\2\2\u0117"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b%\2\2\u011cJ\3\2\2\2\20\2\u00d3"+
		"\u00d8\u00de\u00e3\u00e7\u00ee\u00f1\u00f8\u00fb\u0103\u010f\u0111\u0119"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}