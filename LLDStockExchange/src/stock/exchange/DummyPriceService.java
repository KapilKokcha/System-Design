package stock.exchange;

public class DummyPriceService implements PriceService {
    @Override
    public int getLivePrice(Stock stock) {
        return 100; // dummy
    }
}