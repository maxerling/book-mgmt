/**
 * Created by Max Erling
 * Date: 2021-03-28
 * Copyright: MIT
 * Class: Java20B
 */
public interface BookDAO {
    void create(Book book);
    Book read(int id);
    void update(Book book);
    void delete(String title);
}
