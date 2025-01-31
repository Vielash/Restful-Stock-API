package src.main.Stockingho.BackendStock.model;

public class User {
    private int userID;
    private String userName;
    private String userSurname;
    private String userPassword;

    public User(int userID, String userName, String userSurname, String userPassword) {
        this.userID = userID;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userPassword = userPassword;
    }

    public int getUserID() {
        return userID;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public String getUserName() {
        return userName;
    }
    public String getUserSurname() {
        return userSurname;
    }


    public void setUserID(int userID) {
        this.userID = userID;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
