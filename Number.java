import java.util.ArrayList;

// Write a Class Number
public class Number {
    // instance variables
    ArrayList<Number> squirrels = new ArrayList<Number>();
    int numOfSquirrels;
    double numsOfSquirrels;
    int index;

    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number() {
        // constructor
        for(int i = 3; i<=36; i++) {
          numsOfSquirrels = (int)Math.random() * i;
        }
    }

    // It contains a getter for the Random Number
    public double getRandomNumber() {
      return numsOfSquirrels;
    }

    // It contains a getter for Index, or the order it was initialized
    public int getIndex() {
      return index;
    }
    

    // Write a tester method
    public static void main(String[] args) {

        // Create an ArrayList of Type Number, my ArrayList is called squirrels
        
        // Initialize 10 squirrels of class type Number

        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops
        

        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
        for (numOfsquirrel : numsOfSquirrels) {
          System.out.println("There are " + numOfSquirrels + " squirrels and were created by index " + index);
        }
        
    }

}