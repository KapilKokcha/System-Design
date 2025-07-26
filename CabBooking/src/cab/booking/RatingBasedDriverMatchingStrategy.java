package cab.booking;

import java.util.Comparator;
import java.util.Map;

public class RatingBasedDriverMatchingStrategy implements DriverMatchingStrategy {
	private static final int MAX_DISTANCE = 5;

	@Override
    public Driver getDriver(Map<Long, Driver> driverMap, Rider rider) {
        return driverMap.values().stream()
                .filter(d -> d.isAvailable() && Math.abs(d.getLocation() - rider.getLocation()) <= MAX_DISTANCE)
                .max(Comparator.comparingInt(Driver::getRatings))
                .orElse(null);
    }

}
