package com.bank.atm.model;





public class Data {
    private int  id;
    private String type;
    private String holder;
    private String card_number;
    private String validity_period;
    private String password;
    private double balance;
    private String currency;
    private boolean state;
    private String bank;

    public Data(int id, String type, String holder, String card_number, String validity_period, String password, double balance, String currency, boolean state, String bank) {
        this.id = id;
        this.type = type;
        this.holder = holder;
        this.card_number = card_number;
        this.validity_period = validity_period;
        this.password = password;
        this.balance = balance;
        this.currency = currency;
        this.state = state;
        this.bank = bank;
    }

    public int getId() {
        return id;
    }


    public String getType() {
        return type;
    }


    public String getHolder() {
        return holder;
    }


    public String getCard_number() {
        return card_number;
    }


    public String getValidity_period() {
        return validity_period;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }


    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getBank() {
        return bank;
    }

    @Override
    public String toString() {
        return "ATM_Controller{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", holder='" + holder + '\'' +
                ", card_number='" + card_number + '\'' +
                ", validity_period='" + validity_period + '\'' +
                ", password=" + password +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", state=" + state +
                ", bank='" + bank + '\'' +
                '}';
    }
}


