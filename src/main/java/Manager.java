import java.util.ArrayList;
import java.util.Arrays;

public class Manager extends Person {
    public Manager(int id, String name, String surname, String patronymic, String address, String phone) {
        super(id, name, surname, patronymic, address, phone);
    }

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

    public String getStatsCounts() {
        String InHands = String.valueOf(Main.Library.BooksInHands.size());
        String InStock = String.valueOf(Main.Library.BooksInStock.size());
        String sum = String.valueOf(Main.Library.allBooks.size());
        return String.format("Всего %s книг, %s книг в библиотеке и %s книг у читателей", sum, InStock, InHands);

    }

    public String getStatsBooksCategory(String category){
        int AllBookCounter = 0;
        for (int i = 0; i < Main.Library.allBooks.size(); i++) {
            if (Main.Library.allBooks.get(i).equals(category)){
                AllBookCounter += 1;

            }
        }
        return "Книг жанра '" + category+ "': " + String.valueOf(AllBookCounter);
    }

    public String getStatsReadersBooks(Reader reader) {
        ArrayList<Book> takenBooks = new ArrayList<Book>();
        for (ReaderCard r : Main.Library.readerCards) {
            if (r.reader == reader) {
                takenBooks = r.takenBooks;
                break;
            }
        }

        return Arrays.toString(takenBooks.toArray()).replace("[", "").replace("]", "");
    }
}
