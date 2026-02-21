package com.bookingsystem.service;

import java.time.LocalDateTime;
import java.util.List;

import com.bookingsystem.exception.InvalidMovieException;
import com.bookingsystem.models.*;

public interface ShowService {
	List <Show> getAllShows();

	Show getShowById(int showId) throws InvalidMovieException;

	void addShow(Show show);

	void updateShow(Show show) throws InvalidMovieException;

	void deleteShow(int showld) throws InvalidMovieException;

	List <Show> getShowsByMovie(int novield) throws InvalidMovieException;

	List <Show> getShowsByTime(LocalDateTime time);

}
