package movies;


import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    static Input input = new Input();

    public static void main(String[] args) {

        Movie[] movies = MoviesArray.findAll();

        System.out.println("-----Welcome to the movie app-------");
        int userInput;
        do {
            System.out.println("\n    What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - add new movie\n"+
                    "\n" +
                    "Enter your choice:");
            userInput = input.getInt();

            movies = showMovies(userInput, movies);


        } while (userInput != 0);

    }


        public static Movie[] showMovies(int categoryNum, Movie[] movies) {
            String category = "";
            System.out.println("\n");

            switch (categoryNum) {
                case 0:
                    System.out.println("★─▄█▀▀║░▄█▀▄║▄█▀▄║██▀▄║─★\n" +
                            "★─██║▀█║██║█║██║█║██║█║─★\n" +
                            "★─▀███▀║▀██▀║▀██▀║███▀║─★\n" +
                            "★───────────────────────★\n" +
                            "★───▐█▀▄─ ▀▄─▄▀ █▀▀──█───★\n" +
                            "★───▐█▀▀▄ ──█── █▀▀──▀───★\n" +
                            "★───▐█▄▄▀ ──▀── ▀▀▀──▄───★");
                    break;
                case 1:
                    System.out.println("Displaying all movies:");
                    for (Movie movie : movies) {
                        System.out.println(movie.getCategory() + " -- " + movie.getName());
                    }
                    return movies;
                case 2:
                    category = "animated";
                    break;
                case 3:
                    category = "drama";
                    break;
                case 4:
                    category = "horror";
                    break;
                case 5:
                    category = "scifi";
                    break;
                case 6:
                    movies = addNewMovie(movies);
                    return movies;
            }

            if (categoryNum != 0 ) {
                System.out.println("Displaying " + category + " movies: ");
                for (Movie movie : movies) {
                    if (movie.getCategory().equals(category))
                        System.out.println(movie.getCategory() + " -- " + movie.getName());
                }
            }
            return movies;

        }

    public static Movie[] addNewMovie(Movie[] oldArray) {
        System.out.println("Let's add a new movie!\n");
        System.out.println("give me the movie name please");

        String movieName =input.getString();

        System.out.println("What it's category");

        String moviecat =input.getString();

        Movie[] newArray = new Movie[oldArray.length + 1];

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }


        newArray[oldArray.length] = new Movie(movieName, moviecat) ;

        return newArray;
    }
    }//end of main


