package ust.figures.views.texts;

import ust.figures.models.Square;

public class SquareView extends FigureView {

  public SquareView(Square square) {
    super(square);
  }

  private Square getSquare() {
    return (Square) this.figure;
  }

  protected String getTitle() {
    return "El cuadrado de lado " + this.getSquare().getSide();
  }

  public Square read() {
    double side = FigureView.console.readDouble("Introduce el lado del cuadrado: ");
    this.getSquare().setSide(side);
    return this.getSquare();
  }
  
}
