package in.inversionOFcontrol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application.dataprovider.xml");
        UserDataProvider webService = (UserDataProvider) context.getBean("webServiceProvider");
        UserDataProvider appService = (UserDataProvider) context.getBean("appServiceProvider");
        UserDataProvider flutterService = (UserDataProvider) context.getBean("flutterServiceProvider");

        UserMangaer userManager1 = (UserMangaer) context.getBean("userManager1");
        System.out.println(userManager1.getInfo());

        UserMangaer userManager2 = (UserMangaer) context.getBean("userManager2");
        System.out.println(userManager2.getInfo());

        UserMangaer userManager3 = (UserMangaer) context.getBean("userManager3");
        System.out.println(userManager3.getInfo());
    }
}
