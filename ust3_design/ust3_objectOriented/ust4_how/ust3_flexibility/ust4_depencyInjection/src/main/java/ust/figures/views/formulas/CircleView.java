package ust.figures.views.formulas;

import ust.figures.models.Circle;

class CircleView extends FigureView {

  public CircleView(Circle circle) {
    super(circle);
  }

  private Circle getCircle() {
    return (Circle) this.figure;
  }

  protected String getTitle() {
    return "radio = " 
      + this.getCircle().getRadius();
  }

  public Circle read() {
    double radius = FigureView.console.readDouble("Introduce el radio del círculo: ");
    this.getCircle().setRadius(radius);  
    return this.getCircle();
  }
  
}
