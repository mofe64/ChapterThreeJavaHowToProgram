package com.company;

public class ModifiedAccountClass {
    private double balance;
    private String name;

    public ModifiedAccountClass(double balance, String name) {
        this.name = name;
        if(balance> 0.0){
            this.balance = balance;
        }
    }
    public void deposit(double depositAmount){
        if(depositAmount> 0.0){
            balance += depositAmount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void withdraw(int withdrawAmount){
        if(withdrawAmount < balance) {
            balance -= withdrawAmount;
        }
    }
}
