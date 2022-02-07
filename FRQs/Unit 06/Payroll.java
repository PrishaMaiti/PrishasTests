// public class Payroll {
//         private int[] itemsSold; // number of items sold by each employee

//         private double[] wages; // wages to be computed in part (b)

//         /** Returns the bonus threshold as described in part (a).

//          */

//         public double computeBonusThreshold() {
//             int min = itemsSold[0];
//             for (int i = 1; i < itemsSold.length(); i++) {
//                 if (itemsSold[i] < min) {
//                     min = itemsSold[i];
//                 }
//             }
//             int max = itemsSold[0];
//             for (int i = 1; i < itemsSold.length(); i++) {
//                 if (itemsSold[i] > max) {
//                     max = itemsSold[i];
//                 }
//             }
//             int sum = 0;
//             for (int j = 0; j < itemsSold.length(); j++) {
//                 sum+= itemsSold[j];
//             }
//             double threshold = (sum - min - max)/itemsSold.length();
//             return threshold;
//             System.out.println("threshold: " + threshold);
//         }

//         public void computeWages(double fixedWage, double perItemWage) {
//           int threshold = computeBonusThreshold();
//           int count = 0;
//           for (employee : wages) {
//               int wage = fixedWage + (perItemWage * itemsSold[count]);
//               if((double)itemsSold[count] > threshold) {                        wage = wage * 1.1;
//               }
//               wages[count] = wage;
//               }

//         }
//         public static void main(String[] args){
//           int[] itemsSold = new int[]{48, 50, 37, 62, 38, 70, 55, 37, 64, 60};
//           double fixedWage = 10.0;
//           double perItemWage = 1.5;
//           Payroll p = new Payroll();
//           p.computeBonusThreshold();
//           p.computeWages(fixedWage, perItemWage);
//         }

//     }