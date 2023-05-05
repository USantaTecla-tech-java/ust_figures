class App {

  public static void main(String[] args) {
    Figure[] figures = new Figure[5];
    for (int i = 0; i < figures.length; i++) {
      figures[i] = App.createFigure();
      figures[i].read();
    }
    double perimeters = 0;
    double areas = 0;
    for (Figure figure : figures) {
      figure.writeln();
      perimeters += figure.getPerimeter();
      areas += figure.getArea();
    }
    new Console().writeln("El total de perímetros es " + perimeters
        + " y el de áreas es " + areas);
}

  private static Figure createFigure() {
    Console console = new Console();
    char type;
    boolean isValid;
    do {
      type = console.readChar("Introduce el tipo de figura " +
          "([C]írculo [R]ectangulo c[U]adrado): ");
      isValid = App.isValidFigure(type);
      if (!isValid) {
        console.writeln("Error!!! Introduce un letra de las indicadas");
      }
    } while (!isValid);
    switch (type) {
      case 'c':
      case 'C':
        return new Circle();
      case 'r':
      case 'R':
        return new Rectangle();
      case 'u':
      case 'U':
        return new Square();
      default:
        return null;
    }
  }

  private static boolean isValidFigure(char type) {
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

}
