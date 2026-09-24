package Lab02;
import java.util.ArrayList;
public class GameCharacter {
    private int health = 60;
    private ArrayList<String> inventory = new ArrayList<>();

    public GameCharacter() {
        inventory.add("Potion");
        inventory.add("ThrowingStar");
    }

    public void attack() throws HealthDepletionException {
        health -= 10;
        if (this.health <= 0) {
            throw new HealthDepletionException("Character's health has depleted!");
        } else{
            System.out.println("Character attacks! Health is now: " + this.health);
        }
    
    }
    
    public void useItem(String item) throws ItemNotFoundException {
        // .remove() returns true if the item was found and successfully removed
        if (this.inventory.remove(item)) {
            System.out.println("Character used: " + item);
        } else {
            throw new ItemNotFoundException("Item not found in character's inventory!");
        }
    }

}

