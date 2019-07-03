import java.io.File;
import org.stringtemplate.v4.*;

/**
 *  Figure Compiler module
 *  @author Miguel Luís Pereira Correia (miguelluiscorreia@ua.pt)
 */
public class FigureCompiler extends FigureBaseVisitor<ST> {

  private String target = "tex";
  private STGroupFile stg = null;
  private int counter_var = 0;

  public boolean validTarget(String target) {
    File f = new File(target+".stg");

    return ("tex".equalsIgnoreCase(target) && f.exists() && f.isFile() && f.canRead());
  }

  public void setTarget(String target) {
    assert validTarget(target);
    this.target = target;
  }

  @Override
  public ST visitMain(FigureParser.MainContext ctx) {
    assert validTarget(target);

    stg = new STGroupFile(target+".stg");
    ST res = stg.getInstanceOf("module");
    res.add("stat", visit(ctx.statList()));
    return res;
  }

  @Override
  public ST visitStatList(FigureParser.StatListContext ctx) {
    ST res = stg.getInstanceOf("stats");
    for(FigureParser.CanvasContext stx: ctx.canvas())
      res.add("stat", visit(stx));

    return res;
  }

  @Override
  public ST visitStatement(FigureParser.StatementContext ctx) {
    ST res = stg.getInstanceOf("stats");
    for(FigureParser.StatContext stx: ctx.stat())
      res.add("stat", visit(stx));

    return res;
  }

  @Override
  public ST visitCanvas(FigureParser.CanvasContext ctx) {
    ST res = stg.getInstanceOf("canvas");
    if(ctx.NUMBER() != null)
      res.add("scale", ctx.NUMBER().getText());
    else
      res.add("scale", "1");

    res.add("stat", visit(ctx.statement()));

    return res;
  }

  @Override
  public ST visitNumLoop(FigureParser.NumLoopContext ctx) {
    ST res = stg.getInstanceOf("loop");
    if(ctx.ct == null)
      res.add("ct", createCounter());
    else
      res.add("ct", ctx.ct.getText());
    res.add("list", ctx.list);
    res.add("stat", visit(ctx.statement()));

    return res;
  }

  @Override
  public ST visitColorLoop(FigureParser.ColorLoopContext ctx) {
    ST res = stg.getInstanceOf("loop");
    if(ctx.ct == null)
      res.add("ct", createCounter());
    else
      res.add("ct", ctx.ct.getText());

    res.add("list", ctx.list);
    res.add("stat", visit(ctx.statement()));

    return res;
  }

  @Override
  public ST visitPrint(FigureParser.PrintContext ctx) {
    ST res = stg.getInstanceOf("print");
    res.add("stat", visit(ctx.expr()));
    return res;
  }

  @Override
  public ST visitFill(FigureParser.FillContext ctx) {
    ST res = null;
    FigureSymbol s = ctx.fig;
    s.setFillColor(ctx.c1.getText());
    if(ctx.c2 != null)
      s.setStrokeColor(ctx.c2.getText());
    else
      s.setStrokeColor("black");

    res = fillElement(s);

    return res;
  }

  @Override
  public ST visitTranslate(FigureParser.TranslateContext ctx) {
    ST res = null;

    FigureSymbol s = ctx.fig;
    s.setXPos(ctx.n1.getText());
    s.setYPos(ctx.n2.getText());

    if(s.getFill())
      res = fillElement(s);
    else
      res = createElement(ctx.ID().getText(), s.getType());

    return res;
  }

  @Override
  public ST visitRotate(FigureParser.RotateContext ctx) {
    ST res = stg.getInstanceOf("rotate");
    res.add("stat", visit(ctx.expr()));
    res.add("angle", ctx.NUMBER().getText());
    return res;
  }

  @Override
  public ST visitTransExpr(FigureParser.TransExprContext ctx) {
    ST res = visit(ctx.translate());
    return res;
  }

  @Override
  public ST visitAddExpr(FigureParser.AddExprContext ctx) {
    ST res = stg.getInstanceOf("add");
    res.add("stat", visit(ctx.e1));
    res.add("stat", visit(ctx.e2));
    return res;
  }

  @Override
  public ST visitRotExpr(FigureParser.RotExprContext ctx) {
    ST res = visit(ctx.rotate());
    return res;
  }

  @Override
  public ST visitFillExpr(FigureParser.FillExprContext ctx) {
    ST res = visit(ctx.fill());
    return res;
  }

  @Override
  public ST visitIdExpr(FigureParser.IdExprContext ctx) {
    ST res = null;
    String id = ctx.ID().getText();
    FigureSymbol s = ctx.fig;
    if(s.getFill())
      res = fillElement(s);
    else
      res = createElement(id, s.getType());
    return res;
  }

  private ST createElement(String id, String figName) {
    ST res = null;
    switch(figName)
    {
      case "square":
        Square sq = (Square)FigureParser.symbolTable.get(id);
        res = stg.getInstanceOf("square");
        res.add("l", sq.getSide());
        res.add("xpos", sq.getXPos());
        res.add("ypos", sq.getYPos());
        res.add("stroke", sq.getStrokeColor());
        break;
      case "rect":
        Rectangle rect = (Rectangle)FigureParser.symbolTable.get(id);
        res = stg.getInstanceOf("rectangle");
        res.add("c", rect.getLength());
        res.add("l", rect.getWidth());
        res.add("xpos", rect.getXPos());
        res.add("ypos", rect.getYPos());
        res.add("stroke", rect.getStrokeColor());
        break;
      case "circle":
        Circle cir = (Circle)FigureParser.symbolTable.get(id);
        res = stg.getInstanceOf("circle");
        res.add("r", cir.getRadius());
        res.add("xpos", cir.getXPos());
        res.add("ypos", cir.getYPos());
        res.add("stroke", cir.getStrokeColor());
        break;
      case "line":
        Line line = (Line)FigureParser.symbolTable.get(id);
        res = stg.getInstanceOf("line");
        res.add("xstart", line.getXPos());
        res.add("ystart", line.getYPos());
        res.add("xend", line.getXEnd());
        res.add("yend", line.getYEnd());
        res.add("stroke", line.getStrokeColor());
        break;
    }

    return res;
  }

  private ST fillElement(FigureSymbol s) {
    ST res = null;

    switch(s.getType())
    {
      case "square":
        Square sq = (Square)s;
        res = stg.getInstanceOf("squareFill");
        res.add("l", sq.getSide());
        res.add("xpos", sq.getXPos());
        res.add("ypos", sq.getYPos());
        res.add("fill", sq.getFillColor());
        res.add("stroke", sq.getStrokeColor());
        break;
      case "rect":
        Rectangle rect = (Rectangle)s;
        res = stg.getInstanceOf("rectangleFill");
        res.add("c", rect.getLength());
        res.add("l", rect.getWidth());
        res.add("xpos", rect.getXPos());
        res.add("ypos", rect.getYPos());
        res.add("fill", rect.getFillColor());
        res.add("stroke", rect.getStrokeColor());
        break;
      case "circle":
        Circle cir = (Circle)s;
        res = stg.getInstanceOf("circleFill");
        res.add("r", cir.getRadius());
        res.add("xpos", cir.getXPos());
        res.add("ypos", cir.getYPos());
        res.add("fill", cir.getFillColor());
        res.add("stroke", cir.getStrokeColor());
        break;
    }

    return res;
  }

  private String createCounter() {
    counter_var++;
    return "ct"+counter_var;
  }
}
