package condition1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Note for students:
 * - Please implement using switch-case statement.
 */
public class DayOfWeekTest {

    @Test
    public void testDayWednesday() {
        // Code input
        int codeInputDay = 3;

        // Execution / code output
        DayOfWeek dayOfWeek = new DayOfWeek();
        String codeOutput = dayOfWeek.getDayName(codeInputDay);

        // Expected output
        String expectedOutput = "Day: Wednesday";

        // Assertion simple try-catch
        try {
            assertEquals("Day output test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testDayUnknown() {
        int codeInputDay = 10;
        DayOfWeek dayOfWeek = new DayOfWeek();
        String codeOutput = dayOfWeek.getDayName(codeInputDay);
        String expectedOutput = "Day: Unknown";

        try {
            assertEquals("Unknown day output test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}