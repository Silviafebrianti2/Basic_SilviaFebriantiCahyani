package looping2;

public class WhileLoopNested {

    public String getTriangle(int n) {
        int i = 1;
        String result = "";

        while (i <= n) {
            int j = 1;
            while (j <= i) {
                result += "*";
                j++;
            }

            // Tambahkan newline kecuali di baris terakhir
            if (i < n) {
                result += "\n";
            }

            i++;
        }

        return result;
    }
}
