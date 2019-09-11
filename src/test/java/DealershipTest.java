import cars.Car;
import cars.Engine;
import cars.FuelEngine;
import cars.Tyre;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;
    Engine engine;
    Tyre tyre;

    @Before
    public void before() {
        dealership = new Dealership();
        engine = new FuelEngine(2400, "Petrol");
        tyre = new Tyre("Road");
        car = new Car(1000, 0, "Red", engine, tyre);
    }

    @Test
    public void dealershipCanAddCar() {
        dealership.addCar(car);
        assertEquals(1, dealership.numberOfCars());
    }

}
