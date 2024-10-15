package ru.gubern.spring.config;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import ru.gubern.spring.config.condition.JpaCondition;

@Conditional(JpaCondition.class)
@Configuration
public class JpaConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "db")
    public DatabaseProperties databaseProperties(){
        return new DatabaseProperties();
    }

    @PostConstruct
    void init(){
        System.out.println("Jpa os enabled");
    }
}
