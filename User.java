import java.util.ArrayList;
public class User {

    private final int id ;
    private final String firstName; //454
    private final String lastName;
    private final int age;
    private ArrayList<User> children;

    public User(int id, String firstName, String lastName, int age) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;

    }

    public String getLastName() {
        return lastName;
    }
}
