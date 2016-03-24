package wizard;

import wizard.balls.Balls;
import wizard.balls.ReadOnlyBalls;
import wizard.rules.ReadOnlyRules;
import wizard.rules.exceptions.RuleViolationForColorException;

public class Bag {

    private final int capacity;
    private ReadOnlyRules rules;
    private final Balls balls;

    public Bag(int capacity, ReadOnlyRules rules) {
        this.capacity = capacity;
        this.rules = rules;
        balls = new Balls();
    }

    public boolean add(Ball ball) throws BagFullException, RuleViolationForColorException {
        if (isFull())
            throw new BagFullException(capacity);

        validateNewEntry(ball);
        return balls.add(ball);
    }

    private void validateNewEntry(Ball ball) throws RuleViolationForColorException {
        ReadOnlyBalls readOnlyBalls = new ReadOnlyBalls(balls);
        rules.cryWhenRuleViolated(ball, readOnlyBalls);
    }

    private boolean isFull() {
        return balls.size() == capacity;
    }
}
