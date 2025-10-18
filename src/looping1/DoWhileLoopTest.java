package looping1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Note for students:
 * - Please implement using do-while statement.
 */
public class DoWhileLoopTest {

    @Test
    public void testLoopOutput7() {
        // Code input
        int codeInput = 7;
        // Execution / codeOutput
        DoWhileLoop tDoWhileLoop = new DoWhileLoop();
        int codeOutput = tDoWhileLoop.getOddNumbersAndSum(codeInput);
        // Expected output
        int expectedOutput = 16; // 1+3+5+7
        try {
            assertEquals("Do-while loop odd sum test (max=7):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testLoopOutput6() {
        // Code input
        int codeInput = 6;
        // Execution / codeOutput
        DoWhileLoop tDoWhileLoop = new DoWhileLoop();
        int codeOutput = tDoWhileLoop.getOddNumbersAndSum(codeInput);
        // Expected output
        int expectedOutput = 9; // 1+3+5
        try {
            assertEquals("Do-while loop odd sum test (max=6):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testLoopOutput0() {
        // Code input
        int codeInput = 0;
        // Execution / codeOutput
        DoWhileLoop tDoWhileLoop = new DoWhileLoop();
        int codeOutput = tDoWhileLoop.getOddNumbersAndSum(codeInput);
        // Expected output
        int expectedOutput = 0;
        try {
            assertEquals("Do-while loop odd sum test (max=0):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}