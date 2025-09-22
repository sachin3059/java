package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
        String password = "0000";

        String query = "SELECT sname FROM student where sid = 1";


        try{
            // 1. connect to database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to PostgresSQL database!");

            // 2. Create a statement
            Statement stmt = conn.createStatement();

            // 3. Execute query(example: fetch version)
            ResultSet rs = stmt.executeQuery(query);

            // 4. Process result
            if(rs.next()){
                System.out.println("student name: " + rs.getString(1));
            }

            // 5. close Connection
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}