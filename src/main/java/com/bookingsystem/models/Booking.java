package com.bookingsystem.models;

import java.time.LocalDateTime;
import java.util.List;

import com.bookingsystem.enums.BookingStatus;

public class Booking {
	private int bookingId;
	private String userName;
	private Show show;
	private List<Seat> bookedSeats;
	private double totalAmount;
	private LocalDateTime bookingTime;
	private BookingStatus status;
	
	
	
	public Booking(int bookingId, String userName, Show show, List<Seat> bookedSeats, double totalAmount,
			LocalDateTime bookingTime, BookingStatus status) {
		super();
		this.bookingId = bookingId;
		this.userName = userName;
		this.show = show;
		this.bookedSeats = bookedSeats;
		this.totalAmount = totalAmount;
		this.bookingTime = bookingTime;
		this.status = status;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
	public List<Seat> getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(List<Seat> bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public LocalDateTime getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}
	public BookingStatus getStatus() {
		return status;
	}
	public void setStatus(BookingStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userName=" + userName + ", show=" + show + ", bookedSeats="
				+ bookedSeats + ", totalAmount=" + totalAmount + ", bookingTime=" + bookingTime + ", status=" + status
				+ "]";
	}
	
	
}
