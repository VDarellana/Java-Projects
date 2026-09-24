public class AgeVerification {
    private String name;
    private int age;
    public AgeVerification(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void verifyAge(int requiredAge)throws UnderageException{
        if (age >= requiredAge){
            System.out.println("You pass the age Requirement");
        }
        throw new UnderageException("The age requirement is not met");
    }

    public static void main(String[] args) {
        AgeVerification person1 = new AgeVerification("Pedro",10);
        try {
            person1.verifyAge(18);
        } catch (UnderageException e) {
            System.out.println(e);
        }
        try {
            AgeVerification person2 = new AgeVerification("Gerardo", 20);
            person2.verifyAge(16);
        } catch (UnderageException e) {
            System.out.println(e);
        }
    }
}
