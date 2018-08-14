package com.mybank.batch;

import com.mybank.domain.*;

public class AccumulateSavingsBatch{
    private Bank bank;

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void doBatch(){
        for (int cust_idx = 0;
             cust_idx < bank.getNumOfCustomers();
             cust_idx++) {
            Customer customer = bank.getCustomer(cust_idx);

            for (int acct_idx = 0;
                 acct_idx < customer.getNumOfAccounts();
                 acct_idx++) {
                Account account = customer.getAccount(acct_idx);
                if (account instanceof SavingsAccount) {
                    ((SavingsAccount) account).accumulateInterest();
                    }

            }
        }
    }
}
