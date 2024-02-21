package turing.java.edu.az.module02;

public class TriangularPrism extends PhaseFigure {
    private double base;
    private double side;
    private double height;

    public TriangularPrism(String name, String color, double height, double base, double side) {
        super(name, color);
        this.height = height;
        this.base = base;
        this.side = side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculateVolume() {
        return 0.5 * base * side * height;
    }
}
