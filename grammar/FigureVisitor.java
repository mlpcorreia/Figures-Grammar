// Generated from Figure.g4 by ANTLR 4.7.1

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FigureParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FigureVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FigureParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FigureParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureParser#statList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatList(FigureParser.StatListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(FigureParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FigureParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureParser#canvas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCanvas(FigureParser.CanvasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numLoop}
	 * labeled alternative in {@link FigureParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumLoop(FigureParser.NumLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colorLoop}
	 * labeled alternative in {@link FigureParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorLoop(FigureParser.ColorLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(FigureParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(FigureParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureParser#fill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFill(FigureParser.FillContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureParser#translate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslate(FigureParser.TranslateContext ctx);
	/**
	 * Visit a parse tree produced by {@link FigureParser#rotate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotate(FigureParser.RotateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code transExpr}
	 * labeled alternative in {@link FigureParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExpr(FigureParser.TransExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link FigureParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(FigureParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rotExpr}
	 * labeled alternative in {@link FigureParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotExpr(FigureParser.RotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fillExpr}
	 * labeled alternative in {@link FigureParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFillExpr(FigureParser.FillExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link FigureParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(FigureParser.IdExprContext ctx);
}