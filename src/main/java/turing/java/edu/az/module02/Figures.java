package turing.java.edu.az.module02;

public class Figures {
    public static void main(String[] args) {
        PlainFigure plainFigure = new PlainFigure("Square", "Yellow");
        Square2 square2 = new Square2("Square", "Pink", 45, 6);
        Triangle triangle = new Triangle("Triangle", 45, "blue", 2, 3, 4, 5);
        PhaseFigure phaseFigure = new PhaseFigure("Cube", "red", 43, 12);
        System.out.println(plainFigure.name);
        System.out.println(plainFigure.color);
        System.out.println(phaseFigure.height);
        System.out.println(phaseFigure.name);
        System.out.println(triangle.calculateArea());
    }
}
