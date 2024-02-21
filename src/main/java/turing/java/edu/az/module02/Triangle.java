package turing.java.edu.az.module02;

public class Triangle extends PlainFigure {
    private double side1;
    private double side2;
    private double side3;
    private double base;
    private double height;

    public Triangle(String name, double height, String color, double side1, double side2, double side3, double base) {
        super(name, color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.height = height;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

}
