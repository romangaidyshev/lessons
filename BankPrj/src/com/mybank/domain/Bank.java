package com.mybank.domain;

import java.util.*;

public class Bank {

    private static List<Customer> customers = new ArrayList();

    private Bank() {
    }

    public static void addCustomer(String f, String l) {
        customers.add(new Customer(f, l));
    }

    public static int getNumOfCustomers() {
        return customers.size();
    }

    public static Customer getCustomer(int index) {
        return customers.get(index);
    }

}
