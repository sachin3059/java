package org.example;


// tight coupling example

public class Main {
    public static void main(String[] args) {
        UserManager userManager= new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}