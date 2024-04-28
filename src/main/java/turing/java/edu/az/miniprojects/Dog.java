package turing.java.edu.az.miniprojects;
import java.util.*;

import java.util.Collections;

public class Dog extends Pet {
    public Dog(String name) {
        super(name, String.valueOf(Species.DOG));
    }

    @Override
    public void respond() {
        System.out.println("Havv Havvv!");
    }

    public void foul() {
        System.out.println("Surpriseee..");
    }

    public Dog(String spaces, String nickname) {
        super(spaces, nickname);
    }

    public Dog(String nickname, String spaces, int age, int trickLevel, Set habits) {
        super(nickname, spaces, age, trickLevel, habits);
    }
}
