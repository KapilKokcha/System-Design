package stock.exchange;

public class TransactionExecutor {
    public boolean executeOrder(Order order) {
        ExchangeConnector connector = ExchangeConnectorFactory.getExchange(order.getStock().getExchangeType());
        return connector.execute(order);
    }
}