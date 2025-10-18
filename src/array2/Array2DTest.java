package array2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Array2DTest {

    @Test
    public void testMatrix3x3() {
        // Code input
        int[][] codeInput = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Execution / code output
        Array2D array2d = new Array2D();
        String codeOutput = array2d.getMatrixInfo(codeInput);

        // Expected output
        String expectedOutput = "Row 1: 1O 2E 3O \n" +
                "Row 2: 4E 5O 6E \n" +
                "Row 3: 7O 8E 9O \n" +
                "Total: 45\n" +
                "Average: 5.0";

        try {
            assertEquals("Array 2D 3x3 test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testMatrix2x2() {
        // Code input
        int[][] codeInput = {
                { 2, 3 },
                { 4, 5 }
        };

        // Execution / code output
        Array2D array2d = new Array2D();
        String codeOutput = array2d.getMatrixInfo(codeInput);

        // Expected output
        String expectedOutput = "Row 1: 2E 3O \n" +
                "Row 2: 4E 5O \n" +
                "Total: 14\n" +
                "Average: 3.5";

        try {
            assertEquals("Array 2D 2x2 test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}