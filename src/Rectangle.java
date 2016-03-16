import com.math.Calculator;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calcualte(Calculator calculator) {
        return calculator.calculate(width, height);
    }
}
