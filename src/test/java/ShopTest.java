import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import shop.instruments.Banjo;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Banjo banjo;

    @Before
    public void before(){
        shop = new Shop(new HashMap<>(), 1000);
        banjo = new Banjo("Pilgrim", 4, 100.00, 200.00);
    }

    @Test
    public void canBuyStock(){
        shop.buyStock(banjo, 5);
        assertEquals(5, shop.getShopStock().get(banjo));
        assertEquals(500, shop.getTill(), 0.0);
    }

}
