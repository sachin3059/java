package in.inversionOFcontrol;

public class UserMangaer {
    private UserDataProvider userDataProvider;

    UserMangaer(UserDataProvider userDataProvider){
        this.userDataProvider = userDataProvider;
    }

    public String getInfo(){
        return userDataProvider.getDetails();
    }
}
