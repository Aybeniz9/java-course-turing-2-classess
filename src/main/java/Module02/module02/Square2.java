package Module02.module02;

public class Square2 extends PlainFigure {
    private double sideLength;

    public Square2(String name, String color, double area, double sideLength) {
        super(name, color, area);
        this.sideLength = sideLength;
    }

    public double calculatePerimeter() {
        return sideLength * 4;
    }

    public double calculateArea() {
        return sideLength * sideLength;
    }
}
