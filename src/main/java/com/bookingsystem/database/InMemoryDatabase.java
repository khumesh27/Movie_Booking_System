package com.bookingsystem.database;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.bookingsystem.enums.Genre;
import com.bookingsystem.models.*;

public  class InMemoryDatabase {

    private static List<Movie> movies = new ArrayList<>();
    private static List<Show> shows = new ArrayList<>();

    static {
        // Step 1: Create Movies (shows = null initially)
        Movie m1 = new Movie(1, "Pathaan", Genre.ACTION, 160, 250.0, null);
        Movie m2 = new Movie(2, "RRR", Genre.ACTION, 185, 300.0, null);
        Movie m3 = new Movie(3, "Jawan", Genre.ACTION, 170, 280.0, null);
        Movie m4 = new Movie(4, "Gadar 2", Genre.ACTION, 155, 230.0, null);
        Movie m5 = new Movie(5, "3 Idiots", Genre.COMEDY, 165, 200.0, null);
        Movie m6 = new Movie(6, "Dangal", Genre.SPORT, 161, 240.0, null);
        Movie m7 = new Movie(7, "Chhichhore", Genre.DRAMA, 140, 210.0, null);
        Movie m8 = new Movie(8, "Brahmastra", Genre.FANTASY, 165, 260.0, null);
        Movie m9 = new Movie(9, "Uri: The Surgical Strike", Genre.THRILLER, 138, 220.0, null);
        Movie m10 = new Movie(10, "Shershaah", Genre.BIOPIC, 145, 230.0, null);

        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        movies.add(m4);
        movies.add(m5);
        movies.add(m6);
        movies.add(m7);
        movies.add(m8);
        movies.add(m9);
        movies.add(m10);

        // Step 2: Create Shows (movie = null initially)
        shows.add(new Show(1, null, 1, LocalDateTime.of(2025,11,13,10,0), new ArrayList<>(), 30));
        shows.add(new Show(2, null, 1, LocalDateTime.of(2025,11,13,13,0), new ArrayList<>(), 30));
        shows.add(new Show(3, null, 2, LocalDateTime.of(2025,11,13,18,0), new ArrayList<>(), 30));

        shows.add(new Show(4, null, 2, LocalDateTime.of(2025,11,13,11,0), new ArrayList<>(), 30));
        shows.add(new Show(5, null, 3, LocalDateTime.of(2025,11,13,15,0), new ArrayList<>(), 30));
        shows.add(new Show(6, null, 3, LocalDateTime.of(2025,11,13,19,30), new ArrayList<>(), 30));

        shows.add(new Show(7, null, 1, LocalDateTime.of(2025,11,13,9,0), new ArrayList<>(), 30));
        shows.add(new Show(8, null, 2, LocalDateTime.of(2025,11,13,14,0), new ArrayList<>(), 30));
        shows.add(new Show(9, null, 3, LocalDateTime.of(2025,11,13,20,0), new ArrayList<>(), 30));

        shows.add(new Show(10, null, 1, LocalDateTime.of(2025,11,13,10,15), new ArrayList<>(), 30));
        shows.add(new Show(11, null, 1, LocalDateTime.of(2025,11,13,16,0), new ArrayList<>(), 30));
        shows.add(new Show(12, null, 2, LocalDateTime.of(2025,11,13,19,45), new ArrayList<>(), 30));

        shows.add(new Show(13, null, 1, LocalDateTime.of(2025,11,13,9,30), new ArrayList<>(), 30));
        shows.add(new Show(14, null, 2, LocalDateTime.of(2025,11,13,14,30), new ArrayList<>(), 30));
        shows.add(new Show(15, null, 3, LocalDateTime.of(2025,11,13,18,30), new ArrayList<>(), 30));

        shows.add(new Show(16, null, 1, LocalDateTime.of(2025,11,13,10,45), new ArrayList<>(), 30));
        shows.add(new Show(17, null, 2, LocalDateTime.of(2025,11,13,13,45), new ArrayList<>(), 30));
        shows.add(new Show(18, null, 3, LocalDateTime.of(2025,11,13,17,45), new ArrayList<>(), 30));

        shows.add(new Show(19, null, 1, LocalDateTime.of(2025,11,13,9,15), new ArrayList<>(), 30));
        shows.add(new Show(20, null, 2, LocalDateTime.of(2025,11,13,12,15), new ArrayList<>(), 30));
        shows.add(new Show(21, null, 3, LocalDateTime.of(2025,11,13,19,0), new ArrayList<>(), 30));

        shows.add(new Show(22, null, 1, LocalDateTime.of(2025,11,13,10,0), new ArrayList<>(), 30));
        shows.add(new Show(23, null, 2, LocalDateTime.of(2025,11,13,13,0), new ArrayList<>(), 30));
        shows.add(new Show(24, null, 3, LocalDateTime.of(2025,11,13,18,0), new ArrayList<>(), 30));

        shows.add(new Show(25, null, 1, LocalDateTime.of(2025,11,13,9,45), new ArrayList<>(), 30));
        shows.add(new Show(26, null, 2, LocalDateTime.of(2025,11,13,15,15), new ArrayList<>(), 30));
        shows.add(new Show(27, null, 3, LocalDateTime.of(2025,11,13,20,15), new ArrayList<>(), 30));

        shows.add(new Show(28, null, 1, LocalDateTime.of(2025,11,13,11,15), new ArrayList<>(), 30));
        shows.add(new Show(29, null, 2, LocalDateTime.of(2025,11,13,16,15), new ArrayList<>(), 30));
        shows.add(new Show(30, null, 3, LocalDateTime.of(2025,11,13,21,0), new ArrayList<>(), 30));

        // Step 3: Assign 3 shows per movie
        m1.setShows(shows.subList(0, 3));
        m2.setShows(shows.subList(3, 6));
        m3.setShows(shows.subList(6, 9));
        m4.setShows(shows.subList(9, 12));
        m5.setShows(shows.subList(12, 15));
        m6.setShows(shows.subList(15, 18));
        m7.setShows(shows.subList(18, 21));
        m8.setShows(shows.subList(21, 24));
        m9.setShows(shows.subList(24, 27));
        m10.setShows(shows.subList(27, 30));

        // Step 4: Link movies inside shows
        for (int i = 0; i < shows.size(); i++) {
            if (i < 3) shows.get(i).setMovie(m1);
            else if (i < 6) shows.get(i).setMovie(m2);
            else if (i < 9) shows.get(i).setMovie(m3);
            else if (i < 12) shows.get(i).setMovie(m4);
            else if (i < 15) shows.get(i).setMovie(m5);
            else if (i < 18) shows.get(i).setMovie(m6);
            else if (i < 21) shows.get(i).setMovie(m7);
            else if (i < 24) shows.get(i).setMovie(m8);
            else if (i < 27) shows.get(i).setMovie(m9);
            else shows.get(i).setMovie(m10);
        }
    }

    public static List<Movie> getMovies() {
        return movies;
    }

    public static List<Show> getShows() {
        return shows;
    }
}

