package ru.gubern.spring.integration.service;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.DirtiesContext;
import ru.gubern.spring.database.pool.ConnectionPool;
import ru.gubern.spring.integration.annotation.IT;
import ru.gubern.spring.service.UserService;

@IT
@RequiredArgsConstructor
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class UserServiceIT {
    private UserService userService;
    private ConnectionPool connectionPool;
    @Test
    void test(){

    }
}
