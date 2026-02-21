package com.bookingsystem.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bookingsystem.database.InMemoryDatabase;
import com.bookingsystem.dao.MovieDAO;
import com.bookingsystem.models.Movie;


import com.bookingsystem.enums.Genre;

public  class MovieDAOImpl implements MovieDAO {

    private final List<Movie> movies = InMemoryDatabase.getMovies();
    
    @Override
    public List<Movie> getAllMovies() {
        return InMemoryDatabase.getMovies();
    }

    @Override
    public Optional<Movie> getMovieById(int movieId) {
//        for(int i=0; i<InMemoryDatabase.getMovies().size(); i++) {
//            if(InMemoryDatabase.getMovies().get(i).getMovieId()==movieId) {
//                return InMemoryDatabase.getMovies().get(i);
//            }
//        }
        return movies.stream()
               .filter(movies -> movies.getmovieID() == movieId)
               .findFirst();
    }
    @Override
    public Optional<Movie> getMovieBytitle(String movietitle) {
        return movies.stream()
               .filter(movies -> movies.getTitle().equalsIgnoreCase(movietitle.trim()))
               .findFirst();
    }

    @Override
    public List<Movie> getMovieBygenre(Genre moviegenre) {
        return movies.stream()
                .filter(movies -> movies.getGenre()==moviegenre)
                .collect(Collectors.toList());
    }
    @Override
    public void addMovie(Movie movie) {    
        movies.add(movie);
    }

    @Override
    public void updateMovie(Movie updatedMovie) {
        for (Movie movie : movies) {
            if (movie.getmovieID() == updatedMovie.getmovieID()) {
                movie.setTitle(updatedMovie.getTitle());
                movie.setGenre(updatedMovie.getGenre());
                movie.setDuration(updatedMovie.getDuration());
                movie.setBasePrice(updatedMovie.getBasePrice());
                break;
            }
        }
    }

    @Override
    public void deleteMovie(int movieId) {
        movies.removeIf(movie -> movie.getmovieID() == movieId);
    }
    
}