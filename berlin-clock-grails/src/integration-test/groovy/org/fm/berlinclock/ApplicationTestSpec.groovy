package org.fm.berlinclock

import grails.testing.mixin.integration.Integration
import grails.transaction.*

import geb.spock.*

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
@Rollback
class ApplicationTestSpec extends GebSpec {

    def setup() {}

    def cleanup() {}

    void "the default path should get the homepage"() {
        when:"The home page is visited"
            go '/'

        then:"The title is correct"
        	title == "Berlin Clock"
    }
}
