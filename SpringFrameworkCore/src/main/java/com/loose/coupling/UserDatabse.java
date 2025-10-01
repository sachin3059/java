package com.loose.coupling;



public class UserDatabse implements UserDataProvider {
    @Override
    public String getUserDetails(){

        return "User Details from database";
    }
}
