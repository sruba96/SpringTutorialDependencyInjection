package spring.tutorial;

import com.sun.glass.ui.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.tutorial.api.Logger;
import spring.tutorial.api.UserCreator;
import spring.tutorial.api.UsersRepository;
import spring.tutorial.domain.User;
import spring.tutorial.implementations.LoggerImpl;
import spring.tutorial.implementations.UserRepositoryImplementations;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by pawel on 07.03.16.
 */
public class Main {

    public static void main(String[] args) {

       ApplicationContext context =
               new ClassPathXmlApplicationContext("configuration/config.xml");

        UsersRepository usersRepository =
        context.getBean("myUserRepository", UsersRepository.class);

        User janek = usersRepository.createUser("Janek");


//        Locale locale = Locale.getDefault();
//        Calendar calendar = GregorianCalendar.getInstance(locale);
//
//        DateFormat dateFormatter = SimpleDateFormat.getDateInstance();
        GregorianCalendar calendar = context.getBean("calendar" , GregorianCalendar.class);
        DateFormat dateFormatter = context.getBean("formatter" , SimpleDateFormat.class);
        System.out.println(dateFormatter.format(calendar.getTime()));


        User user = context.getBean("someUser" , User.class);
        System.out.println(user.toString());



    }
}
