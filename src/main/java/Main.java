import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    }

    public static class Library {
        static List<Book> allBooks = new ArrayList<Book>();
        static ArrayList<ReaderCard> readerCards = new ArrayList<ReaderCard>();

        protected static void addBook(Book book) {
            allBooks.add(book);
        }

        protected static void deleteBook(Book book) {
            allBooks.remove(book);
        }

    }
}
