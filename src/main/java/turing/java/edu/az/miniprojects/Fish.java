package turing.java.edu.az.miniprojects;

public class Fish extends Pet{


    public Fish(String name){
            super(name, String.valueOf(Species.FISH));
        }
        @Override
        public void respond() {
            System.out.println("swimminnggg");
        }
    @Override
    public void foul() {
        // Fish does not foul
        System.out.println("Fish doesn't foul.");
    }
    public Fish(String spaces, String nickname) {
        super(spaces, nickname);
    }

    public Fish(String nickname, String spaces, int age, int trickLevel, String[] habits) {
        super(nickname, spaces, age, trickLevel, habits);
    }
}
