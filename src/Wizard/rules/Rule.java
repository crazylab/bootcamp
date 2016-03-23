package wizard.rules;

import wizard.Ball;
import wizard.ReadOnlyBalls;

public interface Rule {
    public void checkRuleViolationToAddNewBall(Ball ball, ReadOnlyBalls balls) throws RuleViolationForColorException;
}
