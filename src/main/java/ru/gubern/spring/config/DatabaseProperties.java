package ru.gubern.spring.config;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class DatabaseProperties {
    private String username;
    private String password;
    private String driver;
    private String url;
    private String hosts;
    private PoolProperties pool;
    private List<PoolProperties> pools;

    @Data
    @NoArgsConstructor
    public static class PoolProperties {
        private Integer size;
        private Integer timeout;
    }
}
