import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {

	Map<City, List<Movie>> cityAndMovies;

	MovieController() {
		cityAndMovies = new HashMap<>();

	}

	public List<Movie> getMoviesInCity(City city) {
		return cityAndMovies.get(city);
	}

	public void setMovieInCity(City city, Movie movie) {
		List<Movie> movies = cityAndMovies.getOrDefault(city, new ArrayList<>());
		movies.add(movie);
		cityAndMovies.put(city, movies);
	}

}
