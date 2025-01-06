package parking.lot;

public class EntryGate extends Gate {
    private final ParkingLot parkingLot;

    public EntryGate(int id, ParkingLot parkingLot) {
        super(id);
        this.parkingLot = parkingLot;
    }

    public ParkingTicket issueParkingTicket(Vehicle vehicle) {
        return parkingLot.getParkingTicket(vehicle);
    }
}

