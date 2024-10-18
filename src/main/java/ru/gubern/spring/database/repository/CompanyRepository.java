package ru.gubern.spring.database.repository;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.gubern.spring.bpp.Transaction;
import ru.gubern.spring.database.entity.Company;
import ru.gubern.spring.database.pool.ConnectionPool;

import java.util.Collections;
import java.util.Optional;

@Slf4j

@Transaction
public class CompanyRepository implements CrudRepository<Integer, Company> {

    @Autowired
    @Qualifier("pool1")
    public final ConnectionPool connectionPool;


    public CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    @PostConstruct
    private void init() {
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        log.info("FindById...");
        return Optional.of(new Company(id, null, Collections.emptyMap()));
    }

    @Override
    public void delete(Company entity) {
        log.info("delete");
    }
}
