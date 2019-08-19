package com.unotalks.unit

import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll


class RemoveEmojiCharsSpecification extends Specification {

    @Subject
    RemoveEmojiChars testObj = new RemoveEmojiChars()


    def "should remove xml emoji chars from messageToTest"() {
        given:
        testObj.cleanMessage(messageToTest)

        expect:
        result == testObj.cleanMessage(messageToTest)

        where:
        messageToTest  | result
        "Felicidades &#xD83D;&#xDE0A; Test" | "Felicidades  Test"
        "Felicidades &#xD83D;&#xDE48; Test" | "Felicidades  Test"
        "Felicidades &#xD83D;&#xDE48;&#xD83D;&#xDE0A; Test" | "Felicidades  Test"
        "&#xD83D;&#xDE0A;" | ""
        "Felicidades Test" | "Felicidades Test"
        "Feliz Cumpleaños&#xD83D;&#xDE48;&#xD83D;&#xDE0A;" | "Feliz Cumpleaños"
        "Feliz Cumpleaños" | "Feliz Cumpleaños"
        "" | ""
        "null" | "null"
        null | null

    }


    @Unroll
    def "should remove xml emoji chars from messageToTest unroll"() {
        given:
        testObj.cleanMessage(messageToTest)

        expect:
        result == testObj.cleanMessage(messageToTest)

        where:
        messageToTest  | result
        "Felicidades &#xD83D;&#xDE0A; Test" | "Felicidades  Test"
        "Felicidades &#xD83D;&#xDE48; Test" | "Felicidades  Test"
        "Felicidades &#xD83D;&#xDE48;&#xD83D;&#xDE0A; Test" | "Felicidades  Test"
        "&#xD83D;&#xDE0A;" | ""
        "Felicidades Test" | "Felicidades Test"
        "Feliz Cumpleaños&#xD83D;&#xDE48;&#xD83D;&#xDE0A;" | "Feliz Cumpleaños"
        "Feliz Cumpleaños" | "Feliz Cumpleaños"
        "" | ""
        "null" | "null"
        null | null

    }

    @Unroll
    def "should remove xml emoji chars from '#messageToTest' to be '#result' when is set"() {
        given:
        testObj.cleanMessage(messageToTest)

        expect:
        result == testObj.cleanMessage(messageToTest)

        where:
        messageToTest  | result
        "Felicidades &#xD83D;&#xDE0A; Test" | "Felicidades  Test"
        "Felicidades &#xD83D;&#xDE48; Test" | "Felicidades  Test"
        "Felicidades &#xD83D;&#xDE48;&#xD83D;&#xDE0A; Test" | "Felicidades  Test"
        "&#xD83D;&#xDE0A;" | ""
        "Felicidades Test" | "Felicidades Test"
        "Feliz Cumpleaños&#xD83D;&#xDE48;&#xD83D;&#xDE0A;" | "Feliz Cumpleaños"
        "Feliz Cumpleaños" | "Feliz Cumpleaños"
        "" | ""
        "null" | "null"
        null | null

    }

    @Unroll("messageToTest: #messageToTest messageAfterCleanUp: #result")
    def "should remove xml emoji chars from messageToTest vars"() {
        given:
        testObj.cleanMessage(messageToTest)

        expect:
        result == testObj.cleanMessage(messageToTest)

        where:
        messageToTest  | result
        "Felicidades &#xD83D;&#xDE0A; Test" | "Felicidades  Test"
        "Felicidades &#xD83D;&#xDE48; Test" | "Felicidades  Test"
        "Felicidades &#xD83D;&#xDE48;&#xD83D;&#xDE0A; Test" | "Felicidades  Test"
        "&#xD83D;&#xDE0A;" | ""
        "Felicidades Test" | "Felicidades Test"
        "Feliz Cumpleaños&#xD83D;&#xDE48;&#xD83D;&#xDE0A;" | "Feliz Cumpleaños"
        "Feliz Cumpleaños" | "Feliz Cumpleaños"
        "" | ""
        "null" | "null"
        null | null

    }

}