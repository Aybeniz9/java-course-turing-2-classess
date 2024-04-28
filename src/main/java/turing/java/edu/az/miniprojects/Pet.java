package turing.java.edu.az.miniprojects;

import java.util.Arrays;
import java.util.Objects;
import java.util.*;

public abstract class Pet {
    private String nickname;
    private Species spaces;
    private int age;
    private int trickLevel;
    private Set<String> habits;




    public Pet(String spaces, String nickname) {
        this.spaces = Species.DOG;
        this.nickname = nickname;
    }

    public Pet(String nickname, String spaces, int age, int trickLevel, Set habits) {
        this.nickname = nickname;
        this.spaces = Species.DOG;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = new HashSet<>();
    }

    public Pet() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Species getSpaces() {
        return spaces;
    }

    public void setSpaces(Species spaces) {
        this.spaces = spaces;
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

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

  public void addHabit(String habit){
       habits.add(habit);
   }

    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;
        return getAge() == pet.getAge() && getTrickLevel() == pet.getTrickLevel() && Objects.equals(getNickname(), pet.getNickname()) && Objects.equals(spaces, pet.spaces) && Arrays.equals(new Set[]{getHabits()}, new Set[]{pet.getHabits()});
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNickname(), spaces, getAge(), getTrickLevel());
        result = 31 * result + Arrays.hashCode(new Set[]{getHabits()});
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nickname='" + nickname + '\'' +
                ", spaces='" + spaces + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(new Set[]{habits}) +
                '}';
    }
}
