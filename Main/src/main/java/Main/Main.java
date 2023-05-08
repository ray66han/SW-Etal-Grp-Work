package Main;

import org.Database.DatabaseFunctions;

import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Team
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        // Example code showing how to interact with database.

        DatabaseFunctions Database = new DatabaseFunctions(); // Create a database object we can use to interact with.
        ArrayList<Chore> list = Database.GET_LAST_WEEK_FINISHED_CHORE_LIST(); // Get data from database

        for (final Chore chore : list) { // Loop over ArrayList
            System.out.println(chore.getName() + " has been completed last week by "); // Example of using the data
        }
    }
}

