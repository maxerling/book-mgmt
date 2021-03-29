import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
