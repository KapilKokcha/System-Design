package food.delivery;

public class PrepaidPaymentStrategy implements PaymentStrategy {
	public boolean pay(double amount) {
		System.out.println("Prepaid payment of Rs. " + amount + " processed successfully.");
		return true;
	}
}
