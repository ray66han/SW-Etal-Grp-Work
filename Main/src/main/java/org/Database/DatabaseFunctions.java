package org.Database;
import Main.User;
import java.sql.*;
import java.util.ArrayList;


public class DatabaseFunctions {
    DatabaseConnection databaseConn = new DatabaseConnection();
    Connection connection = databaseConn.Connect();


    /**
     * Creates a new user in the database with the following params.
     *
     * @param name  Name of the user.
     * @param email Email of the user.
     */
    public void CREATE_USER(String name, String email) throws SQLException {
        User existing_user = GET_USER_WITH_EMAIL(email);
        if (existing_user == null) {
            String query_adduser = "INSERT INTO Users (" + "user_name," + " user_email) VALUES (" + "?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query_adduser)) {
                preparedStatement.setString(1, name.toLowerCase());
                preparedStatement.setString(2, email.toLowerCase());
                preparedStatement.execute();

                System.out.println("[Database] New user succesfully created with email: " + email);
            }
        } else {
            System.out.println("User already exists!");
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

    /**
     * Sets a user to a certain group.
     * @param user The user you wish to modify.
     * @param groupId The ID of the group you wish to assign them to.
     * @throws SQLException Throws SQL Error.
     */
    public void USER_SET_GROUP(User user, Integer groupId) throws SQLException{
            String query = "UPDATE USERS SET user_group = ? WHERE user_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, groupId);
                preparedStatement.setInt(2, user.getId());
                preparedStatement.execute();
                System.out.println("[Database] Successfully assigned user to group id " + groupId);
            }
        }

    /**
     *  Fetches all users from database with provided group ID.
     * @param groupID ID of group.
     * @return Returns an ArrayList of object Users.
     * @throws SQLException Sql error.
     */
    public ArrayList GROUP_LIST_USERS(Integer groupID) throws SQLException {
        String query = "SELECT * FROM users WHERE user_group = ?";
        ArrayList<User> user_list = new ArrayList<User> ();

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, groupID);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getInt(4));
                user_list.add(user);
            }
            return user_list;
        }
    }


    /** Checks if user with existing email already exists in database.
     *
     * @param email Email to search database for
     * @return  Returns true if user exists in database
     * @throws SQLException Throws custom error.
     */
    public User GET_USER_WITH_EMAIL(String email) throws SQLException {

        String query = "SELECT * FROM users WHERE user_email = ?";
        User user;
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, email.toLowerCase());
            ResultSet rs = preparedStatement.executeQuery();

            if (!(rs.getInt(1) == 0)) { // If database returns an actual user with an id:
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getInt(4));
            return user;}
            else return null;
        }
    }

    public User GET_USER_WITH_ID(Integer id) throws SQLException {

        String query = "SELECT * FROM users WHERE user_id = ?";
        User user;
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (!(rs.getInt(1) == 0)) { // If database returns an actual user with an id:
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getInt(4));
                return user;}
            else return null;
        }
    }

    static class userAlreadyExists extends SQLException
    { public userAlreadyExists(String email)
        {super("[Database] User with the email " + email + "already exists in the database!");}
    }

    static class userNotFound extends SQLException
    { public userNotFound(User user)
    {super("[Database] Could not find the user!");}
    }
}