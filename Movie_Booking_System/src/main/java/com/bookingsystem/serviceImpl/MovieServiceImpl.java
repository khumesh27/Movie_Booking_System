package com.bookingsystem.serviceImpl;
import com.bookingsystem.enums.Genre;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.bookingsystem.service.MovieService;

import com.bookingsystem.dao.MovieDAO;
import com.bookingsystem.daoImpl.MovieDAOImpl;
import com.bookingsystem.enums.Genre;
import com.bookingsystem.exception.InvalidMovieException;
import com.bookingsystem.models.Movie;

public  class   MovieServiceImpl implements MovieService {
    
    private final MovieDAO dao;
    
    public MovieServiceImpl() {
       this.dao = new MovieDAOImpl();
   }
    public List<Movie> getAllMovies(){
        System.out.println("Movie ServiceIMpl");
        return dao.getAllMovies();
    }
    @Override
    public Optional<Movie> getMovieById(int movieId) throws InvalidMovieException {
        return dao.getMovieById(movieId);
    }
    @Override
    public Optional<Movie> getMovieBytitle(String movietitle) throws InvalidMovieException {
        return dao.getMovieBytitle(movietitle);
    }    
    @Override
	public List<Movie> getMoviesByGenre(Genre genre) {
		// TODO Auto-generated method stub
    	 return dao.getMovieBygenre(genre);
		
	}

    @Override
    public void addMovie(Movie movie) {
        // TODO Auto-generated method stub
         dao.addMovie(movie);
        
    }
    @Override
    public void updateMovie(Movie movieId) throws InvalidMovieException {
        dao.updateMovie(movieId);
    }
    @Override
    public void deleteMovie(int movield) throws InvalidMovieException {
        // TODO Auto-generated method stub
        dao.deleteMovie(movield);
        
    }
	
}