package book;

public class Book {
    private int id;
    private String isbn;
    private String author;
    private String title;
    private double price;

    public Book(int id, String isbn, String author, String title, double price) {
        this.id = id;
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}