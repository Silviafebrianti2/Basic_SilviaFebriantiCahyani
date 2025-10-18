package basic;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int codeInput1 = 2;
        int codeInput2 = 3;
        int codeOutput = calc.add(codeInput1, codeInput2);
        int expectedOutput = 5;
        try {
            assertEquals("Addition test failed:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}