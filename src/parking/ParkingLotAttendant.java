package parking;

import java.util.ArrayList;
import java.util.List;

//Can add parking lot
//Can park car into the parking lot

public class ParkingLotAttendant {
    List<ParkingLot> parkingLots = new ArrayList();

    public boolean addParkingLot(ParkingLot parkingLot) {
        return parkingLots.add(parkingLot);
    }

    public boolean parkCar(Car car) {
        for (ParkingLot parkingLot : parkingLots) {
            if (!parkingLot.isFull()) {
                return parkingLot.parkCar(car);
            }
        }
        return false;
    }

    public boolean isParkingLotFull() {
        for (ParkingLot parkingLot : parkingLots) {
            if (!parkingLot.isFull()) {
                return false;
            }
        }
        return true;
    }
}
