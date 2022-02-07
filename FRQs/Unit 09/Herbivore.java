public class Herbivore extends Animal {
  public Herbivore(String d, String s, String n) {
    super(d, s, n);
    species = s;
    name = n;
  }
  public String toString() {
    String str = name + " the " + species + " is a herbivore";
    System.out.println(str);
    return str;
  }
}