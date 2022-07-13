import user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<User> users =new ArrayList<>();
        for (int i = 0; i < 10; i++) users.add(new User("Name"+i,i*8));
        Optional<User> endsWith3= users.stream()
                .filter(o->o.getName().endsWith("3"))
                .findFirst();
        endsWith3.ifPresentOrElse(System.out::println,() -> System.out.println("404"));
    }
}
