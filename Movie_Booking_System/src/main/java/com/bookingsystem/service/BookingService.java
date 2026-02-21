package com.bookingsystem.service;

import java.util.List;

import com.bookingsystem.exception.InvalidBookingException;
import com.bookingsystem.exception.InvalidMovieException;
import com.bookingsystem.exception.SeatNotAvaialableException;
import com.bookingsystem.models.*;

public interface BookingService {
	
			Booking createBooking(String userName, int showId, List<Integer> seatNumbers)
					throws SeatNotAvaialableException, InvalidMovieException;

			void cancelBooking(int bookingId) throws InvalidBookingException; 
			Booking getBookingById(int bookingId) throws InvalidBookingException;

			List <Booking> getBookingsByUser(String userName);

			List <Booking> getBookingsByShow(int showld) throws InvalidMovieException;

			double calculateTotalAmount (List<Seat> seats);

}




