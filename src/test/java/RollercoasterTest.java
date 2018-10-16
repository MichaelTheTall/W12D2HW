import Attraction.Rollercoaster;
import Main.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster roller;
    Visitor anna;
    Visitor bob;

    @Before
    public void before(){
        roller = new Rollercoaster("Keep on Rollin'");
        anna = new Visitor("Anna",12, 110, 5.00);
        bob = new Visitor("bob",20, 180, 50.00);
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

}
