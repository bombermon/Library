import java.util.ArrayList;
import java.util.Arrays;

public class Manager extends Person {  // создание менеджера на основе класса-мамы person
    public Manager(int id, String name, String surname, String patronymic, String address, String phone) {
        super(id, name, surname, patronymic, address, phone);
    }

    public void addBookToLibrary(Book book){   // метод добавление книги в библиотеку
        if (Main.Library.allBooks.contains(book)){
            System.out.println("Такая книга уже есть");
        }
        else{
            Main.Library.allBooks.add(book);
            Main.Library.BooksInStock.add(book);
        }
    }

    public void deleteBookFromLibrary(Book book){  // метод удаление книги из библиотеки
        if (Main.Library.BooksInStock.contains(book)){ // проверка находится ли книга в обороте
            Main.Library.allBooks.remove(book);
            Main.Library.BooksInStock.remove(book);
            System.out.println("Книга удалена!");
        }
        else {
            System.out.println("Книга на руках у читателя, ее нельзя удалить.");
        }
    }

    public void getStatsCounts() {   // статистика по количеству книг
        String InHands = String.valueOf(Main.Library.BooksInHands.size());
        String InStock = String.valueOf(Main.Library.BooksInStock.size());
        String sum = String.valueOf(Main.Library.allBooks.size());
        System.out.println(String.format("Всего %s книг, %s книг в библиотеке и %s книг у читателей", sum, InStock, InHands));

    }

    public void getStatsBooksCategory(String category){   // список книг конкретной категории
        int AllBookCounter = 0;
        for (int i = 0; i < Main.Library.allBooks.size(); i++) {  // поиск книг нужной нам категории
            if (Main.Library.allBooks.get(i).getCategory().equals(category)){
                AllBookCounter += 1;

            }
        }
        System.out.println("Книг жанра '" + category+ "': " + String.valueOf(AllBookCounter));
    }

    public void getStatsReadersBooks(Reader reader) {  // метод получения списка книг пользователя
        ArrayList<Book> takenBooks = new ArrayList<Book>();
        for (ReaderCard r : Main.Library.readerCards) {  // ищем пользователя в списке карточек
            if (r.reader == reader) {
                takenBooks = r.takenBooks; // нашли
                break;
            }
        }
        for (int i = 0; i < takenBooks.size(); i++) {  // поиск книг нужной нам категории
            Book temp = takenBooks.get(i);
            System.out.println(String.format("%s %s %s %s %s %s", temp.getName(), temp.getAuthor(), temp.getPublication(), temp.getPublisher(), String.valueOf(temp.getYearOfPublication()), temp.getCategory()));
        }
    }
}
