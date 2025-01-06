package parking.lot;

import java.time.LocalDateTime;

public class ParkingSpot {
    int id;
    Vehicle vehicle;
    boolean isAvailable;
    LocalDateTime entryTime;

    public ParkingSpot(int id){
        this.id = id;
    }

    public boolean parkVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
        this.isAvailable=false;
        this.entryTime = LocalDateTime.now();
        return true;
    }

    public boolean emptySpot(){
        isAvailable=true;
        this.vehicle=null;
        this.entryTime=null;
        return true;
    }

}
