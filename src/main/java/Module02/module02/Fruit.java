package Module02.module02;

public class Fruit {
    public String color;
    public int kq;

    public String getColor() {
        return color;
    }

    public int getKq() {
        return kq;
    }

    public Fruit(String color, int kq) {
        this.color = color;
        this.kq = kq;
    }


    public static void main(String[] args) {
       // Apple apple=new Apple("Quba");
        //System.out.println(apple.nationality);
        Fruit fruit=new Fruit("Qirmizi",5);
    }

}
