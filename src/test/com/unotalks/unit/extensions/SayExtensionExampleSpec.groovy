package com.unotalks.unit.extensions

import spock.lang.Specification

/**
 *
 * @author kensipe
 */
@SayOnFail
class SayExtensionExampleSpec extends Specification {

    def "Say On Fail Example Feature uno square Talks"() {
        expect:
        Math.max(1, 4) == 4
        //   Math.max(1, 4) == 3
    }
}