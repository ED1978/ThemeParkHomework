import attractions.Dogems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogemsTest {

    Dogems dogems;

    @Before
    public void before(){
        dogems = new Dogems(3);
    }

    @Test
    public void canGetName() {
        assertEquals("Dogems", dogems.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(3, dogems.getRating());
    }

    @Test
    public void canGetVisitCount() {
        assertEquals(0, dogems.getVisitCount());
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
