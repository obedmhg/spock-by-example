package com.unotalks.unit

import spock.lang.Specification
import spock.lang.Subject


class WorkingWithMocksSpecification extends Specification {

    @Subject
    File fileMock = Mock(File)
    @Subject
    File fileMock2 = Mock()

    def setup() {
        fileMock.getName() >> "testSpock.txt"
        fileMock2.getName() >> "testSpock2.txt"
    }

    def "mockingFile" () {
        when:
        def result = fileMock.getName()

        then:
        result == "testSpock.txt"
    }

    def "mockingFile as Mock()" () {
        when:
        def result = fileMock2.getName()

        then:
        result == "testSpock2.txt"
    }
}