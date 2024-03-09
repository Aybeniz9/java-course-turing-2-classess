package turing.java.edu.az.miniprojects;

final class Woman extends Human{
    @Override
    public void greetPet(Pet pet) {
        System.out.println("Hi, sweet " + getFamily().getPet().getNickname() + "!");
    }

    public void makeup() {
        System.out.println("Time to do some makeup.");
    }

}
