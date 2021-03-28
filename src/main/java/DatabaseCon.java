import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by Max Erling
 * Date: 2021-03-28
 * Copyright: MIT
 * Class: Java20B
 */
public class DatabaseCon {
    private String user;
    private String pass;
    private String connection;





    public Connection getConnection() throws SQLException {
        try {
            Properties prop = new Properties();
            FileInputStream in = new FileInputStream("resources/app.properties");
            prop.load(in);
            this.user = prop.getProperty("dbuser");
            this.pass = prop.getProperty("dbpass");
            this.connection = prop.getProperty("connection");

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return DriverManager.getConnection(this.connection,this.user,this.pass);
    }
}
