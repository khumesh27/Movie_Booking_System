package com.bookingsystem.dao;

import java.util.List;

import com.bookingsystem.models.*;

public interface BookingDAO {
	
	Booking getBookingById(int bookingId);
	void addBooking(Booking booking);
	void updateBooking(Booking booking);
	void deleteBooking(int bookingId);
	List<Booking> getBookingsByUser(String userName);
	List<Booking> getBookingsByShow(int showId);
	
}
