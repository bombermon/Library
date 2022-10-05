import java.util.ArrayList;

class ReaderCard {
    protected ArrayList<Book> takenBooks = new ArrayList<Book>();  // взятые книги читателем
    protected Reader reader;  // сам читатель
    protected ReaderCard(Reader reader){ // конструктор
        this.reader = reader;
    }
}
