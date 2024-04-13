package turing.java.edu.az.miniprojects;
import java.util.*;

final class Man extends Human {
    @Override
    public void greetPet(Pet pet) {
        System.out.println("SAALAAAMMM Mann " + family.getPet().getNickname() + "!");
    }

    public void repairCar() {
        System.out.println("Temir etme timeeesi");
    }


}
