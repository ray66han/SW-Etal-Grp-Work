package Main;

import org.Database.DatabaseFunctions;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseFunctions Database = new DatabaseFunctions();
        Chore chore1 = Database.GET_CHORE_WITH_ID(5);
        Database.DELETE_CHORE(chore1);
    }
}
