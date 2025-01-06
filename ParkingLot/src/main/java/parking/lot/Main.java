package parking.lot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Initialize parking spaces
        Map<VehicleType, List<ParkingSpot>> parkingSpace = new HashMap<>();
        parkingSpace.put(VehicleType.CAR, Arrays.asList(new ParkingSpot(1), new ParkingSpot(2)));
        parkingSpace.put(VehicleType.BIKE, Arrays.asList(new ParkingSpot(3), new ParkingSpot(4)));

        // Create parking lot
        ParkingLot parkingLot = new ParkingLot(parkingSpace);

        // Create gates and add them to the parking lot
        EntryGate entryGate1 = new EntryGate(1, parkingLot);
        ExitGate exitGate1 = new ExitGate(2, parkingLot);

        parkingLot.entryGates.add(entryGate1);
        parkingLot.exitGates.add(exitGate1);

        // Simulate entry operation
        Vehicle car = new Vehicle("ABC123", VehicleType.CAR);
        ParkingTicket ticket = entryGate1.issueParkingTicket(car);

        System.out.println("Ticket issued at Entry Gate 1 for Vehicle: " + car.registrationNumber);

        // Simulate exit operation
        int price = exitGate1.processVehicleExit(ticket.parkingSpot);
        System.out.println("Total Price: " + price);
    }
}