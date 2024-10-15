package ru.gubern.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gubern.spring.config.ApplicationConfiguration;
import ru.gubern.spring.database.pool.ConnectionPool;
import ru.gubern.spring.service.CompanyService;

@SpringBootApplication
public class ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
    }
}
