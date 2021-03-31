import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by Max Erling
 * Date: 2021-03-28
 * Copyright: MIT
 * Class: Java20B
 */
public class BookDAOImpl implements BookDAO {

    private List<Book> books;

    public BookDAOImpl() {
        this.books = new ArrayList<>();
    }

    @Override
    public List<Book> getAllBooks() {
        try (Connection con = getConnection()) {

        } catch (SQLException sqlError) {
            System.out.println("SQL Error: " + sqlError.getMessage());
        }
        return null;
    }

    @Override
    public void createBook(Book book) {
        try (Connection con = getConnection()) {

        } catch (SQLException sqlError) {
            System.out.println("SQL Error: " + sqlError.getMessage());
        }

    }

    @Override
    public Book readBook(int id) {
        try (Connection con = getConnection()) {

        } catch (SQLException sqlError) {
            System.out.println("SQL Error: " + sqlError.getMessage());
        }
        return null;
    }

    @Override
    public void updateBook(Book book) {
        try (Connection con = getConnection()) {

        } catch (SQLException sqlError) {
            System.out.println("SQL Error: " + sqlError.getMessage());
        }

    }

    @Override
    public void deleteBook(String title) {
        try (Connection con = getConnection()) {

        } catch (SQLException sqlError) {
            System.out.println("SQL Error: " + sqlError.getMessage());
        }

    }


    public Connection getConnection() throws SQLException {
        String user = "";
        String pass = "";
        String connection = "";
        try {
            Properties prop = new Properties();
            FileInputStream in = new FileInputStream("C:\\Users\\m\\Desktop\\Programming\\2021\\book-mgmt\\src\\main\\resources\\app.properties");
            prop.load(in);
            user = prop.getProperty("dbuser");
            pass = prop.getProperty("dbpass");
            connection = prop.getProperty("connection");

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


        return DriverManager.getConnection(connection,user,pass);

    }
}
