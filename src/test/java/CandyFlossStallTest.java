import Stall.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall floss;

    @Before
    public void before(){
        floss = new CandyFlossStall("Mental Floss", "Jenny", "C2");
    }

    @Test
    public void getName(){
        assertEquals("Mental Floss", floss.getName());
    }

    @Test
    public void getOwner(){
        assertEquals("Jenny", floss.getOwner());
    }

    @Test
    public void getParking(){
        assertEquals("C2", floss.getParking());
    }

    @Test
    public void price(){
        assertEquals(4.20, floss.defaultPrice(), 0.01);
    }
}
