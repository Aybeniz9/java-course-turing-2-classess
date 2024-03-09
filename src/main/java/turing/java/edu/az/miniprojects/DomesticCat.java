package turing.java.edu.az.miniprojects;

public class DomesticCat extends Pet{

    public DomesticCat(String name) {
            super(name, String.valueOf(Species.DOMESTIC_CAT));
        }

        @Override
        public void respond() {
            System.out.println("Miyauu!");
        }

        public void foul() {
            System.out.println("Mennn deliyemmm, xesteyemm mennn...");
        }
    public DomesticCat(String spaces, String nickname) {
        super(spaces, nickname);
    }

    public DomesticCat(String nickname, String spaces, int age, int trickLevel, String[] habits) {
        super(nickname, spaces, age, trickLevel, habits);
    }
}
