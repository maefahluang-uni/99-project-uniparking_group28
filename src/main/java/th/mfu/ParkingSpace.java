import java.sql.Date;

public class ParkingSpace{

    private int spaceID, adminUserID;
    private String location, spaceType;
    private Boolean availability;
    private Date lastUpdateTimeStamp;

    public ParkingSpace(){

    }

    public ParkingSpace(int spaceID, int adminUserID){
        spaceID = this.spaceID;
        adminUserID = this.adminUserID;
    }

    public int getSpaceID(){
        return spaceID;
    }

    public int getAdminUserID(){
        return adminUserID;
    }

    public void setLocation(String location){
        location = this.location;
    }

    public String getLocation(){
        return location;
    }

    public void setSpaceType(String spaceType){
        spaceType = this.spaceType;
    }

    public String getSpaceType(){
        return spaceType;
    }

    public void setAvailability(Boolean availability){
        availability = this.availability;
    }

    public Boolean getAvailability(){
        return availability;
    }

    public void setLastUpdateTimeStamp(Date lastUpdateTimeStamp){
        lastUpdateTimeStamp = this.lastUpdateTimeStamp;
    }

    public Date getLastUpdateTimeStamp(){
        return lastUpdateTimeStamp;
    }


}