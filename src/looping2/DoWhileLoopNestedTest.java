package looping2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


/*
 * Note for students:
 * - Please implement using do-while statement.
 */
public class DoWhileLoopNestedTest {

    @Test
    public void testNumberTriangle1() {
        // Code input
        int codeInput = 1;
        // Execution / codeOutput
        DoWhileLoopNested tDoWhileLoopNested = new DoWhileLoopNested();
        String codeOutput = tDoWhileLoopNested.getNumberTriangle(codeInput);
        // Expected output
        String expectedOutput = "1";

        try {
            assertEquals("Number triangle test (max=1):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testNumberTriangle3() {
        // Code input
        int codeInput = 3;
        // Execution / codeOutput
        DoWhileLoopNested tDoWhileLoopNested = new DoWhileLoopNested();
        String codeOutput = tDoWhileLoopNested.getNumberTriangle(codeInput);
        // Expected output
        String expectedOutput = "1\n12\n123";
        try {
            assertEquals("Number triangle test (max=3):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testNumberTriangle4() {
        // Code input
        int codeInput = 4;
        // Execution / codeOutput
        DoWhileLoopNested tDoWhileLoopNested = new DoWhileLoopNested();
        String codeOutput = tDoWhileLoopNested.getNumberTriangle(codeInput);
        // Expected output
        String expectedOutput = "1\n12\n123\n1234";
        try {
            assertEquals("Number triangle test (max=4):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}