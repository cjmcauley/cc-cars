import cars.Car;
import cars.Engine;
import cars.FuelEngine;
import cars.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Engine engine;
    private Tyre tyre;
    private Car car;

    private final double epsilon = 0.05;

    @Before
    public void before() {
        engine = new FuelEngine(2400, "Petrol");
        tyre = new Tyre("road");
        car = new Car(1000, 0, "Red", engine, tyre);
    }

    @Test
    public void carCanDrive() {
        assertEquals("Driving with 2400 size engine on road tyres", car.drive());
    }

    @Test
    public void carDamageAffectsPrice() {
        car.setDamage(0.75);
        assertEquals(250, car.getPriceWithDamage(), epsilon);
    }

    @Test
    public void canGetDamageCost() {
        car.setDamage(0.2);
        assertEquals(200, car.getDamageCost(), epsilon);
    }
}
