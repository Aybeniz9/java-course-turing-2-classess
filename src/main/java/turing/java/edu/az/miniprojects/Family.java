package turing.java.edu.az.miniprojects;

import java.util.Arrays;
import java.util.Objects;

public class Family {
//    Human mother=new Human();
//    Human father=new Human();
//    Human child1=new Human();
//    Human child2=new Human();
//    private Family family;
    private Human mother;
    private Human father;
    private Human []children;
    private Pet pet;
    public Family(Human mother, Human father, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.children = new Human[0];
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Family(Human mother, Human father) {
        if (mother == null || father == null) {
            throw new IllegalArgumentException("Both parents must be provided.");
        }

        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

//    public Family getFamily() {
//        return family;
//    }
//
//    public void setFamily(Family family) {
//        this.family = family;
//    }

    public void greetPet() {
        System.out.println("Hello," + pet.getNickname());
    }

    public void describePet() {
        String slyLevel = (pet.getTrickLevel() > 50) ? "very sly" : "almost not sly";
        System.out.println("I have an " + pet.getSpecies() + " is " + pet.getAge() + " years old, he is " + slyLevel);
    }
    public void addChild(Human child) {
        Human[] newArray = Arrays.copyOf(children, children.length + 1);
        newArray[newArray.length - 1] = child;
        children = newArray;
        child.setFamily(this);
        System.out.println(child);
    }
    public boolean deleteChild(int index) {
        if (index >= 0 && index < children.length) {
            Human[] newArray = new Human[children.length - 1];
            for (int i = 0, j = 0; i < children.length; i++) {
                if (i != index) {
                    newArray[j++] = children[i];
                }
            }
            children = newArray;
            return true;
        }
        return false;
    }
    public int countFamily() {
        return children.length + 2;

    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family family)) return false;
        return Objects.equals(getMother(), family.getMother()) && Objects.equals(getFather(), family.getFather()) && Arrays.equals(getChildren(), family.getChildren()) && Objects.equals(getPet(), family.getPet());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getMother(), getFather(), getPet());
        result = 31 * result + Arrays.hashCode(getChildren());
        return result;
    }
}
