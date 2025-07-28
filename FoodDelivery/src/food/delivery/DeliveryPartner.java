package food.delivery;

public class DeliveryPartner extends Person {
    private boolean available;
    private int rating;

    public DeliveryPartner(long id, int location, int rating) {
        super(id, location);
        this.rating = rating;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
