package net.codejava.javaee.bookstore.model;

import java.time.Instant;

public class Order {
    private int id;
    private Instant dateOrder;
    private String status;

    public Order(){

    }

    public Order(int id, Instant dateOrder, String status) {
        this.id = id;
        this.dateOrder = dateOrder;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Instant dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
