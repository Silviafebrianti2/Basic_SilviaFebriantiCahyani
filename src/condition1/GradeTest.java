package condition1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Note for students:
 * - Please implement using if-else statement.
 */
public class GradeTest {

    @Test
    public void testGradeA_Boundary() {
        // Code input
        int codeInputScore = 90; // lower limit A Grade
        // Execution / code output
        Grade grade = new Grade();
        String codeOutput = grade.getGrade(codeInputScore);
        // Expected output
        String expectedOutput = "Grade: A";

        try {
            assertEquals("Grade A (90)", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testGradeB_Boundary() {
        // Code input
        int codeInputScore = 89; // upper limit B Grade
        // Execution / code output
        Grade grade = new Grade();
        String codeOutput = grade.getGrade(codeInputScore);
        // Expected output
        String expectedOutput = "Grade: B";

        try {
            assertEquals("Grade B (89)", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testGradeC_Boundary() {
        // Code input
        int codeInputScore = 74; // upper limit C Grade
        // Execution / code output
        Grade grade = new Grade();
        String codeOutput = grade.getGrade(codeInputScore);
        // Expected output
        String expectedOutput = "Grade: C";

        try {
            assertEquals("Grade C (74)", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testGradeF_Boundary() {
        // Code input
        int codeInputScore = 59; // upper limit F Grade
        // Execution / code output
        Grade grade = new Grade();
        String codeOutput = grade.getGrade(codeInputScore);
        // Expected output
        String expectedOutput = "Grade: F";

        try {
            assertEquals("Grade F (59)", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}