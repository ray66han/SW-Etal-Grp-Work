package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DatabaseConnection {
    private Connection conn;
    public DatabaseConnection() {
        conn = null;
    }

    public boolean Connect(String filename) {
        try {
            String url = "jdbc:sqlite:"+filename;
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to "+filename+"has been successfully established.");
        } catch (SQLException e) {
            System.out.println("Failed to connect  to "+filename);
            System.out.println(e.getMessage());
            return false;}
        return true;
    }



}
