package turing.java.edu.az.miniprojects;
import java.util.*;

final class Man extends Human {
    @Override
    public void greetPet(Pet pet) {

        getFamily().getPet().stream().forEach(pet1 -> System.out.println("Hello"+getSurname()));
    }

    public void repairCar() {
        System.out.println("Temir etme timeeesi");
    }


}
