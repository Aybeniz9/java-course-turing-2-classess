package turing.java.edu.az.miniprojects;

import java.util.Arrays;
import java.util.Objects;


public class Human {
    private Family family;
    private String[][] schedule;
    private String name;
    private String surname;
    private int year;
    private int iq;
    //public Pet pet ;
//     private Human mother;
//    private Human father;
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
//    public Human(String name, String surname, int year, Human mother, Human father) {
//        this.name = name;
//        this.surname = surname;
//        this.year = year;
//       this.mother = mother;
//     this.father = father;
//    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
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
//
//    public Pet getPet() {
//        return pet;
//    }
//
//    public void setPet(Pet pet) {
//        this.pet = pet;
//    }
//
//    public Human getMother() {
//        return mother;
//    }
//
//    public void setMother(Human mother) {
//        this.mother = mother;
//    }
//
//    public Human getFather() {
//        return father;
//    }
//
//    public void setFather(Human father) {
//        this.father = father;
//    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }


    @Override
    public String toString() {
        return "Human{" +
                "schedule=" + Arrays.toString(schedule) +
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
        return year == human.year && iq == human.iq && Arrays.equals(schedule, human.schedule) && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }
}

