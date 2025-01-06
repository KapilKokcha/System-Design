package parking.lot;

public class ExitGate extends Gate {
    private final ParkingLot parkingLot;

    public ExitGate(int id, ParkingLot parkingLot) {
        super(id);
        this.parkingLot = parkingLot;
    }

    public int processVehicleExit(ParkingSpot parkingSpot) {
        return parkingLot.exitVehicle(parkingSpot);
    }
}

