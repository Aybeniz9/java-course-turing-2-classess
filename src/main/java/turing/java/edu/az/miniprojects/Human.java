package turing.java.edu.az.miniprojects;

public class Human {

    public String[][] schedule;
    public String name;
    public String surname;
    public int year;
    public int iq;
    Pet pet = new Pet();
    Human mother = new Human();
    Human father = new Human();
    public String n;
    public String day;



    public void greetPet() {
        System.out.println("Hello," + pet.nickname);
    }

    public void describePet() {
        System.out.println("I have an " + pet.spaces + "is" + pet.age + "years old,he is" + pet.trickLevel + ">50/" + pet.trickLevel + "<50");
    }
    public static class Schedule {
        public String[][] schedule;
        public Schedule() {
            this.schedule = new String[][]{
                    {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"},
                    {"Exercise", "Reading", "Cooking", "Gardening", "Painting", "Hiking", "Family Time"}
            };
        }

        public String getActivity(String day) {
            for (int i = 0; i < schedule[0].length; i++) {
                if (schedule[0][i].equalsIgnoreCase(day)) {
                    return schedule[1][i];
                }
            }
            return "No activity found for " + day;
        }
    }
    public Human() {
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

//    @Override
//    public String toString() {
//        return String.format();
//    }
}
