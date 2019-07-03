public class Circle extends FigureSymbol{

  private String radius;

  public Circle(){
  }

  public Circle(String radius, String stroke) {
    this.radius = radius;
    super.setStrokeColor(stroke);
  }

  public Circle(String radius, String xpos, String ypos) {
    super(xpos,ypos);
    this.radius = radius;
  }

  public Circle(String radius, String xpos, String ypos, String stroke) {
    super(xpos,ypos);
    this.radius = radius;
    super.setStrokeColor(stroke);
  }

  public String getRadius() {
    return radius;
  }
}
