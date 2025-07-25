package stock.exchange;

public final class Order {
    private final long id;
    private final User user;
    private final Stock stock;
    private final int quantity;
    private final TransactionType transactionType;
    private final OrderType orderType;

    public Order(long id, User user, Stock stock, int quantity,
                 TransactionType transactionType, OrderType orderType) {
        this.id = id;
        this.user = user;
        this.stock = stock;
        this.quantity = quantity;
        this.transactionType = transactionType;
        this.orderType = orderType;
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Stock getStock() {
        return stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public OrderType getOrderType() {
        return orderType;
    }
}