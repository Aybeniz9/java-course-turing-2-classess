package turing.java.edu.az;

import java.util.Scanner;
import javax.swing.*;

public class InfotmationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] age = new int[n];
        int[] grade = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(i + "-ci adi Daxil edin ");
            name[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i + "-ci yasi daxil edin ");
            age[i] = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            System.out.println(i + "-ci grade daxil edin ");

            grade[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int max = grade[0];
            if (grade[i] > max) {
                max = grade[i];
            }
            System.out.println(max);

        }

    }
}
