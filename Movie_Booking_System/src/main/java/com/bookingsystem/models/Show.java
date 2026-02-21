package com.bookingsystem.models;

import java.time.LocalDateTime;
import java.util.List;

public class Show {
	private int showId;
	private Movie movie;
	private int screenNo;
	private LocalDateTime showTime;
	private List<Seat> seats;
	private int availableSeats;
	
	
	
	public Show(int showId, Movie movie, int screenNo, LocalDateTime showTime, List<Seat> seats, int availableSeats) {
		super();
		this.showId = showId;
		this.movie = movie;
		this.screenNo = screenNo;
		this.showTime = showTime;
		this.seats = seats;
		this.availableSeats = availableSeats;
	}
	public void setshowId(int showId) {
		this.showId = showId;
	}
	public int getshowId() {
		return showId;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public int getScreenNo() {
		return screenNo;
	}
	public void setScreenNo(int screenNo) {
		this.screenNo = screenNo;
	}
	public LocalDateTime getShowTime() {
		return showTime;
	}
	public void setShowTime(LocalDateTime showTime) {
		this.showTime = showTime;
	}
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	
	@Override
	public String toString() {
		return "Show [showId=" + showId + ", movie=" + movie + ", screenNo=" + screenNo + ", showTime=" + showTime
				+ ", seats=" + seats + ", availableSeats=" + availableSeats + "]";
	}
}
