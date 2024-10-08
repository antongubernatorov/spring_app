package ru.gubern.database.repository;

import ru.gubern.database.pool.ConnectionPool;

public class UserRepository {
    public final ConnectionPool connectionPool;

    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
