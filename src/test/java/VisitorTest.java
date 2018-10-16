import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor bob;

    @Before
    public void before(){
        bob = new Visitor("Bob", 20, 180, 50.00);
    }

    @Test
    public void getName(){
        assertEquals("Bob", bob.getName());
    }
    @Test
    public void getAge(){
        assertEquals(20, bob.getAge());
    }

    @Test
    public void getHeight(){
        assertEquals(180, bob.getHeight());
    }

    @Test
    public void getMoney(){
        assertEquals(50.00, bob.getMoney(), 0.01);
    }
}

