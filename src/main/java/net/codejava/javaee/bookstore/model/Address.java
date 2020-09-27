package net.codejava.javaee.bookstore.model;

public class Address {
    private int id;
    private String detailAddress;

    public Address(){

    }

    public Address(int id, String detailAddress) {
        this.id = id;
        this.detailAddress = detailAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }
}