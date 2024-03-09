package turing.java.edu.az.miniprojects;


public class Dog extends Pet{
    public Dog(String name) {
            super(name, String.valueOf(Species.DOG));
        }

        @Override
        public void respond() {
            System.out.println("Woof!");
        }

        public void foul() {
            System.out.println("Left a surprise in the backyard...");
        }
    public Dog(String spaces, String nickname) {
        super(spaces, nickname);
    }

    public Dog(String nickname, String spaces, int age, int trickLevel, String[] habits) {
        super(nickname, spaces, age, trickLevel, habits);
    }
}
