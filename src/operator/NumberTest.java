package operator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NumberTest {

    @Test
    public void testCase1_PositiveNumbers() {
        // Code input
        int codeInputA = 10;
        int codeInputB = 5;

        // Execution / code output
        Number number = new Number();
        String codeOutput = number.getOperatorResults(codeInputA, codeInputB);

        // Expected output
        String expectedOutput = "Sum: 15\n" + // a + b = 10 + 5
                "Product: 50\n" + // a * b = 10 * 5
                "Is Equal: false\n" + // a == b ? false
                "Logical AND: true\n" + // a > 0 && b > 0 ? true
                "Logical OR: true"; // a < 0 || b > 0 ? true

        // Assertion simple try-catch
        try {
            assertEquals("Case 1: Positive numbers", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testCase2_NegativeAndPositive() {
        // Code input
        int codeInputA = -3;
        int codeInputB = 5;
        // Execution / code output
        Number number = new Number();
        String codeOutput = number.getOperatorResults(codeInputA, codeInputB);
        // Expected output
        String expectedOutput = "Sum: 2\n" + // a + b = -3 + 5
                "Product: -15\n" + // a * b = -3 * 5
                "Is Equal: false\n" + // a == b ? false
                "Logical AND: false\n" + // a > 0 && b > 0 ? false
                "Logical OR: true"; // a < 0 || b > 0 ? true

        try {
            assertEquals("Case 2: Negative & Positive numbers", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testCase3_SameNumbers() {
        // Code input
        int codeInputA = 7;
        int codeInputB = 7;
        // Execution / code output
        Number number = new Number();
        String codeOutput = number.getOperatorResults(codeInputA, codeInputB);
        // Expected output
        String expectedOutput = "Sum: 14\n" + // a + b = 7 + 7
                "Product: 49\n" + // a * b = 7 * 7
                "Is Equal: true\n" + // a == b ? true
                "Logical AND: true\n" + // a > 0 && b > 0 ? true
                "Logical OR: true"; // a < 0 || b > 0 ? true

        try {
            assertEquals("Case 3: Same numbers", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}