package cab.booking;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DriverManager {

	private final Map<Long, Driver> driverMap = new ConcurrentHashMap<>();
    private static volatile DriverManager instance;

    private DriverManager() {}

    public static DriverManager getInstance() {
        if (instance == null) {
            synchronized (DriverManager.class) {
                if (instance == null) {
                    instance = new DriverManager();
                }
            }
        }
        return instance;
    }

    public boolean addDriver(Driver driver) {
        return driverMap.putIfAbsent(driver.getId(), driver) == null;
    }

    public Map<Long, Driver> getDrivers() {
        return driverMap;
    }
	
}
