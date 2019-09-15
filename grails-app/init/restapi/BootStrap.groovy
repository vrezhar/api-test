package restapi

class BootStrap {

    def init = { servletContext ->
        def primary =  DictionaryEntry.findOrSaveWhere(entry: "lorem ipsum", value: "infernus ad astra")
    }
    def destroy = {
    }
}
