package ru.gubern.spring.database.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.gubern.spring.bpp.Transaction;
import ru.gubern.spring.database.entity.Company;
import ru.gubern.spring.database.pool.ConnectionPool;

import java.util.Optional;

@Transaction
public class CompanyRepository implements CrudRepository<Integer, Company> {

    @Autowired
    @Qualifier("connectionPool")
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
        System.out.println("FindById...");
        return Optional.empty();
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete");
    }
}
