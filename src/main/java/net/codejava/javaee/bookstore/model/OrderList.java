package net.codejava.javaee.bookstore.model;



public class OrderList {
    private int id;
    private String quantity;

    public OrderList(){

    }

    public OrderList(int id, String quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
