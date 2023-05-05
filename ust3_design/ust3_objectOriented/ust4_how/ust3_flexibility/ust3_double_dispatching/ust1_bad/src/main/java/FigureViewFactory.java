public class FigureViewFactory {
  
  public static FigureView create() {
    char type;
    boolean isValid;
    do {
      type = FigureView.console.readChar("Introduce el tipo de figura " +
          "([C]írculo [R]ectangulo c[U]adrado): ");
      isValid = FigureViewFactory.isValid(type);
      if (!isValid) {
        FigureView.console.writeln("Error!!! Introduce un letra de las indicadas");
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
    return FigureViewFactory.getFigureView(figure);
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

  public static FigureView getFigureView(Figure figure) {
    if (figure instanceof Circle) {
      return new CircleView((Circle) figure);
    }
    if (figure instanceof Rectangle) {
      return new RectangleView((Rectangle) figure);
    }
    return new SquareView((Square) figure);
  }
  
}
