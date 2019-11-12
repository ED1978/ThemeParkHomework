import org.junit.Before;
import org.junit.Test;
import stallStuff.FagStall;
import stallStuff.Vehicle;

import static org.junit.Assert.assertEquals;

public class FagStallTest {

    FagStall fagStall;
    Vehicle vehicle;

    @Before
    public void before(){
        fagStall = new FagStall("Doris", 11);
        vehicle = new Vehicle("Ford", "Transit");
    }

    @Test
    public void hasName() {
        assertEquals("Fag Stall", fagStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Doris", fagStall.getOwnerName());
    }

    @Test
    public void hasRating() {
        assertEquals(11, fagStall.getRating());
    }

    @Test
    public void canSetRating() {
        fagStall.setRating(3);
        assertEquals(3, fagStall.getRating());
    }

    @Test
    public void canParkVehicle() {
        fagStall.parkVehicle(vehicle);
        assertEquals(1, fagStall.getParkingSpaceCount());
    }

    @Test
    public void canLeaveParkingSpace() {
        fagStall.parkVehicle(vehicle);
        fagStall.leaveParkingSpace();
        assertEquals(0, fagStall.getParkingSpaceCount());
    }

}
