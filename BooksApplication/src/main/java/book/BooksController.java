package book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    BooksService bookService;
    @Autowired
    public BooksController(BooksService bookService){
        this.bookService = bookService;
    }
    @PostMapping()
    public void  save(@RequestBody Book book){
        bookService.save(book);
    };

    @GetMapping("/books/{id}")
    public Book getById(@PathVariable int id){
        return bookService.getBook(id);
    };

    @GetMapping
    public List<Book> getAll(){
        return bookService.getAllBooks();
    };

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Book book){
        bookService.updateBook(id,book);
    };

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        bookService.deleteBook(id);
    }

};
