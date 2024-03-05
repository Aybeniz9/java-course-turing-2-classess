package turing.java.edu.az.module02.Birht;

import java.time.LocalDate;

abstract class Person implements Nefess, Yatmaq {
    protected final LocalDate birthDate;
    String name;
    String year;

    Person(LocalDate birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    public abstract void doHappyBirthday();

}
