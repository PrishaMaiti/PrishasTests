// public class LightSequence {
//   String currentSequence;

// // attributes not shown

 

// /** The parameter seq is the initial sequence used for

// * the light display

// */

// public LightSequence(String seq) {
//   System.out.println("The new light sequence is: " + seq);
// }

 

// /** Inserts the string segment in the current sequence,

// * starting at the index ind. Returns the new sequence.

// */

// // public String insertSegment(String segment, int ind)

// // { /* implementation not shown */ }

 

// /** Updates the sequence to the value in seq

// */

// public void changeSequence(String seq) {
//   currentSequence = seq;
// }

// /** Part e of Unit 2 FRQ
// */

// public String removeSegment(String oldSeq, String segment) {
//   int foundAt;
//   // The value newSeq will concatenate the substring from index 0 to index foundAt, where segment is first found
//   // With the substring from index foundAt to index (foundAt + segment.length() + 1);
//   for (foundAt=0; foundAt<= oldSeq.length()- segment.length(); foundAt++) {
//     String newSeq;
//     String temp = oldSeq.substring(foundAt, foundAt + segment.length() + 1);
//     if (temp.equals(segment)) {
//       newSeq = oldSeq.substring(0, foundAt) + oldSeq.substring(foundAt + segment.length() + 1);
//       }
//     else if(temp != segment) {
//       newSeq = oldSeq;
//     }
// }
// return newSeq;
// }

 

// /** Uses the current sequence to turn the light on and off

// * for the show

// */

// public void display() {
//   System.out.println("Displaying the lights... ");
//  }

// public static void main(String[] args) {
//   LightSequence gradShow = new LightSequence("0101 0101 0101 0101");
//   gradShow.display();
//   gradShow.changeSequence("0011 0011 0011");
//   String resultSeq = gradShow.insertSegment ("1111 1111", 4);
//   System.out.println(Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0)));
// }

// }