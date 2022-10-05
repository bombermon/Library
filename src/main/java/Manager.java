import java.util.Arrays;

public class Manager {
    public void addBookToLibrary(Book book){
        if (Arrays.asList(Main.Library.allBooks).contains(book)){
            System.out.println("Такая книга уже есть");
        }
        else{
            Main.Library.allBooks.add(book);
            Main.Library.BooksInStock.add(book);
        }
    }

    public void deleteBookFromLibrary(Book book){
        if (Arrays.asList(Main.Library.BooksInStock).contains(book)){
            Main.Library.allBooks.remove(book);
            Main.Library.BooksInStock.remove(book);
        }
        else {
            System.out.println("Книга на руках у читателя, ее нельзя удалить.");
        }
    }


}
