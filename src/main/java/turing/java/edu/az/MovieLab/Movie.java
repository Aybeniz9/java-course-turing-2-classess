package turing.java.edu.az.MovieLab;

public class Movie {
    public String  name;
    public  double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Movie(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }
}
