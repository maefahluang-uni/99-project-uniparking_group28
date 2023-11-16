public class User {

    private int userID;
    private String firstName, lastName, email, username, password, role;

    public User() {
        
    }

    public User(int userID) {
        userID = this.userID;
    }

    public int getUserID(){
        return userID;
    }

    public void setFirstName(String firstName){
        firstName = this.firstName;
    }

    public String getFirstName(){
        return firstName;
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

    public String getEmail(String email){
        return email;
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

    public void setFeedback(String feedback){
        feedback = this.feedback;
    }

    public String getfeedback(){
        return feedback;
    }
}
