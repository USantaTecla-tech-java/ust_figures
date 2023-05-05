class App {

  public static void main(String[] args) {
    Console console = new Console();
    double radius = console.readDouble("Introduce el radio del círculo");
    double perimeter = 2 * 3.1415 * radius;
    console.writeln("El perímetro del círculo es " + perimeter);
    double area = 3.1415 * radius * radius;
    console.writeln("El área del círculo es " + area);
  }
}
