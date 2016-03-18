package onlyMySpringIdea.config;

import onlyMySpringIdea.api.Home;
import onlyMySpringIdea.implementation.HomeImpl;
import onlyMySpringIdea.implementation.Wall;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pawel on 18.03.16.
 */
@Configuration
@ComponentScan("onlyMySpringIdea")
public class HomeConfig {


    @Bean
    public HomeImpl homeImpl() {
        HomeImpl home = new HomeImpl();
        home.setWall(wall());
        return home;
    }


    @Bean
    public Wall wall() {
        return new Wall();
    }


}
