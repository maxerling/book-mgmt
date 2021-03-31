import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by Max Erling
 * Date: 2021-03-28
 * Copyright: MIT
 * Class: Java20B
 */
public class AuthorDAOImpl implements AuthorDAO {

    private List<Author> authors;

    public AuthorDAOImpl() {
        this.authors  = new ArrayList<>();


    }

    @Override
    public List<Author> getAllAuthors() {
        String sqlStm = "SELECT * FROM author";
        try (Connection con = getConnection()) {
            Statement stm = con.createStatement();

            ResultSet rs = stm.executeQuery(sqlStm);

            while (rs.next()) {
                Author temp = new Author(rs.getInt("id"),rs.getString("first_name"),rs.getString("last_name"));
                this.authors.add(temp);
            }


        } catch (SQLException sql){
            System.out.println("SQL Error: " + sql.getMessage());
        }
        return this.authors;
    }

    @Override
    public void createAuthor(Author author) {
        String sql = "INSERT INTO author(first_name,last_name) VALUES (?,?)";
         try (Connection con = getConnection()) {
             PreparedStatement prepStm = con.prepareStatement(sql);
             prepStm.setString(1,author.getFirstName());
             prepStm.setString(2,author.getLastName());
             prepStm.executeUpdate();
         } catch (SQLException sqlError) {
             System.out.println("SQL Error: " + sqlError.getMessage());
         }
    }

    @Override
    public Author readAuthor(int id) {
        Author temp = null;
        String sql = "SELECT * FROM author WHERE author.id = ?" ;
        try (Connection con = getConnection()) {
            PreparedStatement prepStm = con.prepareStatement(sql);
            prepStm.setInt(1,id);
            ResultSet rs = prepStm.executeQuery();
            if (rs.next()) {
                temp = new Author(rs.getInt("id"),rs.getString("first_name"),rs.getString("last_name"));
            }

        } catch (SQLException sqlError) {
            System.out.println("SQL Error: " + sqlError.getMessage());
        }
        return temp;
    }

    @Override
    public void updateAuthor(Author author) {
        try (Connection con = getConnection()) {

        } catch (SQLException sqlError) {
            System.out.println("SQL Error: " + sqlError.getMessage());
        }

    }

    @Override
    public void deleteAuthor(String first_name, String last_name) {
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
