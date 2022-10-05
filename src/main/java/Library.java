import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public static class Library {
    static List<Book> allBooks = new ArrayList<Book>();
    static ArrayList<ReaderCard> readerCards = new ArrayList<ReaderCard>();

    static List<Book> BooksInStock = new ArrayList<Book>();
    static List<Book> BooksInHands = new ArrayList<Book>();


    protected static void addBook(Book book){
        if (Arrays.asList(allBooks).contains(book)){
            System.out.println("Такая книга уже есть");
        }
        else{
            allBooks.add(book);
            BooksInStock.add(book);
        }

    }

    protected static void deleteBook(Book book){
        if (Arrays.asList(BooksInStock).contains(book)){
            allBooks.remove(book);
            BooksInStock.remove(book);
        }
        else {
            System.out.println("Книга на руках у читателя, ее нельзя удалить.");
        }



    }

    protected static String getStats(){

        return "hello";
    }
}
