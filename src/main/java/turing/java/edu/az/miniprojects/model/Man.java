package turing.java.edu.az.miniprojects.model;

final class Man extends Human {
    private static final String motherName = "Mami";
    private static final String motherSurname = "Fati";

    Man() {
        super(motherName, motherSurname);
    }


    public void greetPet(Pet pet) {

        getFamily().getPet().stream().forEach(pet1 -> System.out.println("Hello" + getSurname()));
    }

    public void repairCar() {
        System.out.println("Temir etme timeeesi");
    }


}
