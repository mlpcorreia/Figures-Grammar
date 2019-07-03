public class Line extends FigureSymbol {

  private String xend;
  private String yend;

  public Line() {
  }

  public Line(String xstart, String ystart, String xend, String yend, String stroke) {
    super(xstart, ystart);
    this.xend = xend;
    this.yend = yend;
    super.setStrokeColor(stroke);
  }

  public String getXEnd() {
    return xend;
  }

  public String getYEnd() {
    return yend;
  }
}
