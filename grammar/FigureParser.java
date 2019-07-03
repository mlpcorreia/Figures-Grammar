// Generated from Figure.g4 by ANTLR 4.7.1

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FigureParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, FIGNAME=16, 
		COLOR=17, ID=18, NUMBER=19, WS=20, COMMENT=21, ERROR=22;
	public static final int
		RULE_main = 0, RULE_statList = 1, RULE_stat = 2, RULE_statement = 3, RULE_canvas = 4, 
		RULE_loop = 5, RULE_print = 6, RULE_element = 7, RULE_fill = 8, RULE_translate = 9, 
		RULE_rotate = 10, RULE_expr = 11;
	public static final String[] ruleNames = {
		"main", "statList", "stat", "statement", "canvas", "loop", "print", "element", 
		"fill", "translate", "rotate", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'canvas('", "')'", "'endcanvas'", "'loop('", "'='", "','", 
		"'endloop'", "'print'", "'<'", "'>'", "'.fill('", "'.translate('", "'rotate('", 
		"'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "FIGNAME", "COLOR", "ID", "NUMBER", "WS", "COMMENT", 
		"ERROR"
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
	public String getGrammarFileName() { return "Figure.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	static protected Map<String,FigureSymbol> symbolTable = new HashMap<>();
	static protected List<String> loopSymbol = new ArrayList<>();

	public FigureParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public StatListContext statList() {
			return getRuleContext(StatListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FigureParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			statList();
			setState(25);
			match(EOF);
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

	public static class StatListContext extends ParserRuleContext {
		public List<CanvasContext> canvas() {
			return getRuleContexts(CanvasContext.class);
		}
		public CanvasContext canvas(int i) {
			return getRuleContext(CanvasContext.class,i);
		}
		public StatListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitStatList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatListContext statList() throws RecognitionException {
		StatListContext _localctx = new StatListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(27);
				canvas();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public RotateContext rotate() {
			return getRuleContext(RotateContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				print();
				}
				break;
			case FIGNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				element();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				rotate();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				loop();
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

	public static class StatementContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__8) | (1L << T__13) | (1L << FIGNAME))) != 0)) {
				{
				{
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__13) | (1L << FIGNAME))) != 0)) {
					{
					setState(39);
					stat();
					}
				}

				setState(42);
				match(T__0);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CanvasContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(FigureParser.NUMBER, 0); }
		public CanvasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canvas; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitCanvas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CanvasContext canvas() throws RecognitionException {
		CanvasContext _localctx = new CanvasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_canvas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__1);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(49);
				match(NUMBER);
				}
			}

			setState(52);
			match(T__2);
			setState(53);
			statement();
			setState(54);
			match(T__3);
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

	public static class LoopContext extends ParserRuleContext {
		public String list;
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
			this.list = ctx.list;
		}
	}
	public static class NumLoopContext extends LoopContext {
		public Token ct;
		public Token setct;
		public Token nloop;
		public Token step;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(FigureParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(FigureParser.NUMBER, i);
		}
		public TerminalNode ID() { return getToken(FigureParser.ID, 0); }
		public NumLoopContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitNumLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColorLoopContext extends LoopContext {
		public Token ct;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ID() { return getToken(FigureParser.ID, 0); }
		public List<TerminalNode> COLOR() { return getTokens(FigureParser.COLOR); }
		public TerminalNode COLOR(int i) {
			return getToken(FigureParser.COLOR, i);
		}
		public ColorLoopContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitColorLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loop);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new NumLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(T__4);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(57);
					((NumLoopContext)_localctx).ct = match(ID);
					setState(58);
					match(T__5);
					setState(59);
					((NumLoopContext)_localctx).setct = match(NUMBER);
					setState(60);
					match(T__6);
					}
				}

				setState(63);
				((NumLoopContext)_localctx).nloop = match(NUMBER);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(64);
					match(T__6);
					setState(65);
					((NumLoopContext)_localctx).step = match(NUMBER);
					}
				}

				setState(68);
				match(T__2);
				setState(69);
				statement();
				setState(70);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new ColorLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(T__4);
				setState(73);
				((ColorLoopContext)_localctx).ct = match(ID);
				setState(74);
				match(T__6);
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(75);
					match(COLOR);
					setState(76);
					match(T__6);
					setState(77);
					match(COLOR);
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLOR );
				setState(82);
				match(T__2);
				setState(83);
				statement();
				setState(84);
				match(T__7);
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

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__8);
			setState(89);
			expr(0);
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

	public static class ElementContext extends ParserRuleContext {
		public Token figName;
		public Token cl;
		public List<TerminalNode> NUMBER() { return getTokens(FigureParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(FigureParser.NUMBER, i);
		}
		public TerminalNode ID() { return getToken(FigureParser.ID, 0); }
		public TerminalNode FIGNAME() { return getToken(FigureParser.FIGNAME, 0); }
		public TerminalNode COLOR() { return getToken(FigureParser.COLOR, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_element);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((ElementContext)_localctx).figName = match(FIGNAME);
			setState(92);
			match(T__9);
			setState(93);
			match(NUMBER);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					match(T__6);
					setState(95);
					match(NUMBER);
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(101);
				match(T__6);
				setState(102);
				((ElementContext)_localctx).cl = match(COLOR);
				}
			}

			setState(105);
			match(T__10);
			setState(106);
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

	public static class FillContext extends ParserRuleContext {
		public FigureSymbol fig;
		public Token c1;
		public Token c2;
		public TerminalNode ID() { return getToken(FigureParser.ID, 0); }
		public List<TerminalNode> COLOR() { return getTokens(FigureParser.COLOR); }
		public TerminalNode COLOR(int i) {
			return getToken(FigureParser.COLOR, i);
		}
		public FillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fill; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitFill(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FillContext fill() throws RecognitionException {
		FillContext _localctx = new FillContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fill);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ID);
			setState(109);
			match(T__11);
			setState(110);
			((FillContext)_localctx).c1 = match(COLOR);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(111);
				match(T__6);
				setState(112);
				((FillContext)_localctx).c2 = match(COLOR);
				}
			}

			setState(115);
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

	public static class TranslateContext extends ParserRuleContext {
		public FigureSymbol fig;
		public Token n1;
		public Token n2;
		public TerminalNode ID() { return getToken(FigureParser.ID, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(FigureParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(FigureParser.NUMBER, i);
		}
		public TranslateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitTranslate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslateContext translate() throws RecognitionException {
		TranslateContext _localctx = new TranslateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_translate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ID);
			setState(118);
			match(T__12);
			setState(119);
			((TranslateContext)_localctx).n1 = match(NUMBER);
			setState(120);
			match(T__6);
			setState(121);
			((TranslateContext)_localctx).n2 = match(NUMBER);
			setState(122);
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

	public static class RotateContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(FigureParser.NUMBER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RotateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitRotate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotateContext rotate() throws RecognitionException {
		RotateContext _localctx = new RotateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rotate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__13);
			setState(125);
			match(NUMBER);
			setState(126);
			match(T__2);
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(127);
				match(T__14);
				setState(128);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public FigureSymbol fig;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.fig = ctx.fig;
		}
	}
	public static class TransExprContext extends ExprContext {
		public TranslateContext translate() {
			return getRuleContext(TranslateContext.class,0);
		}
		public TransExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitTransExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RotExprContext extends ExprContext {
		public RotateContext rotate() {
			return getRuleContext(RotateContext.class,0);
		}
		public RotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitRotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FillExprContext extends ExprContext {
		public FillContext fill() {
			return getRuleContext(FillContext.class,0);
		}
		public FillExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitFillExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(FigureParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FigureVisitor ) return ((FigureVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new FillExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(132);
				fill();
				}
				break;
			case 2:
				{
				_localctx = new TransExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				translate();
				}
				break;
			case 3:
				{
				_localctx = new RotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				rotate();
				}
				break;
			case 4:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
					((AddExprContext)_localctx).e1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(138);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(139);
					match(T__14);
					setState(140);
					((AddExprContext)_localctx).e2 = expr(6);
					}
					} 
				}
				setState(145);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u0095\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\4\3"+
		"\4\3\4\3\4\5\4(\n\4\3\5\5\5+\n\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\3\6\3\6"+
		"\5\6\65\n\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7@\n\7\3\7\3\7\3\7\5"+
		"\7E\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7Q\n\7\r\7\16\7R\3\7"+
		"\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tc\n\t\f\t\16"+
		"\tf\13\t\3\t\3\t\5\tj\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nt\n\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u0084"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u008b\n\r\3\r\3\r\3\r\7\r\u0090\n\r\f\r\16"+
		"\r\u0093\13\r\3\r\2\3\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u009b"+
		"\2\32\3\2\2\2\4 \3\2\2\2\6\'\3\2\2\2\b/\3\2\2\2\n\62\3\2\2\2\fX\3\2\2"+
		"\2\16Z\3\2\2\2\20]\3\2\2\2\22n\3\2\2\2\24w\3\2\2\2\26~\3\2\2\2\30\u008a"+
		"\3\2\2\2\32\33\5\4\3\2\33\34\7\2\2\3\34\3\3\2\2\2\35\37\5\n\6\2\36\35"+
		"\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\" \3\2\2\2#(\5"+
		"\16\b\2$(\5\20\t\2%(\5\26\f\2&(\5\f\7\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2"+
		"\2\'&\3\2\2\2(\7\3\2\2\2)+\5\6\4\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,.\7\3"+
		"\2\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\t\3\2\2\2\61/\3\2"+
		"\2\2\62\64\7\4\2\2\63\65\7\25\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3"+
		"\2\2\2\66\67\7\5\2\2\678\5\b\5\289\7\6\2\29\13\3\2\2\2:?\7\7\2\2;<\7\24"+
		"\2\2<=\7\b\2\2=>\7\25\2\2>@\7\t\2\2?;\3\2\2\2?@\3\2\2\2@A\3\2\2\2AD\7"+
		"\25\2\2BC\7\t\2\2CE\7\25\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\5\2\2G"+
		"H\5\b\5\2HI\7\n\2\2IY\3\2\2\2JK\7\7\2\2KL\7\24\2\2LP\7\t\2\2MN\7\23\2"+
		"\2NO\7\t\2\2OQ\7\23\2\2PM\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2"+
		"\2\2TU\7\5\2\2UV\5\b\5\2VW\7\n\2\2WY\3\2\2\2X:\3\2\2\2XJ\3\2\2\2Y\r\3"+
		"\2\2\2Z[\7\13\2\2[\\\5\30\r\2\\\17\3\2\2\2]^\7\22\2\2^_\7\f\2\2_d\7\25"+
		"\2\2`a\7\t\2\2ac\7\25\2\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2ei\3"+
		"\2\2\2fd\3\2\2\2gh\7\t\2\2hj\7\23\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl"+
		"\7\r\2\2lm\7\24\2\2m\21\3\2\2\2no\7\24\2\2op\7\16\2\2ps\7\23\2\2qr\7\t"+
		"\2\2rt\7\23\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\5\2\2v\23\3\2\2\2wx"+
		"\7\24\2\2xy\7\17\2\2yz\7\25\2\2z{\7\t\2\2{|\7\25\2\2|}\7\5\2\2}\25\3\2"+
		"\2\2~\177\7\20\2\2\177\u0080\7\25\2\2\u0080\u0083\7\5\2\2\u0081\u0082"+
		"\7\21\2\2\u0082\u0084\5\30\r\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\27\3\2\2\2\u0085\u0086\b\r\1\2\u0086\u008b\5\22\n\2\u0087\u008b"+
		"\5\24\13\2\u0088\u008b\5\26\f\2\u0089\u008b\7\24\2\2\u008a\u0085\3\2\2"+
		"\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u0091"+
		"\3\2\2\2\u008c\u008d\f\7\2\2\u008d\u008e\7\21\2\2\u008e\u0090\5\30\r\b"+
		"\u008f\u008c\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\31\3\2\2\2\u0093\u0091\3\2\2\2\21 \'*/\64?DRXdis\u0083"+
		"\u008a\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}