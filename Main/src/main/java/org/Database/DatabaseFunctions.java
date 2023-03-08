package org.Database;
import Main.Chore;
import Main.User;
import java.sql.*;
import java.util.ArrayList;


public class DatabaseFunctions {

    // TODO Create tenporary chore func
    // TODO Set chore status
    // TODO Set chore assigned to


    DatabaseConnection databaseConn = new DatabaseConnection();
    Connection connection = databaseConn.Connect();


    /**
     * Creates a new user in the database with the following params.
     *
     * @param name  Name of the user.
     */
    public void CREATE_USER(String name) throws SQLException {
        String query_adduser = "INSERT INTO Users (" + "user_name," + " user_points) VALUES (" + "?, 0)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query_adduser)) {
            preparedStatement.setString(1, name.toLowerCase());
            preparedStatement.execute();
            System.out.println("[Database] New user successfully created");
        }
    }

    /**
     *  Deletes a user from the database.
     * @param user User object.
     * @throws userNotFound Throws userNotFound if no user exists in database.
     */
    public void DELETE_USER(User user) throws SQLException {

        if (user != null) {
            String query = "DELETE FROM users WHERE user_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, user.getId());
                preparedStatement.execute();
                System.out.println("[Database] Successfully deleted user");
            }
        } else {throw new userNotFound(user);}
    }

    public User GET_USER_WITH_ID(Integer id) throws SQLException {

        String query = "SELECT * FROM users WHERE user_id = ?";
        User user;
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (!(rs.getInt(1) == 0)) { // If database returns an actual user with an id:
                user = new User(rs.getInt(1), rs.getString(2), rs.getInt(3));
                return user;}
            else return null;
        }
    }

    public void CREATE_CHORE(String name, Integer weight) { // TODO Setup return chore
        String query_addchore = "INSERT INTO Chores (" + "chore_name," + " chore_weight) VALUES (" + "?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query_addchore)) {
            preparedStatement.setString(1, name.toLowerCase());
            preparedStatement.setInt(2, weight);
            preparedStatement.execute();
            System.out.println("[Database] New chore successfully created");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    static class userNotFound extends SQLException
    { public userNotFound(User user)
    {super("[Database] Could not find the user!");}
    }
}