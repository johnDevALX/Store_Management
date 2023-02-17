package com.Store.model;

public class Product {
    private String productName;
    private int productId;
    private int price;
    private int quantity;

    public Product() {
    }

    public Product(String name, int productId, int price, int quantity){
        this.productName = name;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName= " + productName +
                " productId" + productId +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
