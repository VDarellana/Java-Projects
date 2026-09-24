public class MathUtilities {
    private static final double pi = 3.14159;

    public static int gcd(int a, int b) {
        while(b != 0) {
            int r = b;
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static double power(double base, int exponent) {
        double result = 1.0;
        for(int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static double calculateCircleArea(double radius) {
        return pi * power(radius, 2);
    }

    public static int factorial(int n){
        if(n < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
