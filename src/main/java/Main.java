import user.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users =new ArrayList<>();
        for (int i = 0; i < 10; i++) users.add(new User("Name"+i,i*8));
        users.stream()
            .sorted((o1,o2)->String.CASE_INSENSITIVE_ORDER.compare(o1.getName(),o2.getName()))
            .filter((user -> user.getAge()>40))
            .limit(3)
            .map(User::getName)
            .forEach(System.out::println);
    }
}
