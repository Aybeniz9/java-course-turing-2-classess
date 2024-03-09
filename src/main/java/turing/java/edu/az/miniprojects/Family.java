package turing.java.edu.az.miniprojects;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;

    private Human[] children = new Human[10];
    private int numChildren = 0;
    private Pet pet;

    public Family(Human mother, Human father, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.children = new Human[10];
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

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Family " + mother + " is being removed.");
        super.finalize();
    }

}
