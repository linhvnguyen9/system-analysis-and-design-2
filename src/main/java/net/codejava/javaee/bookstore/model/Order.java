package net.codejava.javaee.bookstore.model;

import java.util.Date;

public class Order {
    private OrderList orderList;
    private Date date;
    private String id;

    public Order() {

    }

    public Order(OrderList orderList, Date date, String id) {
        this.orderList = orderList;
        this.date = date;
        this.id = id;
    }

    public OrderList getOrderList() {
        return orderList;
    }

    public void setOrderList(OrderList orderList) {
        this.orderList = orderList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
