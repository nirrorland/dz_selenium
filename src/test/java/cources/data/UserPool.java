package cources.data;

import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserPool {
    private List<User> users =  new CopyOnWriteArrayList<User>();

    private UserPool() {
        users.add(new User("login2@yandex.ru", "pass2"));
        users.add(new User("login3@mail.ru", "pass32"));

    }

    public synchronized User pollUser(){
        if(users.size() == 0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return pollUser();
        }
        User user = users.get(users.size()-1);
        users.remove(user);
        return user;
    }

    public synchronized void releaseUser(User user){
        users.add(user);
    }

    public static final UserPool instance = new UserPool();
}
