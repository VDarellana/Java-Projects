public class SimpleDivision {
    
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
            return 0; // Returns the requested default value
        } finally {
            System.out.println("Division operation is complete");
        }
    }

    public static void main(String[] args) {
        int result1 = SimpleDivision.divide(10, 2);
        System.out.println("Result: " + result1);

        int result2 = SimpleDivision.divide(10, 0); // Triggers ArithmeticException
        System.out.println("Result: " + result2);

        int result3 = SimpleDivision.divide(10, 5);
        System.out.println("Result: " + result3);
    }
}
