package ru.gubern.spring.database.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.gubern.spring.database.pool.ConnectionPool;

@RequiredArgsConstructor
public class UserRepository {

    @Qualifier("pool2")
    public final ConnectionPool connectionPool;
}
