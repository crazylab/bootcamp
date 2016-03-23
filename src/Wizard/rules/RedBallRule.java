package wizard.rules;

import wizard.Ball;
import wizard.Color;
import wizard.ReadOnlyBalls;

public class RedBallRule implements Rule {
    @Override
    public void checkRuleViolationToAddNewBall(Ball ball, ReadOnlyBalls balls) throws RuleViolationForColorException {
        if (!ball.isOfColor(Color.RED))
            return;
        if (balls.countOf(Color.RED) == getAllowedCount(balls))
            throw new RedBallRuleViolationException(getAllowedCount(balls));
    }

    private int getAllowedCount(ReadOnlyBalls balls) {
        int totalGreenBallsPresent = balls.countOf(Color.GREEN);
        return (totalGreenBallsPresent * 2) - 1;
    }
}
