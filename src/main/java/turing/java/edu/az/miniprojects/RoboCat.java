package turing.java.edu.az.miniprojects;
import java.util.*;
public class RoboCat extends Pet {

    public RoboCat(String name) {
        super(name, String.valueOf(Species.ROBO_CAT));
    }

    @Override
    public void respond() {
        System.out.println("Biiip biiip! Iy em RoboCat.");
    }

    public RoboCat(String spaces, String nickname) {
        super(spaces, nickname);
    }

    public RoboCat(String nickname, String spaces, int age, int trickLevel, Set habits) {
        super(nickname, spaces, age, trickLevel, habits);
    }
}
