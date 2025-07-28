package food.delivery;

public abstract class Person {
	protected long id;
	protected int loc;

	public Person(long id, int loc) {
		super();
		this.id = id;
		this.loc = loc;
	}

	public long getId() {
		return id;
	}

	public int getLoc() {
		return loc;
	}

	
	
}
