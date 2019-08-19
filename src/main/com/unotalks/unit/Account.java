package com.unotalks.unit;

import lombok.Getter;
import lombok.Setter;

public class Account {

    @Getter @Setter
    private String accountNo;

    @Getter @Setter
    private long balance;

    @Getter @Setter
    AccountType type = new AccountType();

}
