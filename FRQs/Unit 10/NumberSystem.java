// public class NumberSystem {
//   int gcf;

//   /** Precondition: a and b are positive integers.

//   * Returns the greatest common factor of a and b, as described in part (a).

//   */

//   public static int gcf(int a, int b) {
//     if(b == 0) {
//       System.out.println(a);
//       return a;
//     }
//     System.out.println("GCF = " + gcf(b, a % b));
//     return gcf(b, a % b);
//     }

  

//   /** Precondition: numerator and denominator are positive integers.

//   * Reduces the fraction numerator / denominator

//   * and prints the result, as described in part (b).

//   */

//   public static void reduceFraction(int numerator, int denominator) {
//     long gcf = gcf(a, b);
//     return (a / gcf) + "/" + (b / gcf);
//   }
//   public static void main(String[] args) {
//     reduceFraction(50, 100);
//   }
// }