package Module02.module02.Lesson14;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

import static Module02.module02.DfbMethod.DFPMinimize;
import static Module02.module02.DfbMethod.function;

public class DfbMain {
//    public class DfbMethod {
//        public static void main(String[] args) {
//            try {
//                double[] result = DFPMinimize();
//                System.out.println("Minimum noqte: (" + result[0] + ", " + result[1] + ", " + result[2] + ")");
//                System.out.println("Minimum qiymet: " + function(result));
//            } catch (DimensionMismatchException e) {
//                e.printStackTrace();
//            }
//        }
//
//        // Başlangıç noqtesi
//        static double[] startPoint = {1.0, -1.0, 2.0};
//
//        // Funksiya ve gradyan hesaplamaları
//        static double[] gradient(double[] x) {
//            double[] grad = new double[3];
//            grad[0] = 2 * x[0];
//            grad[1] = 2 * x[1];
//            grad[2] = 2 * x[2];
//            return grad;
//        }
//
//        public static double function(double[] x) {
//            return Math.pow(x[0], 2) + Math.pow(x[1], 2) + Math.pow(x[2], 2);
//        }
//
//        // DFP usulu
//        public static double[] DFPMinimize() throws DimensionMismatchException {
//            int maxIterations = 100;
//            double epsilon = 1e-6; // epsilon durdurma
//
//            RealMatrix B = MatrixUtils.createRealIdentityMatrix(3); // Hesaplama matrisi B
//
//            double[] x = startPoint.clone();
//            int iter = 0;
//
//            while (iter < maxIterations) {
//                double[] grad = gradient(x);
//                RealMatrix gradMatrix = MatrixUtils.createColumnRealMatrix(grad);
//                RealMatrix pMatrix = B.operate((RealVector) gradMatrix).mapMultiply(-1.0); // Axtarış istiqaməti
//
//                double[] p = pMatrix.getColumn(0);
//
//                // Adım boyu
//                double alpha = 0.1; // Sabit adım boyu
//
//                double[] newX = new double[3];
//                for (int i = 0; i < 3; i++) {
//                    newX[i] = x[i] + alpha * p[i];
//                }
//
//                // Durdurma kriteri
//                if (Math.abs(function(newX) - function(x)) < epsilon) {
//                    break;
//                }
//
//                // Hesaplama matrisi güncellemesi
//                double[] s = new double[]{newX[0] - x[0], newX[1] - x[1], newX[2] - x[2]};
//                double[] y = new double[]{gradient(newX)[0] - grad[0], gradient(newX)[1] - grad[1], gradient(newX)[2] - grad[2]};
//                RealMatrix sMatrix = MatrixUtils.createColumnRealMatrix(s);
//                RealMatrix yMatrix = MatrixUtils.createColumnRealMatrix(y);
//
//                double ys = yMatrix.transpose().multiply(sMatrix).getEntry(0, 0);
//                if (ys == 0.0) {
//                    ys = 1e-10; // To avoid division by zero
//                }
//
//                RealMatrix term1 = sMatrix.multiply(sMatrix.transpose()).scalarMultiply(1.0 / ys);
//
//                RealMatrix By = B.operate(yMatrix);
//                double yBy = yMatrix.transpose().multiply(By).getEntry(0, 0);
//                if (yBy == 0.0) {
//                    yBy = 1e-10; // To avoid division by zero
//                }
//                RealMatrix term2 = By.multiply(By.transpose()).scalarMultiply(1.0 / yBy);
//
//                B = B.add(term1).subtract(term2); // Yeni hesaplama matrisi
//
//                x = newX;
//                iter++;
//            }
//
//            return x;
//        }
//    }
}
