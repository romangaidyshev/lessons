package com.mybank.domain;

public class Account {
    protected double balance;

    /**
     * Creates a new instance of com.mybank.domain.Account
     */
    protected Account(double initBalance) {
        balance = initBalance;
    }
    protected Account() {
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {

        balance = balance + amt;
    }

    public void withdraw(double amt) throws OverdraftException{

        if (balance >= amt) {
            balance = balance - amt;

        } else {
            throw new OverdraftException("Недостаточно денег на счету", amt-balance);

        }
    }
}
