package turing.java.edu.az.miniprojects.Service;

import turing.java.edu.az.miniprojects.Dao.FamilyDao;
import turing.java.edu.az.miniprojects.model.Family;
import turing.java.edu.az.miniprojects.model.Human;
import turing.java.edu.az.miniprojects.model.Pet;

import java.util.List;

public class FamilyService {
    private FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public List<Family> getallfamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyDao.getAllFamilies().forEach(family -> System.out.println(family.prettyFormat()));
    }

    public List<Family> getFamiliesBiggerThan(int size) {
        List<Family> familyList = null;
        try {
            familyDao.getAllFamilies().stream()
                    .filter(family -> family.countFamily() > size)
                    .forEach(family -> familyList.add(family));
            return familyList;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Family> getFamiliesLessThan(int size) {
        List<Family> familyList = null;
        try {
            familyDao.getAllFamilies().stream()
                    .filter(family -> family.countFamily() < size)
                    .forEach(family -> familyList.add(family));
            return familyList;
        } catch (Exception e) {
            return null;


        }
    }

    public int countFamiliesWithMemberNumber(int number) {
        return (int) familyDao.getAllFamilies().stream()
                .filter(family -> family.countFamily() == number)
                .count();
    }

    public void createFamily(Human father, Human mother) {
        Family newFamily = new Family(mother, father);
        familyDao.saveFamily(newFamily);
    }

    public boolean deleteFamily(int index) {
        return familyDao.deleteFamily(index);
    }

    public boolean deleteFamilyByFamily(Family family) {
        return familyDao.deleteFamilyByFamily(family);

    }

    public void saveFamily(Family family) {
        familyDao.saveFamily(family);

    }

    public Family bornChildren(Family family, String boy, String girl) {
        return null;
    }

    public Family adoptChildren(Family family, Human children) {
        family.addChild(children);
        return null;
    }

    public void deleteAllChildrenOlderThan(int age) {
        familyDao.getAllFamilies().forEach(family -> {
            List<Human> childrenToRemove = family.getChildren().stream()
                    .filter(child -> (2024 - child.getYear()) > age)
                    .toList();
            childrenToRemove.forEach(family::deleteChild);
        });
    }
    public int count() {
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyByIndex(int index) {
        return familyDao.getFamilyIndex(index);
    }

    public List<Pet> getPets(int index) {
        return familyDao.getAllFamilies().get(index).getPet().stream().toList();
    }

    public void addPet(int index, Pet pet) {
        familyDao.getAllFamilies().get(index).getPet().add(pet);
    }
}
