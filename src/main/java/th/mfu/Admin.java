package th.mfu;

public class Admin{

    private int adminID;
    private String username,password;

    public Admin(){

    }

    public Admin(int adminID){
        adminID = this.adminID;
    }

    public int getAdminID(){
        return adminID;
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