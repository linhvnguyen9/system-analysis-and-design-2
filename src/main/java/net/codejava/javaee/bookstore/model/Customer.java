package net.codejava.javaee.bookstore.model;

public class Customer {
    private int id;
    private String nameCus;
    private String phoneNumber;

    public Customer(){

    }

    public Customer(int id, String nameCus, String phoneNumber) {
        this.id = id;
        this.nameCus = nameCus;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCus() {
        return nameCus;
    }

    public void setNameCus(String nameCus) {
        this.nameCus = nameCus;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
