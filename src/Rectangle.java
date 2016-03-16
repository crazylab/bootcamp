// Rectangle calculates area and perimeter of the rectangle

public class Rectangle {
    private final double length;
    private final double width;

    public static Rectangle createRectangle(double length, double width) throws Exception {
        if(length <= 0 || width <= 0)
            throw new Exception("Rectangle length, width should be positive");
        return new Rectangle(length, width);
    }

    private Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

    public double calculateArea() {
        return width * length;
    }

    public double calcualtePerimeter() {
        return 2 * (width + length);
    }
}
