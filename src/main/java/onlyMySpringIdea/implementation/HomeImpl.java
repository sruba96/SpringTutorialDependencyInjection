package onlyMySpringIdea.implementation;

import onlyMySpringIdea.api.Home;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by pawel on 18.03.16.
 */
@Service
public class HomeImpl implements Home {

    private int walls;
    private int windows;
    private int floors;

    private double wallPrize;
    private double windowPrize;
    private double floorPrize;
    private Double cost;


    public void showHome() {
        System.out.println("This home have :" + walls +
                " walls, " + windows + " windows and " + floors + " floors.");
    }

    public void showPrize() {
        if (this.cost != null)
            System.out.println("Cost this build is " + cost + ".");
        else
            System.out.println("Cost is unknown.");

    }

    public boolean reCountPrize() {

        try {

            Double cost = getFloorPrize() * getFloors();
            cost += getWallPrize() * getWalls();
            cost += getWindowPrize() * getWindows();
            this.cost = cost;

        } catch (NullPointerException nullExeption) {
            System.out.println("Lack of information about build");
            return false;
        }
        return true;

    }

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getWallPrize() {
        return wallPrize;
    }

    public void setWallPrize(double wallPrize) {
        this.wallPrize = wallPrize;
    }

    public double getWindowPrize() {
        return windowPrize;
    }

    public void setWindowPrize(double windowPrize) {
        this.windowPrize = windowPrize;
    }

    public double getFloorPrize() {
        return floorPrize;
    }

    public void setFloorPrize(double floorPrize) {
        this.floorPrize = floorPrize;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
