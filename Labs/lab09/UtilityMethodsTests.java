import java.util.Arrays;

public class UtilityMethodsTests {

    static int passCount = 0;
    static int failCount = 0;
    static UtilityMethods util = new UtilityMethods();

    public static void main(String[] args) {
        if(util.findMax(3,5) == 5){
            System.out.println("Find Max Passed");
            passCount++;
        }
        if (util.reverseString("hello").equals("olleh")){
            System.out.println("Reverse String Passed");
            passCount++;
        }else{
            System.out.println("Failed");
            failCount++;
        }
        if (util.isPrime(7 ) == true){
            System.out.println("Is Prime passed");
            passCount++;
        }else{
            System.out.println("Failed");
            failCount++;
        }
        if(util.factorial(5) == 120){
            System.out.println("factorial Passed");
            passCount++;
        }else{
            System.out.println("Failed");
            failCount++;
        }
        if(util.sumArray(new int[]{5,4,7}) == 16){
            System.out.println("Sum Array Passed");
            passCount++;
        }else{
            System.out.println("Failed");
            failCount++;
        }
        if(util.findLargest(new int[]{10,5,100}) == 100){
            System.out.println("Find Largest Passed");
            passCount++;
        }else{
            System.out.println("Failed");
            failCount++;
        }
        if(util.isPalindrome("racecar") == true){
            System.out.println("Is palidrome Passed");
            passCount++;
        }else{
            System.out.println("Failed");
            failCount++;
        }

        if(Arrays.equals(util.sortArray(new int[] {5,6,2,8}), new int[]{2,5,6,8})){
            System.out.println("Find Max Passed");
            passCount++;
        }else{
            System.out.println("Failed");
            failCount++;
        }

        System.out.println("tests Passed: " + passCount);
        System.out.println("TestsFailed: " + failCount);
    }

}