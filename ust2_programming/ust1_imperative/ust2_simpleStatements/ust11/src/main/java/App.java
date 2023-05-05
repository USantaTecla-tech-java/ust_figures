class App {

  public static void main(String[] args) {
    FigureViewFactory figureViewFactory = new FigureViewFactory();
    Figure[] figures = new Figure[5];
    for (int i = 0; i < figures.length; i++) {
      figures[i] = figureViewFactory.create().read();
    }
    double perimeters = 0;
    double areas = 0;
    for (Figure figure : figures) {
      figureViewFactory.getFigureView(figure).writeln();
      perimeters += figure.getPerimeter();
      areas += figure.getArea();
    }
    new Console().writeln("El total de perímetros es " + perimeters
        + " y el de áreas es " + areas);
  }


}

