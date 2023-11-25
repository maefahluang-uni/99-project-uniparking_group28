package th.mfu.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation{

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int reservationID;     
      private int userID;
      private Date date;
      private Time startTime;
      private String location, duration;

      public Reservation(){
        
      }

      public void setLocation(String location){
        this.location = location;
      }

      public void setUserId(Integer userId){
        this.userID = userId;
      }

      public int getReservationID(){
        return reservationID;
      }

      public void setReservationID(Integer reservationID){
        this.reservationID = reservationID;
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