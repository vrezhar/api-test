package restapi

import grails.rest.Resource


@Resource(uri = "/dictionary")
class DictionaryEntry {

    String entry
    String value
    static constraints = {
    }
}
