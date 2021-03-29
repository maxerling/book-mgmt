/**
 * Created by Max Erling
 * Date: 2021-03-28
 * Copyright: MIT
 * Class: Java20B
 */
public class Main {
    public static void main(String[] args) {
        AuthorDAOImpl authorImpl = new AuthorDAOImpl();

        System.out.println(authorImpl.getAllAuthors());
    }
}
