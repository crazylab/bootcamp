package parking;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkingSpotTest {
    @Test
    public void should_return_true_when_it_is_available() {
        ParkingSpot parkingSpot = new ParkingSpot();
        assertTrue(parkingSpot.isAvailable());
    }

    @Test
    public void should_return_false_when_it_is_not_available() {
        ParkingSpot parkingSpot = new ParkingSpot();
        parkingSpot.addCar(new Car());
        assertFalse(parkingSpot.isAvailable());
    }
}