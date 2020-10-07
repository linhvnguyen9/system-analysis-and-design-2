package net.codejava.javaee.bookstore.dao;

import net.codejava.javaee.bookstore.common.BaseDao;
import net.codejava.javaee.bookstore.model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDaoImpl extends BaseDao<Account> implements AccountDao {
    public AccountDaoImpl(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
        super(jdbcURL, jdbcUsername, jdbcPassword);
    }

    @Override
    public boolean checkLogin(Account a) throws SQLException {
        PreparedStatement preparedStatement = jdbcConnection
                .prepareStatement("select * from account where username = ? and password = ?");
        preparedStatement.setString(1, a.getUsername());
        preparedStatement.setString(2, a.getPassword());

        System.out.println(preparedStatement);
        ResultSet rs = preparedStatement.executeQuery();

        return rs.next();
    }

    @Override
    public void saveAccount(Account a) {

    }

    @Override
    public void deleteAccount(Account a) {

    }

    @Override
    public void editAccount(Account a) {

    }
}
