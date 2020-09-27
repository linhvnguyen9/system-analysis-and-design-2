package net.codejava.javaee.bookstore.dao;

import net.codejava.javaee.bookstore.common.BaseDao;
import net.codejava.javaee.bookstore.entity.Order;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl extends BaseDao<Order> implements OrderDao {
    public OrderDaoImpl(String jdbcURL, String jdbcUsername, String jdbcPassword, Connection jdbcConnection) {
        super(jdbcURL, jdbcUsername, jdbcPassword, jdbcConnection);
    }

    @Override
    public List<Order> getAllOrders() throws SQLException {
        List<Order> orderList = new ArrayList<>();

        //TODO: Must join order, orderlist, book table
        String sql = "SELECT * FROM book";

        super.connect();

        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
//            int id = resultSet.getInt("book_id");
//            String title = resultSet.getString("title");
//            String author = resultSet.getString("author");
//            float price = resultSet.getFloat("price");
//
//            Order order = new Order();
//            orderList.add(order);
        }

        resultSet.close();
        statement.close();

        disconnect();

        return orderList;
    }

    @Override
    public Order getOrderById(String id) {
        return null;
    }

    @Override
    public void saveOrder(Order o) throws SQLException {
//        String sql = "INSERT INTO order (title, author, price) VALUES (?, ?, ?)";
//        super.connect();
//
//        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
//        statement.setString(1, book.getTitle());
//        statement.setString(2, book.getAuthor());
//        statement.setFloat(3, book.getPrice());

//        statement.executeUpdate();
//        statement.close();
        disconnect();
    }

    @Override
    public void deleteOrder(Order o) throws SQLException {
//        String sql = "DELETE FROM book where id = ?";

        super.connect();

//        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
//        statement.setInt(1, book.getId());

//        statement.executeUpdate();
//        statement.close();
        disconnect();
    }
}

//    public boolean updateBook(Book book) throws SQLException {
//        String sql = "UPDATE book SET title = ?, author = ?, price = ?";
//        sql += " WHERE book_id = ?";
//        connect();
//
//        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
//        statement.setString(1, book.getTitle());
//        statement.setString(2, book.getAuthor());
//        statement.setFloat(3, book.getPrice());
//        statement.setInt(4, book.getId());
//
//        boolean rowUpdated = statement.executeUpdate() > 0;
//        statement.close();
//        disconnect();
//        return rowUpdated;
//    }
//
//    public Book getBook(int id) throws SQLException {
//        Book book = null;
//        String sql = "SELECT * FROM book WHERE book_id = ?";
//
//        connect();
//
//        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
//        statement.setInt(1, id);
//
//        ResultSet resultSet = statement.executeQuery();
//
//        if (resultSet.next()) {
//            String title = resultSet.getString("title");
//            String author = resultSet.getString("author");
//            float price = resultSet.getFloat("price");
//
//            book = new Book(id, title, author, price);
//        }
//
//        resultSet.close();
//        statement.close();
//
//        return book;
//    }
//}