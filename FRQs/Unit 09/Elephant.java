public class Elephant extends Herbivore {
  private String name;
  private String species;
  private double tuskLength;
  public Elephant(String d, String s, String n, double tL) {
    super(d, s, n);
    tuskLength = tL;
  }
  public String toString() {
    String elephantState = name + "the elephant is a herbivore with tusks " + tuskLength + " meters long";
    System.out.println(elephantState);
    return elephantState;
  }
}