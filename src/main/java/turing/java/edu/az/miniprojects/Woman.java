package turing.java.edu.az.miniprojects;

final class Woman extends Human {
    @Override
    public void greetPet(Pet pet) {
        System.out.println("Hi, sweet " + family.getPet().getNickname() + "!");
    }

    public void makeup() {
        System.out.println("Menim makeupa ehtiyacim yoxdur");
    }

}
