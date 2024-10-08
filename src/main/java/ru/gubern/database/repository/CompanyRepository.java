package ru.gubern.database.repository;

import ru.gubern.database.pool.ConnectionPool;

public class CompanyRepository {
    public final ConnectionPool connectionPool;

    public CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public static CompanyRepository of(ConnectionPool connectionPool){
        return new CompanyRepository(connectionPool);
    }
}
