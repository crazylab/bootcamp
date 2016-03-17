package chance;

import org.junit.Assert;
import org.junit.Test;

public class ChanceCounterTest {
    @Test
    public void should_give_number_of_chances_of_getting_tails_for_flipping_one_coin() throws Exception {
        ChanceCounter chanceCounter = new ChanceCounter(1, 2);
        Assert.assertEquals(0.5, chanceCounter.chanceOfGettingTail(1),0);

    }

    @Test
    public void should_give_number_of_chances_of_not_getting_tails_for_flipping_one_coin() throws Exception {
        ChanceCounter chanceCounter = new ChanceCounter(1, 2);
        Assert.assertEquals(0.5, chanceCounter.chanceOfNotGettingTail(1),0);
    }

    @Test
    public void should_give_number_of_chances_of_getting_tails_for_flipping_two_coins() throws Exception {
        ChanceCounter chanceCounter = new ChanceCounter(1, 2);
        Assert.assertEquals(0.25, chanceCounter.chanceOfGettingTail(2),0);
    }

    @Test
    public void should_give_number_of_chances_of_getting_at_least_one_tail_for_flipping_two_coins() throws Exception {
        ChanceCounter chanceCounter = new ChanceCounter(1, 2);
        Assert.assertEquals(0.75, chanceCounter.chanceOfGettingAtLeastOneTail(2),0);
    }
}