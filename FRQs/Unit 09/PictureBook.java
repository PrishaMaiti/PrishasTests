public class PictureBook extends Book {
      private String title;
      private String author;
      private String illustrator;
      public PictureBook(String t, String a, String i) {
          super(t, a);
          illustrator = i;
      }
      public void printBookInfo() {
          //System.out.println(title + ", written by " + author + " and illustrated by " + illustrator);
          super.printBookInfo();
          System.out.println(" and illustrated by " + illustrator);
      }
    }