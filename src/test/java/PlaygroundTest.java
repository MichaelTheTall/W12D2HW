import Attraction.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground("The PlaySpace",9);
    }

    @Test
    public void getName(){
        assertEquals("The PlaySpace", playground.getName());
    }
    
}
