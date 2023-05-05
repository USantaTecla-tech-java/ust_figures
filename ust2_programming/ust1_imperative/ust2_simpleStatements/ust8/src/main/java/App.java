class App {

  public static void main(String[] args) {
    Rectangle[] rectangles = new Rectangle[5];
    for (int i = 0; i < rectangles.length; i++) {
      rectangles[i] = App.createRectangle();
      rectangles[i].read();
    }
    double perimeters = 0;
    double areas = 0;
    for (Rectangle rectangle : rectangles) {
      rectangle.writeln();
      perimeters += rectangle.getPerimeter();
      areas += rectangle.getArea();
    }
    new Console().writeln("El total de perímetros es " + perimeters
        + " y el de áreas es " + areas);
    areas = 0;
    for(Rectangle rectangle : rectangles){
      rectangle.setWidth(rectangle.getWidth()*2);
      perimeters += rectangle.getPerimeter();
      areas += rectangle.getArea();
    }
    new Console().writeln("El total de perímetros es " + perimeters
        + " y el de áreas es " + areas);
  }

  private static Rectangle createRectangle() {
    Console console = new Console();
    char type;
    boolean isValid;
    do {
      type = console.readChar("Introduce el tipo de rectángulo " +
          "([R]ectangulo c[U]adrado): ");
      isValid = App.isValidRectangle(type);
      if (!isValid) {
        console.writeln("Error!!! Introduce un letra de las indicadas");
      }
    } while (!isValid);
    switch (type) {
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

  private static boolean isValidRectangle(char type) {
    if (Character.isLowerCase(type)) {
      type -= 'a' - 'A';
    }
    for (char option : new char[] { 'R', 'U' }) {
      if (type == option) {
        return true;
      }
    }
    return false;
  }

}
