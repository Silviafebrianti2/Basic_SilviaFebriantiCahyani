package looping2;

public class DoWhileLoopNested {

    public String getNumberTriangle(int n) {
        StringBuilder result = new StringBuilder();
        int i = 1;

        // Loop baris (do-while luar)
        do {
            int j = 1;
            // Loop kolom (do-while dalam)
            do {
                result.append(j);
                j++;
            } while (j <= i);

            // Tambahkan newline kecuali di baris terakhir
            if (i < n) {
                result.append("\n");
            }

            i++;
        } while (i <= n);

        return result.toString();
    }
}
