import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    List<Book> allBooks = new ArrayList<Book>();
    ArrayList<ReaderCard> readerCards = new ArrayList<ReaderCard>();

    List<Book> BooksInStock = new ArrayList<Book>();
    List<Book> BooksInHands = new ArrayList<Book>();


    public void addBook(Book book){
        if (Arrays.asList(allBooks).contains(book)){
            System.out.println("Такая книга уже есть");
        }
        else{
            allBooks.add(book);
            BooksInStock.add(book);
        }

    }

    public void deleteBook(Book book){
        if (Arrays.asList(BooksInStock).contains(book)){
            allBooks.remove(book);
            BooksInStock.remove(book);
        }
        else {
            System.out.println("Книга на руках у читателя, ее нельзя удалить.");
        }



    }

    public String getStats(){

        return "hello";
    }
}
