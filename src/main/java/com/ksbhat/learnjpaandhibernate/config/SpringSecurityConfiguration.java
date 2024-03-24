package com.ksbhat.learnjpaandhibernate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
        //Authenticate all requests
        httpSecurity.authorizeHttpRequests(
                auth -> auth.anyRequest().authenticated()
        );

        //For API requests, if not authenticated show a login popup instead of login page
        httpSecurity.httpBasic(Customizer.withDefaults());

        //Disable CSRF
        httpSecurity.csrf().disable();
        return httpSecurity.build();
    }

}
