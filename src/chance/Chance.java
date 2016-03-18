/*
Chances can perform or and operation
Chances can add or subtract with another chance
Chance can tell a chance is equals to it or not
 */

package chance;

import chance.exception.InvalidChanceException;

public class Chance {
    private double chance;

    public static Chance create(double probability) throws InvalidChanceException {
        if(probability < 0 || probability > 1)
            throw new InvalidChanceException(probability);
        return new Chance(probability);
    }

    private Chance(double chance) {
        this.chance = chance;
    }

    public Chance not() throws InvalidChanceException {
        return create(1 - chance);
    }

    public Chance and(Chance event) throws InvalidChanceException {
        return create(this.chance * event.chance);
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Chance))
            return false;
        Chance otherChance = (Chance)obj;
        return otherChance.chance == this.chance;
    }

    public Chance or(Chance anotherEvent) throws InvalidChanceException {
        Chance notThis = this.not();
        Chance notAnotherEvent = anotherEvent.not();
        return (notThis.and(notAnotherEvent)).not();
    }
}
