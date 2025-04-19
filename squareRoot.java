public class squareRoot {
    public static double sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("Cannot find square root of negative number.");
        }
        return Math.sqrt(a);
    }
}
