package condition1;

public class Grade {

    public String getGrade(int score) {
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 75) {
            grade = "B";
        } else if (score >= 60) {
            grade = "C";
        } else if (score >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        return "Grade: " + grade;
    }
}
