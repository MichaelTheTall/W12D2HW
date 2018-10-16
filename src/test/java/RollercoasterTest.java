import Attraction.Rollercoaster;
import Main.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster roller;
    Visitor anna;
    Visitor bob;
    Visitor ben;

    @Before
    public void before(){
        roller = new Rollercoaster("Keep on Rollin'");
        anna = new Visitor("Anna",19, 110, 5.00);
        bob = new Visitor("bob",20, 210, 50.00);
        ben = new Visitor("ben",20, 150, 50.00);
    }

    @Test
    public void getName(){
        assertEquals("Keep on Rollin'", roller.getName());
    }

    @Test
    public void ageCheckPass(){
        assertEquals(true, roller.isAllowedTo(bob));
    }

    @Test
    public void ageCheckFail(){
        assertEquals(false, roller.isAllowedTo(anna));
    }

    @Test
    public void priceNormalHeight(){
        assertEquals(8.40, roller.priceFor(ben), 0.01);
    }

    @Test
    public void priceTall(){
        assertEquals(16.80, roller.priceFor(bob), 0.01);
    }
}
