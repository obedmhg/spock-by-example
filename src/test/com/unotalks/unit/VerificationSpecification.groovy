package com.unotalks.unit

import spock.lang.Specification
import spock.lang.Subject


class VerificationSpecification extends Specification {
    @Subject
    File fileMock = Mock(File)
    @Subject
    File fileMock2 = Mock()

    def "should verify getName ran 3 times onf file and 1 on file2" () {
        when:
        def result = fileMock.getName()
        result = fileMock.getName()
        result = fileMock.getName()
        result = fileMock2.getName()

        then:
        1 * fileMock2.getName()
        3 * fileMock.getName()
    }

    def "should verify getName ran 3 times onf file and 1 on file2 in that order" () {
        when:
        def result = fileMock.getName()
        result = fileMock.getName()
        result = fileMock2.getName()
        result = fileMock.getName()

        then:
        3 * fileMock.getName()

        and:
        1 * fileMock2.getName()
    }

    def "should verify getName ran n times, order matter" () {
        when:
        def result = fileMock.getName()
        result = fileMock.getName()
        result = fileMock2.getName()
        result = fileMock.getName()

        then:
        2 * fileMock.getName()

        and:
        1 * fileMock2.getName()

        and:
        1 * fileMock.getName()
    }

}