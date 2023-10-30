package ust.figures.models;

public class Rectangle implements Figure {
  
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

  public void setWidth(double width) {
    this.width = width;
  }
  
  public void setHeight(double height) {
    this.height = height;
  }

  public void accept(FigureVisitor figureVisitor) {
    figureVisitor.visit(this);
  }

}
