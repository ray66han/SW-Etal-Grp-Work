package Main;

import org.Database.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DatabaseConnection database = new DatabaseConnection();
        database.Connect();

   }
}