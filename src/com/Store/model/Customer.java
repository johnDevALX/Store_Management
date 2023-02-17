package com.Store.model;

import com.Store.enumeration.Gender;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{
    private Gender gender;
    private BigDecimal bal;
    private List<Product> cart;
    public Customer (){
        super();
    }

    public Customer(String firstName, String lastName, int id, Gender gender, BigDecimal bal) {
        super(firstName, lastName, id);
        cart = new ArrayList<>();
        this.gender = gender;
        this.bal = bal;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BigDecimal getBal() {
        return bal;
    }

    public void setBal(BigDecimal bal) {
        this.bal = bal;
    }
    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Customer{Firstname: " + super.getFirstName() + " Lastname: " + super.getLastName() +
                " id: " + super.getId() +
                "gender=" + gender +
                ", bal=" + bal +
                ", listOfItemInCart= " + cart +
                '}';
    }
}
