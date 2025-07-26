package cab.booking;

public class Main {
	public static void main(String args[]) {
		DriverManager driverManager = DriverManager.getInstance();
		RiderManager riderManager = RiderManager.getInstance();

		Driver d1 = new Driver(1, "John", 5, true, 10);
		Driver d2 = new Driver(2, "Mike", 4, true, 12);
		driverManager.addDriver(d1);
		driverManager.addDriver(d2);

		Rider r1 = new Rider(100, "Kapil", 11);
		riderManager.addRider(r1);

		StrategyManager strategyManager = StrategyManager.getInstance();
//        PricingStrategy pricingStrategy = strategyManager.getSurchargePricingStrategy(1.5); // 50% surcharge
		PricingStrategy pricingStrategy = strategyManager.getPricingStrategy();
		RideManager rideManager = new RideManager(strategyManager.getDriverMatchingStrategy(), pricingStrategy);

		Trip trip = new Trip(11, 25, 14, r1);
		boolean booked = rideManager.bookRide(trip, r1);

		if (booked) {
			System.out.println(
					"Trip booked with driver: " + trip.getDriver().getName() + " at price: " + trip.getPrice());
		} else {
			System.out.println("No driver found!");
		}
	}
}
