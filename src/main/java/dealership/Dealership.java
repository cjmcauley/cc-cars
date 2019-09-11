package dealership;
import cars.Car;

import java.util.ArrayList;

public class Dealership {
    ArrayList<Car> cars;
    private double till;

    public Dealership() {
        till = 0;
        cars = new ArrayList<Car>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public double getTill() {
        return till;
    }

    public Car sellCar(Car car) {
        till += car.getPrice();
        cars.remove(car);
        return car;
    }

    public int numberOfCars() {
        return cars.size();
    }
}
