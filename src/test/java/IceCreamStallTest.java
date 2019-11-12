import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;
    Vehicle vehicle;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Doris", 11);
        vehicle = new Vehicle("Ford", "Transit");
    }

    @Test
    public void hasName() {
        assertEquals("Ice Cream", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Doris", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasRating() {
        assertEquals(11, iceCreamStall.getRating());
    }

    @Test
    public void canSetRating() {
        iceCreamStall.setRating(3);
        assertEquals(3, iceCreamStall.getRating());
    }

    @Test
    public void canParkVehicle() {
        iceCreamStall.parkVehicle(vehicle);
        assertEquals(1, iceCreamStall.getParkingSpaceCount());
    }

    @Test
    public void canLeaveParkingSpace() {
        iceCreamStall.parkVehicle(vehicle);
        iceCreamStall.leaveParkingSpace();
        assertEquals(0, iceCreamStall.getParkingSpaceCount());
    }
}
