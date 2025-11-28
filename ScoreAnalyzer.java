
public class ScoreAnalyzer {

    public String classifyResult(int[] scores) {

        // Hitung total hanya untuk nilai valid
        int total = 0;
        int count = scores.length; // sesuai TestCase: tetap dibagi seluruh elemen, termasuk invalid

        for (int score : scores) {
            if (score >= 0 && score <= 100) { 
                total += score;
            }
        }

        // Hitung rata-rata
        double average = (double) total / count;

        // Klasifikasi
        if (average >= 85) {
            return "Excellent";
        } else if (average >= 70) {
            return "Good";
        } else if (average >= 55) {
            return "Fair";
        } else {
            return "Poor";
        }
    }
}
