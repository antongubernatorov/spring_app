package ru.gubern.spring.config;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import ru.gubern.spring.database.pool.ConnectionPool;
import ru.gubern.spring.database.repository.CrudRepository;
import ru.gubern.spring.database.repository.UserRepository;
import ru.gubern.web.config.WebConfiguration;

import java.awt.*;

@Import(WebConfiguration.class)
//@ImportResource("application.xml")
@Configuration
@ComponentScan(basePackages = "ru.gubern",
    useDefaultFilters = false,
    includeFilters = {
         @Filter(type = FilterType.ANNOTATION, value = Component.class),
         @Filter(type = FilterType.ASSIGNABLE_TYPE, value = CrudRepository.class),
         @Filter(type = FilterType.REGEX, pattern = "com\\..+Repository")
    })
public class ApplicationConfiguration {
    @Bean("pool2")
    public ConnectionPool pool2(){
        return new ConnectionPool("test-name", 20);
    }

    @Bean
    public ConnectionPool pool3(){
        return new ConnectionPool("test-pool", 25);
    }

    @Bean
    @Profile("prod")
    //! & |
    public UserRepository userRepository(ConnectionPool pool2){
        return new UserRepository(pool2);
    }

    @Bean
    public UserRepository userRepository3(){
        return new UserRepository(pool3());
    }
}
