package org.Database;

import java.sql.*;


public class DatabaseFunctions {

    /**
     * Creates a new user in the database with the following params.
     *
     * @param name  Name of the user.
     * @param email Email of the user.
     */
    public void CreateUser(String name, String email) throws SQLException {
        DatabaseConnection databaseConn = new DatabaseConnection();
        Connection connection = databaseConn.Connect();
        String query = "INSERT INTO Users (" + "user_name," + " user_email) VALUES (" + "?, ?)";

        // TODO: Add query to search database if user exists already, if they do throw error, if not then continue.
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.execute();
        }
    }
}