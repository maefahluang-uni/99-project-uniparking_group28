package th.mfu.model;

import javax.persistence.Entity;


public class User {

    private int userID;
    private String username, password;
    
    public User() {
        
    }

    public User(int userID) {
        userID = this.userID;
    }

    public int getUserID(){
        return userID;
    }

    public void setUsername(String username){
        username = this.username;
    }

    public String getUsername(){
        return username;
    }

    public void setPassword (String password){
        password = this.password;
    }

    public String getPassword(){
        return password;
    }
}
