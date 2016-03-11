package spring.tutorial.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.tutorial.api.Logger;
import spring.tutorial.api.UsersRepository;
import spring.tutorial.domain.User;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by pawel on 07.03.16.
 */
@Service("userRepository")
public class UserRepositoryImpl implements UsersRepository{
    @Autowired
    private Logger logger;
    private String localization;



    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public User createUser(String name) {
        logger.log("Tworzenie użytkownika " + name);
        return new User(name);
    }

    @PostConstruct
    public void postConstruct()
    {
        logger.log("Post Construct");
    }

    @PreDestroy
    public void preDestroy()
    {
        logger.log("Pre destroy");
    }

}
