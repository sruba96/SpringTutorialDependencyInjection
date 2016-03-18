package onlyMySpringIdea.implementation;

import onlyMySpringIdea.api.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pawel on 18.03.16.
 */
@Component
public class HomeImpl implements Home {

    private Wall wall;


    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public void showHome() {
        System.out.println("wall = " + wall);
        wall.show();
    }
}
