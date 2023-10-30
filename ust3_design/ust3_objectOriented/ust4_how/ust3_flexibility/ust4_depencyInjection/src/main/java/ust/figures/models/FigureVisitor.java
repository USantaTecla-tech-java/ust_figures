package ust.figures.models;

public interface FigureVisitor {
  
  void visit(Circle circle);

  void visit(Rectangle rectangle);

  void visit(Square square);
  
}
