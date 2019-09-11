import cars.Car;
import cars.Engine;
import cars.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Engine engine;
    private Tyre tyre;
    private Car car;

    @Before
    public void before() {
        engine = new Engine(2400);
        tyre = new Tyre("road");
        car = new Car(1000, 0, "Red", engine, tyre);
    }

    @Test
    public void carCanDrive() {
        assertEquals("Driving with 2400 size engine on road tyres", car.drive());
    }
}
