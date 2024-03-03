package turing.java.edu.az.miniprojects;

import java.util.Arrays;

public class Family {
//    Human mother=new Human();
//    Human father=new Human();
//    Human child1=new Human();
//    Human child2=new Human();
    private Human mother=new Human();
    private Human father=new Human();
    private Human []child;
    private Pet pet;

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

    public Human[] getChild() {
        return child;
    }

    public void setChild(Human[] child) {
        this.child = child;
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
                ", child=" + Arrays.toString(child) +
                ", pet=" + pet +
                '}';
    }
    public void deleteChild(Human child){
    }

}
