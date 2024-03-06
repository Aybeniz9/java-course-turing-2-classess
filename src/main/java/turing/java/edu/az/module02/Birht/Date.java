package turing.java.edu.az.module02.Birht;

import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2023,4,23));
        System.out.println(LocalDate.ofEpochDay(4567));
        System.out.println(LocalDate.ofYearDay(2020,31));
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.parse("2024-03-04"));
        System.out.println(LocalDate.MIN);
    }
}
