import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PalindromeCounter {
     public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        String filenName = "potentialPalindromes.txt";
        int palindromeCount = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(filenName))){
            String line;
            while((line = br.readLine()) != null){
                if(isPalindrome(line)){
                    palindromeCount++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of palindromes found: " + palindromeCount);
    }
}
