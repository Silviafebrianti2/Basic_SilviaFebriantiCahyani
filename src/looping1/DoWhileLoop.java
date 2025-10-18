package looping1;

public class DoWhileLoop {

    public int getOddNumbersAndSum(int max) {
        int i = 1;
        int sum = 0;

        // Pastikan loop hanya berjalan jika max > 0
        if (max > 0) {
            do {
                if (i % 2 != 0) { // jika ganjil
                    sum += i;
                }
                i++;
            } while (i <= max);
        }

        return sum;
    }
}
