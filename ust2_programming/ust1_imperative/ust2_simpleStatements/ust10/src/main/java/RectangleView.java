public class RectangleView extends FigureView {

  public RectangleView(Rectangle rectangle) {
    super(rectangle);
  }

  private Rectangle getRectangle() {
    return (Rectangle) this.figure;
  }
  
  protected String getTitle() {
    return "El rectangulo de ancho " 
      + this.getRectangle().getWidth() 
      + " y de alto " + this.getRectangle().getHeight();
  }

  public Rectangle read() {
    Console console = new Console();
    double width = console.readDouble("Introduce el ancho del rectangulo: ");
    this.getRectangle().setWidth(width);
    double height = console.readDouble("Introduce el alto del rectangulo: ");
    this.getRectangle().setHeight(height);
    return this.getRectangle();
  }
}
