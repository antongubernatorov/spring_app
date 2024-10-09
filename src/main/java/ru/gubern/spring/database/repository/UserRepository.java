package ru.gubern.spring.database.repository;

import ru.gubern.spring.database.pool.ConnectionPool;

public class UserRepository {
    public final ConnectionPool connectionPool;

    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
