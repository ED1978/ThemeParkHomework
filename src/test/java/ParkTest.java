import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park();
    }

    @Test
    public void canGetName() {
        assertEquals("Park", park.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(0, park.getRating());
    }

    @Test
    public void canGetVisitCount() {
        assertEquals(0, park.getVisitCount());
    }

    @Test
    public void canSetRating() {
        park.setRating(2);
        assertEquals(2, park.getRating());
    }

    @Test
    public void canAddVisit() {
        park.addVisit();
        assertEquals(1, park.getVisitCount());
    }
}
