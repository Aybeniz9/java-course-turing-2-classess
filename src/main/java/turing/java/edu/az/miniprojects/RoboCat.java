package turing.java.edu.az.miniprojects;

public class RoboCat extends Pet{

    public RoboCat(String name) {
            super(name, String.valueOf(Species.ROBO_CAT));
        }

        @Override
        public void respond() {
            System.out.println("Beep boop! I am RoboCat.");
        }
    @Override
    public void foul() {

        System.out.println("RoboCat doesn't foul.");
    }
    public RoboCat(String spaces, String nickname) {
        super(spaces, nickname);
    }

    public RoboCat(String nickname, String spaces, int age, int trickLevel, String[] habits) {
        super(nickname, spaces, age, trickLevel, habits);
    }
}
