package Module02.module02;

public class PlainFigure extends Figure {
    private double area;
    public PlainFigure(String name, String color) {
        super(name, color);
    }

    public PlainFigure(String name, String color, double area) {
        super(name, color);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
