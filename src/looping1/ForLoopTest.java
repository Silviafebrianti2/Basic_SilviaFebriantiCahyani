package looping1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Note for students:
 * - Please implement using for statement.
 */
public class ForLoopTest {

    @Test
    public void testLoopOutput5() {
        // Code input
        int codeInput = 5;
        // Execution / codeOutput
        ForLoop tForLoop = new ForLoop();
        int codeOutput = tForLoop.getNumbersAndSum(codeInput);
        // Expected output
        int expectedOutput = 15; // 1+2+3+4+5
        try {
            assertEquals("For-loop sum test (max=5):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testLoopOutput3() {
        // Code input
        int codeInput = 3;
        // Execution / codeOutput
        ForLoop tForLoop = new ForLoop();
        int codeOutput = tForLoop.getNumbersAndSum(codeInput);
        // Expected output
        int expectedOutput = 6; // 1+2+3
        try {
            assertEquals("For-loop sum test (max=3):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testLoopOutput0() {
        // Code input
        int codeInput = 0;
        // Execution / codeOutput
        ForLoop tForLoop = new ForLoop();
        int codeOutput = tForLoop.getNumbersAndSum(codeInput);
        // Expected output
        int expectedOutput = 0;
        try {
            assertEquals("For-loop sum test (max=0):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}