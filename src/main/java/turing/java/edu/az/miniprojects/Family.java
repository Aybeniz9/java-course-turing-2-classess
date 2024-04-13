package turing.java.edu.az.miniprojects;

import java.util.Arrays;
import java.util.Objects;
import java.util.*;

public class Family {
    private Human mother;
    private Human father;

    private List<Human> children ;
    private int numChildren = 0;
    private Set<Pet> pets;

    public Family(Human mother, Human father, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.pets = new HashSet<>();
        this.children = new ArrayList<>();
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
        this.pets = new HashSet<>();
    }

    public Family(Human mother, Human father) {
        if (mother == null || father == null) {
            throw new IllegalArgumentException("Both parents must be provided.");
        }

        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
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

    public void setChildren(List<Human>children) {
        this.children = children;
    }

    public Set<Pet> getPet() {
        return pets;
    }


    public void setPet(Set<Pet> pet) {
        this.pets = pet;
    }
    public void addChild(Human child) {
        if (numChildren < children.toArray().length) {
            children.set(numChildren++, child);
        }
    }
//    public void addChiledren(Human children){
//        children.addChild(children);
//    }
    public void addPet(Pet pet) {
        pets.add(pet);
    }


    public boolean deleteChild(Human child) {
        for (int i = 0; i < numChildren; i++) {
            if (children.get(i).equals(child)) {
                children.set(i, null);
                numChildren--;
                return true;
            }
        }
        return false;
    }

    public boolean deleteChild(int index) {
        if (index >= 0 && index < numChildren) {
            for (int i = index; i < numChildren - 1; i++) {
                children.set(i, children.get(i + 1));
            }
            children.set(numChildren - 1, null);
            numChildren--;
            return true;
        }
        return false;
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
