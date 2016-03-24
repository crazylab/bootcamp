package parking;

import java.util.ArrayList;
import java.util.List;
//Add new parking lot
//park car
//send status to observer

public class ParkingLots {
    List<ParkingLot> parkingLots = new ArrayList();
    private List<Observer> observers = new ArrayList<Observer>();

    public boolean addParkingLot(ParkingLot parkingLot) {
        return parkingLots.add(parkingLot);
    }

    public boolean parkCar(Car car) {
        for (ParkingLot parkingLot : parkingLots) {
            if (!parkingLot.isFull()) {
                parkingLot.parkCar(car);
                updateObservers();
                return true;
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

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void updateObservers(){
        for (Observer observer : observers) {
            observer.updateState(new ReadOnlyParkingLots(this));
        }
    }

    public int totalCapacity() {
        int totalCapacity = 0;
        for (ParkingLot parkingLot : parkingLots) {
            totalCapacity += parkingLot.totalCapacity();
        }
        return totalCapacity;
    }

    public int availableParkingSpace() {
        int totalAvailable = 0;
        for (ParkingLot parkingLot : parkingLots) {
            totalAvailable+= parkingLot.totalAvailableSpace();
        }
        return totalAvailable;
    }
}
