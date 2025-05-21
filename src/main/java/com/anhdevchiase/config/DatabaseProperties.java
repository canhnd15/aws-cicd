package com.anhdevchiase.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("spring.datasource")
public class DatabaseProperties {
    private String url;
    private String username;
    private String password;
}
