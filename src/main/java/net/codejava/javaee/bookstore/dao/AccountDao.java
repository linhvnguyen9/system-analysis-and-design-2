package net.codejava.javaee.bookstore.dao;

import net.codejava.javaee.bookstore.model.Account;

import java.sql.SQLException;

public interface AccountDao {
    boolean checkLogin(Account a) throws SQLException;
    void saveAccount(Account a);
    void deleteAccount(Account a);
    void editAccount(Account a);
}
