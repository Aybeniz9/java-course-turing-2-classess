package Module02.module02;

public class Apple extends Fruit {

     public  String nationality;

    public Apple(String color, int kq) {
        super(color, kq);
    }

    public void eatApple( ){
         System.out.println("Alma yeyilmisdir");
     }
     public void giveApple(){
        System.out.println("Marketden alma alinmisdir");
    }
    public void soyApple(){
        System.out.println("Alma soyulmusdur");
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    //public Apple(String nationality) {
    //     this.nationality = nationality;
     //   super();
    }

