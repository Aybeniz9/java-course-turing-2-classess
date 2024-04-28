package turing.java.edu.az.miniprojects;

final class Woman extends Human {

    public void greetPet(Pet pet) {
      getFamily().getPet().stream().forEach(pet1 -> System.out.println("Hello" + pet.getNickname()));
    }


    public void makeup() {
        System.out.println("Menim makeupa ehtiyacim yoxdur");
    }

}

