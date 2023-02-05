import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private  int id ;
    private String firstName; //454
    private String lastName;
    private int age;
    private String profession;
    private ArrayList<User> children;

    private int savijauta;
    public User() {
    }

    public User(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setChildren(ArrayList<User> children) {
        this.children = children;
    }

    public void setSavijauta(int savijauta) {
        this.savijauta = savijauta;
    }

    public static void main(String[] args) {

        String tekstas = null;
        User test = new User();
        User test2 = new User();

        test2.setFirstName("Jumbo");

        test.setChildren(test2.children);

        //new ArrayList<User>();

        //test.setChildren(test2);

        Scanner sc = new Scanner(System.in);

        System.out.println("Laba diena, kaip jums sekasi? Kas naujo? \n Įvertinkite šios dienos savijautą nuo 1 iki 10");

        test.savijauta = sc.nextInt();

        System.out.println("Iveskite vardą, pavardę, amžių (skaičiais) ir profesiją");

        test.firstName = sc.next();
        test.lastName = sc.next();
        test.age = sc.nextInt();
        test.profession = sc.next();

        System.out.println("Jūsų šios dienos savijauta: " + test.getSavijauta() + ", " +test.getFirstName() + ", " + test.getLastName() + ", " + test.getAge() + ", " + test.getProfession());

        tekstas = test.getChildName(test);

        System.out.println("Metodo tekstas: " + tekstas + ", Jūsų šios dienos savijauta: " + test.getSavijauta() + ", " +test.getFirstName() + ", " + test.getLastName() + ", " + test.getAge() + ", " + test.getProfession());

    }

    public String getChildName(User child) {
        //if (!this.children.contains(child)) {
           // new Exception("Invalid argument!");
       // } else {
            String name = null;
            if (child.getFirstName() != null) {
                name = child.getFirstName();
            }
            if (name == "Harry") {
                name.replace('r', 'p');
            }
        //    if (name != null || name.length() > 0) {
        //        name.concat(child.getLastName());
       //     }
      //  }
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public ArrayList<User> getChildren() {
        return children;
    }

    public int getSavijauta() {
        return savijauta;
    }


}
