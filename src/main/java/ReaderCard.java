import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ReaderCard {
    ArrayList<Book> takenBooks = new ArrayList<Book>();
    BookReader reader;

    public ReaderCard(BookReader reader){
        this.reader = reader;
    }
}
