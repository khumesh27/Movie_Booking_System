package com.bookingsystem.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;

import com.bookingsystem.exception.InvalidMovieException;
import com.bookingsystem.models.Show;
import com.bookingsystem.service.ShowService;

public class ShowServiceImpl implements ShowService{

	@Override
	public List<Show> getAllShows() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Show getShowById(int showId) throws InvalidMovieException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addShow(Show show) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateShow(Show show) throws InvalidMovieException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteShow(int showld) throws InvalidMovieException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Show> getShowsByMovie(int novield) throws InvalidMovieException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Show> getShowsByTime(LocalDateTime time) {
		// TODO Auto-generated method stub
		return null;
	}

}
