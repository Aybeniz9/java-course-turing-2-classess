package turing.java.edu.az.miniprojects;

final class Man extends Human{
    @Override
    public void greetPet(Pet pet) {
        System.out.println("Hey there, " + getFamily().getPet().getNickname()+ "!");
    }

    public void repairCar() {
        System.out.println("Time to fix the car.");
    }


}
