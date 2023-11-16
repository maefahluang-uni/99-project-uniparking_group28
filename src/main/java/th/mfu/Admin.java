public class Admin{

    private int adminID;
    private String firstname,lastName,email,username,password;

    public admin(){

    }

    public admin(int adminID){
        adminID = this.adminID;
    }

    public int getAdminID(){
        return adminID;
    }

    public void setFirstName(String firstname){
        firstname = this.firstname;
    }
    public String getFirstname(){
        return firstname;
    }
    public void setLastName(String lastName){
        lastName = this.lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setEmail(String email){
        email = this.email;
    }
    public String getEmail(){
        return email;
    }
    public void setUsername(String username){
        username = this.username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        password = this.password;
    }
    public String getPassword(){
        return password;
    }


}