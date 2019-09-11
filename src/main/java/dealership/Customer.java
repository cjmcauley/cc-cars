package dealership;
import cars.Car;

public class Customer {
    Car car;

    public Customer() {
    }

    public void buyCar(Car car, Dealership dealership) {
        this.car = dealership.sellCar(car);
    }

    public Car getCar() {
        return car;
    }
}
