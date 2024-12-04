package U5T7_StaticMethods2;

public class Utility {
    private Utility() { }

    // checks if a value is even or not
    public static boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // checks if a value is divisible by 3
    public static boolean isDivisibleBy3(int x) {
        if (x % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // checks if a value is a perfect square or not
    public static boolean isPerfectSquare(int x) {
        double base = Math.sqrt(x);
        if (!checkDecimal(base)) {
            return true;
        } else {
            return false;
        }
    }

    // A
    // checks a value for decimals
    private static boolean checkDecimal(double x) {
        if (x == (int)x) {
            return false;
        } else {
            return true;
        }
    }
}
