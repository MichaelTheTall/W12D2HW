import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobacco;

    @Before
    public void before(){
        tobacco = new TobaccoStall("Smoke on the Water", "Joe", "A24");
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
}
