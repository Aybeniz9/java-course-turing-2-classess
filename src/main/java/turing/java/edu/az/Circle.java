package turing.java.edu.az;

public class Circle {
    public static double radius;
    public static String color;
    public long countOfCircle;
    public double calcLongth;

    public Circle(double radius, String color, long countOfCircle) {
        this.radius = radius;
        this.color = color;
        this.countOfCircle = countOfCircle;
    }


    public long countOfCircle() {
        return countOfCircle;
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
