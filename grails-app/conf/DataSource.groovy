// environment specific settings
environments {
    development {
        dataSource {
            pooled = true
            driverClassName = "net.sourceforge.jtds.jdbc.Driver"
            dialect = "org.hibernate.dialect.SQLServerDialect"
            dbCreate = "update"
            url="jdbc:jtds:sqlserver://localhost:1433;databaseName=grails"
            username = "SA"
            password = "Sqlserver@2017"
        }

        hibernate {
            show_sql = true
        }

    }
}
