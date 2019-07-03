public class FigureSymbol {

  private Boolean fill = false;
  private String fillColor = null;
  private String strokeColor = "";
  private String xpos = "0";
  private String ypos = "0";
  private String type = "";

  public FigureSymbol() {
  }

  public FigureSymbol(String xpos, String ypos) {
    this.xpos = xpos;
    this.ypos = ypos;
  }

  public Boolean getFill() {
    return fill;
  }

  public void setFillColor(String color) {
    fill = true;
    this.fillColor = color;
  }

  public void setStrokeColor(String color) {
    this.strokeColor = color;
  }

  public String getFillColor() {
    return fillColor;
  }

  public String getStrokeColor() {
    return strokeColor;
  }

  public String getXPos() {
    return xpos;
  }

  public void setXPos(String xpos) {
    this.xpos = xpos;
  }

  public String getYPos() {
    return ypos;
  }

  public void setYPos(String ypos) {
    this.ypos = ypos;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
