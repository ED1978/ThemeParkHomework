import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster(5);
    }

    @Test
    public void canGetName() {
        assertEquals("Rollercoaster", rollerCoaster.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(5, rollerCoaster.getRating());
    }

    @Test
    public void canGetVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
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

}
