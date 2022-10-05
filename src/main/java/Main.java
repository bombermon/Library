import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book(1,"1984","JoRj Bablic", "first","Bublic",
                2007,"Jija");
        Manager manager = new Manager(1,"Anton", "Chertilov", "Genadevich",
                "Moscow, Pushkina street, Kolotushkia, 1", "88005553535");
        Librarian librarian = new Librarian(2,"Maria", "Ivanovna", "Kuzminichna",
                "Moscow, Pushkina street, Kolotushkia, 2", "88005553536");
        Reader reader = new Reader(3,"Zhenya", "Chikatilo", "Genadevich",
                "Moscow, Pushkina street, Kolotushkia, 34", "893712341222");
        manager.addBookToLibrary(new Book(1,"Java learning", "Rusik", "first",
                "Bablic", 2021, "Programming"));
        manager.addBookToLibrary(new Book(2,"Python learning", "Vovasik", "second",
                "Brivat", 2022, "Programming"));
        manager.addBookToLibrary(new Book(3,"JavaScript learning", "Sanek", "first",
                "Bablic", 2019, "Programming"));
        manager.addBookToLibrary(new Book(4,"How to drink correctly for kettles", "Rusik", "second",
                "Bablic", 2009, "Life hacks"));
        reader.takeBook(librarian, librarian.findBookByName("Java learning"));
        Scanner in = new Scanner(System.in);

        int choice = -1;
        while (choice != -4){
            System.out.println("Добро пожаловать в меню.\nВыберите кто вы: \n1. Менеджер\n2. Библиотекарь\n3. Читатель\n4. Никто");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Выберите число:\n 1 - Добавить \n 2 - Удалить \n 3 - Вывод статистики");
                    int num = in.nextInt();
                    if (num == 1) {
                        System.out.print("Введите id");
                        int id = in.nextInt();
                        System.out.print("Введите название книги");
                        String name = in.next();
                        System.out.print("Введите автора");
                        String author = in.next();
                        System.out.print("Введите издание");
                        String publication = in.next();
                        System.out.print("Введите издателя");
                        String publisher= in.next();
                        System.out.print("Введите год публикации");
                        int yearOfPublication = in.nextInt();
                        System.out.print("Введите категорию");
                        String category = in.next();
                        manager.addBookToLibrary(new Book(id,name,author,publication,publisher,yearOfPublication,category));
                    } else if (num == 2) {
                        for (String s : Library.allBooks) {
                            System.out.print(s);
                        }

                        } else {
                        System.out.println("Не правильный ввод");
                    }
                    break;

                case 2:
                    System.out.print("Выберите число:\n 1 - Поиск книг в библиотеке \n 2 - Дать книгу читателю");
                    int w = in.nextInt();
                    if (w == 1) {
                        System.out.println("Введите название книги");
                        String nameBook = in.next();
                        librarian.findBookByName(nameBook);
                    }else if (w == 2) {
                        librarian.giveBookToReader(reader,book);
                    }
                    else {
                        System.out.println("Не правильный ввод");
                    }

                    break;
                case 3:
                    System.out.print("Выберите число:\n 1 - Взять книгу \n 2 - Вернуть книгу");
                    int n = in.nextInt();
                    if (n == 1) {
                        System.out.print("Введите id");
                        int id = in.nextInt();
                        System.out.print("Введите имя пользователя");
                        String name = in.next();
                        System.out.print("Введите фамилию");
                        String surname = in.next();
                        System.out.print("Введите отчество");
                        String patronymic = in.next();
                        System.out.print("Введите адрес");
                        String address = in.next();
                        System.out.print("Введите телефон");
                        String phone= in.next();
                        new Reader(id,name,surname,patronymic,address,phone);
                        System.out.print("Введите название книги");
                        String book_name= in.next();
                        reader.takeBook(librarian, librarian.findBookByName(book_name));
                    }else if (n == 2) {
                        System.out.print("Введите название книги");
                        String book_name= in.next();
                        reader.returnBook(librarian, librarian.findBookByName(book_name));
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
