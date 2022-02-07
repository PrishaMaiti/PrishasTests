// public class ExperimentalFarm {
//     private Plot[][] farmPlots;
//     int length;
//     int width;

//     public ExperimentalFarm(Plot[][] p) {
//       farmPlots = p;
//     }

//     /** Returns the plot with the highest yield for a given crop type, as described in part (a). */

//     public Plot getHighestYield(String c) {

//         Plot p = new Plot(String crop, int yield);
//         Plot maxValue = farmPlots[0][0];
//         for (int i = 0; i < farmPlots.length; i++) {
//             for (int j = 0; j < farmPlots[i].length; j++) {
//                 if (farmPlots[i][j] > maxValue && c.equals(farmPlots[i][j].getCropType)) {
//                     maxValue = farmPlots[i][j];
//                     length = i;
//                     width = j;
//                 }
//             }
//         }
//         return maxValue;
//     }



//     /** Returns true if all plots in a given column in the two-dimensional array farmPlots

//       * contain the same type of crop, or false otherwise, as described in part (b).

//       */

//     public boolean sameCrop(int col) {
//         boolean indicator;
//         for (col = 0; col <= farmPlots.length() - 1; col++) {
//           if(farmPlots[0][col].getCropType.equals(farmPlots[i][j].getCropType())) {
//             continue;
//           }
//           else {
//             return false;
//           }
//           return true;
//         }

//     }

// }