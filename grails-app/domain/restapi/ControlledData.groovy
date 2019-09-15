package restapi

import grails.rest.Resource

@Resource(uri = "/data", superClass = ApiController)
class ControlledData
{
    String data
    static constraints = {
    }
}
