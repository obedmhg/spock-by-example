package com.unotalks.unit;

public class AccountManager {

    public void addFounds(Account account, long founds) {
        account.setBalance(account.getBalance() + founds);
    }

}
