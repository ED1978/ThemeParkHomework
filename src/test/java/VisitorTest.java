import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor("Bert", 21, 140, 100.00);
    }

    @Test
    public void hasName() {
        assertEquals("Bert", visitor.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(21, visitor.getAge());
    }

    @Test
    public void hasMoney() {
        assertEquals(100.00, visitor.getMoney(), 0.01);
    }

    @Test
    public void canGetHeight() {
        assertEquals(140, visitor.getHeight());
    }

    @Test
    public void canAddMoney() {
        visitor.increaseMoney(1.99);
        assertEquals(101.99, visitor.getMoney(), 0.01);
    }

    @Test
    public void canDecreaseMoney() {
        visitor.decreaseMoney(1.00);
        assertEquals(99.00, visitor.getMoney(), 0.01);
    }
}
