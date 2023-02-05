import java.util.ArrayList;
public class User {
    private final int id;
    private final String firstUserName;
    private final String lastUserName;
    private final int age;
    private ArrayList<User> children;

    public User(int id, String firstUserName, String lastUserName, int age) {
        this.id = id;
        this.firstUserName = firstUserName;
        this.lastUserName = lastUserName;
        this.age = age;
    }

    public static void main(String[]args){
    }

    public String getLastName() {
        return lastUserName;
    }

}
