package cab.booking;

public class StrategyManager {
	
	private static volatile StrategyManager instance;

    private StrategyManager() {}

    public static StrategyManager getInstance() {
        if (instance == null) {
            synchronized (StrategyManager.class) {
                if (instance == null) {
                    instance = new StrategyManager();
                }
            }
        }
        return instance;
    }

    public PricingStrategy getPricingStrategy() {
        return new DefaultPricingStrategy();
    }

    public DriverMatchingStrategy getDriverMatchingStrategy() {
        return new RatingBasedDriverMatchingStrategy();
    }
	
    public PricingStrategy getSurchargePricingStrategy(double surchargeMultiplier) {
        return new SurchargePricingStrategy(surchargeMultiplier);
    }
    
}
