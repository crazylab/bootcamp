package parking;
//can say if place is available or not
//can add a car when it is free
public class ParkingSpot {
    private Car car = null;
    public boolean isAvailable() {
        return car == null;
    }

    public void addCar(Car car) {
        this.car = car;
    }
}
