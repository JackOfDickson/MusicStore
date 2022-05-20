import org.junit.Before;
import org.junit.Test;
import shop.instruments.ElectricGuitar;

import static org.junit.Assert.assertEquals;

public class ElectricGuitarTest {

    ElectricGuitar electricGuitar;

    @Before
    public void before(){
        electricGuitar = new ElectricGuitar("Shredder", 200.00, 500.00, 6);
    }

    @Test
    public void hasStringCount(){
        assertEquals(6, electricGuitar.getStringCount());
    }

    @Test
    public void canPlay(){
        assertEquals("*electric guitar noises*", electricGuitar.play());
    }
}
