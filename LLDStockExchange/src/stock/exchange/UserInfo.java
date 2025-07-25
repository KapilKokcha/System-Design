package stock.exchange;


public class UserInfo {
    private final User user;
    private int availableFunds;

    public UserInfo(User user, int availableFunds) {
        this.user = user;
        this.availableFunds = availableFunds;
    }

    public User getUser() {
        return user;
    }

    public int getAvailableFunds() {
        return availableFunds;
    }

    public void deductFunds(int amount) {
        this.availableFunds -= amount;
    }
}