package org.Database;
import java.sql.*;


public class DatabaseConnection {
    private Connection connection;

    public DatabaseConnection() {
        connection = null;
    }

    /** Connect
     * @return conn Returns the connection to the database.
     */
    public Connection Connect() {
        String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "/database/database.db";
        try {
            connection = DriverManager.getConnection(url);
            System.out.println("[DATABASE]: Connection to (" + url + ") has been successfully established.");
        } catch (SQLException e) { System.out.println("Failed to connect  to " + url); e.printStackTrace();}

        return connection;
    }

}