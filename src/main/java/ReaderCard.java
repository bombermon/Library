import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ReaderCard {
    ArrayList<Book> takenBooks = new ArrayList<Book>();
    Reader reader;

    public ReaderCard(Reader reader){
        this.reader = reader;
    }

    public void addBook(Book book){
        takenBooks.add(book);
    }

    public void deleteBook(Book book){
        takenBooks.remove(book);
    }
}
