import junit.framework.TestCase;

import java.util.Random;

public class SimpleCalculatorTest extends TestCase {

    public void testAddNum() {
        SimpleCalculator s = new SimpleCalculator();
        Random rand = new Random();
        var num1 = rand.nextInt(100);
        var num2 = rand.nextInt(100);
        var expectedRes = num1 + num2;
        var Actualres = s.addNum(num1,num2);

        // verify
        assertEquals(expectedRes, Actualres);

    }
}