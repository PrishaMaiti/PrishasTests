public class BookListing {
  BookListing listing;
  Book bookObject;
  double price;
  String title;
  String author;
  String illustrator;
  public BookListing(Book b, double p) {
    bookObject = b;
    price = p;
  }
  public void printDescription() {
    if(bookObject instanceof Book) {
      System.out.print(title + ", written by " + author);
    }
    if(bookObject instanceof PictureBook) {
      System.out.print(title + ", written by " + author + "and illustrated by " + illustrator);
    }
  }
  public static void main(String[] args) {
    Book book1 = new Book("Frankenstein", "Mary Shelley");
    Book book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
    BookListing listing1 = new BookListing(book1, 10.99);
    listing1.printDescription();
    BookListing listing2 = new BookListing(book2, 12.99);
    listing2.printDescription();
  }
}