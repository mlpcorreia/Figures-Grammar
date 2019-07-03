public class Rectangle extends FigureSymbol{

  private String length;
  private String width;

  public Rectangle(){
  }

  public Rectangle(String length, String width, String stroke) {
    this.length = length;
    this.width = width;
    super.setStrokeColor(stroke);
  }

  public Rectangle(String length, String width, String xpos, String ypos) {
    super(xpos,ypos);
    this.length = length;
    this.width = width;
  }
  public Rectangle(String length, String width, String xpos, String ypos, String stroke) {
    super(xpos,ypos);
    this.length = length;
    this.width = width;
    super.setStrokeColor(stroke);
  }
  public String getLength() {
    return length;
  }

  public String getWidth() {
    return width;
  }
}
