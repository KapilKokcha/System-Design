package cab.booking;

public class Rider {
	private long id;
    private String name;
    private int location;

    public Rider(long id, String name, int location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public long getId() { return id; }
    public String getName() { return name; }
    public int getLocation() { return location; }
	
	
}
