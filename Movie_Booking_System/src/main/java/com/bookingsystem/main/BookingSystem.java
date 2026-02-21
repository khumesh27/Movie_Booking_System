package com.bookingsystem.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.bookingsystem.db.DBConnection;
import com.bookingsystem.enums.Genre;
import com.bookingsystem.exception.InvalidMovieException;
import com.bookingsystem.models.Movie;
import com.bookingsystem.models.Show;
import com.bookingsystem.service.BookingService;
import com.bookingsystem.service.MovieService;
import com.bookingsystem.service.ShowService;
import com.bookingsystem.serviceImpl.BookingServiceImpl;
import com.bookingsystem.serviceImpl.MovieServiceImpl;
import com.bookingsystem.serviceImpl.ShowServiceImpl;

public class BookingSystem {

	private static final Scanner scanner = new Scanner(System.in);
	private static final MovieService service = new MovieServiceImpl();
	private static final ShowService showservice = new ShowServiceImpl();
	private static final BookingService book = new BookingServiceImpl();

	public static void main(String args[]) throws InvalidMovieException {

		boolean running = true;

		while (running) {
			BookingSystem.printMenu();
			System.out.println();
			System.out.print("Enter your choice:  ");
			int choice = scanner.nextInt();

			switch (choice) {

			// MOVIE TICKET BOOKING SYSTEM
			case 1:
				System.out.println("Case 1  List all Movie");
				List<Movie> allMovies = service.getAllMovies();
				System.out.println(allMovies);
				break;
			case 2:
				System.out.println("Enter movie  Id");
				int movie_id = scanner.nextInt();
				Optional<Movie> m = service.getMovieById(movie_id);
				System.out.println(m);
				break;
			case 3:
				scanner.nextLine();
				System.out.println("Enter movie Title");
				String movie_title = scanner.nextLine().trim();

				Optional<Movie> t = service.getMovieBytitle(movie_title);
				System.out.println(t);
				break;
			case 4:
				scanner.nextLine();
				System.out.println("Enter movie genre:");
				String genreInput = scanner.nextLine().trim().toUpperCase();

				Genre movie_genre;
				try {
					movie_genre = Genre.valueOf(genreInput);
				} catch (IllegalArgumentException e) {
					System.out.println("Invalid genre entered!");
					return;
				}
				List<Movie> g = service.getMoviesByGenre(movie_genre);
				g.forEach(System.out::println);
				System.out.println(g);
				break;
			case 5:
				System.out.println("Enter MovieID: ");
				int movieid = scanner.nextInt();
				scanner.nextLine();

				System.out.print("Enter movietitle: ");
				String movietitle = scanner.nextLine();

				System.out.println("Enter movie genre:");
				String genre = scanner.nextLine().trim().toUpperCase();

				System.out.println("Enter movie duration:");
				int duration = scanner.nextInt();

				System.out.println("Enter movie basePrice:");
				double basePrice = scanner.nextDouble();

//				Genre movie_genre1;
				try {

//					movie_genre1 = Genre.valueOf(genre);
					Connection con = DBConnection.getDBConnection();
					Statement st = con.createStatement();
					String query = "INSERT INTO movies (movie_id, title, genre, duration, base_price) VALUES ("
					        + movieid + ", '"
					        + movietitle + "', '"
					        + genre + "', "
					        + duration + ", "
					        + basePrice + ");";

					st.execute(query);
				} catch (IllegalArgumentException | SQLException e) {
					System.out.println("Invalid genre entered!");
					return;
				}

//				System.out.print("Enter duration: ");
//				int duration = scanner.nextInt();
//
//				System.out.print("Enter baseprice: ");
//				double baseprice = scanner.nextDouble();
//				scanner.nextLine();
//				Movie addmovie = new Movie(movieid, movietitle, movie_genre1, duration, baseprice, null);
//				service.addMovie(addmovie);
				System.out.println("Movie added successfully.");
				break;
			case 6:
				System.out.println("Update Movie");
				System.out.print("Enter movie ID to Update: ");
				int movieid1 = scanner.nextInt();
//				if (!service.getMovieById(movieid1).equals(null)) {
//					System.out.println("Movie Found ! ");
					System.out.println("Enter MovieID: ");
					int umovieid = scanner.nextInt();
					scanner.nextLine();

					System.out.print("Enter movietitle: ");
					String umovietitle = scanner.nextLine();

					System.out.println("Enter movie genre:");
					String ugenre = scanner.nextLine().trim().toUpperCase();

					Genre umovie_genre1;
					try {
						umovie_genre1 = Genre.valueOf(ugenre);
					} catch (IllegalArgumentException e) {
						System.out.println("Invalid genre entered!");
						return;
					}

					System.out.print("Enter duration: ");
					int uduration = scanner.nextInt();

					System.out.print("Enter baseprice: ");
					double ubaseprice = scanner.nextDouble();
					scanner.nextLine();
					Movie uaddmovie = new Movie(umovieid, umovietitle, umovie_genre1, uduration, ubaseprice, null);
//					service.updateMovie(uaddmovie);
					System.out.println("Movie updated successfully.");
					// service.updateMovie(movieid1);
//				} else {
//					System.out.println("Movie not Found ! ");
//				}
				break;
			case 7:
				System.out.print("Enter movie ID to remove: ");
				int id = scanner.nextInt();
     			service.deleteMovie(id);
				System.out.println("Book removed.");
				break;

			case 8:
				System.out.println("List all Show");
				List<Show> allshows = showservice.getAllShows();
				System.out.println(allshows);
				break;
			case 9:
				System.out.println("Book a seat for a show !");
				break;
			case 10:
				System.out.println("Cancle a booking !");
				break;
			case 11:
				running = false;
				System.out.println("Exit !");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void printMenu() {
		System.out.println("\n=== MOVIE TICKET BOOKING SYSTEM ===");
		System.out.println();

		System.out.println("1. List all Movie");
		System.out.println("2. Search movie by Id ");
		System.out.println("3. Search movie by title");
		System.out.println("4. Search movie by genre");
		System.out.println("5. Add movie");
		System.out.println("6. Update Movie ");
		System.out.println("7. Delete movie ");
		System.out.println("8. List all Show");
		System.out.println("9. Book a seat for a show ");
		System.out.println("10. Cancle a booking  ");
		System.out.println("11. Exit Application ");

	}
}



