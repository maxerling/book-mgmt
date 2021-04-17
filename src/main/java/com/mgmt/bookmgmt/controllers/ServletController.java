package com.mgmt.bookmgmt.controllers;

/**
 * Created by Max Erling
 * Date: 2021-04-13
 * Copyright: MIT
 * Class: Java20B
 */
/*
public class ServletController {
    private BookDAOImpl bookDAO;

    public ServletController() {
        this.bookDAO = new BookDAOImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        try {
            switch (action) {
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertBook(request, response);
                    break;
                case "/delete":
                    deleteBook(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/update":
                    updateBook(request, response);
                    break;
                default:
                    listBook(request, response);
                    break;
            }
            } catch (SQLException | IOException ex) {
            throw new ServletException(ex);
        }


    }

    private void listBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> listBook = bookDAO.getAllBooks();
        request.setAttribute("listBook", listBook);
        RequestDispatcher dispatcher = request.getRequestDispatcher("bookform.html");
        dispatcher.forward(request, response);
    }

}
*/