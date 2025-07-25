package stock.exchange;

public final class Stock {
    private final int id;
    private final ExchangeType exchangeType;

    public Stock(int id, ExchangeType exchangeType) {
        this.id = id;
        this.exchangeType = exchangeType;
    }

    public int getId() {
        return id;
    }

    public ExchangeType getExchangeType() {
        return exchangeType;
    }
}