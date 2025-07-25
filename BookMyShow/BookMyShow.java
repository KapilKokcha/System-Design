package BookMyShow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import BookMyShow.City;

public class BookMyShow {

	MovieController movieController;
	TheaterController theaterController;

	public BookMyShow() {
		movieController = new MovieController();
		theaterController = new TheaterController();
	}

	public static void main(String[] args) {
		BookMyShow bookMyShow = new BookMyShow();
		bookMyShow.initialize();
	}

	public void initialize() {
		createMovies();
		createTheater();
	}

	public void createMovie() {
		Movie m1 = new Movie();
		m1.setName("Movie 1");

		Movie m2 = new Movie();
		m2.setName("Movie 2");

		movieController.setMovieInCity(City.Bangalore, m1);
		movieController.setMovieInCity(City.Bangalore, m2);
		movieController.setMovieInCity(City.Delhi, m1);
		movieController.setMovieInCity(City.Delhi, m2);
	}

	public void createTheater() {
		
		List<Movie>movie=movieController.getMoviesInCity(City.Bangalore);

		Theater t1 = new Theater("Thaeter 1");
		t1.setScreens(createScreens());
		
		t1.getScreens().stream().flatMap(screen -> screen.getShows().stream()).filter(show -> show.getId() == 1)
				.findFirst().ifPresent(show -> show.setMovie(movie.get(0)));
		

		Theater t2 = new Theater("Thaeter 2");
		t2.setScreens(createScreens());

	}

	public List<Screen> createScreens() {
		List<Screen> screens = new ArrayList<>();
		Screen s1 = new Screen();
		s1.setName("S1");
		s1.setSeats(createSeats());
		s1.setShows(createShows());
		screens.add(s1);
		return screens;
	}

	public List<Show> createShows() {
	    List<Show> shows = new ArrayList<>();

	    Show s1 = new Show();
	    s1.setId(1);
	    s1.setTime(LocalDateTime.now().plusHours(1));
	    s1.setDuration("2h 15m");
	    s1.setBookedSeats(new ArrayList<>());
	    shows.add(s1);

	    Show s2 = new Show();
	    s2.setId(2);
	    s2.setTime(LocalDateTime.now().plusHours(4));
	    s2.setDuration("2h 10m");
	    s2.setBookedSeats(new ArrayList<>());
	    shows.add(s2);

	    return shows;
	}
	
	public List<Seat> createSeats() {
		List<Seat> seats = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			Seat seat = new Seat();
			seat.setId(i);
			seat.seatType(SeatType.REGULAR);
			seats.add(seat);
		}

		for (int i = 10; i < 20; i++) {
			Seat seat = new Seat();
			seat.setId(i);
			seat.seatType(SeatType.RECLINER);
			seats.add(seat);
		}
		return seats;
	}

}
