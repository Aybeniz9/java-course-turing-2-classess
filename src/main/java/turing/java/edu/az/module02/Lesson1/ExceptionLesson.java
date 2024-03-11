package turing.java.edu.az.module02.Lesson1;

import java.util.Scanner;

public class ExceptionLesson {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String surname = sc.nextLine();
        int n1 = Integer.parseInt(name);

        System.out.println(name);
        int n2 = Integer.parseInt(surname);
        try {
        } catch (Exception e) {
            System.out.println(n1 / n2);

        }

    }
}