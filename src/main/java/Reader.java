public class Reader extends Person{
    public void takeBook(Librarian librarian, Book book){
        librarian.giveBookToReader(this, book);
    }

    public void returnBook(Librarian librarian, Book book){
        librarian.returnBookFromReader(this, book);
    }
}
