public class Animal {
  String diet;
  String species;
  String name;
  public Animal(String d, String s, String n) {
    diet = d;
    species = s;
    name = n;
  }
  public String toString() {
     String state = name + " the " + species + " is a " + diet;
     System.out.println(state);
     return state;
  }
}