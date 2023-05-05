public class Square implements Figure {

  private Rectangle rectangle;

  public Square() {
    this.rectangle = new Rectangle();
  }
  
  public double getSide() {
    return this.rectangle.getWidth();
  }

  public double getPerimeter() {
    return this.rectangle.getPerimeter();
  }

  public double getArea() {
    return this.rectangle.getPerimeter();
  }

  public void read() {
    Console console = new Console();
    double side = console.readDouble("Introduce el lado del cuadrado: ");
    this.setSide(side);
  }

  public void setSide(double side) {
    this.rectangle.setWidth(side);
    this.rectangle.setHeight(side);
  }

}
