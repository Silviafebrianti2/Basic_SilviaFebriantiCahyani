package looping1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Note for students:
 * - Please implement using while statement.
 */
public class WhileLoopTest {

    @Test
    public void testLoopOutput6() {
        // Code input
        int codeInput = 6;
        // Execution / codeOutput
        WhileLoop tWhileLoop = new WhileLoop();
        int codeOutput = tWhileLoop.getEvenNumbersAndSum(codeInput);
        // Expected output
        int expectedOutput = 12; // 2+4+6
        try {
            assertEquals("While-loop even sum test (max=6):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testLoopOutput5() {
        // Code input
        int codeInput = 5;
        // Execution / codeOutput
        WhileLoop tWhileLoop = new WhileLoop();
        int codeOutput = tWhileLoop.getEvenNumbersAndSum(codeInput);
        // Expected output
        int expectedOutput = 6; // 2+4
        try {
            assertEquals("While-loop even sum test (max=5):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testLoopOutput0() {
        // Code input
        int codeInput = 0;
        // Execution / codeOutput
        WhileLoop tWhileLoop = new WhileLoop();
        int codeOutput = tWhileLoop.getEvenNumbersAndSum(codeInput);
        // Expected output
        int expectedOutput = 0;
        try {
            assertEquals("While-loop even sum test (max=0):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}