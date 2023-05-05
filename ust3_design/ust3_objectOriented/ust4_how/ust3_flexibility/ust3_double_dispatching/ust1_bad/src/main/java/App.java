class App {

  public static void main(String[] args) {
    Figure[] figures = new Figure[5];
    for (int i = 0; i < figures.length; i++) {
      figures[i] = FigureViewFactory.create().read();
    }
    double perimeters = 0;
    double areas = 0;
    for (Figure figure : figures) {
      FigureViewFactory.getFigureView(figure).writeln();
      perimeters += figure.getPerimeter();
      areas += figure.getArea();
    }
    new Console().writeln("El total de perímetros es " + perimeters
        + " y el de áreas es " + areas);
  }


}
