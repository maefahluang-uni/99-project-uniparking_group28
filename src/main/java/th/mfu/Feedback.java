public class feedback{
    private int feedbackID,userID;
    private String feedbackText;
    private date timeStamp;

    public feedback(){

    }

    public feedback(int feedbackID){
        feedbackID = this.feedbackID;
    }
    public int getfeedbackID(){
        return feedbackID;
    }
    public setuserID(int userID){
        userID = this.userID;
    }
    public int getUserID(){
        return userID;
    }
    public setFeedbackText(String feedbackText){
        feedbackText = this.feedbackText;
    }
    public String getfeedbackText(){
        return feedbackText; 
    }
    public settimeStamp(date timeStamp){
        timeStamp = this.timeStamp;
    }
    public date gettimeStamp(){
        return timeStamp;
    }

    

}