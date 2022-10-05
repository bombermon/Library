public class Reader extends Person{

    public Reader(int id, String name, String surname, String patronymic, String address, String phone) {
        super(id, name, surname, patronymic, address, phone);
        Main.Library.readerCards.add(new ReaderCard(this));
    }
    public void takeBook(Librarian librarian, Book book){
        librarian.giveBookToReader(this, book);
    }

    public void returnBook(Librarian librarian, Book book){
        librarian.returnBookFromReader(this, book);
    }
}
