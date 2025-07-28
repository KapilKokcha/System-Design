package food.delivery;

public class Restaurant {
	private long id;
	private Menu menu;
	private int loc;
	private int rating;
	private boolean available;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public int getLoc() {
		return loc;
	}
	public void setLoc(int loc) {
		this.loc = loc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public Restaurant(long id, Menu menu, int loc, int rating, boolean available) {
		super();
		this.id = id;
		this.menu = menu;
		this.loc = loc;
		this.rating = rating;
		this.available = available;
	}
	
	
	
	
	
}
