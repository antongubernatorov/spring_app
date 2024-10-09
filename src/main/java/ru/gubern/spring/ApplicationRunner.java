package ru.gubern.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gubern.spring.config.ApplicationConfiguration;
import ru.gubern.spring.database.pool.ConnectionPool;
import ru.gubern.spring.service.CompanyService;

public class ApplicationRunner {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {

            var companyService = context.getBean("companyService", CompanyService.class);
            System.out.println(companyService.findById(1));
        }
    }
}
