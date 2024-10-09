package ru.gubern.spring.service;

import ru.gubern.spring.database.repository.CompanyRepository;
import ru.gubern.spring.database.repository.UserRepository;

public class UserService {
    public final UserRepository userRepository;
    public final CompanyRepository companyRepository;

    public UserService(UserRepository userRepository, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
