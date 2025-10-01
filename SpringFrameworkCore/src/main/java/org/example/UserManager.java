package org.example;

public class UserManager {

    private  UserDatabse userDatabse = new UserDatabse();
    public String getUserInfo(){
        return userDatabse.getUserDetails();
    }

}
