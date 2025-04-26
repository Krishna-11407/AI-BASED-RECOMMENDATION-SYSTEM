package com.example.recommender;

import com.opencsv.CSVReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MovieDataLoader {
    public static List<Movie> loadMovies() {
        List<Movie> movies = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new InputStreamReader(
                MovieDataLoader.class.getResourceAsStream("/movies.csv")))) {
            String[] line;
            int id = 0;
            while ((line = reader.readNext()) != null) {
                if (line.length < 2 || line[0].equalsIgnoreCase("name")) continue;
                movies.add(new Movie(id++, line[0], line[1]));
            }
        } catch (Exception e) {
            System.err.println("Error loading movies: " + e.getMessage());
        }
        return movies;
    }
} 