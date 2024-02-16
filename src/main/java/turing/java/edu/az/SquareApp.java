package turing.java.edu.az;

public class SquareApp {
    private double side;
    private String color;
    public long countOfSquares;
    public long countOfCircle() {
        return countOfSquares;
    }
    public SquareApp(double side, String color, long countOfSquares) {
        this.side=side;
        this.color = color;
        this.countOfSquares=countOfSquares;
    }
    public String getColor() {
        return color;
    }
    public double setSide() {
        return side;
    }
    public void setColor() {
        if (color == "White")
            this.color = color;
    } public double getCalcLongth(){
        return side*side;
    }
}
