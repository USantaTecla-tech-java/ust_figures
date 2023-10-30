package ust.figures.views.texts;

import ust.figures.models.Figure;
import ust.figures.views.Console;

public abstract class FigureView {

  protected Figure figure;
  protected static Console console = new Console();

  public FigureView(Figure figure) {
    this.figure = figure;
  }

  public void writeln() {
    FigureView.console.writeln(this.getTitle()
        + " tiene un perímetro de " + this.figure.getPerimeter()
        + " y tiene un área de " + this.figure.getArea());
  }

  protected abstract String getTitle();

  public abstract Figure read();

}
