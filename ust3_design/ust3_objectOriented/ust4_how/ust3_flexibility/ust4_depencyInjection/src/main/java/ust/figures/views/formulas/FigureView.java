package ust.figures.views.formulas;

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
        + "\n perímetro = " + this.figure.getPerimeter()
        + "\n área = " + this.figure.getArea());
  }

  protected abstract String getTitle();

  public abstract Figure read();

}
