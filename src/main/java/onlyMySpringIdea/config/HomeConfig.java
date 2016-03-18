package onlyMySpringIdea.config;

import onlyMySpringIdea.api.Home;
import onlyMySpringIdea.implementation.HomeImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pawel on 18.03.16.
 */
@Configuration
@ComponentScan
public class HomeConfig {

    @Bean(name = "ThisBean")
    public HomeImpl homeImpl()
    {
        Home home = new HomeImpl();
        return new HomeImpl();
    }
}
