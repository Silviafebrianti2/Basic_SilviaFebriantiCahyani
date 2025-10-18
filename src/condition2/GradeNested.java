package condition2;

public class GradeNested {

    public String getGradeInfo(String subject, int score) {
        String grade;

        if (subject.equalsIgnoreCase("Math")) {
            // Logika untuk pelajaran Math
            if (score >= 90) {
                grade = "A";
            } else if (score >= 75) {
                grade = "B";
            } else {
                grade = "C";
            }
            return "Subject: Math, Grade: " + grade;

        } else if (subject.equalsIgnoreCase("English")) {
            // Logika untuk pelajaran English
            if (score >= 85) {
                grade = "A";
            } else if (score >= 70) {
                grade = "B";
            } else {
                grade = "C";
            }
            return "Subject: English, Grade: " + grade;

        } else {
            // Jika mata pelajaran tidak dikenali
            return "Subject: Unknown, Grade: N/A";
        }
    }
}
