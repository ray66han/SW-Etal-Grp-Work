package Main;

import org.Database.DatabaseFunctions;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseFunctions database = new DatabaseFunctions();
        database.CreateUser("Milo", "Milo@gmail.com");

    }
}