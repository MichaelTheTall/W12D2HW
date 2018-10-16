import Attraction.Dodgems;
import Attraction.Park;
import Main.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor anna;
    Visitor bob;

    @Before
    public void before(){
        anna = new Visitor("Anna",10, 110, 5.00);
        bob = new Visitor("bob",20, 180, 50.00);
        dodgems = new Dodgems("Dodgem This");
        }

    @Test
    public void getName(){
        assertEquals("Dodgem This", dodgems.getName());
    }

    @Test
    public void priceUnder12(){
        assertEquals(2.25, dodgems.priceFor(anna), 0.01);
    }

    @Test
    public void priceOver12(){
        assertEquals(4.50, dodgems.priceFor(bob), 0.01);
    }

}
