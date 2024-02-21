package turing.java.edu.az.module02;

public class PhaseFigure extends Figure {
    private double volume;
    public double height;
    public PhaseFigure(String name, String color) {
        super(name, color);
    }

    public PhaseFigure(String name, String color, int volume, int height) {
        super(name, color);
        this.volume = volume;
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double calculateVolume() {
        return 0;
    }

}
