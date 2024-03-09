package turing.java.edu.az.miniprojects;

public enum Species {
    DOG("Dog"),
    FISH("FISH"),
    ROBO_CAT("ROBOCAT"),
    UNKNOWN("UNKNOWN)"),
    DOMESTIC_CAT("domestic cat");
    private final String speciesName;

    Species(String speciesName) {
        this.speciesName = speciesName;
    }
    @Override
    public String toString() {
        return speciesName;
    }
}
