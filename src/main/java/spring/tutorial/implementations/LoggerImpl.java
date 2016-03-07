package spring.tutorial.implementations;

import spring.tutorial.api.Logger;

import java.util.Date;

/**
 * Created by pawel on 07.03.16.
 */

/**
 * Display date + message in format "Date : message"
 */
public class LoggerImpl implements Logger {
    private String name;
    private int version;



    public void setName(String name) {
        this.name = name;
    }

    public void log(String message) {
        System.out.println(new Date() + ": " + name + " - " + message +
                ". Version: " + version);
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
