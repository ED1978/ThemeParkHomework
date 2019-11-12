import attractions.Dogems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogemsTest {

    Dogems dogems;

    @Before
    public void before(){
        dogems = new Dogems();
    }

    @Test
    public void canGetName() {
        assertEquals("attractions.Dogems", dogems.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(0, dogems.getRating());
    }

    @Test
    public void canGetVisitCount() {
        assertEquals(0, dogems.getVisitCount());
    }

    @Test
    public void hasTicketPrice() {
        assertEquals(4.50, dogems.getTicketPrice(), 0.01);
    }

    @Test
    public void canSetRating() {
        dogems.setRating(2);
        assertEquals(2, dogems.getRating());
    }

    @Test
    public void canAddVisit() {
        dogems.addVisit();
        assertEquals(1, dogems.getVisitCount());
    }
}
