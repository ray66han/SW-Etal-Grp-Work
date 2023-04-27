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
        Chore Chore1 = Database.GET_CHORE_WITH_ID(1); // Pulls a user from the datbase with ID 0 and makes it an object
        Database.SET_CHORE_NAME(Chore1, "New Chore Name/Desc!"); // Sets desc of chore
        Database.SET_CHORE_STATUS(Chore1, 2); // Sets Status of Chore. E.g Completed
        Database.SET_CHORE_TIME(Chore1, 50); // Sets the time of chore
        Database.SET_CHORE_WEEKLY(Chore1, true);  // Is the chore weekly? Should it reoccur?

        // Creating & Delete Chore

        Database.CREATE_CHORE("Wash Towels", 50); // New chore of time 50 mintues.

        Chore Chore2 = Database.GET_CHORE_WITH_ID(10);
        User user = Database.GET_USER_WITH_ID(1);
        Database.ASSIGN_CHORE_TO_USER(Chore2, user);
        Database.DELETE_CHORE(Chore2);
    }
}

