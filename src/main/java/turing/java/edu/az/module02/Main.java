package turing.java.edu.az.module02;
import java.util.Arrays;
import java.util.Random;
public class Main {
        public static void main(String[] args) {
            int usaqSayisi = 17;
            int[] usaqlar = new int[usaqSayisi];
            for (int i = 0; i < usaqSayisi; i++) {
                usaqlar[i] = i + 1;
            }
            Random random = new Random();
            for (int i = 0; i < usaqSayisi; i++) {
                int index1 = random.nextInt(usaqSayisi);
                int index2 = random.nextInt(usaqSayisi);
                int temp = usaqlar[index1];
                usaqlar[index1] = usaqlar[index2];
                usaqlar[index2] = temp;
            }
            System.out.println("Yer deyisdiren usaqlarin yeri:");
            System.out.println(Arrays.toString(usaqlar));
        }
    }

