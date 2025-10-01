package in.inversionOFcontrol;

public class Main {
    public static void main(String[] args) {
        UserDataProvider webService = new WebServiceDatabaseProvider();
        UserDataProvider appService = new AppServiceDatabaseProvider();
        UserDataProvider flutterService = new FlutterServiceDatabaseProvider();

        UserMangaer userMangaer = new UserMangaer(webService);
        System.out.println(userMangaer.getInfo());

        UserMangaer userMangaer1 = new UserMangaer(appService);
        System.out.println(userMangaer1.getInfo());

        UserMangaer userMangaer2 = new UserMangaer(flutterService);
        System.out.println(userMangaer2.getInfo());
    }
}
