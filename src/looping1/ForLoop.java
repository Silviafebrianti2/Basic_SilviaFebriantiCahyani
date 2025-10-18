package looping1;

public class ForLoop {

    public int getNumbersAndSum(int max) {
        int sum = 0;

        for (int i = 1; i <= max; i++) {
            sum += i;
        }

        return sum;
    }
}
