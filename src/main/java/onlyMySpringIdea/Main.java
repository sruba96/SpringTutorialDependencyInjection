package onlyMySpringIdea;

import onlyMySpringIdea.api.Home;
import onlyMySpringIdea.config.HomeConfig;
import onlyMySpringIdea.implementation.HomeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pawel on 18.03.16.
 */
public class Main {

    @Autowired
    private Home home1;

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(HomeConfig.class);

        HomeImpl home = context.getBean("homeImpl" , HomeImpl.class);

        home.showHome();



    }

}
