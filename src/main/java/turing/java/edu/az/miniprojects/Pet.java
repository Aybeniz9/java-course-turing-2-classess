package turing.java.edu.az.miniprojects;

import java.util.Arrays;
import java.util.Objects;

public  abstract  class Pet {
    private String nickname;
    private Species spaces;
    private int age;
    private int trickLevel;
    private String[] habits;


    public Pet(String spaces, String nickname) {
        this.spaces = Species.COW;
        this.nickname = nickname;
    }

    public Pet(String nickname, String spaces, int age, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.spaces = Species.COW;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }



    public class Fish extends Pet{
        public Fish(String name){
            super(name, String.valueOf(Species.FISH));
        }
        @Override
        public void respond() {
            System.out.println("Just keep swimming...");
        }


    }
    public class DomesticCat extends Pet{
        public DomesticCat(String name) {
            super(name, String.valueOf(Species.DOMESTIC_CAT));
        }

        @Override
        public void respond() {
            System.out.println("Meow!");
        }

        public void foul() {
            System.out.println("Made a mess in the litter box...");
        }

    }
    public class Dog extends Pet{
        public Dog(String name) {
            super(name, String.valueOf(Species.DOG));
        }

        @Override
        public void respond() {
            System.out.println("Woof!");
        }

        public void foul() {
            System.out.println("Left a surprise in the backyard...");
        }

    }
    public class RoboCat extends Pet{
        public RoboCat(String name) {
            super(name, String.valueOf(Species.ROBO_CAT));
        }

        @Override
        public void respond() {
            System.out.println("Beep boop! I am RoboCat.");
        }
        

    }

    public String getSpecies() {
        return String.valueOf(Species.DOG);
    }

    public void setSpecies(String spaces) {
        this.spaces = Species.valueOf(spaces);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }
    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;
        return getAge() == pet.getAge() && getTrickLevel() == pet.getTrickLevel() && Objects.equals(getNickname(), pet.getNickname()) && Objects.equals(spaces, pet.spaces) && Arrays.equals(getHabits(), pet.getHabits());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNickname(), spaces, getAge(), getTrickLevel());
        result = 31 * result + Arrays.hashCode(getHabits());
        return result;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nickname='" + nickname + '\'' +
                ", spaces='" + spaces + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
