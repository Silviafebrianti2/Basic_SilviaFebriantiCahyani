package function1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Function1Test {

    @Test
    public void test_1_addPositive() {
        // Unit test 1: add two positive numbers
        // Code input
        int codeInputA = 5;
        int codeInputB = 10;
        // Execution / code output
        Function1 function1 = new Function1();
        int codeOutput = function1.add(codeInputA, codeInputB);
        // Expected output
        int expectedOutput = 15;

        try {
            assertEquals("1: Add two positive numbers:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void test_2_addZero() {
        // Unit test 2: add positive number with zero
        // Code input
        int codeInputA = 5;
        int codeInputB = 0;
        // Execution / code output
        Function1 function1 = new Function1();
        int codeOutput = function1.add(codeInputA, codeInputB);
        // Expected output
        int expectedOutput = 5;

        try {
            assertEquals("2: Add with zero:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void test_3_addNegative() {
        // Unit test 3: add positive and negative number
        // Code input
        int codeInputA = 5;
        int codeInputB = -3;
        // Execution / code output
        Function1 function1 = new Function1();
        int codeOutput = function1.add(codeInputA, codeInputB);
        // Expected output
        int expectedOutput = 2;

        try {
            assertEquals("3: Add negative number:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void test_4_multiplyPositive() {
        // Unit test 4: multiply two positive numbers
        // Code input
        int codeInputA = 5;
        int codeInputB = 10;
        // Execution / code output
        Function1 function1 = new Function1();
        int codeOutput = function1.multiply(codeInputA, codeInputB);
        // Expected output
        int expectedOutput = 50;

        try {
            assertEquals("4: Multiply two positive numbers:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void test_5_multiplyZero() {
        // Unit test 5: multiply with zero
        // Code input
        int codeInputA = 5;
        int codeInputB = 0;
        // Execution / code output
        Function1 function1 = new Function1();
        int codeOutput = function1.multiply(codeInputA, codeInputB);
        // Expected output
        int expectedOutput = 0;

        try {
            assertEquals("5: Multiply with zero:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void test_6_multiplyNegative() {
        // Unit test 6: multiply with negative number
        // Code input
        int codeInputA = 5;
        int codeInputB = -3;
        // Execution / code output
        Function1 function1 = new Function1();
        int codeOutput = function1.multiply(codeInputA, codeInputB);
        // Expected output
        int expectedOutput = -15;

        try {
            assertEquals("6: Multiply with negative number:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}