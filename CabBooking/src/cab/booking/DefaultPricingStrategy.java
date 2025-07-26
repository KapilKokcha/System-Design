package cab.booking;

public class DefaultPricingStrategy implements PricingStrategy{

	@Override
	public int getPrice(int distance) {
		return 10*distance;
	}
	
}
