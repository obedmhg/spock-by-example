package com.unotalks.unit;

import lombok.Getter;
import lombok.Setter;

public class Account {

    AccountType type = new AccountType();
    private String accountNo;
    private long balance;

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public long getBalance() {

        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getAccountNo() {

        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }


}
