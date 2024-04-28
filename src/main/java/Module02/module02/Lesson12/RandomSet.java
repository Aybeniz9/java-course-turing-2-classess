package Module02.module02.Lesson12;
import java.util.Random;
public class RandomSet {
        public static void main(String[] args) {
            Random random = new Random();
            double[] randomNumbers = new double[10];
            for (int i = 0; i < 10; i++) {
                randomNumbers[i] = random.nextDouble() * 20;
            }

            for (int i = 0; i < 10; i++) {
                double cap = 2 * randomNumbers[i];
                System.out.println("Rastgele sayı: " + randomNumbers[i] + ", Çap: " + cap);
            }
        }
    }

