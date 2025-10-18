package function2;

public class Factorial {

    public int factorial(int n) {
        int result = 1;
        int i = 1;

        // Gunakan perulangan do-while agar sesuai standar praktikum
        if (n > 0) {
            do {
                result *= i;
                i++;
            } while (i <= n);
        }

        return result;
    }
}
