package com.mybank.domain;

import java.util.*;

public class Customer {

    private String firstName;
    private String lastName;
    private List<Account> accounts = new ArrayList();
    //private int numOfAccounts;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(int acct_idx) {
        return accounts.get(acct_idx);
    }

    public int getNumOfAccounts() {
        return accounts.size();
    }
}
