import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        int choice = -1;
        while (choice != -4){
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Perform "original number" case.
                    break;
                case 2:
                    // Perform "encrypt number" case.
                    break;
                case 3:
                    // Perform "decrypt number" case.
                    break;
                case 4:
                    // Perform "quit" case.
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
