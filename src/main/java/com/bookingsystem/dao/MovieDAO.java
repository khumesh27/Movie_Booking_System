package com.bookingsystem.dao;

import java.util.List;
import java.util.Optional;

import com.bookingsystem.enums.Genre;
import com.bookingsystem.models.*;
public interface MovieDAO {
	
	List<Movie> getAllMovies();
	Optional<Movie>  getMovieById(int movieId);
	Optional<Movie>  getMovieBytitle(String movietitle);
	List<Movie> getMovieBygenre(Genre moviegenre);
	void addMovie(Movie movie);
	void updateMovie(Movie movie);
	void deleteMovie(int movieId);
	
}
