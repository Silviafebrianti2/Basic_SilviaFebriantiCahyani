package looping2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Note for students:
 * - Please implement using for statement.
 */
public class ForLoopNestedTest {

    @Test
    public void testGrid1() {
        // Code input
        int codeInput = 1;
        // Execution / codeOutput
        ForLoopNested tForLoopNested = new ForLoopNested();
        String codeOutput = tForLoopNested.getGrid(codeInput);
        // Expected output
        String expectedOutput = "Row 1 Col 1";
        try {
            assertEquals("Grid test (max=1):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testGrid3() {
        // Code input
        int codeInput = 3;
        // Execution / codeOutput
        ForLoopNested tForLoopNested = new ForLoopNested();
        String codeOutput = tForLoopNested.getGrid(codeInput);
        // Expected output
        String expectedOutput = "Row 1 Col 1\nRow 1 Col 2\nRow 1 Col 3\n" +
                "Row 2 Col 1\nRow 2 Col 2\nRow 2 Col 3\n" +
                "Row 3 Col 1\nRow 3 Col 2\nRow 3 Col 3";

        try {
            assertEquals("Grid test (max=3):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testGrid5() {
        // Code input
        int codeInput = 5;
        // Execution / codeOutput
        ForLoopNested tForLoopNested = new ForLoopNested();
        String codeOutput = tForLoopNested.getGrid(codeInput);
        // Expected output
        String expectedOutput = "Row 1 Col 1\nRow 1 Col 2\nRow 1 Col 3\nRow 1 Col 4\nRow 1 Col 5\n" +
                "Row 2 Col 1\nRow 2 Col 2\nRow 2 Col 3\nRow 2 Col 4\nRow 2 Col 5\n" +
                "Row 3 Col 1\nRow 3 Col 2\nRow 3 Col 3\nRow 3 Col 4\nRow 3 Col 5\n" +
                "Row 4 Col 1\nRow 4 Col 2\nRow 4 Col 3\nRow 4 Col 4\nRow 4 Col 5\n" +
                "Row 5 Col 1\nRow 5 Col 2\nRow 5 Col 3\nRow 5 Col 4\nRow 5 Col 5";
        try {
            assertEquals("Grid test (max=5):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}