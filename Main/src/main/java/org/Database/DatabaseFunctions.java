package org.Database;
import java.sql.*;


public class DatabaseFunctions {
    DatabaseConnection databaseConn = new DatabaseConnection();
    Connection connection = databaseConn.Connect();


    /**
     * Creates a new user in the database with the following params.
     *
     * @param name  Name of the user.
     * @param email Email of the user.
     * @throws userAlreadyExists
     */
    public void create_User(String name, String email) throws SQLException {
        if (!check_Email(email)) {
            String query_adduser = "INSERT INTO Users (" + "user_name," + " user_email) VALUES (" + "?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query_adduser)) {
                preparedStatement.setString(1, name.toLowerCase());
                preparedStatement.setString(2, email.toLowerCase());
                preparedStatement.execute();

                System.out.println("\n[Database] Successfully created user with the following email " + email);
            }
        } else {throw new userAlreadyExists(email);}
    }

    /**
     *  Deletes a user from the database.
     * @param email Unique Email to search user for.
     * @throws userNotFound Throws userNotFound if no user exists in database.
     */
    public void delete_User(String email) throws SQLException {
        if (check_Email(email)) {
            String query = "DELETE FROM users WHERE user_email = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, email.toLowerCase());
                preparedStatement.execute();
                System.out.println("[Database] Successfully deleted user with the following email; " + email);
            }
        } else {throw new userNotFound(email);}
    }


    /** Checks if user with existing email already exists in database.
     *
     * @param email Email to search database for
     * @return  Returns true if user exists in database
     * @throws SQLException Throws custom error.
     */
    public boolean check_Email(String email) throws SQLException {

        String query = "SELECT * FROM users WHERE user_email = ?";
        Object user_id;
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, email.toLowerCase());
            ResultSet rs = preparedStatement.executeQuery();
            user_id = rs.getObject(1);
        }
        return user_id != null;
    }


    static class userAlreadyExists extends SQLException
    { public userAlreadyExists(String email)
        {super("[Database] User with the email " + email + "already exists in the database!");}
    }

    static class userNotFound extends SQLException
    { public userNotFound(String email)
    {super("[Database] Could not find the user with the following email: " + email);}
    }
}