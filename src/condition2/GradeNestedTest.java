package condition2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Note for students:
 * - Please implement using if-else statement.
 */

public class GradeNestedTest {

    // Math boundaries
    @Test
    public void testMath_GradeA() {
        // Code input
        String codeInputSubject = "Math";
        int codeInputScore = 90; // lower limit A Grade
        // Execution / code output
        GradeNested gradeNested = new GradeNested();
        String codeOutput = gradeNested.getGradeInfo(codeInputSubject, codeInputScore);
        // Expected output
        String expectedOutput = "Subject: Math, Grade: A";
        try {
            assertEquals("Math Grade A boundary test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testMath_GradeB() {
        // Code input
        String codeInputSubject = "Math";
        int codeInputScore = 89; // upper limit B Grade
        // Execution / code output
        GradeNested gradeNested = new GradeNested();
        String codeOutput = gradeNested.getGradeInfo(codeInputSubject, codeInputScore);
        // Expected output
        String expectedOutput = "Subject: Math, Grade: B";
        try {
            assertEquals("Math Grade B boundary test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testMath_GradeC() {
        // Code input
        String codeInputSubject = "Math";
        int codeInputScore = 74; // upper limit C Grade
        // Execution / code output
        GradeNested gradeNested = new GradeNested();
        String codeOutput = gradeNested.getGradeInfo(codeInputSubject, codeInputScore);
        // Expected output
        String expectedOutput = "Subject: Math, Grade: C";
        try {
            assertEquals("Math Grade C boundary test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    // English boundaries
    @Test
    public void testEnglish_GradeA() {
        // Code input
        String codeInputSubject = "English";
        int codeInputScore = 85; // lower limit A Grade
        // Execution / code output
        GradeNested gradeNested = new GradeNested();
        String codeOutput = gradeNested.getGradeInfo(codeInputSubject, codeInputScore);
        // Expected output
        String expectedOutput = "Subject: English, Grade: A";
        try {
            assertEquals("English Grade A boundary test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testEnglish_GradeB() {
        // Code input
        String codeInputSubject = "English";
        int codeInputScore = 84; // upper limit B Grade
        // Execution / code output
        GradeNested gradeNested = new GradeNested();
        String codeOutput = gradeNested.getGradeInfo(codeInputSubject, codeInputScore);
        // Expected output
        String expectedOutput = "Subject: English, Grade: B";
        try {
            assertEquals("English Grade B boundary test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testEnglish_GradeC() {
        // Code input
        String codeInputSubject = "English";
        int codeInputScore = 69; // upper limit C Grade
        // Execution / code output
        GradeNested gradeNested = new GradeNested();
        String codeOutput = gradeNested.getGradeInfo(codeInputSubject, codeInputScore);
        // Expected output
        String expectedOutput = "Subject: English, Grade: C";
        try {
            assertEquals("English Grade C boundary test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    // Unknown subject
    @Test
    public void testUnknownSubject() {
        // Code input
        String codeInputSubject = "History"; // subject not in Math/English
        int codeInputScore = 80;
        // Execution / code output
        GradeNested gradeNested = new GradeNested();
        String codeOutput = gradeNested.getGradeInfo(codeInputSubject, codeInputScore);
        // Expected output
        String expectedOutput = "Subject: Unknown, Grade: N/A";
        try {
            assertEquals("Unknown subject test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}