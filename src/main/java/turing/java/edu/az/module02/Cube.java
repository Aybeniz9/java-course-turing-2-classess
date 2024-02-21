package turing.java.edu.az.module02;

public class Cube extends PhaseFigure {
    private double height;

    public Cube(String name, String color, double volume, double height) {
        super(name, color);
        this.height = height;
    }

    public double calculateVolume() {
        return 0;
    }
}
