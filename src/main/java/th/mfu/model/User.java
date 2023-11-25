package th.mfu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column(name="username")
    private String username;

    @Column(name = "password")
    private String password;
    
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
