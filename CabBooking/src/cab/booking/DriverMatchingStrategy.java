package cab.booking;

import java.util.Map;

public interface DriverMatchingStrategy {
	Driver getDriver(Map<Long,Driver>driverMap,Rider rider);
}
