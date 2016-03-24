package wizard.rules;

import wizard.Ball;
import wizard.balls.ReadOnlyBalls;
import wizard.rules.exceptions.RuleViolationForColorException;

public interface Rule {
    public void checkRuleViolationToAddNewBall(Ball ball, ReadOnlyBalls balls) throws RuleViolationForColorException;
}
