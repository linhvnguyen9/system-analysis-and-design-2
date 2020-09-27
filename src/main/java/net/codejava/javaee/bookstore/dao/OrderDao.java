package net.codejava.javaee.bookstore.dao;

import net.codejava.javaee.bookstore.model.Order;

import java.sql.SQLException;
import java.util.List;

public interface OrderDao {
    List<Order> getAllOrders() throws SQLException;

    Order getOrderById(String id);

    void saveOrder(Order o) throws SQLException;

    void deleteOrder(Order o) throws SQLException;
}
