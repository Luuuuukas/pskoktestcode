import java.util.ArrayList;
public class User {

    private final int id;
    private final String firstUserName;
    private final String lastUserName;
    private final int age;
    private ArrayList<User> children;

    public User(int id, String firstName, String lastName, int age) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
    }
    
    public static void main(String[]args){
    }

    public String getLastName() {
        return lastName;
    }
    
}
