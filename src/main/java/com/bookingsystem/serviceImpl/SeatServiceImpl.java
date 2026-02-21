package com.bookingsystem.serviceImpl;

import java.util.List;

import com.bookingsystem.exception.InvalidMovieException;
import com.bookingsystem.exception.SeatNotAvaialableException;
import com.bookingsystem.models.Seat;
import com.bookingsystem.service.SeatService;

public class SeatServiceImpl implements SeatService{

	@Override
	public List<Seat> getSeatsByShow(int showId) throws InvalidMovieException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seat> getAvailableSeats(int shouId) throws InvalidMovieException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void bookSeat(int should, int seatNumber) throws SeatNotAvaialableException, InvalidMovieException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelseat(int should, int seatNunber) throws InvalidMovieException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateSeatPrice(int shouId, int seatNuMber) throws InvalidMovieException {
		// TODO Auto-generated method stub
		return 0;
	}

}
