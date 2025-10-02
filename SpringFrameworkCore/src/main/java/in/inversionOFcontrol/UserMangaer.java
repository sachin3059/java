package in.inversionOFcontrol;

public class UserMangaer {
    private UserDataProvider userDataProvider;

    public void setUserDataProvider(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getInfo(){
        return userDataProvider.getDetails();
    }
}
