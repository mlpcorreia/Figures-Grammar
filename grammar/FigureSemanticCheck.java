import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Figure Semantic check module
 * @author Miguel Luís Pereira Correia (miguelluiscorreia@ua.pt)
 */
public class FigureSemanticCheck extends FigureBaseVisitor<Boolean>{

  /**
   *  Loop with a list of numbers
   */
  @Override
  public Boolean visitNumLoop(FigureParser.NumLoopContext ctx) {
    Boolean res = visit(ctx.statement());
    double i, step, nloop;
    String list = "";
    nloop = Double.parseDouble(ctx.nloop.getText());

    if(ctx.ct != null)
    {
      String id = ctx.ct.getText();
      if(FigureParser.symbolTable.containsKey(id) || FigureParser.loopSymbol.contains(id))
      {
        ErrorHandling.printError(ctx, "Variable \""+ctx.ct.getText()+"\" already declared!");
        res = false;
      }
      else
        FigureParser.loopSymbol.add(id);
    }

    if(ctx.setct == null)
      i = 0;
    else
      i = Double.parseDouble(ctx.setct.getText());

    if(ctx.step == null)
      step = 1;
    else
      step = Double.parseDouble(ctx.step.getText());

    list = list+"{";

    do{
      list = list+i+",";
      i = i + step;
    }while(i < nloop);

    list = list+i+"}";

    ctx.list = list;
    return res;
  }

  /**
   *  Loop with a list of colors
   */
  @Override
  public Boolean visitColorLoop(FigureParser.ColorLoopContext ctx) {
    Boolean res = visit(ctx.statement());
    String list = "";

    String id = ctx.ct.getText();
    if(FigureParser.symbolTable.containsKey(id) || FigureParser.loopSymbol.contains(id))
    {
      ErrorHandling.printError(ctx, "Variable \""+ctx.ct.getText()+"\" already declared!");
      res = false;
    }
    else
      FigureParser.loopSymbol.add(id);

    list = ctx.COLOR().toString().replace("[","{");
    list = list.replace("]", "}");
    ctx.list = list;

    return res;
  }

  /**
   *  Creating the elements with semantic check
   */
  @Override
  public Boolean visitElement(FigureParser.ElementContext ctx) {
    Boolean res = true;
    String id = ctx.ID().getText();

    if(FigureParser.symbolTable.containsKey(id))
    {
      ErrorHandling.printError(ctx, "Variable \""+id+"\" already declared!");
      res = false;
    }
    else
    {
      String figName = ctx.figName.getText();
      String stroke = "black";
      int count = ctx.getChildCount();
      if(ctx.cl != null)
        stroke = ctx.cl.getText();
      switch(figName)
      {
        case "circle":
          Circle cir = new Circle();
          if(count == 5 || count == 7)
            cir = new Circle(ctx.getChild(2).getText(), stroke);
          else if(count == 9 || count == 11)
            cir = new Circle(ctx.getChild(2).getText(), ctx.getChild(4).getText(), ctx.getChild(6).getText(), stroke);
          else
            res = false;

          cir.setType("circle");
          FigureParser.symbolTable.put(id, cir);
          break;
        case "square":
          Square sq = new Square();
          if(count == 5 || count == 7)
            sq = new Square(ctx.getChild(2).getText(), stroke);
          else if(count == 9 || count == 11)
            sq = new Square(ctx.getChild(2).getText(), ctx.getChild(4).getText(), ctx.getChild(6).getText(), stroke);
          else
            res = false;

          sq.setType("square");
          FigureParser.symbolTable.put(id, sq);
          break;
        case "rect":
          Rectangle rect = new Rectangle();
          if(count == 7 || count == 9)
            rect = new Rectangle(ctx.getChild(2).getText(), ctx.getChild(4).getText(), stroke);
          else if(count == 11 || count == 13)
            rect = new Rectangle(ctx.getChild(2).getText(), ctx.getChild(4).getText(), ctx.getChild(6).getText(), ctx.getChild(8).getText(), stroke);
          else
            res = false;

          rect.setType("rect");
          FigureParser.symbolTable.put(id, rect);
          break;
        case "line":
          Line line = new Line();
          if(count == 11 || count == 13)
            line = new Line(ctx.getChild(2).getText(), ctx.getChild(4).getText(), ctx.getChild(6).getText(), ctx.getChild(8).getText(), stroke);
          else
            res = false;

          line.setType("line");
          FigureParser.symbolTable.put(id, line);
          break;
      }
      if(!res)
      {
        ErrorHandling.printError(ctx, "Bad element definition!");
      }
    }

    return res;
  }

  /**
   *  Rotate elements and the respective semantic 
   */
  @Override
  public Boolean visitRotate(FigureParser.RotateContext ctx) {
    Boolean res = true;

    if(ctx.expr() == null)
    {
      ErrorHandling.printError(ctx, "There is nothing to rotate!");
      res = false;
    }
    else
    {
      res = visit(ctx.expr());
    }

    return res;
  }

  /**
   * Command chain
   */
  @Override
  public Boolean visitAddExpr(FigureParser.AddExprContext ctx) {
    Boolean res = visit(ctx.e1) && visit(ctx.e2);
    return res;
  }

  /**
   *  Fill operation related to the elements
   */
  @Override
  public Boolean visitFill(FigureParser.FillContext ctx) {
    Boolean res = true;
    String id = ctx.ID().getText();

    if(!FigureParser.symbolTable.containsKey(id))
    {
      ErrorHandling.printError(ctx, "Variable \""+id+"\" does not exist!");
      res = false;
    }
    else if(FigureParser.symbolTable.get(id).getType() == "line")
    {
      ErrorHandling.printError(ctx, "Impossible to fill a line!");
      res = false;
    }
    else
      ctx.fig = FigureParser.symbolTable.get(id);

    return res;
  }

  /**
   *  Translate operations realted to the elements
   */
  @Override
  public Boolean visitTranslate(FigureParser.TranslateContext ctx) {
    Boolean res = true;
    String id = ctx.ID().getText();

    if(!FigureParser.symbolTable.containsKey(id))
    {
      ErrorHandling.printError(ctx, "Variable \""+id+"\" does not exist!");
      res = false;
    }
    else
      ctx.fig = FigureParser.symbolTable.get(id);

    return res;
  }

  /**
   *  Translate operation in expr rule
   */
  @Override
  public Boolean visitTransExpr(FigureParser.TransExprContext ctx) {
    Boolean res = visit(ctx.translate());
    return res;
  }

  /**
   *  Fill operations in expr rule
   */
  @Override
  public Boolean visitFillExpr(FigureParser.FillExprContext ctx) {
    Boolean res = visit(ctx.fill());
    return res;
  }

  /**
   *  Access variables method
   */
  @Override
  public Boolean visitIdExpr(FigureParser.IdExprContext ctx) {
    Boolean res = true;
    String id = ctx.ID().getText();

    if(!FigureParser.symbolTable.containsKey(id))
    {
      ErrorHandling.printError(ctx, "Variable \""+id+"\" does not exist!");
      res = false;
    }
    else
    {
      FigureSymbol s = FigureParser.symbolTable.get(id);
      ctx.fig = s;
    }
    return res;
  }
}
