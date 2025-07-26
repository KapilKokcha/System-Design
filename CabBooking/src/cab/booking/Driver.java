package cab.booking;

public class Driver {
	private long id;
	private String name;
	private int ratings;
	private boolean available;
	private int location;

	public Driver(long id, String name, int ratings, boolean available, int location) {
		this.id = id;
		this.name = name;
		this.ratings = ratings;
		this.available = available;
		this.location = location;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRatings() {
		return ratings;
	}

	public boolean isAvailable() {
		return available;
	}

	public int getLocation() {
		return location;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
