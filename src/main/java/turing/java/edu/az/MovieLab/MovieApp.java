package turing.java.edu.az.MovieLab;

import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {
        System.out.println("Press 1. Enter 3 Movies and Ratings\nPress 2. Display the Movies \nPress 3. Add one more Movie \nPress 0. Exit");
        int count = 0;
        Scanner sc = new Scanner(System.in);
        Movie[] array = new Movie[1000];
        for (int j = 0; j < 1000; j++) {
            System.out.println("Please enter the number");
            int number = sc.nextInt();
            if (number == 1) {                                     //1
                for (int i = 0; i < 3; i++) {
                    System.out.println("Enter name");
                    String name = sc.next();
                    System.out.println("Enter rating");
                    double rating = sc.nextDouble();
                    Movie movie = new Movie(name, rating);
                    array[i] = movie;
                    count++;
                }
            } else if (number == 2) {                      //2
                if (array[0] == null) {
                    System.out.println("Enter first number pls");
                } else {
                    for (int i = 0; i < count; i++) {
                        if (array[i] == null)
                            break;
                        System.out.print(i + 1 + " movie " + array[i].getName() + " " + array[i].getRating());
                        System.out.println();
                    }
                }

            } else if (number == 3) {                            //3
                System.out.println("Enter how many movies");
                int numberOpt3 = sc.nextInt();
                int n= count;
                for (int i = n; i < numberOpt3 + n; i++) {
                    System.out.println("Enter name");
                    String name = sc.next();
                    System.out.println("Enter rating");
                    double rating = sc.nextDouble();
                    Movie movie = new Movie(name, rating);
                    array[i] = movie;
                    count++;
                }

            } else if (number == 0) {
                System.out.println("Bayss");
                break;
            } else {
                System.out.println("Invalid number");
            }
        }
    }
}
