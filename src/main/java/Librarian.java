import java.util.Arrays;

public class Librarian extends Person{

    public Librarian(int id, String name, String surname, String patronymic, String address, String phone) {
        super(id, name, surname, patronymic, address, phone);
    }

    public Book findBookByName(String bookName){
        for (Book book: Main.Library.BooksInStock){
            if (book.getName().equals(bookName)){
                return book;
            }
        }
        System.out.println("В библеотеке нет свободных книг с таким названием");
        return null;
    }
    public void giveBookToReader(Reader reader, Book book) {
        if (Main.Library.BooksInStock.contains(book)){
            ReaderCard readerCard = getReaderCardByReader(reader);
            if(readerCard != null){
                readerCard.takenBooks.add(book);
                Main.Library.BooksInStock.remove(book);
                Main.Library.BooksInHands.add(book);
            }else {
                System.out.println("У читателя отсутствует карточка");
            }
        }
        else{
            System.out.println("Такая книга недоступна");
        }
    }

    public void returnBookFromReader(Reader reader, Book book) {
        ReaderCard readerCard = getReaderCardByReader(reader);
        if(readerCard != null){
            if (readerCard.takenBooks.contains(book)){
                readerCard.takenBooks.remove(book);
                Main.Library.BooksInStock.add(book);
                Main.Library.BooksInHands.remove(book);
            } else {
                System.out.println("Читатель не должен вернуть эту книгу");
            }
        }else {
            System.out.println("У читателя отсутствует карточка");
        }
    }
    private ReaderCard getReaderCardByReader(Reader reader){
        for(ReaderCard r: Main.Library.readerCards){
            if (r.reader == reader){
                return r;
            }
        }
        return null;
    }
}
