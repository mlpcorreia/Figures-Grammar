public class Square extends FigureSymbol{

  private String side;

  public Square() {
  }

  public Square(String side, String stroke) {
    this.side = side;
    super.setStrokeColor(stroke);
  }

  public Square(String side, String xpos, String ypos) {
    super(xpos,ypos);
    this.side = side;
  }

  public Square(String side, String xpos, String ypos, String stroke) {
    super(xpos,ypos);
    this.side = side;
    super.setStrokeColor(stroke);
  }

  public String getSide() {
    return side;
  }
}
