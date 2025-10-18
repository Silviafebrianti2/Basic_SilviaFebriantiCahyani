package looping2;

public class ForLoopNested {

    public String getGrid(int max) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                result.append("Row ").append(i).append(" Col ").append(j);
                // Tambahkan newline jika bukan data terakhir
                if (!(i == max && j == max)) {
                    result.append("\n");
                }
            }
        }

        return result.toString();
    }
}
