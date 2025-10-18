package condition2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Note for students:
 * - Please implement using switch-case statement.
 */
public class NestedSwitchTest {

    @Test
    public void testFoodPizza() {
        // Code input
        int codeInputCategory = 2;
        int codeInputChoice = 1;
        // Execution / code output
        NestedSwitch nestedSwitch = new NestedSwitch();
        String codeOutput = nestedSwitch.getSelection(codeInputCategory, codeInputChoice);
        // Expected output
        String expectedOutput = "2, You selected: Pizza";

        try {
            assertEquals("Food-Pizza test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testDrinkCoffee() {
        // Code input
        int codeInputCategory = 1;
        int codeInputChoice = 2;
        // Execution / code output
        NestedSwitch nestedSwitch = new NestedSwitch();
        String codeOutput = nestedSwitch.getSelection(codeInputCategory, codeInputChoice);
        // Expected output
        String expectedOutput = "1, You selected: Coffee";

        try {
            assertEquals("Drink-Coffee test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testInvalidChoice() {
        // Code input
        int codeInputCategory = 2;
        int codeInputChoice = 5;
        // Execution / code output
        NestedSwitch nestedSwitch = new NestedSwitch();
        String codeOutput = nestedSwitch.getSelection(codeInputCategory, codeInputChoice);
        // Expected output
        String expectedOutput = "2, Invalid food choice";

        try {
            assertEquals("Invalid food choice test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testInvalidCategory() {
        // Code input
        int codeInputCategory = 3;
        int codeInputChoice = 1;
        // Execution / code output
        NestedSwitch nestedSwitch = new NestedSwitch();
        String codeOutput = nestedSwitch.getSelection(codeInputCategory, codeInputChoice);
        // Expected output
        String expectedOutput = "3, Invalid category";

        try {
            assertEquals("Invalid category test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}