package turing.java.edu.az.module02;

public class RectangleApp {
    private double side1;
    private double side2;
    private String color;

    public long countOfRectangle;
    public long getCountOfRectangle() {
        return countOfRectangle;
    }
    public RectangleApp(double side1, double side2, String color, long countOfRectangle) {
        this.side1=side1;
        this.side2=side2;
        this.color = color;

    }
    public String getColor() {
        return color;
    }
    public double setSide1() {
        return side1;
    }
    public double setSide2() {
        return side1;
    }
    public void setColor() {
        if (color == "White")
            this.color = color;
    } public double getCalcLongth(){
        return side1*side2;
    }
}
