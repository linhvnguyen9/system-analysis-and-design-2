package net.codejava.javaee.bookstore;


import net.codejava.javaee.bookstore.dao.AccountDAO;
import net.codejava.javaee.bookstore.model.Account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class AccountControllerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private AccountDAO accountDAO;

    public void init() {
        accountDAO = new AccountDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Account account = new Account();

        account.setUsername(username);
        account.setPassword(password);

        try {
            accountDAO.registerDAO(account);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("accountDetails.jsp");
    }
}
