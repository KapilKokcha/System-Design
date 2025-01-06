package parking.lot;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    Map<VehicleType, List<ParkingSpot>> parkingSpace;

    public ParkingLot(Map<VehicleType, List<ParkingSpot>> parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        for (ParkingSpot parkingSpot : this.parkingSpace.get(vehicle.type)) {
            if (parkingSpot.isAvailable) {
                parkingSpot.parkVehicle(vehicle);
                return parkingSpot;
            }
        }
        return null;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle) {
        ParkingSpot parkingSpot = parkVehicle(vehicle);
        if (parkingSpot == null) {
            // Handle error/exeption
            throw new IllegalStateException("No parking spot available for the vehicle type: " + vehicle.type);
        }
        return new ParkingTicket(parkingSpot, LocalDateTime.now());
    }

    public boolean freeParkingSpot(ParkingSpot parkingSpot) {
        for (ParkingSpot eleParkingSpot : parkingSpace.get(parkingSpot.vehicle.type)) {
            if (parkingSpot.id == eleParkingSpot.id) {
                eleParkingSpot.emptySpot();
                return true;
            }
        }
        return false;
    }

    public int exitVehicle(ParkingSpot parkingSpot) {
        if (parkingSpot.entryTime == null || parkingSpot.vehicle == null) {
            throw new IllegalStateException("The parking spot is already empty or invalid.");
        }
        LocalDateTime currentTime = LocalDateTime.now();
        int price = (int) Duration.between(parkingSpot.entryTime, currentTime).toHours() * parkingSpot.vehicle.type.getHourlyRate();
        freeParkingSpot(parkingSpot);
        return price;
    }

}
