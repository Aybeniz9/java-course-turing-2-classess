package turing.java.edu.az.miniprojects;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String status=sc.nextLine();
        sendEmail(status);}

        public static void sendEmail(String status){
        if ("ACCEPTED".equalsIgnoreCase(status)){
            System.out.println("Your order accepted!");

        }

        else if ("SHIPPER".equalsIgnoreCase(status)){
            System.out.println("Your order has shipped!");

        }
        else if ("DElivered".equalsIgnoreCase(status)){
            System.out.println("Your order has delivered!");
        }
        else {
            System.out.println("Sustem Error!");
        }

    }
}
