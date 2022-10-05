public class Reader extends Person{
    public void takeBook(Book book){
        Main.Library.takeBook(book);
    }

    public void returnBook(Book book){
        Main.Library.returnBook(book);
    }

}
