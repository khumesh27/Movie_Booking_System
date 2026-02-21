package com.bookingsystem.service;

import java.util.List;

import com.bookingsystem.exception.InvalidMovieException;
import com.bookingsystem.exception.SeatNotAvaialableException;
import com.bookingsystem.models.Seat;

public interface SeatService {
	List<Seat> getSeatsByShow(int showId) throws InvalidMovieException;

	List <Seat> getAvailableSeats(int shouId) throws InvalidMovieException; 
	void bookSeat(int should, int seatNumber) throws SeatNotAvaialableException, InvalidMovieException;

	void cancelseat(int should, int seatNunber) throws InvalidMovieException;

	double calculateSeatPrice(int shouId, int seatNuMber) throws InvalidMovieException;

}
