import org.junit.Before;
import org.junit.Test;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Vehicle vehicle;

    @Before
    public void before(){
        vehicle = new Vehicle("Ford", "Transit");
    }

    @Test
    public void hasMake() {
        assertEquals("Ford", vehicle.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Transit", vehicle.getModel());
    }
}
