/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.sql.*;


/**
 *
 * @author usercc
 */
public class TestConnect {

    public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:./etal.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
             // Execute a query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM chores");
            while (rs.next()) {
                // Retrieve data from the result set
                int id = rs.getInt("chore_id");
                String name = rs.getString("chore_name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Close the result set, statement, and connection
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();
    }

}
