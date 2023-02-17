package com.Store.model;

import com.Store.enumeration.TransactionStatus;

import java.time.LocalDateTime;
import java.util.Date;

public class TransactionRecord {
    private int transactionId;
    private Customer customer;
    private LocalDateTime dateOfSale;
    private TransactionStatus transactionStatus;

    public TransactionRecord(int transactionId, Customer customer, LocalDateTime dateOfSale, TransactionStatus transactionStatus) {
        this.transactionId = transactionId;
        this.customer = customer;
        this.dateOfSale = dateOfSale;
        this.transactionStatus = transactionStatus;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(LocalDateTime dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    @Override
    public String toString() {
        return "TransactionRecord{" +
                "transactionId=" + transactionId +
                ", customer=" + customer +
                ", dateOfSale=" + dateOfSale +
                ", transactionStatus=" + transactionStatus +
                '}';
    }
}
