package com.unotalks.unit

import spock.lang.Specification


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
}