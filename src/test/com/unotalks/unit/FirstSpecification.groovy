package com.unotalks.unit

import spock.lang.FailsWith
import spock.lang.Specification


class FirstSpecification extends Specification {

    def "one plus one should equal two"() {
        expect:
        1 + 1 == 2
    }

    def "two plus two should equal four"() {
        given: "2 numbers"
        int left = 2
        int right = 2

        when: "adding them"
        int result = left + right

        then: "result should be 2"
        result == 4
    }

    def "Should be able to remove first item from list"() {
        given:
        def list = [1, 2, 3, 4]

        when:
        list.remove(0)

        then:
        list == [2, 3, 4]
    }

    def "Should get an index out of bounds when removing a non-existent item"() {
        given:
        def list = [1, 2, 3, 4]

        when:
        list.remove(20)

        then:
        thrown(IndexOutOfBoundsException)

    }

    @FailsWith(IndexOutOfBoundsException)
    def "Should fail to get an index out of bounds when removing a non-existent item"() {
        given:
        def list = [1, 2, 3, 4]
        list.remove(20)
    }


    def "numbers to the power of two"(int a, int b, int c) {
        expect:
        Math.pow(a, b) == c

        where:
        a | b | c
        1 | 2 | 1
        2 | 2 | 4
        3 | 2 | 9
        4 | 2 | 16
    }

}