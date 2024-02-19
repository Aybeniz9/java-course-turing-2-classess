package turing.java.edu.az.miniprojects;

public class Pet {
    public String nickname;
    public String spaces;

    public int age;
    public int trickLevel;
    public String[] habits;

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public Pet(String spaces, String nickname) {
        this.spaces = spaces;
        this.nickname = nickname;
    }

    public Pet(String nickname, String spaces, int age, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.spaces = spaces;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {

    }

}
