import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-03-28
 * Copyright: MIT
 * Class: Java20B
 */
public interface AuthorDAO {
    List<Author> getAllAuthors();
    void createAuthor(Author author);
    Author readAuthor(int id);
    void updateAuthor(Author author);
    void deleteAuthor(String first_name, String last_name);
}
