package com.unotalks.unit

import groovy.sql.Sql
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class DatabaseDrivenSpec extends Specification {
    @Shared sql = Sql.newInstance("jdbc:h2:mem:", "org.h2.Driver")

    def setupSpec() {
        sql.execute("create table maxdata (id int primary key, a int, b int, c int)")
        sql.execute("insert into maxdata values (1, 3, 7, 7), (2, 5, 4, 5), (3, 9, 9, 9),(4, 9, 1, 1)")
    }

    @Unroll
    def "maximum of two numbers"() {
        expect:
        Math.max(a, b) == c

        where:
        [a, b, c] << sql.rows("select a, b, c from maxdata")
    }

    def cleanup() {
        sql.execute("delete from maxdata")
    }
}