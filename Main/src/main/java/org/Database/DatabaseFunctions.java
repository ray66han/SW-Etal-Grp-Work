package org.Database;
import Main.Chore;
import Main.User;
import java.sql.*;
import java.util.ArrayList;


public class DatabaseFunctions {

    // TODO Create temporary chore func
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
        String query_addchore = "INSERT INTO Chores (" + "chore_name," + " chore_time) VALUES (" + "?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query_addchore)) {
            preparedStatement.setString(1, name.toLowerCase());
            preparedStatement.setInt(2, weight);
            preparedStatement.execute();
            System.out.println("[Database] New chore successfully created");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void DELETE_CHORE(Chore chore) throws SQLException {
        if (chore != null) {
            String query = "DELETE FROM chores WHERE chore_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, chore.getId());
                preparedStatement.execute();
                System.out.println("[Database] Successfully deleted chore");
            }
        } else {throw new choreNotFound(chore);}
    }
    public Chore GET_CHORE_WITH_ID(Integer id) throws SQLException {

        String query = "SELECT * FROM chores WHERE chore_id = ?";
        Chore chore;
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (!(rs.getInt(1) == 0)) { // If database returns an actual user with an id:
                chore = new Chore(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getInt(5), rs.getString(6));
                return chore;
            } else return null;
        }
    }

    public ArrayList<Chore> GET_FULL_CHORE_LIST() {
        String query = "SELECT chore_id, chore_name, status_desc, chore_reoccuring, chore_time, user_name FROM Chores\n" +
                "    left JOIN users u on u.user_id = chores.chore_assigned_to\n" +
                "    JOIN chore_status cs on cs.status_id = chores.chore_status";
        Chore chore;
        ArrayList<Chore> list = new ArrayList<Chore>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                chore = new Chore(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getInt(5), rs.getString(6));
                list.add(chore);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    public ArrayList<Chore> GET_THIS_WEEK_CHORE_LIST() {}
//    public ArrayList<Chore> GET_LAST_WEEK_CHORE_LIST() {}

    public void ASSIGN_CHORE_TO_USER(Chore chore, User user) throws SQLException {

        String query = "UPDATE chores SET chore_assigned_to = ? WHERE chore_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setInt(2, chore.getId());
            preparedStatement.execute();
            System.out.println("[Database] Successfully assigned chore ID " + chore.getId() + " to user ID " + user.getId());
        }
    }


    static class userNotFound extends SQLException {
        public userNotFound(User user) {
            super("[Database] Could not find the user!");
        }
    }

    static class choreNotFound extends SQLException {
        public choreNotFound(Chore chore) {
            super("[Database] Could not find the chore!");
        }
    }

}