package turing.java.edu.az.miniprojects.model;

import java.util.Map;

final class Woman extends Human {


    public Woman(String name, String surname, long year, int iq, Map<String, String> schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    public void greetPet(Pet pet) {
        getFamily().getPet().stream().forEach(pet1 -> System.out.println("Hello" + pet.getNickname()));
    }


    public void makeup() {
        System.out.println("Menim makeupa ehtiyacim yoxdur");
    }

}

