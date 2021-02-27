import java.util.ArrayList;

public class Q1 {

    public static class Book {
        private String title;
        private String author;

        public Book(String t, String a) {
            title = t;
            author = a;
        }

        public void printBookInfo() {
            System.out.print(title + ", written by " + author);
        }

    }

    public static class PictureBook extends Book{
        private String illustrator;

        public PictureBook(String t, String a, String i) {
            super(t, a);
            illustrator = i;
        }

        public void printBookInfo() {
            System.out.print(super.title + ", written by " + super.author + " and illustrated by " + illustrator);
        }
    }

    public static class BookListing {
        public BookListing(Book book, Double d) {
            System.out.println(book.title + ", written by " + book.author + ", $" + d);
        }
    }

    public static void main(String[] args) {
        PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
        myBook.printBookInfo();
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Book book1 = new Book("Frakenstein", "Mary Shelley");
        Book book2 = new PictureBook("The Wonderful Wizard Of Oz", "L. Frank Baum", "W.W. Denslow");
        myLibrary.add(book1);
        myLibrary.add(book2);
        BookListing booklisting = new BookListing(book2, 12.99);
    }
}
