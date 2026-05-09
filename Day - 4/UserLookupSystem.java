import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class User {

    int id;
    String name;

    User(int id, String name) {

        this.id = id;
        this.name = name;
    }
}

public class UserLookupSystem {

   
    static List<User> users = new ArrayList<>();

    static Optional<User> findUserById(int id) {

        for (User u : users) {

            if (u.id == id) {

                return Optional.of(u);
            }
        }

        return Optional.empty();
    }

    public static void main(String[] args) {

       
        users.add(new User(1, "Revanth"));

        users.add(new User(2, "Rahul"));

        
        Optional<User> result = findUserById(1);

        
        result.ifPresent(
                user -> System.out.println(
                        "User Found: " + user.name
                )
        );

        
        Optional<User> result2 = findUserById(10);

        System.out.println(result2.map(user -> user.name).orElse("User Not Found")
        );
    }
}