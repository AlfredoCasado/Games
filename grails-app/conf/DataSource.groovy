dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    username = "root"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            url = "jdbc:mysql://localhost:3306"
        }
    }
    test {
        dataSource {
            url = "jdbc:mysql://localhost:3306"
        }
    }
    production {
        dataSource {
            url = "jdbc:mysql://localhost:3306"
        }
    }
}
