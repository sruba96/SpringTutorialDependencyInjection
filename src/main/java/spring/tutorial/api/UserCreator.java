package spring.tutorial.api;

import spring.tutorial.domain.User;

/**
 * Created by pawel on 07.03.16.
 */
public class UserCreator {

    public User createUser(String name) {
        return new User(name);
    }
}
