import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> allBooks = new ArrayList<Book>();
    ArrayList<ReaderCard> readerCards = new ArrayList<ReaderCard>();

    public void addBook(Book book){
        allBooks.add(book);
    }

    public void deleteBook(Book book){
        allBooks.remove(book);
    }
}
