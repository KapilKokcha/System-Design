package food.delivery;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {
	private static volatile OrderManager instance;
	private final Map<Long, Order> orders = new HashMap<>();

	private OrderManager() {
	}

	public static OrderManager getInstance() {
		if (instance == null) {
			synchronized (OrderManager.class) {
				if (instance == null)
					instance = new OrderManager();
			}
		}
		return instance;
	}

	public boolean placeOrder(Order order, PaymentStrategy paymentStrategy) {
		if (!RestaurantManager.getInstance().validateRestaurant(order.getRestaurant())) {
			System.out.println("Restaurant not available");
			return false;
		}

		Payment payment = new Payment(order.calculateTotalPrice(), paymentStrategy);
		if (!payment.processPayment())
			return false;

		order.setPayment(payment);
		order.setStatus(OrderStatus.PLACED);

		DeliveryPartner partner = DeliveryManager.getInstance().assignPartner(order);
		if (partner != null) {
			order.assignDeliveryPartner(partner);
			partner.setAvailable(false);
		}

		orders.put(order.getId(), order);
		return true;
	}

}
