package Module02.module02;

public class Circle {
    private final double radius;
    private String color;
    public long countOfCircles;

    public Circle(double radius, String color, long countOfCircles) {
        this.radius = radius;
        this.color = color;
        this.countOfCircles = countOfCircles;
    }public long countOfCircle() {
        return countOfCircles;
    }
    public String getColor() {

        return color;
    }

    public void setColor() {
        if (color != "White")
            this.color = color;
    }
    public double getCalcLongth(){
        return 2*Math.PI*radius;
    }
}
