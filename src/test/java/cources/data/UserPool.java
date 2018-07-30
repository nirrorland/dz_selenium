package cources.data;

import java.util.List;

public class UserPool {
    private List<User> users;

    private UserPool() {
        users.add(new User("login1", "pass1"));
        users.add(new User("login2", "pass2"));
    }

    public static final UserPool instance = new UserPool();
}
