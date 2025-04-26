package com.example.recommender;

public class Movie {
    private int id;
    private String name;
    private String genre;

    public Movie(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return name + " (" + genre + ")";
    }
} 