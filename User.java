import java.util.ArrayList;
/**
 *
 * @author 56130
 */

public class User {

    private final int id;
    private final String firstName;
    private final String lastName;
    private final int age;
    private String profession;
    private ArrayList<User> children;

    public User(int id, String firstName, String lastName, int age, ArrayList<User> children) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.children = children;
        //this.profession = profession;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public static void main(String[]args){
    }
}