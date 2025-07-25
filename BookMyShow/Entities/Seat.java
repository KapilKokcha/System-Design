
public class Seat {
	long id;
	String row;
	SeatType seatType;

	// Can add seat type or more details
	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
