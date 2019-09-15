package restapi

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        get "/data"(controller:"api", action:"index")
        post "/data"(controller:"api", action:"save")
        get "/data/$id"(controller:"api", action:"show")
        put "/data/$id"(controller:"api", action:"update")
        delete "/data/$id"(controller:"api", action:"delete")

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
