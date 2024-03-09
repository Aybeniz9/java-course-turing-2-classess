package turing.java.edu.az.miniprojects;

public class DomesticCat extends Pet{

    public DomesticCat(String name) {
            super(name, String.valueOf(Species.DOMESTIC_CAT));
        }

        @Override
        public void respond() {
            System.out.println("Meow!");
        }

        public void foul() {
            System.out.println("Made a mess in the litter box...");
        }
    public DomesticCat(String spaces, String nickname) {
        super(spaces, nickname);
    }

    public DomesticCat(String nickname, String spaces, int age, int trickLevel, String[] habits) {
        super(nickname, spaces, age, trickLevel, habits);
    }
}
