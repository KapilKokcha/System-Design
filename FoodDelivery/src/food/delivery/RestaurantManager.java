package food.delivery;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RestaurantManager {

	 private static volatile RestaurantManager instance;
	    private final List<Restaurant> restaurants = new CopyOnWriteArrayList<>();

	    private RestaurantManager() {}

	    public static RestaurantManager getInstance() {
	        if (instance == null) {
	            synchronized (RestaurantManager.class) {
	                if (instance == null) instance = new RestaurantManager();
	            }
	        }
	        return instance;
	    }

	    public void addRestaurant(Restaurant restaurant) {
	        restaurants.add(restaurant);
	    }

	    public boolean validateRestaurant(Restaurant restaurant) {
	        return restaurants.stream()
	            .anyMatch(r -> r.getId() == restaurant.getId() && r.isAvailable());
	    }	
	
}
