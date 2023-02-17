package com.Store.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderName;
    private int desiredQuantity;
    private Customer customer;


    public Order(String orderName, int desiredQuantity, Customer customer) {

        this.orderName = orderName;
        this.desiredQuantity = desiredQuantity;
        this.customer = customer;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getDesiredQuantity() {
        return desiredQuantity;
    }

    public void setDesiredQuantity(int desiredQuantity) {
        this.desiredQuantity = desiredQuantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", desiredQuantity=" + desiredQuantity +
                ", customer=" + customer +
                '}';
    }
}
