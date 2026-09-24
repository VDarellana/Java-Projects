package Lab02;

public class AdventureGame {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();
        try {
            character.attack();
            character.attack();
            character.attack();
            character.attack();
            character.attack();
            character.attack(); // this should trigger a HealthDepletionException
            character.useItem("Branch"); // this should trigger a ItemNotFoundException
        } catch (HealthDepletionException | ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
} 
