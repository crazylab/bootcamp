package wizard.rules;

import wizard.Ball;
import wizard.balls.ReadOnlyBalls;
import wizard.rules.exceptions.RuleViolationForColorException;

public class ReadOnlyRules {
    private Rules rules;

    public ReadOnlyRules(Rules rules) {
        this.rules = rules;
    }

    public void cryWhenRuleViolated(Ball ball, ReadOnlyBalls balls) throws RuleViolationForColorException {
        rules.cryWhenRuleViolated(ball, balls);
    }
}
