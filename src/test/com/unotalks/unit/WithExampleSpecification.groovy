package com.unotalks.unit

import spock.lang.Specification


class WithExampleSpecification extends Specification {

    def "working with with"() {
        def account = new Account(accountNo: "123", balance: 50.0)

        expect:
        with(account) {
            accountNo == "123"
            balance == 50.0
        }
    }

    def "working with composites"() {
        def account = new Account(accountNo: "123", balance: 50.0)

        expect:
        with(account.type, com.unotalks.unit.AccountType) {
            type == "checking"
        }
    }
}