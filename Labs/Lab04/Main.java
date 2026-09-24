import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    // create a new game character
    ArrayList<String> inventory = new ArrayList<>();
    inventory.add("Branch");
    GameCharacter character = new GameCharacter("Link", 1, 3, inventory);
    // display the original character details
    System.out.println("Original Character: " + character);
    // save the character to a file
    String filename = "gameCharacter.ser";
    GameCharacter.saveToFile(character, filename);
    System.out.println("Character saved to file: " + filename);
    // load the character from the file
    GameCharacter loadedCharacter = GameCharacter.loadFromFile(filename);
    // display the loaded character details
    System.out.println("Loaded Character: " + loadedCharacter);
}
}