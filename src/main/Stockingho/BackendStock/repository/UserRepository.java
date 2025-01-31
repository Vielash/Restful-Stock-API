package src.main.Stockingho.BackendStock.repository;

import src.main.Stockingho.BackendStock.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {

    private static final String URL = "jdbc:mysql://localhost:3306/stockDB";
    private static final String USER = "root";
    private static final String PASSWORD = "Xc123654";

    @Override
    public List<User> getAllUserObjects() {
        List<User> userList = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
            Statement statement = connection.createStatement()) {

            String query = "SELECT id, name, surname, password from user";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String password = resultSet.getString("password");

                User user = new User(id, name, surname, password);
                userList.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public User getUserByID(int userID) {
        User selectedUser = null;
        try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
            Statement statement = connection.createStatement()) {

            String query = "SELECT id, name,surname, password from user WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, userID);

            ResultSet resultSet = preparedStatement.executeQuery();
                resultSet.next();

                int usersID = resultSet.getInt("id");
                String userName = resultSet.getString("name");
                String userSurname = resultSet.getString("surname");
                String userPassword = resultSet.getString("password");

                selectedUser = new User(usersID, userName, userSurname, userPassword);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return selectedUser;
    }

    @Override
    public User getUserByName(String userName) {
        return null;
    }

    @Override
    public boolean addUser(String userName, String userSurname, String userPassword) {
        return false;
    }

    @Override
    public boolean deleteUserByID(int userID) {
        return false;
    }

    @Override
    public boolean updateUserByID(int userId, String userName, String userSurname, String userPassword) {
        return false;
    }

    @Override
    public boolean updateUserNameByID(int userID, String newUserName) {
        return false;
    }

    @Override
    public boolean updateUserSurnameByID(int userID, String newUserSurname) {
        return false;
    }

    @Override
    public boolean updateUserPasswordByID(int userID, String newPassword) {
        return false;
    }

    @Override
    public boolean doesUserExists(int userID) {
        return false;
    }
}
