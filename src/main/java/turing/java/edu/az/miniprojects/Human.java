package turing.java.edu.az.miniprojects;

import java.util.Arrays;
import java.util.Objects;

import static java.lang.String.format;

public class Human {

    private String[][] schedule;
    private String name;
    private String surname;
    private int year;
    private int iq;
     public Pet pet ;
     private Human mother;
    private Human father;
//    private String n;
//    private String day;


//    public static class Schedule {
//        public String[][] schedule;

//        public Schedule() {
//            this.schedule = new String[][]{
//                    {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"},
//                    {"Exercise", "Reading", "Cooking", "Gardening", "Painting", "Hiking", "Family Time"}
//            };
//        }
//
//        public String getActivity(String day) {
//            for (int i = 0; i < schedule[0].length; i++) {
//                if (schedule[0][i].equalsIgnoreCase(day)) {
//                    return schedule[1][i];
//                }
//            }
//            return "No activity found for " + day;
//        }
//    }
public Human(String name, String surname, int year) {
    this.name = name;
    this.surname = surname;
    this.year = year;
}
    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello," + pet.getNickname());
    }

    public void describePet() {
        String slyLevel = (pet.getTrickLevel() > 50) ? "very sly" : "almost not sly";
        System.out.println("I have an " + pet.getSpecies() + " is " + pet.getAge() + " years old, he is " + slyLevel);
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq + ", mother=" + mother.getName() + " " + mother.getSurname() + ", father=" + father.getName() + " " + father.getSurname() + ", pet=" + pet.toString() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return year == human.year && iq == human.iq && Arrays.equals(schedule, human.schedule) && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father) ;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, pet, mother, father);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }



}

