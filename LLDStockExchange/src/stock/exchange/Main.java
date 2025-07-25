package stock.exchange;

public class Main {
	 public static void main(String[] args) {
	        // Setup Users
	        User user1 = new User(1);
	        UserInfo userInfo1 = new UserInfo(user1, 10000);
	        UserManagementSystem.addUser(userInfo1);

	        // Create Stock
	        Stock stock = new Stock(101, ExchangeType.NSE);

	        // Create Order
	        Order order = new Order(1L, user1, stock, 10, TransactionType.BUY, OrderType.MARKET);

	        // Setup Services
	        PriceService priceService = new DummyPriceService();
	        TransactionValidator validator = new TransactionValidator();
	        TransactionExecutor executor = new TransactionExecutor();
	        TransactionManager manager = new TransactionManager(validator, executor, priceService);

	        // Execute Order
	        boolean result = manager.executeTransaction(order);
	        System.out.println("Order executed: " + result);
	    }
}
