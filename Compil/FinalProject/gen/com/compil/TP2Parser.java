// Generated from /home/mohammedi/OpenSourceProjects/master1-sii-assignements/Compil/FinalProject/src/com/compil/TP2.g4 by ANTLR 4.7
package com.compil;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TP2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INTcompil=9, 
		FLOATcompil=10, SCANcompil=11, PRINTcompil=12, CASE=13, ARROW=14, BREAK=15, 
		START=16, IF=17, THEN=18, ELSE=19, ENDIF=20, MATCH=21, FOR=22, WHILE=23, 
		PLUS=24, MINUS=25, MULT=26, DIV=27, SUP=28, INF=29, PROGNAME=30, ID=31, 
		INT=32, FLOAT=33, COMMENT=34, TEXT=35, WS=36;
	public static final int
		RULE_start_rule = 0, RULE_declarations = 1, RULE_suite = 2, RULE_variables = 3, 
		RULE_identifier = 4, RULE_type = 5, RULE_instructions = 6, RULE_instAff = 7, 
		RULE_instIf = 8, RULE_instElse = 9, RULE_instScan = 10, RULE_instPrint = 11, 
		RULE_instFor = 12, RULE_instWhile = 13, RULE_instCase = 14, RULE_cases = 15, 
		RULE_condition = 16, RULE_si = 17, RULE_expression = 18, RULE_expression1 = 19, 
		RULE_pm = 20, RULE_md = 21, RULE_expression2 = 22, RULE_value = 23;
	public static final String[] ruleNames = {
		"start_rule", "declarations", "suite", "variables", "identifier", "type", 
		"instructions", "instAff", "instIf", "instElse", "instScan", "instPrint", 
		"instFor", "instWhile", "instCase", "cases", "condition", "si", "expression", 
		"expression1", "pm", "md", "expression2", "value"
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
		"DIV", "SUP", "INF", "PROGNAME", "ID", "INT", "FLOAT", "COMMENT", "TEXT", 
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

	@Override
	public String getGrammarFileName() { return "TP2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TP2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Start_ruleContext extends ParserRuleContext {
		public TerminalNode PROGNAME() { return getToken(TP2Parser.PROGNAME, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public Start_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterStart_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitStart_rule(this);
		}
	}

	public final Start_ruleContext start_rule() throws RecognitionException {
		Start_ruleContext _localctx = new Start_ruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(49);
			match(PROGNAME);
			setState(50);
			match(T__1);
			setState(51);
			match(T__2);
			setState(52);
			match(T__3);
			setState(53);
			declarations();
			setState(54);
			match(START);
			setState(55);
			instructions();
			setState(56);
			match(T__4);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(58);
				suite();
				setState(59);
				declarations();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				suite();
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

	public static class SuiteContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitSuite(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_suite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			type();
			setState(65);
			variables();
			setState(66);
			match(T__5);
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TP2Parser.ID, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				{
				setState(68);
				match(ID);
				setState(69);
				match(T__6);
				setState(70);
				variables();
				}
				}
				break;
			case 2:
				{
				setState(71);
				match(ID);
				}
				break;
			}
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TP2Parser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(ID);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTcompil() { return getToken(TP2Parser.INTcompil, 0); }
		public TerminalNode FLOATcompil() { return getToken(TP2Parser.FLOATcompil, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==INTcompil || _la==FLOATcompil) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class InstructionsContext extends ParserRuleContext {
		public InstAffContext instAff() {
			return getRuleContext(InstAffContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstIfContext instIf() {
			return getRuleContext(InstIfContext.class,0);
		}
		public InstScanContext instScan() {
			return getRuleContext(InstScanContext.class,0);
		}
		public InstPrintContext instPrint() {
			return getRuleContext(InstPrintContext.class,0);
		}
		public InstForContext instFor() {
			return getRuleContext(InstForContext.class,0);
		}
		public InstWhileContext instWhile() {
			return getRuleContext(InstWhileContext.class,0);
		}
		public InstCaseContext instCase() {
			return getRuleContext(InstCaseContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitInstructions(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instructions);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				instAff();
				setState(79);
				match(T__5);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCANcompil) | (1L << PRINTcompil) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					setState(80);
					instructions();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				instIf();
				setState(84);
				match(T__5);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCANcompil) | (1L << PRINTcompil) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					setState(85);
					instructions();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				instScan();
				setState(89);
				match(T__5);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCANcompil) | (1L << PRINTcompil) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					setState(90);
					instructions();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				instPrint();
				setState(94);
				match(T__5);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCANcompil) | (1L << PRINTcompil) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					setState(95);
					instructions();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				instFor();
				setState(99);
				match(T__5);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCANcompil) | (1L << PRINTcompil) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					setState(100);
					instructions();
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				instWhile();
				setState(104);
				match(T__5);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCANcompil) | (1L << PRINTcompil) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					setState(105);
					instructions();
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				instCase();
				setState(109);
				match(T__5);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCANcompil) | (1L << PRINTcompil) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					setState(110);
					instructions();
					}
				}

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

	public static class InstAffContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstAffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instAff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterInstAff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitInstAff(this);
		}
	}

	public final InstAffContext instAff() throws RecognitionException {
		InstAffContext _localctx = new InstAffContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instAff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			identifier();
			setState(116);
			match(T__7);
			setState(117);
			expression(0);
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

	public static class InstIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TP2Parser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(TP2Parser.THEN, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TP2Parser.ELSE, 0); }
		public TerminalNode ENDIF() { return getToken(TP2Parser.ENDIF, 0); }
		public InstIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterInstIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitInstIf(this);
		}
	}

	public final InstIfContext instIf() throws RecognitionException {
		InstIfContext _localctx = new InstIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IF);
			setState(120);
			match(T__1);
			setState(121);
			condition();
			setState(122);
			match(T__2);
			setState(123);
			match(THEN);
			setState(124);
			instructions();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(125);
				match(ELSE);
				setState(126);
				instructions();
				setState(127);
				match(ENDIF);
				setState(128);
				match(T__5);
				}
			}

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

	public static class InstElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(TP2Parser.ELSE, 0); }
		public InstElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterInstElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitInstElse(this);
		}
	}

	public final InstElseContext instElse() throws RecognitionException {
		InstElseContext _localctx = new InstElseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ELSE);
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

	public static class InstScanContext extends ParserRuleContext {
		public TerminalNode SCANcompil() { return getToken(TP2Parser.SCANcompil, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public InstScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instScan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterInstScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitInstScan(this);
		}
	}

	public final InstScanContext instScan() throws RecognitionException {
		InstScanContext _localctx = new InstScanContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instScan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(SCANcompil);
			setState(135);
			match(T__1);
			setState(136);
			variables();
			setState(137);
			match(T__2);
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

	public static class InstPrintContext extends ParserRuleContext {
		public TerminalNode PRINTcompil() { return getToken(TP2Parser.PRINTcompil, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(TP2Parser.TEXT, 0); }
		public InstPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterInstPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitInstPrint(this);
		}
	}

	public final InstPrintContext instPrint() throws RecognitionException {
		InstPrintContext _localctx = new InstPrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(PRINTcompil);
			setState(140);
			match(T__1);
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(141);
				variables();
				}
				break;
			case TEXT:
				{
				setState(142);
				match(TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(145);
			match(T__2);
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

	public static class InstForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TP2Parser.FOR, 0); }
		public List<InstAffContext> instAff() {
			return getRuleContexts(InstAffContext.class);
		}
		public InstAffContext instAff(int i) {
			return getRuleContext(InstAffContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterInstFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitInstFor(this);
		}
	}

	public final InstForContext instFor() throws RecognitionException {
		InstForContext _localctx = new InstForContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(FOR);
			setState(148);
			match(T__1);
			setState(149);
			instAff();
			setState(150);
			match(T__5);
			setState(151);
			condition();
			setState(152);
			match(T__5);
			setState(153);
			instAff();
			setState(154);
			match(T__2);
			setState(155);
			match(T__3);
			setState(156);
			instructions();
			setState(157);
			match(T__4);
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

	public static class InstWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(TP2Parser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterInstWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitInstWhile(this);
		}
	}

	public final InstWhileContext instWhile() throws RecognitionException {
		InstWhileContext _localctx = new InstWhileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(WHILE);
			setState(160);
			match(T__1);
			setState(161);
			condition();
			setState(162);
			match(T__2);
			setState(163);
			match(T__3);
			setState(164);
			instructions();
			setState(165);
			match(T__4);
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

	public static class InstCaseContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(TP2Parser.MATCH, 0); }
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public InstCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterInstCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitInstCase(this);
		}
	}

	public final InstCaseContext instCase() throws RecognitionException {
		InstCaseContext _localctx = new InstCaseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			identifier();
			setState(168);
			match(MATCH);
			setState(169);
			match(T__3);
			setState(170);
			cases();
			setState(171);
			match(T__4);
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

	public static class CasesContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(TP2Parser.CASE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(TP2Parser.ARROW, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(TP2Parser.BREAK, 0); }
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitCases(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(CASE);
			setState(174);
			value();
			setState(175);
			match(ARROW);
			setState(176);
			instructions();
			setState(177);
			match(BREAK);
			setState(178);
			match(T__5);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(179);
				cases();
				}
			}

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

	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			expression(0);
			setState(183);
			si();
			setState(184);
			expression(0);
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode SUP() { return getToken(TP2Parser.SUP, 0); }
		public TerminalNode INF() { return getToken(TP2Parser.INF, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitSi(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==SUP || _la==INF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PmContext pm() {
			return getRuleContext(PmContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(189);
			expression1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(191);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(192);
					pm();
					setState(193);
					expression1(0);
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Expression1Context extends ParserRuleContext {
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public MdContext md() {
			return getRuleContext(MdContext.class,0);
		}
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitExpression1(this);
		}
	}

	public final Expression1Context expression1() throws RecognitionException {
		return expression1(0);
	}

	private Expression1Context expression1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression1Context _localctx = new Expression1Context(_ctx, _parentState);
		Expression1Context _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(201);
			expression2();
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression1);
					setState(203);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(204);
					md();
					setState(205);
					expression2();
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class PmContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(TP2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TP2Parser.MINUS, 0); }
		public PmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterPm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitPm(this);
		}
	}

	public final PmContext pm() throws RecognitionException {
		PmContext _localctx = new PmContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class MdContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(TP2Parser.MULT, 0); }
		public TerminalNode DIV() { return getToken(TP2Parser.DIV, 0); }
		public MdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterMd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitMd(this);
		}
	}

	public final MdContext md() throws RecognitionException {
		MdContext _localctx = new MdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_md);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Expression2Context extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitExpression2(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression2);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(T__1);
				setState(218);
				expression(0);
				setState(219);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				value();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TP2Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(TP2Parser.FLOAT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP2Listener ) ((TP2Listener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_value);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(FLOAT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				identifier();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 19:
			return expression1_sempred((Expression1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression1_sempred(Expression1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3A\n\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b"+
		"T\n\b\3\b\3\b\3\b\5\bY\n\b\3\b\3\b\3\b\5\b^\n\b\3\b\3\b\3\b\5\bc\n\b\3"+
		"\b\3\b\3\b\5\bh\n\b\3\b\3\b\3\b\5\bm\n\b\3\b\3\b\3\b\5\br\n\b\5\bt\n\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0085"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0092\n\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b7\n\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00c6\n\24\f\24\16\24\u00c9"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00d2\n\25\f\25\16\25\u00d5"+
		"\13\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e1\n"+
		"\30\3\31\3\31\3\31\5\31\u00e6\n\31\3\31\2\4&(\32\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\2\6\3\2\13\f\3\2\36\37\3\2\32\33\3\2\34"+
		"\35\2\u00e7\2\62\3\2\2\2\4@\3\2\2\2\6B\3\2\2\2\bJ\3\2\2\2\nL\3\2\2\2\f"+
		"N\3\2\2\2\16s\3\2\2\2\20u\3\2\2\2\22y\3\2\2\2\24\u0086\3\2\2\2\26\u0088"+
		"\3\2\2\2\30\u008d\3\2\2\2\32\u0095\3\2\2\2\34\u00a1\3\2\2\2\36\u00a9\3"+
		"\2\2\2 \u00af\3\2\2\2\"\u00b8\3\2\2\2$\u00bc\3\2\2\2&\u00be\3\2\2\2(\u00ca"+
		"\3\2\2\2*\u00d6\3\2\2\2,\u00d8\3\2\2\2.\u00e0\3\2\2\2\60\u00e5\3\2\2\2"+
		"\62\63\7\3\2\2\63\64\7 \2\2\64\65\7\4\2\2\65\66\7\5\2\2\66\67\7\6\2\2"+
		"\678\5\4\3\289\7\22\2\29:\5\16\b\2:;\7\7\2\2;\3\3\2\2\2<=\5\6\4\2=>\5"+
		"\4\3\2>A\3\2\2\2?A\5\6\4\2@<\3\2\2\2@?\3\2\2\2A\5\3\2\2\2BC\5\f\7\2CD"+
		"\5\b\5\2DE\7\b\2\2E\7\3\2\2\2FG\7!\2\2GH\7\t\2\2HK\5\b\5\2IK\7!\2\2JF"+
		"\3\2\2\2JI\3\2\2\2K\t\3\2\2\2LM\7!\2\2M\13\3\2\2\2NO\t\2\2\2O\r\3\2\2"+
		"\2PQ\5\20\t\2QS\7\b\2\2RT\5\16\b\2SR\3\2\2\2ST\3\2\2\2Tt\3\2\2\2UV\5\22"+
		"\n\2VX\7\b\2\2WY\5\16\b\2XW\3\2\2\2XY\3\2\2\2Yt\3\2\2\2Z[\5\26\f\2[]\7"+
		"\b\2\2\\^\5\16\b\2]\\\3\2\2\2]^\3\2\2\2^t\3\2\2\2_`\5\30\r\2`b\7\b\2\2"+
		"ac\5\16\b\2ba\3\2\2\2bc\3\2\2\2ct\3\2\2\2de\5\32\16\2eg\7\b\2\2fh\5\16"+
		"\b\2gf\3\2\2\2gh\3\2\2\2ht\3\2\2\2ij\5\34\17\2jl\7\b\2\2km\5\16\b\2lk"+
		"\3\2\2\2lm\3\2\2\2mt\3\2\2\2no\5\36\20\2oq\7\b\2\2pr\5\16\b\2qp\3\2\2"+
		"\2qr\3\2\2\2rt\3\2\2\2sP\3\2\2\2sU\3\2\2\2sZ\3\2\2\2s_\3\2\2\2sd\3\2\2"+
		"\2si\3\2\2\2sn\3\2\2\2t\17\3\2\2\2uv\5\n\6\2vw\7\n\2\2wx\5&\24\2x\21\3"+
		"\2\2\2yz\7\23\2\2z{\7\4\2\2{|\5\"\22\2|}\7\5\2\2}~\7\24\2\2~\u0084\5\16"+
		"\b\2\177\u0080\7\25\2\2\u0080\u0081\5\16\b\2\u0081\u0082\7\26\2\2\u0082"+
		"\u0083\7\b\2\2\u0083\u0085\3\2\2\2\u0084\177\3\2\2\2\u0084\u0085\3\2\2"+
		"\2\u0085\23\3\2\2\2\u0086\u0087\7\25\2\2\u0087\25\3\2\2\2\u0088\u0089"+
		"\7\r\2\2\u0089\u008a\7\4\2\2\u008a\u008b\5\b\5\2\u008b\u008c\7\5\2\2\u008c"+
		"\27\3\2\2\2\u008d\u008e\7\16\2\2\u008e\u0091\7\4\2\2\u008f\u0092\5\b\5"+
		"\2\u0090\u0092\7%\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0094\7\5\2\2\u0094\31\3\2\2\2\u0095\u0096\7\30\2\2\u0096"+
		"\u0097\7\4\2\2\u0097\u0098\5\20\t\2\u0098\u0099\7\b\2\2\u0099\u009a\5"+
		"\"\22\2\u009a\u009b\7\b\2\2\u009b\u009c\5\20\t\2\u009c\u009d\7\5\2\2\u009d"+
		"\u009e\7\6\2\2\u009e\u009f\5\16\b\2\u009f\u00a0\7\7\2\2\u00a0\33\3\2\2"+
		"\2\u00a1\u00a2\7\31\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a4\5\"\22\2\u00a4"+
		"\u00a5\7\5\2\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7\5\16\b\2\u00a7\u00a8\7"+
		"\7\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\5\n\6\2\u00aa\u00ab\7\27\2\2\u00ab"+
		"\u00ac\7\6\2\2\u00ac\u00ad\5 \21\2\u00ad\u00ae\7\7\2\2\u00ae\37\3\2\2"+
		"\2\u00af\u00b0\7\17\2\2\u00b0\u00b1\5\60\31\2\u00b1\u00b2\7\20\2\2\u00b2"+
		"\u00b3\5\16\b\2\u00b3\u00b4\7\21\2\2\u00b4\u00b6\7\b\2\2\u00b5\u00b7\5"+
		" \21\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7!\3\2\2\2\u00b8\u00b9"+
		"\5&\24\2\u00b9\u00ba\5$\23\2\u00ba\u00bb\5&\24\2\u00bb#\3\2\2\2\u00bc"+
		"\u00bd\t\3\2\2\u00bd%\3\2\2\2\u00be\u00bf\b\24\1\2\u00bf\u00c0\5(\25\2"+
		"\u00c0\u00c7\3\2\2\2\u00c1\u00c2\f\4\2\2\u00c2\u00c3\5*\26\2\u00c3\u00c4"+
		"\5(\25\2\u00c4\u00c6\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\'\3\2\2\2\u00c9\u00c7\3\2\2\2"+
		"\u00ca\u00cb\b\25\1\2\u00cb\u00cc\5.\30\2\u00cc\u00d3\3\2\2\2\u00cd\u00ce"+
		"\f\4\2\2\u00ce\u00cf\5,\27\2\u00cf\u00d0\5.\30\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00cd\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4)\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\t\4\2\2\u00d7+\3\2"+
		"\2\2\u00d8\u00d9\t\5\2\2\u00d9-\3\2\2\2\u00da\u00e1\5\n\6\2\u00db\u00dc"+
		"\7\4\2\2\u00dc\u00dd\5&\24\2\u00dd\u00de\7\5\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00e1\5\60\31\2\u00e0\u00da\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00df\3"+
		"\2\2\2\u00e1/\3\2\2\2\u00e2\u00e6\7\"\2\2\u00e3\u00e6\7#\2\2\u00e4\u00e6"+
		"\5\n\6\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\61\3\2\2\2\23@JSX]bglqs\u0084\u0091\u00b6\u00c7\u00d3\u00e0\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}