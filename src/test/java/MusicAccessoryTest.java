import org.junit.Before;
import org.junit.Test;
import shop.musicAccessories.MusicAccessory;

import static org.junit.Assert.assertEquals;

public class MusicAccessoryTest {

    MusicAccessory guitarStrings;

    @Before
    public void before(){
        guitarStrings = new MusicAccessory("a set of strings for a guitar",6.49,12.99);
    }

    @Test
    public void canReturnMarkupAbsolute(){
        assertEquals(6.5, guitarStrings.calculateMarkupAbsolute(), 0.0);
    }

    @Test
    public void canReturnMarkupPercentage(){
        assertEquals(1.0015408, guitarStrings.calculateMarkupPercentage(), 0.0000001);
    }
}
