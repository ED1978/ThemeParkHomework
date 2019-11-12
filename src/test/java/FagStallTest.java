import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.FagStall;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class FagStallTest {

    FagStall fagStall;
    Vehicle vehicle;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        fagStall = new FagStall("Doris");
        vehicle = new Vehicle("Ford", "Transit");
        visitor1 = new Visitor("Mable", 18, 144,  20.00);
        visitor2 = new Visitor("Gertrude", 17, 146, 20.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fag stalls.Stall", fagStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Doris", fagStall.getOwnerName());
    }

    @Test
    public void hasRating() {
        assertEquals(0, fagStall.getRating());
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

    @Test
    public void isAllowedTrue() {
        assertEquals(true, fagStall.isAllowed(visitor1));
    }

    @Test
    public void isAllowedFalse() {
        assertEquals(false, fagStall.isAllowed(visitor2));
    }
}
