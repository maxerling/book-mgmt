import java.sql.*;
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
    private final Connection con;

    public AuthorDAOImpl() {
        this.authors  = new ArrayList<>();
        this.con = (Connection) new DatabaseCon().getConnection();


    }

    @Override
    public List<Author> getAllAuthors() {
        String sqlStm = "SELECT * FROM author";
        try (con) {
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
         try (con) {
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

        return null;
    }

    @Override
    public void updateAuthor(Author author) {


    }

    @Override
    public void deleteAuthor(String first_name, String last_name) {


    }
}
