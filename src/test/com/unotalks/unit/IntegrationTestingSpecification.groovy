package com.unotalks.unit

import groovy.json.JsonSlurper
import spock.lang.Specification

class IntegrationTestingSpecification extends Specification {
    def jsonSlurper = new JsonSlurper()

    def "should validate basic courses exist" () {
        given:
        def url = new URL('https://courses-site-data.firebaseio.com/courses.json')

        when:
        def connection = url.openConnection() as HttpURLConnection
        def response = jsonSlurper.parseText(connection.inputStream.text)


        then:
        connection.responseCode == 200
        response instanceof List
        response[0].name == "Java Fundamentals"
        response[1].name == "Introducción a ReactJS"
        response[2].name == "Introducción a Java"
    }


}