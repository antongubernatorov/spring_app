package ru.gubern.spring.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import ru.gubern.spring.database.repository.CompanyRepository;
import ru.gubern.spring.database.repository.UserRepository;

@RequiredArgsConstructor
@Service
public class UserService {
    public final UserRepository userRepository;
    public final CompanyRepository companyRepository;
}
