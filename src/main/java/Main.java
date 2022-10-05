import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book(1,"1984","JoRj Bablic", "first","Bublic",
                2007,"Jija");
        Manager manager = new Manager(1,"Anton", "Chertilov", "Genadevich",
                "Moscow, Pushkina street, Kolotushkia, 1", "88005553535");
        manager.addBookToLibrary(book);
        Librarian librarian = new Librarian(2,"Maria", "Ivanovna", "Kuzminichna",
                "Moscow, Pushkina street, Kolotushkia, 2", "88005553536");
        Reader reader = new Reader(3,"Zhenya", "Chikatilo", "Genadevich",
                "Moscow, Pushkina street, Kolotushkia, 34", "893712341222");
        manager.addBookToLibrary(new Book(1,"Java learning", "Rusik", "first",
                "Bablic", 2021, "Programming"));
        manager.addBookToLibrary(new Book(2,"Python", "Vovasik", "second",
                "Brivat", 2022, "Programming"));
        manager.addBookToLibrary(new Book(3,"JavaScript learning", "Sanek", "first",
                "Bablic", 2019, "Programming"));
        manager.addBookToLibrary(new Book(4,"How to drink correctly for kettles", "Rusik", "second",
                "Bablic", 2009, "Life hacks"));
        reader.takeBook(librarian, librarian.findBookByName("Java learning"));
        Scanner in = new Scanner(System.in);

        int choice = -1;
        while (choice != -4){
            System.out.println("Добро пожаловать в меню.\nВыберите кто вы: \n1. Менеджер\n2. Библиотекарь\n3. Читатель\n");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Выберите число:\n 1 - Добавить \n 2 - Удалить \n 3 - Вывод статистики");
                    int num = in.nextInt();
                    if (num == 1) {
                        System.out.print("Введите id: ");
                        int id = in.nextInt();
                        System.out.print("Введите название книги: ");
                        String name = in.next();
                        System.out.print("Введите автора: ");
                        String author = in.next();
                        System.out.print("Введите издание: ");
                        String publication = in.next();
                        System.out.print("Введите издателя: ");
                        String publisher= in.next();
                        System.out.print("Введите год публикации: ");
                        int yearOfPublication = in.nextInt();
                        System.out.print("Введите категорию: ");
                        String category = in.next();
                        manager.addBookToLibrary(new Book(id,name,author,publication,publisher,yearOfPublication,category));
                    } else if (num == 2) {
                        System.out.print("Введите название книги: ");
                        BufferedReader reader_1 = new BufferedReader(new InputStreamReader(System.in));

                        String book_for = reader_1.readLine();
                        manager.deleteBookFromLibrary(librarian.findBookByName(book_for));
                        }

                    else if (num == 3) {
                        System.out.println("Добро пожаловать в меню статистики.\nВыберите статистику: \n1. Статистика кол-во книг\n2. Статистика по категории\n3. Кол-во книг у человека\n4. Самый разыскиваемый чел\n5. Самый никому ненужный чел");
                        int stats = in.nextInt();
                        if (stats == 1) {
                            manager.getStatsCounts();
                        }
                        else if (stats == 2){
                            System.out.println("Введите категорию: ");
                            String cat = in.next();
                            manager.getStatsBooksCategory(cat);
                        }
                        else if (stats == 3){
                            manager.getStatsReadersBooks(reader);
                        }
                        else if (stats == 4){
                            manager.getMostWanted();
                        }
                        else if (stats == 5){
                            manager.getMostnotWanted();
                        }
                        else{
                            System.out.println("Неправильный ввод!");
                        }

                    }
                    else {
                        System.out.println("Не правильный ввод");
                    }
                    break;

                case 2:
                    System.out.print("Выберите число:\n 1 - Поиск книг в библиотеке \n 2 - Дать книгу читателю\n");
                    int w = in.nextInt();
                    if (w == 1) {
                        System.out.println("Введите название книги: ");
                        String nameBook = in.next();
                        Book temp_book = librarian.findBookByName(nameBook);
                        if (temp_book != null) {
                            System.out.println(String.format("%s %s %s %s %s %s", temp_book.getName(), temp_book.getAuthor(), temp_book.getPublication(), temp_book.getPublisher(), String.valueOf(temp_book.getYearOfPublication()), temp_book.getCategory()));
                        }
                    }else if (w == 2) {
                        librarian.giveBookToReader(reader,book);
                    }
                    else {
                        System.out.println("Не правильный ввод");
                    }

                    break;
                case 3:
                    System.out.print("Выберите число:\n 1 - Взять книгу \n 2 - Вернуть книгу\n");
                    int n = in.nextInt();
                    if (n == 1) {
                        System.out.print("Введите название книги: ");
                        String book_name = in.next();
                        reader.takeBook(librarian, librarian.findBookByName(book_name));
                    }else if (n == 2) {
                        System.out.print("Введите название книги: ");
                        String book_name= in.next();
                        Book bookToReturn = librarian.cheekBookToReturn(reader, book_name);
                        if (bookToReturn != null){
                            reader.returnBook(librarian, bookToReturn);
                        }
                    }
                    else {
                        System.out.println("Не правильный ввод");
                    }
                    break;
                default:
                    System.out.println("Вы ввели не тот пункт меню");
            }
        }
    }

    public static class Library {
        protected static List<Book> allBooks = new ArrayList<Book>();
        protected static ArrayList<ReaderCard> readerCards = new ArrayList<ReaderCard>();
        protected static List<Book> BooksInStock = new ArrayList<Book>();
        protected static List<Book> BooksInHands = new ArrayList<Book>();
    }
}
