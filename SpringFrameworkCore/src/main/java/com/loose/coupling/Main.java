package com.loose.coupling;

public class Main {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabse();
        UserDataProvider databaseProvider1 = new UserDataBaseProvider();

        UserManager userManagerWithDB = new UserManager(databaseProvider1);
        System.out.println(userManagerWithDB.getUserInfo());
    }
}