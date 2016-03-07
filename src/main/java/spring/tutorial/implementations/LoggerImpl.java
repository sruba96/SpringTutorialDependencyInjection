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
    public void log(String message) {
        System.out.println(new Date() + ": " + message);
    }
}
