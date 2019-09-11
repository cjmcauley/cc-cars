package dealership;
import cars.Car;

import java.util.ArrayList;

public class Dealership {
    ArrayList<Car> cars;
    private double till;

    public Dealership(double till) {
        this.till = till;
        cars = new ArrayList<Car>();
    }

    public void buyCar(Car car) {
        till -= car.getPriceWithDamage();
        cars.add(car);
    }

    public double getTill() {
        return till;
    }

    public Car sellCar(Car car) {
        till += car.getPriceWithDamage();
        cars.remove(car);
        return car;
    }

    public int numberOfCars() {
        return cars.size();
    }
}
