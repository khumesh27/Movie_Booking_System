package com.bookingsystem.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.bookingsystem.models.*;

public interface ShowDAO {
	
	List<Show> getAllShows();
	Show getShowById(int showId);
	void addShow(Show show);
	void updateShow(Show show);
	void deleteShow(int showId);
	List<Show> getShowsByMovie(int movieId);
	List<Show> getShowsByTime(LocalDateTime time);
	
}
