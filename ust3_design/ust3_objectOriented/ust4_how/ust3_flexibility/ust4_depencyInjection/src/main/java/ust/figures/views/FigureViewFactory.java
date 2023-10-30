package ust.figures.views;

import ust.figures.models.Circle;
import ust.figures.models.Figure;
import ust.figures.models.FigureVisitor;
import ust.figures.models.Rectangle;
import ust.figures.models.Square;
import ust.figures.views.formulas.FigureView;

public abstract class FigureViewFactory implements FigureVisitor {
  
  protected static Console console = new Console();

  public FigureView create() {
    char type;
    boolean isValid;
    do {
      type = console.readChar("Introduce el tipo de figura " +
          "([C]írculo [R]ectangulo c[U]adrado): ");
      isValid = FigureViewFactory.isValid(type);
      if (!isValid) {
        console.writeln("Error!!! Introduce un letra de las indicadas");
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

  public abstract FigureView getFigureView(Figure figure) ;

  public abstract void visit(Circle circle);

  public abstract void visit(Rectangle rectangle);

  public abstract void visit(Square square);


  
}
