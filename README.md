# GRAILS-EMPLOYEE-APPLICATION

# SHORT DESCRIPTION

grails employee applcation allows end user to add, find, update and delete an employee from system

# PRE-REQUISTIES

Java JDK installed on machine.
reference for configuring java on machine: https://www.wikihow.com/Install-the-Java-Software-Development-Kit https://www.wikihow.com/Set-Java-Home

GGTS IDE or Intellij IDE or Any Other IDE to run and modify the code.
reference for different IDE's: https://spring.io/tools/ggts, http://www.eclipse.org/downloads/, https://www.jetbrains.com/idea/download/#section=linux

MSSQL Server setup on machine
reference for installing MSSQL Server: https://docs.microsoft.com/en-us/sql/linux/quickstart-install-connect-ubuntu
- I have installed on ubuntu

Postman to test the application
reference link: https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=en

# HOW TO RUN

Once pre-requisties are done.
clone project to your local machine and import into IDE workspace.
Now run the grails-employee-app from main menu run.
Check the working functionality of the application using postman.

# END-POINTS EXPOSED

GET - "/employees" (controller: "employee", action: "list"), lists all emoloyees
POST - "/employee" (controller: "employee", action: "create"), inserts an employee
GET - "/employee/${id}" (controller: "employee", action: "get"), gets an employee based on id
PUT - "/employee/${id}" (controller: "employee", action: "update"), updates an employee based on id
DELETE - "/employee/${id}" (controller: "employee", action: "delete"), deletes an employee based on id