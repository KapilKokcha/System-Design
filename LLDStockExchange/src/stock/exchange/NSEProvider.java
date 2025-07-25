package stock.exchange;

public class NSEProvider implements ExchangeConnector {
    @Override
    public boolean execute(Order order) {
        // actual NSE API logic
        return true;
    }
}