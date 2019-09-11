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

    private final double epsilon = 0.0001;

    @Before
    public void before() {
        dealership = new Dealership(10000);
        engine = new FuelEngine(2400, "Petrol");
        tyre = new Tyre("Road");
        car = new Car(1000, 0, "Red", engine, tyre);
    }

    @Test
    public void canBuyCar() {
        dealership.buyCar(car);
        assertEquals(1, dealership.numberOfCars());
        assertEquals(9000, dealership.getTill(), epsilon);
    }

}
