package turing.java.edu.az.module02.Lesson1;

import java.util.Scanner;

public class ExceptionLesson {
    public static void main(String[] args) {


         final Scanner sc = new Scanner(System.in);

         final String str1 = sc.nextLine();
         final String str2 = sc.nextLine();
        int n1 = Integer.parseInt(str1);

        System.out.println(str1);
        int n2 = Integer.parseInt(str2);
        try {
        } catch (Exception e) {
            System.out.println(n1 / n2);

        }

    }
}