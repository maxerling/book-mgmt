import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-03-28
 * Copyright: MIT
 * Class: Java20B
 */
public class AuthorDAOImpl implements AuthorDAO {

    private List<Author> authors;
    private Connection con;

    public AuthorDAOImpl() {
        this.authors  = new ArrayList<>();

    }

    @Override
    public List<Author> getAllAuthors() {
        this.con = new DatabaseCon().getConnection();
        return null;
    }

    @Override
    public void createAuthor(Author author) {
        this.con = new DatabaseCon().getConnection();

    }

    @Override
    public Author readAuthor(int id) {
        this.con = new DatabaseCon().getConnection();
        return null;
    }

    @Override
    public void updateAuthor(Author author) {
        this.con = new DatabaseCon().getConnection();

    }

    @Override
    public void deleteAuthor(String first_name, String last_name) {
        this.con = new DatabaseCon().getConnection();

    }
}
