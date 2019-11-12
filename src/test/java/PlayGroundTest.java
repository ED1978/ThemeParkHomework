import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayGroundTest {

    PlayGround playGround;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        playGround = new PlayGround((6));
        visitor1 = new Visitor("Mable", 15, 150, 20.00);
        visitor2 = new Visitor("Gertrude", 18, 150, 20.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Playground", playGround.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(6, playGround.getRating());
    }

    @Test
    public void canGetVisitCount() {
        assertEquals(0, playGround.getVisitCount());
    }

    @Test
    public void canSetRating() {
        playGround.setRating(2);
        assertEquals(2, playGround.getRating());
    }

    @Test
    public void canAddVisit() {
        playGround.addVisit();
        assertEquals(1, playGround.getVisitCount());
    }

    @Test
    public void isAllowedTrue() {
        assertEquals(true, playGround.isAllowed(visitor1));
    }

    @Test
    public void asAllowedFalse() {
        assertEquals(false, playGround.isAllowed(visitor2));
    }
}
