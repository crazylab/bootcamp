package parking;

import java.util.ArrayList;
import java.util.List;

//Job: add parking spot
//Add car into parking lot
public class ParkingLot {

    private List<ParkingSpot> parkingLot;

    public ParkingLot(List<ParkingSpot> parkingLot) {
        this.parkingLot = parkingLot;
    }

    public static ParkingLot create(int capacity){
        List<ParkingSpot> parkingSpace = new ArrayList();
        for(int i=0; i<capacity; i++)
            parkingSpace.add(new ParkingSpot());
        return new ParkingLot(parkingSpace);
    }

    public boolean parkCar(Car car) {
        for (ParkingSpot parkingSpot : parkingLot) {
            if(parkingSpot.isAvailable()){
                parkingSpot.addCar(car);
                return true;
            }
        }
        return false;
    }

    public boolean isFull(){
        for (ParkingSpot parkingSpot : parkingLot) {
            if(parkingSpot.isAvailable())
                return false;
        }
        return true;
    }
}
