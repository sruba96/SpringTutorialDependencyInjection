package spring.tutorial.api;

/**
 * Created by pawel on 07.03.16.
 */
public interface Logger {
    void log(String message);
    void setName(String name);
    void setVersion(int version);
}
