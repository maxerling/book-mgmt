/**
 * Created by Max Erling
 * Date: 2021-03-28
 * Copyright: MIT
 * Class: Java20B
 */
public interface AuthorDAO {
    void create(Author author);
    Author read(int id);
    void update(Author author);
    void delete(String first_name, String last_name);
}
