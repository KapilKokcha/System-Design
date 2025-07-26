package cab.booking;

class SurchargePricingStrategy implements PricingStrategy {
    private final double surchargeMultiplier;

    public SurchargePricingStrategy(double surchargeMultiplier) {
        this.surchargeMultiplier = surchargeMultiplier;
    }

    @Override
    public int getPrice(int distance) {
        return (int)(10 * distance * surchargeMultiplier);
    }
}