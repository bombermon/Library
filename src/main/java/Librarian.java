import java.util.Arrays;

public class Librarian extends Person{

    public Librarian(int id, String name, String surname, String patronymic, String address, String phone) {   // конструктор
        super(id, name, surname, patronymic, address, phone);
    }

    public Book findBookByName(String bookName){   // поиск книги по имени
        for (Book book: Main.Library.BooksInStock){ // поиск
            if (book.getName().equals(bookName)){
                return book;
            }
        }
        System.out.println("В библеотеке нет свободных книг с таким названием");
        return null;
    }
    public void giveBookToReader(Reader reader, Book book) {   // метод передать книгу читателю
        if (Main.Library.BooksInStock.contains(book)){   // есть ли книга у нас
            ReaderCard readerCard = getReaderCardByReader(reader);  // считываение карточки читателя
            if(readerCard != null){   // есть ли карточка
                readerCard.takenBooks.add(book);  // добавляем книги туда-сюда
                Main.Library.BooksInStock.remove(book);
                Main.Library.BooksInHands.add(book);
            }else {
                System.out.println("У читателя отсутствует карточка"); // ну не повезло не фартануло
            }
        }
        else{
            System.out.println("Такая книга недоступна");   // снова не повезло
        }
    }

    public void returnBookFromReader(Reader reader, Book book) {  // отжать книгу у читателя
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
    private ReaderCard getReaderCardByReader(Reader reader){  // получить карточку читателя
        for(ReaderCard r: Main.Library.readerCards){
            if (r.reader == reader){
                return r;
            }
        }
        return null;
    }
}
