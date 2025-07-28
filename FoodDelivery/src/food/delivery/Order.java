package food.delivery;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private final long id;
	private final Restaurant restaurant;
	private final List<Dish> dishes;
	private final User user;
	private final int location;
	private OrderStatus status;
	private DeliveryPartner deliveryPartner;
	private Payment payment;

	public Order(long id, Restaurant restaurant, List<Dish> dishes, User user, int location) {
		this.id = id;
		this.restaurant = restaurant;
		this.dishes = dishes;
		this.user = user;
		this.location = location;
		this.status = OrderStatus.PENDING;
	}

	public void assignDeliveryPartner(DeliveryPartner partner) {
		this.deliveryPartner = partner;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public double calculateTotalPrice() {
		return dishes.stream().mapToDouble(Dish::getTotalPrice).sum();
	}

	public long getId() {
		return id;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public int getLocation() {
		return location;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public DeliveryPartner getDeliveryPartner() {
		return deliveryPartner;
	}

}
