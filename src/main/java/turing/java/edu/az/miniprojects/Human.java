package turing.java.edu.az.miniprojects;

import java.util.Objects;
import java.util.*;


public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Map<String,String> schedule;
    public Family family;

    public Human(String name, String surname, int year, int iq, Map<String, String> schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }

    public Human(String name, String surname, int year, int iq, Map<String, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }


    public Human() {
    }


    public void greetPet() {

        for (int i = 0; i < family.getPet().size(); i++) {
            family.getPet().stream().forEach(pet -> System.out.println("Hello"+pet.getNickname()));

        }
    }
    public void describePet() {
        for (int i = 0; i <family.getPet().size();i++){
            family.getPet().stream().forEach(pet -> System.out.println("I have an "+pet.getSpaces()+"is"+pet.getAge()+"years old , he is "+((pet.getTrickLevel()> 50) ? "very sly" : "almost not sly")));

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
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

    public Map<String,String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String,String> schedule) {
        this.schedule = schedule;
    }
    public void addToSchedule(String day,String activity){
        schedule.put(day,activity);
    }



    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                ", family=" + family +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return getYear() == human.getYear() && getIq() == human.getIq() && Objects.equals(getName(), human.getName()) && Objects.equals(getSurname(), human.getSurname()) && Objects.equals(getSchedule(), human.getSchedule()) && Objects.equals(getFamily(), human.getFamily());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getYear(), getIq(), getSchedule(), getFamily());
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

//    public void greetPet(Pet pet) {
//        System.out.println("Hello"+family.getPet().getNickname());
//
//    }
}

