
public class UtilityMethods {

    // method to find the maximum of two numbers
    public int findMax(int a, int b) {
        return a > b ? a : b;
    }

    // method to reverse a string
    public String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    // method to check if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // method to find the factorial of a number
    public int factorial(int number) {
        if (number == 0) return 1;
        return number * factorial(number - 1);
    }

    // method to find the sum of elements in an array
    public int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // method to find the largest element in an array
    public int findLargest(int[] array) {
        int largest = array[0];
        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    // method to check if a string is a palindrome
    public boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // method to sort an array in ascending order
    public int[] sortArray(int[] array) {
        int[] sortedArray = array.clone();
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - 1 - i; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        return sortedArray;
    }
}
