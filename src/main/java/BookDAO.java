import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-03-28
 * Copyright: MIT
 * Class: Java20B
 */
public interface BookDAO {
    List<Book> getAllBooks();
    void createBook(Book book);
    Book readBook(int id);
    void updateBook(Book book);
    void deleteBook(String title);
}
