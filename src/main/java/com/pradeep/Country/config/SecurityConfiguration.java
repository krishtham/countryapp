package com.pradeep.Country.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfiguration {

    private static final AntPathRequestMatcher[] WHITE_LIST_URLS = {
            new AntPathRequestMatcher("/register"),
            new AntPathRequestMatcher("/api/v1/getUsers"),
            new AntPathRequestMatcher("/h2-console/**"),
            new AntPathRequestMatcher("/capital/**"),
            new AntPathRequestMatcher("/login/**")
    };

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.headers(headers -> headers.frameOptions().disable()).
        authorizeHttpRequests()
                .requestMatchers(WHITE_LIST_URLS)
                .permitAll();
        http.csrf().disable();

        return http.build();
    }
}

