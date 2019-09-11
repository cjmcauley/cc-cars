import cars.Car;
import cars.Engine;
import cars.FuelEngine;
import cars.Tyre;
import dealership.Customer;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Dealership dealership;
    Car car;
    Engine engine;
    Tyre tyre;

    @Before
    public void before() {
        customer = new Customer();
        dealership = new Dealership();
        engine = new FuelEngine(2400, "Petrol");
        tyre = new Tyre("Road");
        car = new Car(1000, 0, "Red", engine, tyre);
    }

    @Test
    public void customerCanBuyCar() {
        dealership.addCar(car);
        customer.buyCar(car, dealership);
        assertEquals(car, customer.getCar());
        assertEquals(0, dealership.numberOfCars());
    }

}
