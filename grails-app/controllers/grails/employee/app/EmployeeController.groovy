package grails.employee.app

import grails.converters.JSON
import grails.rest.RestfulController
import org.restapidoc.annotation.RestApi
import org.restapidoc.annotation.RestApiMethod
import org.restapidoc.annotation.RestApiParam
import org.restapidoc.annotation.RestApiParams
import org.restapidoc.pojo.RestApiParamType
import org.restapidoc.pojo.RestApiVerb

@RestApi(name = "Employee Service", description = "Methods for managing employees")
class EmployeeController extends RestfulController {

    @RestApiMethod(verb = RestApiVerb.GET, description = "List all employees", listing = true)
    def list() {
        respond Employee.list(), formats: ['json']
    }

    @RestApiMethod(verb = RestApiVerb.POST,description = "Insert an employee")
    @RestApiParams(params = [ @RestApiParam(name="Employee", type = "Object", paramType = RestApiParamType.PATH, description = "Employee Object")])
    def create() {
        def emp = request.getJSON()
        Employee employee = new Employee(emp)
        employee.save(flush: true)
        respond employee, formats: ['json']
    }

    @RestApiMethod(verb = RestApiVerb.GET, description = "Get an employee")
    @RestApiParams(params = [ @RestApiParam(name = "id", type = "long", paramType = RestApiParamType.PATH,
        description = "The employee id")])
    def get() {
        def employee = Employee.get(params.long('id'))
        println employee.toString()
        if(employee) {
            respond employee, formats: ['json']
        }
    }

    @RestApiMethod(verb = RestApiVerb.PUT, description = "Update an employee")
    @RestApiParams(params = [ @RestApiParam(name = "id", type = "long", paramType = RestApiParamType.PATH,
            description = "The employee id")])
    def update() {
        def employee = Employee.get(params.long('id'))
        def jsonObj = request.getJSON()
        Employee emp = new Employee(jsonObj)
        if(emp.name && emp.organisation){
            employee.name = emp.name
            employee.organisation = emp.organisation
        } else if(emp.name){
            employee.name = emp.name
        } else {
            employee.organisation = emp.organisation
        }
        employee.save(flush: true)
        respond employee, formats: ['json']
    }

    @RestApiMethod(verb = RestApiVerb.DELETE, description = "Delete an employee")
    @RestApiParams(params = [ @RestApiParam(name = "id", type = "long", paramType = RestApiParamType.PATH,
            description = "The employee id")])
    def delete() {
        def employee = Employee.get(params.long('id'))
        if(employee){
            render employee.delete() as JSON
        }
    }
}