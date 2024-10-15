package ru.gubern.spring.database.pool;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Map;

public class ConnectionPool {
    @Value("${db.username}")
    private final String username;
    @Value("${db.pool.size}")
    private final Integer poolSize;
    private List<Object> args;
    private Map<String, Object> properties;

    public ConnectionPool(String username, Integer poolSize) {

        this.username = username;
        this.poolSize = poolSize;
    }


    @PostConstruct
    private void init() {
        System.out.println("Init connection pool");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Clean connection pool");
    }
}
