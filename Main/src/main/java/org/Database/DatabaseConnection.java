package org.Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private Connection conn;
    public DatabaseConnection() {
        conn = null;
    }

    public boolean Connect() { // TODO: Try and catched should use exceptions instead.
        String url = "jdbc:sqlite:"  + System.getProperty("user.dir") + "/database/database.db";
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("DATABASE: Connection to ("+url+") has been successfully established.");
        } catch (SQLException e) {
            System.out.println("Failed to connect  to "+url);
            e.printStackTrace();
            return false;}
        return true;
    }

    public boolean RunSQL(String sql){
        if(conn == null){
            System.out.println("DATABASE: There is no database loaded. Cannot run SQL.");
            return false;
        }
        try {
            Statement sqlStatement = conn.createStatement();
            sqlStatement.execute(sql);
            System.out.println("DATABASE: Succesfully ran SQL Code on database.");
        }
        catch(SQLException e){
            System.out.println("DATABASE: Failed to execute "+sql);
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

}
