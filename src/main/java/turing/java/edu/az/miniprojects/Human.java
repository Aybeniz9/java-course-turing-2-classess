package turing.java.edu.az.miniprojects;

import java.sql.Date;

public class Human {
    public String name;
    public String surname;
    public int year;
    public int  iq;
    Pet pet =new Pet();
    Human mother=new Human();
     Human father=new Human();

     public String [][]schedule= new String["day of week"]["activities"];
    public void greetPet(){
        System.out.println("Hello,"+pet.nickname);
    }
    public void describePet(){
        System.out.println("I have an "+pet.spaces+"is"+pet.age+"years old,he is"+pet.trickLevel+">50/"+pet.trickLevel+"<50");
    }

    public Human() {

    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

}
