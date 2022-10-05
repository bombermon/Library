import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        while (choice != -4){
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
33
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
