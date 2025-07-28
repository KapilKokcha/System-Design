package food.delivery;

public class CashPaymentStrategy implements PaymentStrategy {
	public boolean pay(double amount) {
		System.out.println("Cash will be collected on delivery: Rs. " + amount);
		return true;
	}
}
