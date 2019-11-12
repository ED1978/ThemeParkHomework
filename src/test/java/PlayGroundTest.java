import attractions.PlayGround;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayGroundTest {

    PlayGround playGround;

    @Before
    public void before(){
        playGround = new PlayGround((6));
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

}
