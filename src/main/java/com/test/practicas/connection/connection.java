package com.test.practicas.connection;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class connection {
    @Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.sybase.jdbc4.jdbc.SybDriver");
        dataSource.setUrl("jdbc:sybase:Tds:172.28.0.6:30410/SIJ_001_04_Alterno");
        dataSource.setUsername("userrq");
        dataSource.setPassword("Ar3quipa");

        return dataSource;
    }
}
