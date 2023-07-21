package com.br.aula.aula02.config;

import com.br.aula.aula02.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TesteConfig {
    @Autowired
    private UserRepositories UserRepositories;
}
