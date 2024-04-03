package book;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class BooksRepo {
    private static List<Book> books = new ArrayList<>();
    static {
        books.add(new Book(1,"CS11", "John", "News", 5.5));
        books.add(new Book(2,"CS22", "Marry", "Spring",8.5));
        books.add(new Book(3,"CS33", "Lily","Java", 4.5));

    };


    public void save(Book book){
        books.add(book);
    };

    public List<Book> getAll(){
        return books;
    };

    public Book getById(int id){
        return books.stream()
                .filter(b->b.getId()==id)
                .findFirst()
                .get();
    };

    public void update(int id, Book book){
        books.stream().filter(b->b.getId()==id)
                .findFirst()
                .ifPresent(b->{
                    if(book.getAuthor() != null)
                        b.setAuthor(book.getAuthor());
                    if (book.getIsbn() !=null)
                        b.setIsbn(book.getIsbn());
                    if(book.getPrice() != 0)
                        b.setPrice(book.getPrice());
                });

    };

    public void delete(int id){
        books.removeIf(b -> b.getId() == id);
    }

}
