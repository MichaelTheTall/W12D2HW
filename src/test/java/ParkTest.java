import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Visitor anna;
    Visitor bob;

    @Before
    public void before(){
        park = new Park("The Park");
        anna = new Visitor("Anna",12, 110, 5.00);
        bob = new Visitor("bob",20, 180, 50.00);

    }

    @Test
    public void getName(){
        assertEquals("The Park", park.getName());
    }

    @Test
    public void ageCheckPass(){
        assertEquals(true, park.isAllowedTo(anna));
    }

    @Test
    public void ageCheckFail(){
        assertEquals(false, park.isAllowedTo(bob));
    }
}
