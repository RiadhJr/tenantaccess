package com.hendisantika.dynamicmultitenancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
// @ComponentScan
@ComponentScan(basePackages = { "com.hendisantika.dynamicmultitenancy.tenant.repository" })
public class SpringbootSecurityJwtRestApiDynamicMultiTenancyMysqlPostgresqlApplication
        extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootSecurityJwtRestApiDynamicMultiTenancyMysqlPostgresqlApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSecurityJwtRestApiDynamicMultiTenancyMysqlPostgresqlApplication.class, args);
    }

}
