package turing.java.edu.az;

public class Circle {
    private final double radius;
    private String color;
    public long countOfCircles;
    public double calcLongth;

    public Circle(double radius, String color, long countOfCircles) {
        this.radius = radius;
        this.color = color;
        this.countOfCircles = countOfCircles;
    }public long countOfCircle() {
        return countOfCircles;
    }

    public double calcLongth() {
        return calcLongth;
    }
    public String getColor() {

        return color;
    }

    public void setColor() {
        if (color != "White")
            this.color = color;
    }
}
