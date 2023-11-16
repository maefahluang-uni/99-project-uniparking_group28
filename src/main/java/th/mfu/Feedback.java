public class Feedback{
    private int feedbackID,userID;
    private String feedbackText;
    private Date timeStamp;

    public feedback(){

    }

    public feedback(int feedbackID){
        feedbackID = this.feedbackID;
    }
    public int getFeedbackID(){
        return feedbackID;
    }
    public setUserID(int userID){
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
    public setTimeStamp(Date timeStamp){
        timeStamp = this.timeStamp;
    }
    public date getTimeStamp(){
        return timeStamp;
    }

    

}