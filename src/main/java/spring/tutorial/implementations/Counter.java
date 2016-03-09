package spring.tutorial.implementations;

/**
 * Created by pawel on 09.03.16.
 */
public class Counter {
    private int counter;

    public int getCounter()
    {
        return counter++;
    }
}
