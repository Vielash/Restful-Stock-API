package src.main.Stockingho.BackendStock.repository;

import src.main.Stockingho.BackendStock.model.User;

import java.util.Collection;
import java.util.List;

public interface IUserRepository {

    List<User> getAllUserObjects();
    User getUserByID(int userID);
    User getUserByName(String userName);


    boolean addUser(String userName, String userSurname, String userPassword);
    boolean deleteUserByID(int userID);
    boolean updateUserByID(int userId, String userName, String userSurname, String userPassword);
    boolean updateUserNameByID(int userID, String newUserName);
    boolean updateUserSurnameByID(int userID, String newUserSurname);
    boolean updateUserPasswordByID(int userID, String newPassword);
    boolean doesUserExists(int userID);



}
