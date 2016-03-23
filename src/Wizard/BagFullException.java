package wizard;

public class BagFullException extends Throwable{
    public BagFullException(int limit) {
        super(String.format("Bag can hold only %s Balls", limit));
    }
}
