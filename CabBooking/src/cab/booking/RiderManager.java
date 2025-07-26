package cab.booking;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RiderManager {
	 private final Map<Long, Rider> riderMap = new ConcurrentHashMap<>();
	    private static volatile RiderManager instance;

	    private RiderManager() {}

	    public static RiderManager getInstance() {
	        if (instance == null) {
	            synchronized (RiderManager.class) {
	                if (instance == null) {
	                    instance = new RiderManager();
	                }
	            }
	        }
	        return instance;
	    }

	    public boolean addRider(Rider rider) {
	        return riderMap.putIfAbsent(rider.getId(), rider) == null;
	    }

	    public Map<Long, Rider> getRiders() {
	        return riderMap;
	    }
}
