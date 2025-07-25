package stock.exchange;

public class BSEProvider implements ExchangeConnector {
    @Override
    public boolean execute(Order order) {
        // actual BSE API logic
        return true;
    }
}