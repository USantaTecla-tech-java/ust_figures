abstract class Figure {

  public abstract double getPerimeter();

  public abstract double getArea();

  public abstract void read();

  public void writeln() {
    new Console().writeln(this.getTitle() 
    +  " tiene un perímetro de " + this.getPerimeter()
    + " y tiene un área de " + this.getArea());
  }

  protected abstract String getTitle();

}
