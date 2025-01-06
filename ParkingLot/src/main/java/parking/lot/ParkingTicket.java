package parking.lot;

import java.time.LocalDateTime;

public class ParkingTicket {
    ParkingSpot parkingSpot;
    LocalDateTime parkingTime;

    public ParkingTicket(ParkingSpot parkingSpot, LocalDateTime parkingTime){
        this.parkingSpot=parkingSpot;
        this.parkingTime=parkingTime;
    }

}
