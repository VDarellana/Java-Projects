public class UserAccount {
    private int userId;
    private static int instanceCount;
    private final String username;

    public UserAccount(String username) {
        this.username = username;
        instanceCount++;
        this.userId = instanceCount;
    }
    public static int getInstanceCount() {
        return instanceCount;
    }
    public int getUserId() {
        return userId;
    }
    public String getUsername() {
        return username;
    }
}
