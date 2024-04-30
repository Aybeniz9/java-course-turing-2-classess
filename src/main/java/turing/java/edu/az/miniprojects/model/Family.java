package turing.java.edu.az.miniprojects.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.*;

public class Family {
    private Human mother;
    private Human father;

    private List<Human> children;
    private HashSet<Pet> pets;

    public void greetPet() {
        pets.forEach(pet -> System.out.println(pet + "SALLAAAAAmmmm"));
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.pets = new HashSet<>();
        this.children = new ArrayList<>();
    }


    public Family(Human mother, Human father, List<Human> children, HashSet<Pet> pets) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pets = pets;
    }

    //    public Family(Human mother, Human father) {
//        if (mother == null || father == null) {
//            throw new IllegalArgumentException("Both parents must be provided.");
//        }
//
//        this.mother = mother;
//        this.father = father;
//        this.children = new ArrayList<>();
//    }
    public int countFamily() {
        return children.size() + 2;
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

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPet() {
        return pets;
    }


    public void setPet(Set<Pet> pet) {
        this.pets = (HashSet<Pet>) pet;
    }

    public void addChild(Human child) {
        children.add(child);
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }


    public void deleteChild(Human child) {
        children.remove(child);
    }

    public boolean deleteChild(int index) {
        children.remove(index);
        return false;
    }

    public String prettyFormat() {
        return "{mother = %s , father = % s , pets =% s , children = %s}"
                .formatted(mother, father, pets, children);
    }


    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(new List[]{children}) +
                ", pet=" + pets +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family family)) return false;
        return Objects.equals(getMother(), family.getMother()) && Objects.equals(getFather(), family.getFather()) && Arrays.equals(new List[]{getChildren()}, new List[]{family.getChildren()}) && Objects.equals(getPet(), family.getPet());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getMother(), getFather(), getPet());
        result = 31 * result + Arrays.hashCode(new List[]{getChildren()});
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

}
