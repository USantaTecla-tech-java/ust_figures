public class Rectangle extends Figure {
  
  private double width;
  private double height;

  public double getWidth() {
    return this.width;
  }

  public double getHeight() {
    return this.height;
  }

  public double getPerimeter() {
    return 2 * (this.width + this.height);
  }

  public double getArea() {
    return this.width * this.height;
  }

  public void read() {
    Console console = new Console();
    this.width = console.readDouble("Introduce el ancho del rectangulo: ");
    this.height = console.readDouble("Introduce el alto del rectangulo: ");
  }

  public void setWidth(double width) {
    this.width = width;
  }
  
  public void setHeight(double height) {
    this.height = height;
  }
  
  protected String getTitle() {
    return "El rectangulo de ancho " + this.width + " y de alto " + this.height;
  }

}
