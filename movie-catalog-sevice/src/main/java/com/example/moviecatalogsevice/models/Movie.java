package com.example.moviecatalogsevice.models;

public class Movie {

    private int movieId;
    private String title;

    public Movie() {
    }

    public Movie(int movieId, String title) {
        this.movieId = movieId;
        this.title = title;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
