import org.junit.Before;
import org.junit.Test;
import shop.instruments.Banjo;
import shop.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;

public class BanjoTest {

    Banjo banjo;

    @Before
    public void before(){
        banjo = new Banjo("Pilgrim", 4, 100.00, 200.00);
    }

    @Test
    public void hasStringInstrumentType(){
        assertEquals(banjo.getInstrumentType(), InstrumentType.String);
    }

    @Test
    public void hasStringCount(){
        assertEquals(4, banjo.getStringCount());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(200, banjo.getSellingPrice(), 0.0);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(100, banjo.getBuyingPrice(), 0.0);
    }

    @Test
    public void canReturnMarkupAbsolute(){
        assertEquals(100, banjo.calculateMarkupAbsolute(), 0.0);
    }

    @Test
    public void canReturnMarkupPercentage(){
        assertEquals(1, banjo.calculateMarkupPercentage(), 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("plong", banjo.play());
    }

}
