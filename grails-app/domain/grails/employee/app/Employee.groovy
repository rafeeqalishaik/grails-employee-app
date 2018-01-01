package grails.employee.app

import org.restapidoc.annotation.RestApiMethod
import org.restapidoc.annotation.RestApiObject
import org.restapidoc.annotation.RestApiObjectField

@RestApiObject(name = "employee", description = "An employee works in organisation")
class Employee {

    @RestApiObjectField(description = "Name of an employee")
    String name
    @RestApiObjectField(description = "Name of an organisation")
    String organisation

    static constraints = {
        name blank: false
        organisation blank: false
    }

    @RestApiMethod(description = "Gets employee's name and organisation")
    @Override
    String toString() {
        return "name : "+this.name +" organisation : "+this.organisation
    }
}
