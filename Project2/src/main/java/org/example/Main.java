package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        import package
        load and register
        create connection
        create statement
        execute statement
        process the results
        close
         */


        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "PostG23";



        try{
            // 1. connect to database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to PostgresSQL database!");

            // 2. Create a statement
            String sql = "SELECT * FROM student WHERE sid = ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,1);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                int id = rs.getInt("sid");
                String name = rs.getString("sname");
                int age = rs.getInt("age");

                System.out.println(id + " | " + name + "  | " +  age);
            }

            // 5. close Connection
            rs.close();
            ps.close();
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}