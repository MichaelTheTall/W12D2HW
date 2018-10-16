import Stall.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall icecream;

    @Before
    public void before(){
        icecream = new IceCreamStall("Ice To Meet You", "Ben", "B12");
    }

    @Test
    public void getName(){
        assertEquals("Ice To Meet You", icecream.getName());
    }

    @Test
    public void getOwner(){
        assertEquals("Ben", icecream.getOwner());
    }

    @Test
    public void getParking(){
        assertEquals("B12", icecream.getParking());
    }
}
