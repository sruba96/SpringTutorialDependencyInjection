package spring.tutorial;

import com.sun.glass.ui.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.tutorial.api.Logger;
import spring.tutorial.api.UsersRepository;
import spring.tutorial.domain.User;
import spring.tutorial.implementations.LoggerImpl;
import spring.tutorial.implementations.UserRepositoryImplementations;

/**
 * Created by pawel on 07.03.16.
 */
public class Main {

    public static void main(String[] args) {

       ApplicationContext context =
               new ClassPathXmlApplicationContext("configuration/config.xml");

        UsersRepository usersRepository =
        context.getBean("myUserRepository", UsersRepository.class);

        User janek = usersRepository.createUser("Janek");

    }
}
