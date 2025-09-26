package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // java based approach:

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);







//        spring xml based
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // this lines create a container and also creates the object of all the class mentioned in the bean in spring.xml file
//        Alien obj = (Alien)context.getBean("alien"); // got the referenece of the objec.
//        obj.code();
//        System.out.println(obj.getAge());
    }
}
