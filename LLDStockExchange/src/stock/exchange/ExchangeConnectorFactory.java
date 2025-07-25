package stock.exchange;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ExchangeConnectorFactory {
    private static final Map<ExchangeType, ExchangeConnector> exchangeMap = new ConcurrentHashMap<>();

    public static ExchangeConnector getExchange(ExchangeType exchangeType) {
        return exchangeMap.computeIfAbsent(exchangeType, type -> {
            switch (type) {
                case NSE: return new NSEProvider();
                case BSE: return new BSEProvider();
                default: throw new IllegalArgumentException("Unsupported exchange type: " + type);
            }
        });
    }
}