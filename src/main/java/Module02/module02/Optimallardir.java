package Module02.module02;
import Module02.module02.math3.linear.MatrixUtils;
//import org.apache.commons.math3.linear.RealMatrix;
public class Optimallardir {


        // Başlangıç noktası
        static double[] startPoint = {0.0, 0.0, 0.0}; // İlk başlangıç noktası

        // Fonksiyon ve gradyan hesaplamaları
        static double[] gradient(double[] x) {
            double[] grad = new double[3];
            grad[0] = 2 * (x[0] - 3);
            grad[1] = 2 * (x[1] + 1);
            grad[2] = 2 * (x[2] - 5);
            return grad;
        }

        static double function(double[] x) {
            return Math.pow((x[0] - 3), 2) + Math.pow((x[1] + 1), 2) + Math.pow((x[2] - 5), 2);
        }

        // DFP yöntemi
        static double[] DFPMinimize() {
            int maxIterations = 100;
            double epsilon = 1e-6; // Durdurma kriteri

            RealMatrix B = MatrixUtils.createRealIdentityMatrix(3); // Hesaplama matrisi B

            double[] x = startPoint.clone();
            int iter = 0;

            while (iter < maxIterations) {
                double[] grad = gradient(x);
                double[] p = B.operate(grad); // Axtarış istiqaməti

                // Adım boyu
                double alpha = 0.1; // Sabit adım boyu

                double[] newX = new double[3];
                for (int i = 0; i < 3; i++) {
                    newX[i] = x[i] - alpha * p[i];
                }

                // Durdurma kriteri
                if (Math.abs(function(newX) - function(x)) < epsilon) {
                    break;
                }

                // Hesablama matrisi güncellemesi
                double[] s = new double[]{newX[0] - x[0], newX[1] - x[1], newX[2] - x[2]};
                double[] y = new double[]{gradient(newX)[0] - grad[0], gradient(newX)[1] - grad[1], gradient(newX)[2] - grad[2]};
                RealMatrix sMatrix = MatrixUtils.createColumnRealMatrix(s);
                RealMatrix yMatrix = MatrixUtils.createColumnRealMatrix(y);
                RealMatrix sTranspose = sMatrix.transpose();
                RealMatrix yTranspose = yMatrix.transpose();

                RealMatrix term1 = sMatrix.multiply(sTranspose).scalarMultiply(1 / s[0]);
                RealMatrix term2 = B.multiply(yMatrix).multiply(yTranspose).multiply(B).scalarMultiply(1 / yMatrix.multiply(B).multiply(yTranspose).getEntry(0, 0));

                B = B.add(term1).subtract(term2); // Yeni hesaplama matrisi

                x = newX;
                iter++;
            }

            return x;
        }

        public static void main(String[] args) {
            double[] result = DFPMinimize();
            System.out.println("Minimum nokta: (" + result[0] + ", " + result[1] + ", " + result[2] + ")");
            System.out.println("Minimum değer: " + function(result));
        }
    }

}
