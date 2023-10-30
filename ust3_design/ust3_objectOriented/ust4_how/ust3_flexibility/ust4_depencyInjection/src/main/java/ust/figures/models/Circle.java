package ust.figures.models;

public class Circle implements Figure {
  
  private double radius;
  private static final double PI = 3.1415;

  public double getRadius() {
    return this.radius;
  }

  public double getPerimeter() {
    return 2 * Circle.PI * this.radius;
  }

  public double getArea() {
    return Circle.PI * this.radius * this.radius;
  }
  
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void accept(FigureVisitor figureVisitor) {
    figureVisitor.visit(this);
  }

}
