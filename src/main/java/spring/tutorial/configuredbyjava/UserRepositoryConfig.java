package spring.tutorial.configuredbyjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import spring.tutorial.api.Logger;
import spring.tutorial.api.UsersRepository;
import spring.tutorial.implementations.LoggerImpl;
import spring.tutorial.implementations.UserRepositoryImpl;

/**
 * Created by pawel on 11.03.16.
 */
@Configuration
@ComponentScan("spring.tutorial")
public class UserRepositoryConfig {
    @Bean
    @Scope("singleton")
    public Logger logger() {
        return new LoggerImpl();
    }

    @Bean(initMethod = "postConstruct")
    public UsersRepository userRepository()
    {
        UsersRepository userRepository = new UserRepositoryImpl();
        userRepository.setLogger(logger());
        return new UserRepositoryImpl();
    }



}
