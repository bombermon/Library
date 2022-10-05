import java.util.ArrayList;

class ReaderCard {
    protected ArrayList<Book> takenBooks = new ArrayList<Book>();
    protected Reader reader;
    protected ReaderCard(Reader reader){
        this.reader = reader;
    }
}
