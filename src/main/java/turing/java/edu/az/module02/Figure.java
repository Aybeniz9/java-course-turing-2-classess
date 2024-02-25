package turing.java.edu.az.module02;

public class Figure {
    public String name;
    public String color;
    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0;
    }
}
