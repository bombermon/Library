public class Book {
    int id;
    String name;
    String author;
    String publication;
    String publisher;
    int yearOfPublication;
    String category;

    public Book(int id, String name, String author, String publication, String publisher, int yearOfPublication, String category){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publication = publication;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.category = category;
    }
}
