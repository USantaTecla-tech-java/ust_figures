package ust.figures.models;

public interface Figure {

  double getPerimeter();

  double getArea();

  public void accept(FigureVisitor figureVisitor);

}
