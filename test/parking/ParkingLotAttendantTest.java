package parking;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkingLotAttendantTest {
    ParkingLotAttendant attendant;
    @Before
    public void setUp() throws Exception {
        attendant = new ParkingLotAttendant();
    }

    @Test
    public void should_be_able_to_add_a_parking_lot() {
        assertTrue(attendant.addParkingLot(ParkingLot.create(3)));
    }

    @Test
    public void should_be_able_to_park_a_car_to_parking_lot_when_there_is_space_in_parking_lot() {
        attendant.addParkingLot(ParkingLot.create(3));

        assertTrue(attendant.parkCar(new Car(21)));
    }

    @Test
    public void should_not_be_able_to_park_a_car_to_parking_lot_when_there_is_no_space_in_parking_lot() {
        attendant.addParkingLot(ParkingLot.create(1));

        assertTrue(attendant.parkCar(new Car(21)));

        assertFalse(attendant.parkCar(new Car(22)));
    }

    @Test
    public void should_give_true_when_all_Parking_lots_are_full() {
        attendant.addParkingLot(ParkingLot.create(0));
        attendant.addParkingLot(ParkingLot.create(0));

        assertTrue(attendant.isParkingLotFull());

    }
}