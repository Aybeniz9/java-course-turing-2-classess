package turing.java.edu.az.miniprojects;

import java.util.Arrays;
import java.util.Objects;


public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private DayOfWeek schedule;
    public Family family;
    private Human[] children = new Human[10];
    private int numChildren = 0;


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

    public DayOfWeek getSchedule() {
        return schedule;
    }

    public void setSchedule(DayOfWeek schedule) {
        this.schedule = schedule;
    }

    public boolean deleteChild(Human child) {
        for (int i = 0; i < numChildren; i++) {
            if (children[i].equals(child)) {
                children[i] = null;
                numChildren--;
                return true;
            }
        }
        return false;
    }

    public boolean deleteChild(int index) {
        if (index >= 0 && index < numChildren) {
            for (int i = index; i < numChildren - 1; i++) {
                children[i] = children[i + 1];
            }
            children[numChildren - 1] = null;
            numChildren--;
            return true;
        }
        return false;
    }

    public void addChild(Human child) {
        if (numChildren < children.length) {
            children[numChildren++] = child;
        }
    }

    public int countFamily() {
        return 1 + numChildren;
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

