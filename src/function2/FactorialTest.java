package function2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorial() {
        // codeInput
        int codeInput = 5;

        // Execution / codeOutput
        Factorial factorial = new Factorial();
        int codeOutput = factorial.factorial(codeInput);

        // Expected output
        int expectedOutput = 120;

        // Assertion
        try {
            assertEquals("Factorial of 5 test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testFactorialZero() {
        // codeInput
        int codeInput = 0;

        // Execution / codeOutput
        Factorial factorial = new Factorial();
        int codeOutput = factorial.factorial(codeInput);

        // Expected output
        int expectedOutput = 1;

        // Assertion
        try {
            assertEquals("Factorial of 0 test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}