package cab.booking;

import java.util.Map;

public class RideManager {

	private final DriverMatchingStrategy driverMatchingStrategy;
    private final PricingStrategy pricingStrategy;

    public RideManager(DriverMatchingStrategy driverMatchingStrategy, PricingStrategy pricingStrategy) {
        this.driverMatchingStrategy = driverMatchingStrategy;
        this.pricingStrategy = pricingStrategy;
    }

    public boolean bookRide(Trip trip, Rider rider) {
        Map<Long, Driver> driverMap = DriverManager.getInstance().getDrivers();
        Driver driver = driverMatchingStrategy.getDriver(driverMap, rider);
        if (driver == null) return false;

        int price = pricingStrategy.getPrice(trip.getDistance());
        driver.setAvailable(false);

        trip.setDriver(driver);
        trip.setPrice(price);
        trip.setTripStatus(TripStatus.DRIVER_MATCHED);
        return true;
    }
	
	
}
