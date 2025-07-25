import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {

    Map<City, List<Theater>> theatersInCity;

    public TheaterController() {
        this.theatersInCity = new HashMap<>();
    }

    public void addTheaterToCity(City city, Theater theater) {
        List<Theater> theaters = theatersInCity.getOrDefault(city, new ArrayList<>());
        theaters.add(theater);
        theatersInCity.put(city, theaters);
    }

    public List<Theater> getTheatersInCity(City city) {
        return theatersInCity.getOrDefault(city, new ArrayList<>());
    }
}
