public class Book {
    private final int id;
    private final String name;
    private final String author;
    private final String publication;
    private final String publisher;
    private final int yearOfPublication;
    private final String category;

    public Book(int id, String name, String author, String publication, String publisher, int yearOfPublication, String category){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publication = publication;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.category = category;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPublication() {
        return this.publication;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public String getCategory() {
        return this.category;
    }
}
