package operator;

public class Number {

    public String getOperatorResults(int a, int b) {
        int sum = a + b;
        int product = a * b;
        boolean isEqual = (a == b);
        boolean logicalAnd = (a > 0 && b > 0);
        boolean logicalOr = (a < 0 || b > 0);

        String result = "Sum: " + sum + "\n"
                + "Product: " + product + "\n"
                + "Is Equal: " + isEqual + "\n"
                + "Logical AND: " + logicalAnd + "\n"
                + "Logical OR: " + logicalOr;

        return result;
    }
}
