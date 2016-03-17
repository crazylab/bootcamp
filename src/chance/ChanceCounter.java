/*
Chances of getting tails for one or more coins
Chances of not getting tails
Chance of getting at least one tail
 */
package chance;

public class ChanceCounter {
    private final double sampleSpace;
    private final double totalSpace;

    public ChanceCounter(double sampleSpace, double totalSpace) {
        this.sampleSpace = sampleSpace;
        this.totalSpace = totalSpace;
    }

    public double chanceOfGettingTail(int numberOfCoins) {
        return Math.pow(sampleSpace/totalSpace,numberOfCoins);
    }

    public double chanceOfNotGettingTail(int numberOfCoins) {
        return Math.pow(1 - chanceOfGettingTail(1), numberOfCoins);
    }

    public double chanceOfGettingAtLeastOneTail(int numberOfCoins) {
        return 1 - chanceOfNotGettingTail(numberOfCoins);
    }
}
