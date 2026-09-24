public class SumOfDigits {
    public static int sumOfDigitsRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigitsRecursive(n / 10);
    }

    public static int sumOfDigitsIterative(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) { int number = 1234567890; 
         //measure the time for the recursive method 
         long startTime = System.nanoTime(); 
         int recursiveResult = sumOfDigitsRecursive(number); 
         long recursiveTime = System.nanoTime() - startTime; 
         
         // measure the time for the iterative method 
         startTime = System.nanoTime(); 
         int iterativeResult = sumOfDigitsIterative(number); 
         long iterativeTime = System.nanoTime() - startTime; 
         // print the results 
         System.out.println("The sum of digits of " + number + " (recursive) is " + recursiveResult); 
         System.out.println("Time taken by recursive method: " + recursiveTime + " nanoseconds"); 
         System.out.println("The sum of digits of " + number + " (iterative) is " + iterativeResult); System.out.println("Time taken by iterative method: " + iterativeTime + " nanoseconds"); }
}
