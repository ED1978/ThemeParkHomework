import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster();
        visitor1 = new Visitor("Mable", 15, 150, 20.00);
        visitor2 = new Visitor("Gertrude", 11, 144, 20.00);
        visitor3 = new Visitor("Gertrude", 15, 144, 20.00);
        visitor4 = new Visitor("Gertrude", 11, 201, 20.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Rollercoaster", rollerCoaster.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(0, rollerCoaster.getRating());
    }

    @Test
    public void canGetVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasTicketPrice() {
        assertEquals(8.40, rollerCoaster.getTicketPrice(), 0.01);
    }

    @Test
    public void canSetRating() {
        rollerCoaster.setRating(2);
        assertEquals(2, rollerCoaster.getRating());
    }

    @Test
    public void canAddVisit() {
        rollerCoaster.addVisit();
        assertEquals(1, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedBothTrue() {
        assertEquals(true, rollerCoaster.isAllowed(visitor1));
    }

    @Test
    public void isAllowedBothFalse() {
        assertEquals(false, rollerCoaster.isAllowed(visitor2));
    }

    @Test
    public void isAllowedHeightFalse() {
        assertEquals(false, rollerCoaster.isAllowed(visitor3));
    }

    @Test
    public void isAllowedAgeFalse() {
        assertEquals(false, rollerCoaster.isAllowed(visitor4));
    }

    @Test
    public void priceForVisitorOver200() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor4), 0.01);
    }

    @Test
    public void priceForVisitorUnder200() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor3), 0.01);
    }
}
