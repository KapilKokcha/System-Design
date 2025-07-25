package stock.exchange;

public class TransactionValidator {
    public boolean validateBuyTransaction(int price, int quantity, long userId) {
        UserInfo info = UserManagementSystem.getUserInfo(userId);
        return info.getAvailableFunds() >= price * quantity;
    }

    // In real world, validate SELL stock ownership here
}