package looping2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Note for students:
 * - Please implement using while statement.
 */
public class WhileLoopNestedTest {

    @Test
    public void testTriangle1() {
        // Code input
        int codeInput = 1;
        // Execution / codeOutput
        WhileLoopNested tWhileLoopNested = new WhileLoopNested();
        String codeOutput = tWhileLoopNested.getTriangle(codeInput);
        // Expected output
        String expectedOutput = "*";
        try {
            assertEquals("Triangle test (max=1):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testTriangle3() {
        // Code input
        int codeInput = 3;
        // Execution / codeOutput
        WhileLoopNested tWhileLoopNested = new WhileLoopNested();
        String codeOutput = tWhileLoopNested.getTriangle(codeInput);
        // Expected output
        String expectedOutput = "*\n**\n***";
        try {
            assertEquals("Triangle test (max=3):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testTriangle5() {
        // Code input
        int codeInput = 5;
        // Execution / codeOutput
        WhileLoopNested tWhileLoopNested = new WhileLoopNested();
        String codeOutput = tWhileLoopNested.getTriangle(codeInput);
        // Expected output
        String expectedOutput = "*\n**\n***\n****\n*****";
        try {
            assertEquals("Triangle test (max=5):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}