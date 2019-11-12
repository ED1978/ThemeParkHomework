import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;
    Vehicle vehicle;


    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Betty");
        vehicle = new Vehicle("Ford", "Transit");
    }

    @Test
    public void hasName() {
        assertEquals("CandyFloss", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Betty", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasRating() {
        assertEquals(0, candyFlossStall.getRating());
    }

    @Test
    public void canSetRating() {
        candyFlossStall.setRating(3);
        assertEquals(3, candyFlossStall.getRating());
    }

    @Test
    public void canParkVehicle() {
        candyFlossStall.parkVehicle(vehicle);
        assertEquals(1, candyFlossStall.getParkingSpaceCount());
    }

    @Test
    public void canLeaveParkingSpace() {
        candyFlossStall.parkVehicle(vehicle);
        candyFlossStall.leaveParkingSpace();
        assertEquals(0, candyFlossStall.getParkingSpaceCount());
    }
}
