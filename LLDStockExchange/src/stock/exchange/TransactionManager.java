package stock.exchange;

public class TransactionManager {
    private final TransactionValidator validator;
    private final TransactionExecutor executor;
    private final PriceService priceService;

    public TransactionManager(TransactionValidator validator, TransactionExecutor executor, PriceService priceService) {
        this.validator = validator;
        this.executor = executor;
        this.priceService = priceService;
    }

    public boolean executeTransaction(Order order) {
        int price = priceService.getLivePrice(order.getStock());
        if (order.getTransactionType() == TransactionType.BUY) {
            if (!validator.validateBuyTransaction(price, order.getQuantity(), order.getUser().getId())) {
                throw new RuntimeException("Insufficient Funds");
            }
        }

        boolean executed = executor.executeOrder(order);
        if (!executed) {
            throw new RuntimeException("Execution failed at exchange");
        }

        return true;
    }
}