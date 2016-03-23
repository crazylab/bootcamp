package wizard;

public class Bag {

    private int limit;
    private final Balls balls;

    public Bag(int limit) {
        this.limit = limit;
        balls = new Balls();
    }

    public boolean add(Ball ball) throws BagFullException {
        if (isFull())
            throw new BagFullException(limit);
        return balls.add(ball);
    }

    private boolean isFull() {
        return balls.size() == limit;
    }
}
