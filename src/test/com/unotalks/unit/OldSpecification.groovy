package com.unotalks.unit

import spock.lang.Specification
import spock.lang.Subject


class OldSpecification extends Specification {

    def "looking at old lists"() {
        def list = [1, 2, 3]

        when:
        list << 4
        list << 5

        then:
        list.size() == 5
        old(list.size()) == 3
    }

    def "looking at old maps"() {
        def map = [:]
        map.example = "test"

        when:
        map.example = "new"

        then:
        map.example == "new"
        old(map.example) == "test"
        map.example != old(map.example)
    }

    @Subject
    AccountManager testObject =  new AccountManager();
    def "should add founds to account"() {
        given:
        def account = new Account(accountNo: "123", balance: 60.0)
        when:
        testObject.addFounds(account, 40)
        then:
        account.getBalance() == 100
        old(account.getBalance()) == 60

    }
}