package array1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Array1DTest {

    @Test
    public void testArray1DFullOutput() {
        // Code input
        int[] codeInput = { 2, 4, 6, 8, 10 };
        // Execution / code output  
        Array1D array1d = new Array1D();
        String codeOutput = array1d.getArrayInfo(codeInput);
        // Expected output
        String expectedOutput = "2 4 6 8 10\nSum: 30";

        try {
            assertEquals("Array 1D full output test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testAnotherArray1D() {
        // Code input
        int[] codeInput = { 1, 3, 5 };
        // Execution / code output
        Array1D array1d = new Array1D();
        String codeOutput = array1d.getArrayInfo(codeInput);
        // Expected output  
        String expectedOutput = "1 3 5\nSum: 9";

        try {
            assertEquals("Another Array 1D test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}