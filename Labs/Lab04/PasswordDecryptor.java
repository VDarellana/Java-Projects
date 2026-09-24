import java.io.FileInputStream;
import java.io.IOException;

public class PasswordDecryptor {
    public static void main(String[] args) {
        StringBuilder password = new StringBuilder();
        
        // Open the file using FileInputStream as requested
        try (FileInputStream fis = new FileInputStream("ToP_SeCReT_PassWorD.txt")) {
            int content;
            
            // Read the file byte by byte
            while ((content = fis.read()) != -1) {
                char character = (char) content;
                
                // Hint check: Determine if the character is alphabetical
                if (Character.isLetter(character)) {
                    password.append(character);
                }
            }
            
            // Output the final cleaned password
            System.out.println("The secret password is: " + password.toString());
            
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}