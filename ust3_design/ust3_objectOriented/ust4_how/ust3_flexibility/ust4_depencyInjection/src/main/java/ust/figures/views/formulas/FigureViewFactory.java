package ust.figures.views.formulas;

import ust.figures.models.Circle;
import ust.figures.models.Figure;
import ust.figures.models.FigureVisitor;
import ust.figures.models.Rectangle;
import ust.figures.models.Square;

public class FigureViewFactory implements FigureVisitor {
  
  private FigureView figureView;

  public FigureView create() {
    char type;
    boolean isValid;
    do {
      type = FigureView.console.readChar("Introduce el tipo de figura " +
          "([C]írculo [R]ectangulo c[U]adrado): ");
      isValid = FigureViewFactory.isValid(type);
      if (!isValid) {
        FigureView.console.writeln("Error!!! Introduce un letra de las indicadas");
      }
    } while (!isValid);
    Figure figure;
    switch (type) {
      case 'c':
      case 'C':
        figure = new Circle();
        break;
      case 'r':
      case 'R':
        figure = new Rectangle();
        break;
      case 'u':
      case 'U':
        figure = new Square();
        break;
      default:
        figure = null;
        break;
    }    
    return this.getFigureView(figure);
  }

  private static boolean isValid(char type) {
    if (Character.isLowerCase(type)) {
      type -= 'a' - 'A';
    }
    for (char option : new char[] { 'C', 'R', 'U' }) {
      if (type == option) {
        return true;
      }
    }
    return false;
  }  

  public FigureView getFigureView(Figure figure) {
    figure.accept(this);
    return this.figureView;
  }

  public void visit(Circle circle) {
    this.figureView = new CircleView(circle);
  }

  public void visit(Rectangle rectangle) {
    this.figureView = new RectangleView(rectangle);
  }

  public void visit(Square square) {
    this.figureView = new SquareView(square);
  }


  
}
