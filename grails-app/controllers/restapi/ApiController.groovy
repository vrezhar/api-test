package restapi

import grails.rest.RestfulController

class ApiController extends RestfulController<ControlledData> {

    ApiController(Class<ControlledData> domainClass, boolean readonly)
    {
        super(domainClass,readonly)
    }

    ApiController(Class<ControlledData> domainClass)
    {
        this(domainClass,false)
    }

    def index()
    {
        render "I should be indexing data"
    }

    def show()
    {
        def data = ControlledData.get(params.id)
        if(data)
        {
            render "I am showing data with id ${params.id}: ${data.data}"
        }
        render "I am unable to find anything with id ${params.id}"
    }
    def update(ControlledData data)
    {
        def indb = ControlledData.get(params.id)
        if(indb)
        {
            render "I am updating N${params.id} from ${indb.data} to ${data.data}"
            indb = data
            indb.save()
            return
        }
        render "I am unable to find anything with id ${params.id}"
    }
    def save(ControlledData data)
    {
        render "I am saving ${data.data} to database"
        data.save()
    }

    def delete()
    {
        def data = ControlledData.get(params.id)
        if(data)
        {
            render "I am deleting ${data.data} from database"
            data.delete()
            return
        }
        render "I am unable to delete data which has id ${params.id}"
    }

    @Override
    protected ControlledData queryForResource(Serializable id) {
        ControlledData.where {
            id == id
        }.find()
    }
}
