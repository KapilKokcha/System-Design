package cab.booking;

public class Trip {
	private int source;
    private int destination;
    private int distance;
    private Rider rider;
    private Driver driver;
    private TripStatus tripStatus;
    private int price;

    public Trip(int source, int destination, int distance, Rider rider) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.rider = rider;
        this.tripStatus = TripStatus.SEARCHING_DRIVER;
    }

    public int getSource() { return source; }
    public int getDestination() { return destination; }
    public int getDistance() { return distance; }
    public Rider getRider() { return rider; }
    public Driver getDriver() { return driver; }
    public TripStatus getTripStatus() { return tripStatus; }
    public int getPrice() { return price; }

    public void setDriver(Driver driver) { this.driver = driver; }
    public void setTripStatus(TripStatus tripStatus) { this.tripStatus = tripStatus; }
    public void setPrice(int price) { this.price = price; }

}
