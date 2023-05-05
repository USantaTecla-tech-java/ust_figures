interface Figure {

  double getPerimeter();

  double getArea();

  void accept(FigureViewFactory figureViewFactory);

}
