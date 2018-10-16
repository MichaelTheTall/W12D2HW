import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster roller;

    @Before
    public void before(){
        roller = new Rollercoaster("Keep on Rollin'");
    }

    @Test
    public void getName(){
        assertEquals("Keep on Rollin'", roller.getName());
    }
    
}
