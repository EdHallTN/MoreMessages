import java.util.ArrayList;

/**
 * Created by EdHall on 9/21/16.
 */
public class User {
    String name;
    String pass;
    ArrayList<Message> messages = new ArrayList<>();

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }
}

