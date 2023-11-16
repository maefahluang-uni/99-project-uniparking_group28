public class Reservation{

      private int ReservationID,userID,spaceID;
      private date ReservationTimestamp,expiryTimeStamp;
      private string status;

      public Reservation(){
        
      }

      public Reservation(int ReservationID, int userID, int spaceID){
        ReservationID = this.ReservationID;
        userID = this.userID;
        spaceID = this.spaceID;

      }

      public int getReservayionID(){
        return ReservationID;
      }

      public int getuserID(){
        return userID;
      }

      public int getSpaceID(){
        return spaceID;
      }

      public void setReservationTimeStamp(date ReservationTimestamp, date expiryTimeStamp){
        ReservationTimestamp = this.ReservationTimestamp;
        expiryTimeStamp = this.expiryTimeStamp;
      }

      public date getReservationTimestamp(){
        return ReservationTimestamp;
      }

      public date getexpiryTimeStamp(){
        return expiryTimeStamp;
      }

      public void setstatus(String status){
        status = this.status;
      }

      public String getstatus(){
        return status;
      }


    
}