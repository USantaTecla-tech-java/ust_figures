public class Square extends Rectangle {

  public double getSide() {
    return this.getWidth();
  }

  public void read() {
    Console console = new Console();
    double side = console.readDouble("Introduce el lado del cuadrado: ");
    this.setSide(side);
  }

  public void setSide(double side) {
    super.setWidth(side);
    super.setHeight(side);
  }

  public void setWidth(double width) {
    this.setSide(width);
  }

  public void setHeight(double side) {
    this.setSide(side);
  }

  public void writeln() {
    new Console().writeln("El cuadrado de lado " + this.getSide()
      + " tiene un perímetro de " + this.getPerimeter()
      + " y tiene un área de " + this.getArea());
  }

}
