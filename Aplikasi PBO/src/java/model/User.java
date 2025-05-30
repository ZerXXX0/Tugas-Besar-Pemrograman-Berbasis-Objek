package model;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.DB;


public class User {
    private int id;
    private String username;
    private String password;
    private String email;

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void deleteUser(DB db){
        String query = "DELETE FROM User WHERE id = " + this.id;
        db.runQuery(query);
    }
    
     public boolean logIn(DB db) {
        String query = "SELECT * FROM user WHERE username = '" + this.username +
                       "' AND password = '" + this.password + "'";
        ResultSet rs = db.runQueryWithResult(query);
        try {
            if (rs != null && rs.next()) {
                this.id = rs.getInt("id");
                this.email = rs.getString("email");
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Login error: " + e.getMessage());
        }
        return false;
    }
    
    public void logOut(){
        
    }
   
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
        public void editProfile(DB db, String newUsername, String newEmail){
        String query = "UPDATE User SET username = '" + newUsername + "', email = '" + newEmail + "' WHERE id = " + this.id;
        db.runQuery(query);

    
        this.username = newUsername;
        this.email = newEmail;
    }
    
    public void editPassword(DB db, String newPassword){
        String query = "UPDATE User SET password = '" + newPassword + "' WHERE id = " + this.id;
        db.runQuery(query);

    this.password = newPassword; 
    }
}
