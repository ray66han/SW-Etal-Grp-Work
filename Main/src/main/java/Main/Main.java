package Main;

import org.Database.DatabaseFunctions;

import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {

        // Example code showing how to interact with database.
        DatabaseFunctions Database = new DatabaseFunctions(); // Create a database object we can use to interact with.

        ArrayList<Chore> list = Database.GET_FULL_CHORE_LIST(); // Get a full chore list, excluding dates. Returns as ArrayList

        for (Chore chore : list) { // Loop over the chore arraylist
            System.out.println("Chore Desc (" + chore.name + ") is currently assigned to: " + chore.assigned_to + "with status of " + chore.status);
        }

    }
}
