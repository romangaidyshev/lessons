package com.mybank.domain;

public class CheckingAccount extends Account {
    private double overdraftAmount;

    public CheckingAccount(double initBalance, double overdraftAmount) {
        super(initBalance);
        this.overdraftAmount = overdraftAmount;
    }

    public CheckingAccount(double initBalance) {
        super(initBalance);

    }

    @Override
    public void withdraw(double amt)throws OverdraftException {
        if (balance >= amt) {
            balance = balance - amt;
        } else if (balance + overdraftAmount >= amt) {
            overdraftAmount = (balance + overdraftAmount) - amt;
            balance = 0.0;
        } else {
           throw new OverdraftException("Недостаточно денег даже при использовании overdraft",
                   amt - balance - overdraftAmount);
        }
    }
}
