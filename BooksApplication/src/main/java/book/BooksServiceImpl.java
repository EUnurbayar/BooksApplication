package book;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service

public class BooksServiceImpl implements BooksService {
    BooksRepo bookRepo;
    @Autowired
    public BooksServiceImpl(BooksRepo bookRepo){
        this.bookRepo = bookRepo;
    }

    @Override
    public void save(Book book) {
        bookRepo.save(book);
    }
    @Override
    public Book getBook(int id) {
        return bookRepo.getById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.getAll();
    }


    @Override
    public void updateBook(int id,Book book) {
        bookRepo.update(id, book);
    }

    @Override
    public void deleteBook(int id) {

    }
}
