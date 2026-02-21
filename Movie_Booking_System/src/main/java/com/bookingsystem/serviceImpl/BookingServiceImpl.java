package com.bookingsystem.serviceImpl;

import java.util.List;

import com.bookingsystem.exception.InvalidBookingException;
import com.bookingsystem.exception.InvalidMovieException;
import com.bookingsystem.exception.SeatNotAvaialableException;
import com.bookingsystem.models.*;
import com.bookingsystem.service.BookingService;

public class BookingServiceImpl implements BookingService{

	@Override
	public Booking createBooking(String userName, int showId, List<Integer> seatNumbers)
			throws SeatNotAvaialableException, InvalidMovieException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelBooking(int bookingId) throws InvalidBookingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Booking getBookingById(int bookingId) throws InvalidBookingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> getBookingsByUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> getBookingsByShow(int showld) throws InvalidMovieException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateTotalAmount(List<Seat> seats) {
		// TODO Auto-generated method stub
		return 0;
	}

}
