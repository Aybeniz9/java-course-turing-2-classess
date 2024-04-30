package turing.java.edu.az.miniprojects.Dao;

import turing.java.edu.az.miniprojects.model.Family;

import java.util.List;

public interface FamilyDao {
    List<Family> getAllFamilies();

    Family getFamilyIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamilyByFamily(Family family);

    void saveFamily(Family family);


}
