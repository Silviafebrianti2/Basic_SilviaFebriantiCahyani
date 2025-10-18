package array2;

public class Array2D {

    public String getMatrixInfo(int[][] matrix) {
        StringBuilder result = new StringBuilder();
        int total = 0;
        int count = 0;

        // Loop setiap baris
        for (int i = 0; i < matrix.length; i++) {
            result.append("Row ").append(i + 1).append(": ");
            for (int j = 0; j < matrix[i].length; j++) {
                int value = matrix[i][j];
                total += value;
                count++;

                // Tambahkan O untuk ganjil, E untuk genap
                if (value % 2 == 0) {
                    result.append(value).append("E ");
                } else {
                    result.append(value).append("O ");
                }
            }
            result.append("\n");
        }

        double average = (double) total / count;

        result.append("Total: ").append(total).append("\n");
        result.append("Average: ").append(average);

        return result.toString();
    }
}
