import attractions.Dogems;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import themeParkStuff.ThemePark;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Visitor visitor;
    Vehicle vehicle;
    Dogems dogems;

    @Before
    public void before(){
        visitor = new Visitor("Mark", 22, 175, 10.00);
        vehicle = new Vehicle("Ford", "Transit");
        themePark = new ThemePark("Louden Castle");
        dogems = new Dogems()
;    }

    @Test
    public void hasFeatures() {
        assertEquals(7, themePark.getAttractionsLength());
    }

    @Test
    public void canUpdateRating() {
        themePark.updateFeatureRating("Dogems", 2);
        assertEquals(2, themePark.getDogemsRating());
    }


}
