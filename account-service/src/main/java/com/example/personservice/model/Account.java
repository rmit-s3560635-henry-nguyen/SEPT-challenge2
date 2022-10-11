package com.example.personservice.model;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "accountType")
    private String accountType;

    @Column(name = "accNumber")
    private String accNumber;

    @Column(name = "accName")
    private String accName;

    @Column(name = "balance")
    private String balance;

    @Column(name = "date")
    private String date;

    public Account() {};

    public Account(String accountType, String accNumber, String accName, String balance, String date) {
        this.accountType = accountType;
        this.accNumber = accNumber;
        this.accName = accName;
        this.balance = balance;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
