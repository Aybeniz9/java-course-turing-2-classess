package turing.java.edu.az.miniprojects.Dao.impl;

import turing.java.edu.az.miniprojects.model.Family;
import turing.java.edu.az.miniprojects.Dao.FamilyDao;

import java.util.*;

public class CollectionFamilyDao implements FamilyDao {
    public static List<Family> allfamilies;

    @Override
    public List<Family> getAllFamilies() {
        try {
            return allfamilies;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Family getFamilyIndex(int index) {
        try {
            return getFamilyIndex(index);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean deleteFamily(int index) {
        try {
            allfamilies.remove(index);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public boolean deleteFamilyByFamily(Family family) {
        try {
            allfamilies.remove(String.valueOf(family));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void saveFamily(Family family) {
        if (allfamilies.contains(family)) {
            int index = allfamilies.indexOf(family);
            allfamilies.set(index, family);
        } else {
            allfamilies.add(family);

        }


    }

}

