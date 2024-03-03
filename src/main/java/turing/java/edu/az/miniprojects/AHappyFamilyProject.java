package turing.java.edu.az.miniprojects;

public class AHappyFamilyProject {
    public static void main(String[] args) {
        Pet pet = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human father = new Human("Vito", "Karleone", 1940);
        Human mother = new Human("Jane", "Karleone", 1950);
        Human child = new Human("Michael", "Karleone", 1977, 90, pet, mother, father, null);
        System.out.println(child.toString());
        child.pet.eat();
        child.pet.respond();
        child.pet.foul();
        child.greetPet();
        child.describePet();
    }
}
