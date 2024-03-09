package turing.java.edu.az.miniprojects;

import java.util.Arrays;
import java.util.Objects;


public class Human {
    private Family family;
    private DayOfWeek schedule;
    private String name;
    private String surname;
    private int year;
    private int iq;

    public DayOfWeek name(DayOfWeek dayOfWeek){
        return dayOfWeek;

    }
    public void greetPet() {
        System.out.println("Hello," +family.getPet().getNickname());
    }

    public void describePet() {
        String slyLevel = (family.getPet().getTrickLevel() > 50) ? "very sly" : "almost not sly";
        System.out.println("I have an " + family.getPet().getSpecies() + " is " + family.getPet().getAge() + " years old, he is " + slyLevel);
    }
    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, DayOfWeek schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = DayOfWeek.FRIDAY;
    }

    public Human() {
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

    public DayOfWeek getSchedule() {
        return DayOfWeek.FRIDAY;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = DayOfWeek.FRIDAY;
    }


    @Override
    public String toString() {
        return "Human{" +
                "schedule=" + Arrays.toString(new DayOfWeek[]{DayOfWeek.FRIDAY}) +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return getYear() == human.getYear() && getIq() == human.getIq() && Objects.equals(getFamily(), human.getFamily()) && getSchedule() == human.getSchedule() && Objects.equals(getName(), human.getName()) && Objects.equals(getSurname(), human.getSurname());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq);
        result = 31 * result + Arrays.hashCode(new DayOfWeek[]{DayOfWeek.FRIDAY});
        return result;
    }

    public void greetPet(Pet pet) {

    }
}

