package food.delivery;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Setup User
		User user = new User(1, 101);

		// Setup Dish
//		DishAddOn cheese = new DishAddOn("Extra Cheese", 20.0);
		
		DishAddOn cheese = new DishAddOn("Extra Cheese", 20.0) {
			@Override
			public void apply() {
				System.out.println("Applying extra cheese to the dish.");
			}
		};
		
		List<DishAddOn> addOns = new ArrayList<>();
		addOns.add(cheese);

		Dish pizza = new Dish("Pizza", 150, addOns) {
			@Override
			public void prepare() {
				System.out.println("Preparing Pizza...");
			}

			@Override
			public void serve() {
				System.out.println("Serving Pizza...");
			}
		};

		// Setup Menu
		Menu menu = new Menu();
		menu.addDish(pizza);

		// Setup Restaurant
		Restaurant restaurant = new Restaurant(1, menu, 102, 5, true);
		RestaurantManager.getInstance().addRestaurant(restaurant);

		// Setup Delivery Partner
		DeliveryPartner dp1 = new DeliveryPartner(1001, 105, 5);
		DeliveryManager.getInstance().registerPartner(dp1);

		// Create Order
		List<Dish> dishes = new ArrayList<>();
		dishes.add(pizza);
		Order order = new Order(1, restaurant, dishes, user, user.getLoc());

		// Place Order
		boolean result = OrderManager.getInstance().placeOrder(order, new PrepaidPaymentStrategy());
		System.out.println("Order placed: " + result);
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Assigned Delivery Partner ID: "
				+ (order.getDeliveryPartner() != null ? order.getDeliveryPartner().getId() : "None"));
	}

}
