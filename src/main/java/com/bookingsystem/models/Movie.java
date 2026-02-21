package com.bookingsystem.models;
import java.util.List;

import com.bookingsystem.enums.Genre;

public class Movie {
	private int movieId;
	private String title;
	private Genre genre;
	private int duration;
	private double basePrice;
//	private List<Show> shows;


	public Movie(int movieId, String title, Genre genre, int duration, double basePrice, List<Show> shows) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.basePrice = basePrice;
//		this.shows = shows;
	}
	public void setmovieID(int movieId) {
		this.movieId = movieId;
	}
	public int getmovieID() {
		return movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
//	public List<Show> getShows() {
//		return shows;
//	}
//	public void setShows(List<Show> shows) {
//		this.shows = shows;
//	}
	
	
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", genre=" + genre + ", duration=" + duration
				+ ", basePrice=" + basePrice + /*", shows=" + shows +*/ "]  \n";
	}
	public void setShows(List<Show> subList) {
		// TODO Auto-generated method stub
		
	}
}
