package edu.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        MyBean myBean = (MyBean) context.getBean("myBean");
        System.out.println(myBean);

        myBean.setMessage("hello");;
        myBean.showMessage();
        System.out.println(myBean);
    }
}
