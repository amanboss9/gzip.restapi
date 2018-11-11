package com.spring.gzip.restapi.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	private final Logger logger = LoggerFactory.getLogger(SecurityConfig.class);
    @Override
    protected void configure(HttpSecurity security) throws Exception
    {
    logger.info("Authentication has been skkipped by Aman sharma");
     security.httpBasic().disable();
     security.csrf().disable();
    }
    
}