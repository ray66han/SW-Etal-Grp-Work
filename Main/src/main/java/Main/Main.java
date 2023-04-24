package Main;

import org.Database.DatabaseFunctions;

import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Example code showing how to interact with database.
        DatabaseFunctions Database = new DatabaseFunctions(); // Create a database object we can use to interact with.

        // Getting Data for User1
        User User1 = Database.GET_USER_WITH_ID(0); // Pulls a user from the datbase with ID 0 and makes it an object
        Integer User1Total = Database.GET_USER_TOTAL_CHORES(User1); // Gets total users assigned chores.
        Integer User1Completed = Database.GET_USER_COMPLETED_CHORES(User1); // Gets total users completed chores.

    }
}
