package wizard;

public class ReadOnlyBalls {

    private final Balls balls;

    public ReadOnlyBalls(Balls balls) {
        this.balls = balls;
    }

    public int size() {
        return balls.size();
    }

    public int countOf(Color color) {
        return balls.countOf(color);
    }
}
