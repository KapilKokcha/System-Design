package food.delivery;

public class Payment {
	private final double amount;
	private final PaymentStrategy strategy;

	public Payment(double amount, PaymentStrategy strategy) {
		this.amount = amount;
		this.strategy = strategy;
	}

	public boolean processPayment() {
		return strategy.pay(amount);
	}
}
