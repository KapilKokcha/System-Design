package food.delivery;

public abstract class DishAddOn {
	private final String name;
	private final double price;

	public DishAddOn(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
	
	// Optional abstract method
		public abstract void apply();

}
