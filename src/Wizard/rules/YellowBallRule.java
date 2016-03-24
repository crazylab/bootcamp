package wizard.rules;

import wizard.Ball;
import wizard.Color;
import wizard.balls.ReadOnlyBalls;
import wizard.rules.exceptions.YellowBallRuleViolationException;

public class YellowBallRule implements Rule {
    private final double threshold;

    public YellowBallRule(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public void checkRuleViolationToAddNewBall(Ball ball, ReadOnlyBalls balls) throws YellowBallRuleViolationException {
        if (!ball.isOfColor(Color.YELLOW))
            return;
        if(balls.countOf(Color.YELLOW) == getAllowedCount(balls))
            throw new YellowBallRuleViolationException(getAllowedCount(balls));
    }

    private int getAllowedCount(ReadOnlyBalls balls) {
        return new Double(threshold * (balls.size()+1)).intValue();
    }
}
