import java.util.ArrayList;
import java.util.List;

public class Theater {
	List<Screen> screens;
	String name;
	String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Theater(String name) {
		super();
		this.name = name;
	}

	public Theater(List<Screen> screens, String name) {
		super();
		this.screens = screens;
		this.name = name;
	}

	public List<Screen> getScreens() {
		return screens;
	}

	public String getName() {
		return name;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}

	public void setName(String name) {
		this.name = name;
	}

}
