package th.mfu;

public class ParkingSpace{

    private int spaceID, adminID;
    private String location;
    private Boolean availability;

    public ParkingSpace(){

    }

    public ParkingSpace(int spaceID, int adminUserID){
        spaceID = this.spaceID;
        adminUserID = this.adminID;
    }

    public int getSpaceID(){
        return spaceID;
    }

    public int getAdminUserID(){
        return adminID;
    }

    public void setLocation(String location){
        location = this.location;
    }

    public String getLocation(){
        return location;
    }

    public void setAvailability(Boolean availability){
        availability = this.availability;
    }

    public Boolean getAvailability(){
        return availability;
    }

}