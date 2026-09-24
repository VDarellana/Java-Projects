import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class GameCharacter implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int health;
    private int level;
    private ArrayList<String> inventory;

    public GameCharacter(String name, int health, int level, ArrayList<String> inventory) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.inventory = inventory;
    }
    @Override
    public String toString(){
        return "Name= " + name + ", Level= " + level + ", Health= " + health + ", Inventory= " + inventory;
    }

    public static void saveToFile(GameCharacter character, String filename) {
        try{
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(character);
            System.out.println("Character saved to file: " + filename);
        
        
        
        } catch (IOException e) {
            System.out.println("Error saving character to file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static GameCharacter loadFromFile(String filename) {
        GameCharacter character = null;
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            character = (GameCharacter) in.readObject();
            System.out.println("Character loaded from file: " + filename);
        } catch (IOException e) {
            System.out.println("I/O Error loading character from file: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class definition not found: " + e.getMessage());
            e.printStackTrace();
        }
        return character;
    }
    

}
