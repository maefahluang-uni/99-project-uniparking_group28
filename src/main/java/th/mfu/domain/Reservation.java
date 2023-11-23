package th.mfu.domain;

import java.sql.Date;
import java.sql.Time;

public class Reservation{

      private int reservationID,userID;
      private Date date;
      private Time startTime;
      private String location, duration;

      public Reservation(){
        
      }

      public Reservation(int ReservationID, int userID, String location){
        ReservationID = this.reservationID;
        userID = this.userID;
        location = this.location;

      }

      public int getReservationID(){
        return reservationID;
      }

      public int getUserID(){
        return userID;
      }

      public String getLocation(){
        return location;
      }

      public Date getDate() {
        return date;
      }

      public void setDate(Date date) {
        this.date = date;
      }

      public Time getStartTime() {
        return startTime;
      }

      public void setStartTime(Time startTime) {
        this.startTime = startTime;
      }

      public String getDuration() {
        return duration;
      }

      public void setDuration(String duration) {
        this.duration = duration;
      }





    
}