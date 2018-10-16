import Attraction.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Dodgem This");
    }

    @Test
    public void getName(){
        assertEquals("Dodgem This", dodgems.getName());
    }
}
