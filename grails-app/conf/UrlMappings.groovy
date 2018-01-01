import grails.employee.app.Employee

class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/employees" (controller: "employee", action: "list")
        "/employee" (controller: "employee", action: "create")
        "/employee/${id}" (controller: "employee") {
            action = [ GET: "get", PUT: "update", DELETE: "delete"]
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
