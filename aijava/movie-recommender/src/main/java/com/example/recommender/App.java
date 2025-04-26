package com.example.recommender;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Movie> movies = MovieDataLoader.loadMovies();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Movie Recommendation System!");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Recommend by Genre");
            System.out.println("2. Recommend Similar Movies");
            System.out.println("3. List All Movies");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();
            if (choice.equals("0")) break;
            switch (choice) {
                case "1":
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine().trim().toLowerCase();
                    List<Movie> byGenre = movies.stream()
                        .filter(m -> m.getGenre().toLowerCase().contains(genre))
                        .collect(Collectors.toList());
                    if (byGenre.isEmpty()) System.out.println("No movies found for this genre.");
                    else byGenre.forEach(System.out::println);
                    break;
                case "2":
                    System.out.print("Enter movie name: ");
                    String name = scanner.nextLine().trim().toLowerCase();
                    Optional<Movie> base = movies.stream()
                        .filter(m -> m.getName().toLowerCase().contains(name))
                        .findFirst();
                    if (base.isPresent()) {
                        List<Movie> similar = movies.stream()
                            .filter(m -> !m.getName().equals(base.get().getName()) && m.getGenre().equalsIgnoreCase(base.get().getGenre()))
                            .limit(10)
                            .collect(Collectors.toList());
                        if (similar.isEmpty()) System.out.println("No similar movies found.");
                        else similar.forEach(System.out::println);
                    } else {
                        System.out.println("Movie not found.");
                    }
                    break;
                case "3":
                    movies.forEach(System.out::println);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        System.out.println("Goodbye!");
    }
}
