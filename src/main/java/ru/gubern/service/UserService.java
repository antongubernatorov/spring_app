package ru.gubern.service;

import ru.gubern.database.repository.CompanyRepository;
import ru.gubern.database.repository.UserRepository;

public class UserService {
    public final UserRepository userRepository;
    public final CompanyRepository companyRepository;

    public UserService(UserRepository userRepository, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
