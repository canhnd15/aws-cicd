package com.anhdevchiase.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties("spring.datasource")
public class DatabaseProperties {
    private String url;
    private String username;
    private String password;
}
