package book;

import java.util.List;

public interface BooksService {

    Book getBook(int id);

    List<Book> getAllBooks();

    void save(Book book);

    void updateBook(int id, Book book);

    void deleteBook(int id);

}