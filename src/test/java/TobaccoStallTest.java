import Main.Visitor;
import Stall.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobacco;
    Visitor anna;
    Visitor bob;


    @Before
    public void before(){
        tobacco = new TobaccoStall("Smoke on the Water", "Joe", "A24", 2);
        anna = new Visitor("Anna",12, 110, 5.00);
        bob = new Visitor("bob",20, 180, 50.00);
    }

    @Test
    public void getName(){
        assertEquals("Smoke on the Water", tobacco.getName());
    }

    @Test
    public void getOwner(){
        assertEquals("Joe", tobacco.getOwner());
    }

    @Test
    public void getParking(){
        assertEquals("A24", tobacco.getParking());
    }

    @Test
    public void ageCheckPass(){
        assertEquals(true, tobacco.isAllowedTo(bob));
    }

    @Test
    public void ageCheckFail(){
        assertEquals(false, tobacco.isAllowedTo(anna));
    }

    @Test
    public void price(){
        assertEquals(6.60, tobacco.defaultPrice(), 0.01);
    }


}


