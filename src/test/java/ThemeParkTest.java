import org.junit.Before;
import people.Visitor;
import vehicles.Vehicle;

public class ThemeParkTest {

    ThemePark themePark;
    Visitor visitor;
    Vehicle vehicle;

    @Before
    public void before(){
        visitor = new Visitor("Mark", 22, 175, 10.00);
        vehicle = new Vehicle("Ford", "Transit");
        themePark = new ThemePark("Louden Castle");
    }

}
