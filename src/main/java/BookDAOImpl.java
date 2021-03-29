import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-03-28
 * Copyright: MIT
 * Class: Java20B
 */
public class BookDAOImpl implements BookDAO {

    private List<Book> books;
    private Connection con;

    public BookDAOImpl() {
        this.books = new ArrayList<>();
    }

    @Override
    public List<Book> getAllBooks() {
        this.con = new DatabaseCon().getConnection();
        return null;
    }

    @Override
    public void createBook(Book book) {
        this.con = new DatabaseCon().getConnection();

    }

    @Override
    public Book readBook(int id) {
        this.con = new DatabaseCon().getConnection();
        return null;
    }

    @Override
    public void updateBook(Book book) {
        this.con = new DatabaseCon().getConnection();

    }

    @Override
    public void deleteBook(String title) {
        this.con = new DatabaseCon().getConnection();

    }
}
