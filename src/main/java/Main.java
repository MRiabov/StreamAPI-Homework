import user.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users =new ArrayList<>();
        for (int i = 0; i < 10; i++) users.add(new User("Name"+i,i*8));
        List<User> sorted = users.stream()
                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
                .limit(3)
                .toList();
        for (User user : sorted) System.out.println(user);
    }

}
