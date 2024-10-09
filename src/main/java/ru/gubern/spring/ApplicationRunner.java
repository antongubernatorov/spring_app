package ru.gubern.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gubern.spring.config.ApplicationConfiguration;
import ru.gubern.spring.database.pool.ConnectionPool;

public class ApplicationRunner {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
            System.out.println(context.getBean(ConnectionPool.class));
        }
    }
}
