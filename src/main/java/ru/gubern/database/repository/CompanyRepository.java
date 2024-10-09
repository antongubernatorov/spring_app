package ru.gubern.database.repository;

import ru.gubern.bpp.InjectBean;
import ru.gubern.database.pool.ConnectionPool;

public class CompanyRepository {

    @InjectBean
    public final ConnectionPool connectionPool;


}
