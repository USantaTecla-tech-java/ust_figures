package ust.figures.views.formulas;

import ust.figures.models.Rectangle;

public class RectangleView extends FigureView {

  public RectangleView(Rectangle rectangle) {
    super(rectangle);
  }

  private Rectangle getRectangle() {
    return (Rectangle) this.figure;
  }
  
  protected String getTitle() {
    return "ancho = " 
      + this.getRectangle().getWidth() 
      + " x alto = " + this.getRectangle().getHeight();
  }

  public Rectangle read() {
    double width = FigureView.console.readDouble("Introduce el ancho del rectangulo: ");
    this.getRectangle().setWidth(width);
    double height = console.readDouble("Introduce el alto del rectangulo: ");
    this.getRectangle().setHeight(height);
    return this.getRectangle();
  }
}
