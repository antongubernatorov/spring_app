package ru.gubern.spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import ru.gubern.spring.database.entity.Company;
import ru.gubern.spring.database.repository.CrudRepository;
import ru.gubern.spring.dto.CompanyReadDto;
import ru.gubern.spring.listener.entity.AccessType;
import ru.gubern.spring.listener.entity.EntityEvent;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CompanyService {
    private final CrudRepository<Integer, Company> companyRepository;
    private final UserService userService;
    private final ApplicationEventPublisher eventPublisher;


    public Optional<CompanyReadDto> findById(Integer id){
        return companyRepository.findById(id)
                .map(entity -> {
                    eventPublisher.publishEvent(new EntityEvent(entity, AccessType.READ));
                    return new CompanyReadDto(entity.getId());
                });
    }
}
