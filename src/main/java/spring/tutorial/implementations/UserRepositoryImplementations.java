package spring.tutorial.implementations;

import spring.tutorial.api.Logger;
import spring.tutorial.api.UsersRepository;
import spring.tutorial.domain.User;

/**
 * Created by pawel on 07.03.16.
 */
public class UserRepositoryImplementations  implements UsersRepository{
    private Logger logger;
    private String localization;

    public UserRepositoryImplementations(Logger logger, String localization) {
        this.logger = logger;
        this.localization = localization;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public User createUser(String name) {
        logger.log("Tworzenie użytkownika " + name);
        return new User(name);

    }


}
