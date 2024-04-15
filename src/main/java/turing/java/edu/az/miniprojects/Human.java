package turing.java.edu.az.miniprojects;

import java.util.Arrays;
import java.util.Objects;
import java.util.*;


public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Map<String,String> schedule;
    public Family family;
    private int numChildren = 0;


    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = new HashMap<>();
    }

    public Human() {
    }


    public DayOfWeek name(DayOfWeek dayOfWeek) {
        return dayOfWeek;

    }

    public void greetPet() {
        System.out.println("Hello," + family.getPet().getNickname());
    }

    public void describePet() {
        String slyLevel = (family.getPet().getTrickLevel() > 50) ? "very sly" : "almost not sly";
        System.out.println("I have an " + family.getPet().getSpecies() + " is " + family.getPet().getAge() + " years old, he is " + slyLevel);
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

    public int countFamily() {
        return 1 + numChildren;
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
                ", numChildren=" + numChildren +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return getYear() == human.getYear() && getIq() == human.getIq() && numChildren == human.numChildren && Objects.equals(getName(), human.getName()) && Objects.equals(getSurname(), human.getSurname()) && Objects.equals(getSchedule(), human.getSchedule()) && Objects.equals(getFamily(), human.getFamily());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getYear(), getIq(), getSchedule(), getFamily(), numChildren);
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public void greetPet(Pet pet) {

    }
}

