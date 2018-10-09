import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void before() { calc = new Calculator(); }

    @Test
    public void hasAdd() {
        assertEquals(3, calc.add(1,2));
    }

    @Test
    public void hasSubtract() {
        assertEquals(1, calc.subtract(3,2));
    }

    @Test
    public void hasMultiply() {
        assertEquals(10, calc.multiply(2,5));
    }

    @Test
    public void hasDivide() {
        assertEquals(2.50, calc.divide(10,4), 0.01);
    }

}
