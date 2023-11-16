public class admin{

    private int adminID;
    private String firstname,lastName,email,username,password;

    public admin(){

    }

    public admin(int adminID){
        adminID = this.adminID;
    }

    public int getadminID(){
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
    public void setemail(String email){
        email = this.email;
    }
    public String getemail(){
        return email;
    }
    public void setUsername(String username){
        username = this.username;
    }
    public String getusername(){
        return username;
    }
    public void setPassword(String password){
        password = this.password;
    }
    public String getpassword(){
        return password;
    }


}