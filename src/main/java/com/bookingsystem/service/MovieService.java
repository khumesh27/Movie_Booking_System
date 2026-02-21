package com.bookingsystem.service;

import java.util.List;
import java.util.Optional;

import com.bookingsystem.enums.Genre;
import com.bookingsystem.exception.InvalidMovieException;
import com.bookingsystem.models.Movie;

public interface MovieService {
	List<Movie> getAllMovies();

	Optional<Movie>  getMovieById(int movieId) throws InvalidMovieException;
	Optional<Movie>  getMovieBytitle(String movietitle) throws InvalidMovieException;

	void addMovie (Movie movie);

	void updateMovie(Movie movie) throws InvalidMovieException;

	void deleteMovie(int novield) throws InvalidMovieException;

	List<Movie> getMoviesByGenre(Genre genre);

}


