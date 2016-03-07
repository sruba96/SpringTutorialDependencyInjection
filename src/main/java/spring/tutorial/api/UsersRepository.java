package spring.tutorial.api;

import spring.tutorial.domain.User;

/**
 * Created by pawel on 07.03.16.
 */
public interface UsersRepository {
    User createUser(String name);
    void setLogger(Logger logger);
}
