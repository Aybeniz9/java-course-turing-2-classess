package turing.java.edu.az.module02.Birht;

import java.time.LocalDate;

public class Student extends Person {
    int grade;
    String uniName;

    Student(LocalDate birthDate, String name) {
        super(birthDate, name);
    }


    @Override
    public void doHappyBirthday() {
        System.out.println(super.birthDate + "Happyyyy");

    }
}
