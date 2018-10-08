import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void before() {
        bottle = new WaterBottle();
    }

    @Test
    public void hasVolume() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void hasDrink() {
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void hasEmpty() {
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void hasFill() {
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }
}
