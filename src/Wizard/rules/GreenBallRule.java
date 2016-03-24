package wizard.rules;

import wizard.Ball;
import wizard.Color;
import wizard.balls.ReadOnlyBalls;
import wizard.rules.exceptions.GreenBallRuleViolationException;

public class GreenBallRule implements Rule {
    private final int limit;

    public GreenBallRule(int limit) {
        this.limit = limit;
    }

    @Override
    public void checkRuleViolationToAddNewBall(Ball ball, ReadOnlyBalls balls) throws GreenBallRuleViolationException {
        if (!ball.isOfColor(Color.GREEN))
            return;
        if(balls.countOf(Color.GREEN) == limit)
            throw new GreenBallRuleViolationException(limit);
    }
}
