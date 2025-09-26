package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // this lines create a container and also creates the object of all the class mentioned in the bean in spring.xml file
        Alien obj = (Alien)context.getBean("alien"); // got the referenece of the objec.
        obj.code();
    }
}
