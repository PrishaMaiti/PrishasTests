import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    System.out.println("Hello World!");

    Scanner scan = new Scanner(System.in);

    System.out.println("Which FRQ do you want to see?");
    System.out.println("FRQ 5 Question 1 - Invitation (type 5.1)");
    System.out.println("FRQ 4 Question 2 - CoinGame (type 4.2)");
    System.out.println("FRQ 5 Question 2 - PasswordGenerator (type 5.2)");
    System.out.println("FRQ 9 Question 2 - Animal (type 9.2)");
    System.out.println("FRQ 9 Question 1 - Book (type 9.1)");

    String input = scan.nextLine();
    int i = 1;
    while(i <= 4) {
    if(input.contains("5.1")) {
      Invitation inv1 = new Invitation("1234 Walnut Street");
      System.out.println(inv1.sendInvite("Cheryl"));
      i++;
      System.out.println("Now which FRQ do you want to see?");
      System.out.println("FRQ 5 Question 1 - Invitation (type 5.1)");
      System.out.println("FRQ 4 Question 2 - CoinGame (type 4.2)");
      System.out.println("FRQ 5 Question 2 - PasswordGenerator (type 5.2)");
      System.out.println("FRQ 9 Question 2 - Animal (type 9.2)");
      System.out.println("FRQ 9 Question 1 - Book (type 9.1)");
      input = scan.nextLine();
  }
    if(input.contains("4.2")) {
      int coins = 10;
      int rounds = 5;
      CoinGame g = new CoinGame(coins, rounds);
      g.playGame();
      i++;
      System.out.println("Now which FRQ do you want to see?");
      System.out.println("FRQ 5 Question 1 - Invitation (type 5.1)");
      System.out.println("FRQ 4 Question 2 - CoinGame (type 4.2)");
      System.out.println("FRQ 5 Question 2 - PasswordGenerator (type 5.2)");
      System.out.println("FRQ 9 Question 2 - Animal (type 9.2)");
      System.out.println("FRQ 9 Question 1 - Book (type 9.1)");
      input = scan.nextLine();
    }
    if(input.contains("5.2")) {
      PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
      pw1.pwCount();
      pw1.pwGen();
      pw1.pwGen();
      pw1.pwCount();

      PasswordGenerator pw2 = new
              PasswordGenerator(6);
      pw2.pwCount();
      pw2.pwGen();
      pw2.pwCount();

      // Check if pw1 has changed
      pw1.pwCount();
      pw1.pwGen();
      pw1.pwCount();
      i++;
      System.out.println("Now which FRQ do you want to see?");
      System.out.println("FRQ 5 Question 1 - Invitation (type 5.1)");
      System.out.println("FRQ 4 Question 2 - CoinGame (type 4.2)");
      System.out.println("FRQ 5 Question 2 - PasswordGenerator (type 5.2)");
      System.out.println("FRQ 9 Question 2 - Animal (type 9.2)");
      System.out.println("FRQ 9 Question 1 - Book (type 9.1)");
      input = scan.nextLine();
     }
    if(input.contains("9.2")) {
      String diet = "carnivore";
      String species = "lion";
      String name = "Lisa";
      Animal lisa = new Animal("carnivore", "lion", "Lisa");
      lisa.toString();
      Animal gary = new Herbivore("herbivore", "giraffe", "Gary");
      gary.toString();
      Animal percy = new Elephant("herbivore", "elephant", "Percy", 2.0);
      percy.toString();
      i++;
      System.out.println("Now which FRQ do you want to see?");
      System.out.println("FRQ 5 Question 1 - Invitation (type 5.1)");
      System.out.println("FRQ 4 Question 2 - CoinGame (type 4.2)");
      System.out.println("FRQ 5 Question 2 - PasswordGenerator (type 5.2)");
      System.out.println("FRQ 9 Question 2 - Animal (type 9.2)");
      System.out.println("FRQ 9 Question 1 - Book (type 9.1)");
      input = scan.nextLine();
    }
    if(input.contains("9.1")) {
      PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
      myBook.printBookInfo();
      i++;
      System.out.println("Now which FRQ do you want to see?");
      System.out.println("FRQ 5 Question 1 - Invitation (type 5.1)");
      System.out.println("FRQ 4 Question 2 - CoinGame (type 4.2)");
      System.out.println("FRQ 5 Question 2 - PasswordGenerator (type 5.2)");
      System.out.println("FRQ 9 Question 2 - Animal (type 9.2)");
      System.out.println("FRQ 9 Question 1 - Book (type 9.1)");
      input = scan.nextLine();
    }
    else {
      System.out.println("Invalid input. Try again please!");
      i+= 5;
    }
    }
   }
}