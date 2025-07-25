public enum SeatType {

	RECLINER(250), REGULAR(150);

	private final int price;

	SeatType(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

}
